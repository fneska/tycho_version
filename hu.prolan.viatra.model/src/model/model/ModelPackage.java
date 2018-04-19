/**
 */
package model.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see model.model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = model.model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link model.model.impl.TestModelClassImpl <em>Test Model Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.model.impl.TestModelClassImpl
	 * @see model.model.impl.ModelPackageImpl#getTestModelClass()
	 * @generated
	 */
	int TEST_MODEL_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_MODEL_CLASS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Testmodelclasscomp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_MODEL_CLASS__TESTMODELCLASSCOMP = 1;

	/**
	 * The number of structural features of the '<em>Test Model Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_MODEL_CLASS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Test Model Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_MODEL_CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.model.impl.TestModelClassCompImpl <em>Test Model Class Comp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.model.impl.TestModelClassCompImpl
	 * @see model.model.impl.ModelPackageImpl#getTestModelClassComp()
	 * @generated
	 */
	int TEST_MODEL_CLASS_COMP = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_MODEL_CLASS_COMP__NAME = 0;

	/**
	 * The number of structural features of the '<em>Test Model Class Comp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_MODEL_CLASS_COMP_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Test Model Class Comp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_MODEL_CLASS_COMP_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link model.model.TestModelClass <em>Test Model Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Model Class</em>'.
	 * @see model.model.TestModelClass
	 * @generated
	 */
	EClass getTestModelClass();

	/**
	 * Returns the meta object for the attribute '{@link model.model.TestModelClass#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.model.TestModelClass#getName()
	 * @see #getTestModelClass()
	 * @generated
	 */
	EAttribute getTestModelClass_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link model.model.TestModelClass#getTestmodelclasscomp <em>Testmodelclasscomp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Testmodelclasscomp</em>'.
	 * @see model.model.TestModelClass#getTestmodelclasscomp()
	 * @see #getTestModelClass()
	 * @generated
	 */
	EReference getTestModelClass_Testmodelclasscomp();

	/**
	 * Returns the meta object for class '{@link model.model.TestModelClassComp <em>Test Model Class Comp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Model Class Comp</em>'.
	 * @see model.model.TestModelClassComp
	 * @generated
	 */
	EClass getTestModelClassComp();

	/**
	 * Returns the meta object for the attribute '{@link model.model.TestModelClassComp#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.model.TestModelClassComp#getName()
	 * @see #getTestModelClassComp()
	 * @generated
	 */
	EAttribute getTestModelClassComp_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link model.model.impl.TestModelClassImpl <em>Test Model Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.model.impl.TestModelClassImpl
		 * @see model.model.impl.ModelPackageImpl#getTestModelClass()
		 * @generated
		 */
		EClass TEST_MODEL_CLASS = eINSTANCE.getTestModelClass();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_MODEL_CLASS__NAME = eINSTANCE.getTestModelClass_Name();

		/**
		 * The meta object literal for the '<em><b>Testmodelclasscomp</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_MODEL_CLASS__TESTMODELCLASSCOMP = eINSTANCE.getTestModelClass_Testmodelclasscomp();

		/**
		 * The meta object literal for the '{@link model.model.impl.TestModelClassCompImpl <em>Test Model Class Comp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.model.impl.TestModelClassCompImpl
		 * @see model.model.impl.ModelPackageImpl#getTestModelClassComp()
		 * @generated
		 */
		EClass TEST_MODEL_CLASS_COMP = eINSTANCE.getTestModelClassComp();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_MODEL_CLASS_COMP__NAME = eINSTANCE.getTestModelClassComp_Name();

	}

} //ModelPackage
