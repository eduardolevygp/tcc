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
import java.net.URL
import org.eclipse.core.runtime.FileLocator
import java.io.FileInputStream
import java.awt.Color

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class AceDslGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		var Aplicativo app = resource.contents.findFirst[item | item instanceof Aplicativo] as Aplicativo;
		
		var URL url = new URL("platform:/plugin/org.xtext.ace.acedsl/base/android/");
		var File file = new File(FileLocator.resolve(url).toURI());
		copyFile(fsa, file, 'android');
				
//		Strings
		fsa.generateFile('android/app/src/main/res/values/strings.xml', generateStringsTemplate(app));
		
//		Colors
		fsa.generateFile('android/app/src/main/res/values/colors.xml', generateColorsTemplate(app.estilo));
		
//		Styles
		fsa.generateFile('android/app/src/main/res/values/styles.xml', generateStylesTemplate(app.estilo));
		
//		Logo
		createLogoFiles(app.estilo.logo, fsa);
		
		
	}
	
	
	def void copyFile (IFileSystemAccess2 fsa, File file, String path) {
		if (file.isDirectory) {
			file.listFiles.forEach[arq | {
				copyFile(fsa, arq, path + '/' + arq.name);
			}];	
		} else {
			fsa.generateFile(path, new FileInputStream(file));
		}
	}
	
	def createLogoFiles(Logo logo, IFileSystemAccess2 fsa) {
		var BufferedImage logoImg = null;
		try {
			logoImg = ImageIO.read(new File(logo.caminho));
		} catch (IOException e) {
			return;
		}
		
		val String basePath = 'android/app/src/main/res/drawable-';
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
	
	def generateColorsTemplate (Estilo estilo)  {
		var String primaria = estilo.corPrimaria.valor;
		var String secundaria = estilo.corSecundaria.valor;
		
		var Color primariaCor = new Color(Integer.parseInt(primaria.trim().substring(1), 16));
		var Color secundariaCor = new Color(Integer.parseInt(secundaria.trim().substring(1), 16));
		
		var String contrastePrimaria = "#FFFFFF";
		var String contrasteSecundaria= "#FFFFFF";
		
		if (contrasteDeCorParaPreto(primariaCor) > 4.5) {
			contrastePrimaria = "#000000";
		} 
		if (contrasteDeCorParaPreto(secundariaCor) > 4.5) {
			contrasteSecundaria= "#000000";
		}
		
		return '''
	<?xml version="1.0" encoding="utf-8"?>
	<resources>
	    <color name="color_white">#FFFFFF</color>
	    <color name="color_black">#000000</color>
	    <color name="color_primary">�primaria�</color>
	    <color name="color_secondary">�secundaria�</color>
	    <color name="color_primary_contrast">�contrastePrimaria�</color>
	    <color name="color_secondary_contrast">�contrasteSecundaria�</color>
	</resources>
	'''
	}
	
	def double contrasteDeCorParaPreto (Color color) {
		
		var double R = colorComponent(color.red/255f);
		var double G = colorComponent(color.green/255f);
		var double B = colorComponent(color.blue/255f);

		
		var double luminancia = 0.2126 * R + 0.7152 * G + 0.0722 * B;
		
		System.out.println((luminancia + 0.05) / 0.05);
		
		return (luminancia + 0.05) / 0.05;
	}
	
	def double colorComponent (double Cs) {
		if (Cs <= 0.03928) {
			return Cs/12.92;
		} else {
			return ((Cs + 0.055)/1.055) ** 2.4;
		}
	}
	
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
	        <item name="android:typeface">�estilo.fonte.toString.toLowerCase�</item>
	    </style>
	
	    <style name="TextElement.H1">
	        <item name="android:textSize">@dimen/font_size_extra_large</item>
	        <item name="android:textColor">@color/color_black</item>
	    </style>
	
	</resources>
	'''
}
