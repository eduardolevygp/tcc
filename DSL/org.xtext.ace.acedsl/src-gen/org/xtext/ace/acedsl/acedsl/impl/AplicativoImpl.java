/**
 * generated by Xtext 2.9.2
 */
package org.xtext.ace.acedsl.acedsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.ace.acedsl.acedsl.AcedslPackage;
import org.xtext.ace.acedsl.acedsl.Aplicativo;
import org.xtext.ace.acedsl.acedsl.Estilo;
import org.xtext.ace.acedsl.acedsl.SecaoDisciplinas;
import org.xtext.ace.acedsl.acedsl.SecaoEventos;
import org.xtext.ace.acedsl.acedsl.SecaoMembros;
import org.xtext.ace.acedsl.acedsl.SecaoNoticias;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aplicativo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ace.acedsl.acedsl.impl.AplicativoImpl#getNome <em>Nome</em>}</li>
 *   <li>{@link org.xtext.ace.acedsl.acedsl.impl.AplicativoImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.xtext.ace.acedsl.acedsl.impl.AplicativoImpl#getSecaoEventos <em>Secao Eventos</em>}</li>
 *   <li>{@link org.xtext.ace.acedsl.acedsl.impl.AplicativoImpl#getSecaoMembros <em>Secao Membros</em>}</li>
 *   <li>{@link org.xtext.ace.acedsl.acedsl.impl.AplicativoImpl#getSecaoDisciplinas <em>Secao Disciplinas</em>}</li>
 *   <li>{@link org.xtext.ace.acedsl.acedsl.impl.AplicativoImpl#getSecaoNoticias <em>Secao Noticias</em>}</li>
 *   <li>{@link org.xtext.ace.acedsl.acedsl.impl.AplicativoImpl#getEstilo <em>Estilo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AplicativoImpl extends MinimalEObjectImpl.Container implements Aplicativo
{
  /**
   * The default value of the '{@link #getNome() <em>Nome</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNome()
   * @generated
   * @ordered
   */
  protected static final String NOME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNome() <em>Nome</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNome()
   * @generated
   * @ordered
   */
  protected String nome = NOME_EDEFAULT;

  /**
   * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUrl()
   * @generated
   * @ordered
   */
  protected static final String URL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUrl()
   * @generated
   * @ordered
   */
  protected String url = URL_EDEFAULT;

  /**
   * The cached value of the '{@link #getSecaoEventos() <em>Secao Eventos</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecaoEventos()
   * @generated
   * @ordered
   */
  protected SecaoEventos secaoEventos;

  /**
   * The cached value of the '{@link #getSecaoMembros() <em>Secao Membros</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecaoMembros()
   * @generated
   * @ordered
   */
  protected SecaoMembros secaoMembros;

  /**
   * The cached value of the '{@link #getSecaoDisciplinas() <em>Secao Disciplinas</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecaoDisciplinas()
   * @generated
   * @ordered
   */
  protected SecaoDisciplinas secaoDisciplinas;

  /**
   * The cached value of the '{@link #getSecaoNoticias() <em>Secao Noticias</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecaoNoticias()
   * @generated
   * @ordered
   */
  protected SecaoNoticias secaoNoticias;

  /**
   * The cached value of the '{@link #getEstilo() <em>Estilo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEstilo()
   * @generated
   * @ordered
   */
  protected Estilo estilo;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AplicativoImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AcedslPackage.Literals.APLICATIVO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNome()
  {
    return nome;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNome(String newNome)
  {
    String oldNome = nome;
    nome = newNome;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AcedslPackage.APLICATIVO__NOME, oldNome, nome));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUrl()
  {
    return url;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUrl(String newUrl)
  {
    String oldUrl = url;
    url = newUrl;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AcedslPackage.APLICATIVO__URL, oldUrl, url));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SecaoEventos getSecaoEventos()
  {
    return secaoEventos;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSecaoEventos(SecaoEventos newSecaoEventos, NotificationChain msgs)
  {
    SecaoEventos oldSecaoEventos = secaoEventos;
    secaoEventos = newSecaoEventos;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AcedslPackage.APLICATIVO__SECAO_EVENTOS, oldSecaoEventos, newSecaoEventos);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSecaoEventos(SecaoEventos newSecaoEventos)
  {
    if (newSecaoEventos != secaoEventos)
    {
      NotificationChain msgs = null;
      if (secaoEventos != null)
        msgs = ((InternalEObject)secaoEventos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AcedslPackage.APLICATIVO__SECAO_EVENTOS, null, msgs);
      if (newSecaoEventos != null)
        msgs = ((InternalEObject)newSecaoEventos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AcedslPackage.APLICATIVO__SECAO_EVENTOS, null, msgs);
      msgs = basicSetSecaoEventos(newSecaoEventos, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AcedslPackage.APLICATIVO__SECAO_EVENTOS, newSecaoEventos, newSecaoEventos));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SecaoMembros getSecaoMembros()
  {
    return secaoMembros;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSecaoMembros(SecaoMembros newSecaoMembros, NotificationChain msgs)
  {
    SecaoMembros oldSecaoMembros = secaoMembros;
    secaoMembros = newSecaoMembros;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AcedslPackage.APLICATIVO__SECAO_MEMBROS, oldSecaoMembros, newSecaoMembros);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSecaoMembros(SecaoMembros newSecaoMembros)
  {
    if (newSecaoMembros != secaoMembros)
    {
      NotificationChain msgs = null;
      if (secaoMembros != null)
        msgs = ((InternalEObject)secaoMembros).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AcedslPackage.APLICATIVO__SECAO_MEMBROS, null, msgs);
      if (newSecaoMembros != null)
        msgs = ((InternalEObject)newSecaoMembros).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AcedslPackage.APLICATIVO__SECAO_MEMBROS, null, msgs);
      msgs = basicSetSecaoMembros(newSecaoMembros, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AcedslPackage.APLICATIVO__SECAO_MEMBROS, newSecaoMembros, newSecaoMembros));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SecaoDisciplinas getSecaoDisciplinas()
  {
    return secaoDisciplinas;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSecaoDisciplinas(SecaoDisciplinas newSecaoDisciplinas, NotificationChain msgs)
  {
    SecaoDisciplinas oldSecaoDisciplinas = secaoDisciplinas;
    secaoDisciplinas = newSecaoDisciplinas;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AcedslPackage.APLICATIVO__SECAO_DISCIPLINAS, oldSecaoDisciplinas, newSecaoDisciplinas);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSecaoDisciplinas(SecaoDisciplinas newSecaoDisciplinas)
  {
    if (newSecaoDisciplinas != secaoDisciplinas)
    {
      NotificationChain msgs = null;
      if (secaoDisciplinas != null)
        msgs = ((InternalEObject)secaoDisciplinas).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AcedslPackage.APLICATIVO__SECAO_DISCIPLINAS, null, msgs);
      if (newSecaoDisciplinas != null)
        msgs = ((InternalEObject)newSecaoDisciplinas).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AcedslPackage.APLICATIVO__SECAO_DISCIPLINAS, null, msgs);
      msgs = basicSetSecaoDisciplinas(newSecaoDisciplinas, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AcedslPackage.APLICATIVO__SECAO_DISCIPLINAS, newSecaoDisciplinas, newSecaoDisciplinas));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SecaoNoticias getSecaoNoticias()
  {
    return secaoNoticias;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSecaoNoticias(SecaoNoticias newSecaoNoticias, NotificationChain msgs)
  {
    SecaoNoticias oldSecaoNoticias = secaoNoticias;
    secaoNoticias = newSecaoNoticias;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AcedslPackage.APLICATIVO__SECAO_NOTICIAS, oldSecaoNoticias, newSecaoNoticias);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSecaoNoticias(SecaoNoticias newSecaoNoticias)
  {
    if (newSecaoNoticias != secaoNoticias)
    {
      NotificationChain msgs = null;
      if (secaoNoticias != null)
        msgs = ((InternalEObject)secaoNoticias).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AcedslPackage.APLICATIVO__SECAO_NOTICIAS, null, msgs);
      if (newSecaoNoticias != null)
        msgs = ((InternalEObject)newSecaoNoticias).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AcedslPackage.APLICATIVO__SECAO_NOTICIAS, null, msgs);
      msgs = basicSetSecaoNoticias(newSecaoNoticias, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AcedslPackage.APLICATIVO__SECAO_NOTICIAS, newSecaoNoticias, newSecaoNoticias));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Estilo getEstilo()
  {
    return estilo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEstilo(Estilo newEstilo, NotificationChain msgs)
  {
    Estilo oldEstilo = estilo;
    estilo = newEstilo;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AcedslPackage.APLICATIVO__ESTILO, oldEstilo, newEstilo);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEstilo(Estilo newEstilo)
  {
    if (newEstilo != estilo)
    {
      NotificationChain msgs = null;
      if (estilo != null)
        msgs = ((InternalEObject)estilo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AcedslPackage.APLICATIVO__ESTILO, null, msgs);
      if (newEstilo != null)
        msgs = ((InternalEObject)newEstilo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AcedslPackage.APLICATIVO__ESTILO, null, msgs);
      msgs = basicSetEstilo(newEstilo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AcedslPackage.APLICATIVO__ESTILO, newEstilo, newEstilo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AcedslPackage.APLICATIVO__SECAO_EVENTOS:
        return basicSetSecaoEventos(null, msgs);
      case AcedslPackage.APLICATIVO__SECAO_MEMBROS:
        return basicSetSecaoMembros(null, msgs);
      case AcedslPackage.APLICATIVO__SECAO_DISCIPLINAS:
        return basicSetSecaoDisciplinas(null, msgs);
      case AcedslPackage.APLICATIVO__SECAO_NOTICIAS:
        return basicSetSecaoNoticias(null, msgs);
      case AcedslPackage.APLICATIVO__ESTILO:
        return basicSetEstilo(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AcedslPackage.APLICATIVO__NOME:
        return getNome();
      case AcedslPackage.APLICATIVO__URL:
        return getUrl();
      case AcedslPackage.APLICATIVO__SECAO_EVENTOS:
        return getSecaoEventos();
      case AcedslPackage.APLICATIVO__SECAO_MEMBROS:
        return getSecaoMembros();
      case AcedslPackage.APLICATIVO__SECAO_DISCIPLINAS:
        return getSecaoDisciplinas();
      case AcedslPackage.APLICATIVO__SECAO_NOTICIAS:
        return getSecaoNoticias();
      case AcedslPackage.APLICATIVO__ESTILO:
        return getEstilo();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AcedslPackage.APLICATIVO__NOME:
        setNome((String)newValue);
        return;
      case AcedslPackage.APLICATIVO__URL:
        setUrl((String)newValue);
        return;
      case AcedslPackage.APLICATIVO__SECAO_EVENTOS:
        setSecaoEventos((SecaoEventos)newValue);
        return;
      case AcedslPackage.APLICATIVO__SECAO_MEMBROS:
        setSecaoMembros((SecaoMembros)newValue);
        return;
      case AcedslPackage.APLICATIVO__SECAO_DISCIPLINAS:
        setSecaoDisciplinas((SecaoDisciplinas)newValue);
        return;
      case AcedslPackage.APLICATIVO__SECAO_NOTICIAS:
        setSecaoNoticias((SecaoNoticias)newValue);
        return;
      case AcedslPackage.APLICATIVO__ESTILO:
        setEstilo((Estilo)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AcedslPackage.APLICATIVO__NOME:
        setNome(NOME_EDEFAULT);
        return;
      case AcedslPackage.APLICATIVO__URL:
        setUrl(URL_EDEFAULT);
        return;
      case AcedslPackage.APLICATIVO__SECAO_EVENTOS:
        setSecaoEventos((SecaoEventos)null);
        return;
      case AcedslPackage.APLICATIVO__SECAO_MEMBROS:
        setSecaoMembros((SecaoMembros)null);
        return;
      case AcedslPackage.APLICATIVO__SECAO_DISCIPLINAS:
        setSecaoDisciplinas((SecaoDisciplinas)null);
        return;
      case AcedslPackage.APLICATIVO__SECAO_NOTICIAS:
        setSecaoNoticias((SecaoNoticias)null);
        return;
      case AcedslPackage.APLICATIVO__ESTILO:
        setEstilo((Estilo)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AcedslPackage.APLICATIVO__NOME:
        return NOME_EDEFAULT == null ? nome != null : !NOME_EDEFAULT.equals(nome);
      case AcedslPackage.APLICATIVO__URL:
        return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
      case AcedslPackage.APLICATIVO__SECAO_EVENTOS:
        return secaoEventos != null;
      case AcedslPackage.APLICATIVO__SECAO_MEMBROS:
        return secaoMembros != null;
      case AcedslPackage.APLICATIVO__SECAO_DISCIPLINAS:
        return secaoDisciplinas != null;
      case AcedslPackage.APLICATIVO__SECAO_NOTICIAS:
        return secaoNoticias != null;
      case AcedslPackage.APLICATIVO__ESTILO:
        return estilo != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (nome: ");
    result.append(nome);
    result.append(", url: ");
    result.append(url);
    result.append(')');
    return result.toString();
  }

} //AplicativoImpl