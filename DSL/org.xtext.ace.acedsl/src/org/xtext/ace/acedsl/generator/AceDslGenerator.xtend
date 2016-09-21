/*
 * generated by Xtext 2.9.2
 */
package org.xtext.ace.acedsl.generator

import java.awt.Graphics2D
import java.awt.image.BufferedImage
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.File
import java.io.IOException
import java.io.InputStream
import javax.imageio.ImageIO
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.ace.acedsl.acedsl.Aplicativo
import org.xtext.ace.acedsl.acedsl.Estilo
import org.xtext.ace.acedsl.acedsl.Logo
import java.util.Map
import java.util.HashMap

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class AceDslGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		var Aplicativo app = resource.contents.findFirst[item | item instanceof Aplicativo] as Aplicativo;
		
//		Strings
		fsa.generateFile('app/src/main/res/values/strings.xml', generateStringsTemplate(app));
		
//		Colors
		fsa.generateFile('app/src/main/res/values/colors.xml', generateColorsTemplate(app.estilo));
		
//		Styles
		fsa.generateFile('app/src/main/res/values/styles.xml', generateStylesTemplate(app.estilo));
		
//		Logo
		createLogoFiles(app.estilo.logo, fsa);
		
	}
	
	def createLogoFiles(Logo logo, IFileSystemAccess2 fsa) {
		var BufferedImage logoImg = null;
		try {
			logoImg = ImageIO.read(new File(logo.caminho));
		} catch (IOException e) {
			return;
		}
		
		val String basePath = 'app/src/main/res/drawable-';
		val String filename = '/ic_logo.png';
		
		fsa.generateFile(basePath+'mdpi'+filename, logoResized(logoImg, 100, 100));
		fsa.generateFile(basePath+'hdpi'+filename, logoResized(logoImg, 150, 150));
		fsa.generateFile(basePath+'xhdpi'+filename, logoResized(logoImg, 200, 200));
		fsa.generateFile(basePath+'xxhdpi'+filename, logoResized(logoImg, 300, 300));
		fsa.generateFile(basePath+'xxxhdpi'+filename, logoResized(logoImg, 400, 400));
	
	}
	
	def imageSizeFit(int origWidth, int origHeight, int targetWidth, int targetHeight) {
		var float ratio = Math.min(targetWidth as float/origWidth, targetHeight as float/origHeight);
		
		var Map<String, Integer> size = new HashMap<String, Integer>();
		size.put("width", (origWidth * ratio) as int);
		size.put("height", (origHeight * ratio) as int);
		
		return size; 
	}
	
	def InputStream logoResized(BufferedImage logo, int width, int height) {
		
		
		var Map<String, Integer> size = imageSizeFit(logo.width, logo.height, width, height);
		
		var int newWidth = size.get("width");
		var int newHeight = size.get("height");
		
		
		var BufferedImage redimen = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_RGB);
		var Graphics2D g = redimen.createGraphics();
		g.drawImage(logo, 0, 0, newWidth, newHeight, null);
		g.dispose();
		
		var ByteArrayOutputStream os = new ByteArrayOutputStream();
		ImageIO.write(redimen, "png", os);
		var InputStream is = new ByteArrayInputStream(os.toByteArray());
		
		return is;
		
	}
	
	def generateColorsTemplate (Estilo estilo) '''
		<?xml version="1.0" encoding="utf-8"?>
		<resources>
		    <color name="color_primary">�estilo.corPrimaria.valor�</color>
		    <color name="color_secondary">�estilo.corSecundaria.valor�</color>
		    <color name="color_tertiary">�estilo.corTerciaria.valor�</color>
		    <color name="color_white">#FFFFFF</color>
		    <color name="color_black">#000000</color>
		</resources>
	'''
	
	def generateStringsTemplate (Aplicativo app) '''
	<resources>
	    <!-- Main -->
	    <string name="academic_center_name_initials">�app.nome�</string>
	    <string name="nav_bar_logo">NavBarLogo</string>
	
	    <!-- Home -->
	    <string name="home_welcome">Bem-vindo ao <b>%s</b>!</string>
	
	    <string name="navigation_drawer_open">Open navigation drawer</string>
	    <string name="navigation_drawer_close">Close navigation drawer</string>
	
	    <!--Drawer Menu-->
	    <string name="section_1">Gest�o</string>
	    <string name="section_2">Membros</string>
	    <string name="section_3">Eventos</string>
	    <string name="section_4">Not�cias</string>
	</resources>'''
	
	def generateStylesTemplate (Estilo estilo) '''
	<resources>
	
	    <style name="AppTheme" parent="Theme.AppCompat.Light.DarkActionBar">
	        <item name="colorPrimary" >@color/color_primary</item>
	        <item name="colorAccent">@color/color_primary</item>
	    </style>
	
	    <style name="AppTheme.NoActionBar">
	        <item name="windowActionBar">false</item>
	        <item name="windowNoTitle">true</item>
	    </style>
	    <style name="AppTheme.AppBarOverlay" parent="ThemeOverlay.AppCompat.Dark.ActionBar" />
	    <style name="AppTheme.PopupOverlay" parent="ThemeOverlay.AppCompat.Light" />
	
	    <style name="TextElement">
	        <item name="android:layout_width">wrap_content</item>
	        <item name="android:layout_height">wrap_content</item>
	        <item name="android:includeFontPadding">false</item>
	        <item name="android:lineSpacingMultiplier">1.3</item>
	        <item name="android:fontFamily">�estilo.fonte.toString.toLowerCase�</item>
	    </style>
	
	    <style name="TextElement.H1">
	        <item name="android:textSize">@dimen/font_size_extra_large</item>
	        <item name="android:textColor">@color/color_black</item>
	    </style>
	
	</resources>
	'''
}
