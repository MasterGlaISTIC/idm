/**
 */
package org.xtext.example.survey.survey;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.survey.survey.SurveyFactory
 * @model kind="package"
 * @generated
 */
public interface SurveyPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "survey";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/survey/Survey";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "survey";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SurveyPackage eINSTANCE = org.xtext.example.survey.survey.impl.SurveyPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.survey.survey.impl.surveyImpl <em>survey</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.survey.survey.impl.surveyImpl
   * @see org.xtext.example.survey.survey.impl.SurveyPackageImpl#getsurvey()
   * @generated
   */
  int SURVEY = 0;

  /**
   * The feature id for the '<em><b>Polls</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SURVEY__POLLS = 0;

  /**
   * The number of structural features of the '<em>survey</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SURVEY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.survey.survey.impl.PollImpl <em>Poll</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.survey.survey.impl.PollImpl
   * @see org.xtext.example.survey.survey.impl.SurveyPackageImpl#getPoll()
   * @generated
   */
  int POLL = 1;

  /**
   * The feature id for the '<em><b>Questions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLL__QUESTIONS = 0;

  /**
   * The number of structural features of the '<em>Poll</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.survey.survey.impl.QuestionImpl <em>Question</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.survey.survey.impl.QuestionImpl
   * @see org.xtext.example.survey.survey.impl.SurveyPackageImpl#getQuestion()
   * @generated
   */
  int QUESTION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Options</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTION__OPTIONS = 1;

  /**
   * The number of structural features of the '<em>Question</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.survey.survey.impl.optionImpl <em>option</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.survey.survey.impl.optionImpl
   * @see org.xtext.example.survey.survey.impl.SurveyPackageImpl#getoption()
   * @generated
   */
  int OPTION = 3;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION__TEXT = 0;

  /**
   * The number of structural features of the '<em>option</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link org.xtext.example.survey.survey.survey <em>survey</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>survey</em>'.
   * @see org.xtext.example.survey.survey.survey
   * @generated
   */
  EClass getsurvey();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.survey.survey.survey#getPolls <em>Polls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Polls</em>'.
   * @see org.xtext.example.survey.survey.survey#getPolls()
   * @see #getsurvey()
   * @generated
   */
  EReference getsurvey_Polls();

  /**
   * Returns the meta object for class '{@link org.xtext.example.survey.survey.Poll <em>Poll</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Poll</em>'.
   * @see org.xtext.example.survey.survey.Poll
   * @generated
   */
  EClass getPoll();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.survey.survey.Poll#getQuestions <em>Questions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Questions</em>'.
   * @see org.xtext.example.survey.survey.Poll#getQuestions()
   * @see #getPoll()
   * @generated
   */
  EReference getPoll_Questions();

  /**
   * Returns the meta object for class '{@link org.xtext.example.survey.survey.Question <em>Question</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Question</em>'.
   * @see org.xtext.example.survey.survey.Question
   * @generated
   */
  EClass getQuestion();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.survey.survey.Question#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.survey.survey.Question#getName()
   * @see #getQuestion()
   * @generated
   */
  EAttribute getQuestion_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.survey.survey.Question#getOptions <em>Options</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Options</em>'.
   * @see org.xtext.example.survey.survey.Question#getOptions()
   * @see #getQuestion()
   * @generated
   */
  EReference getQuestion_Options();

  /**
   * Returns the meta object for class '{@link org.xtext.example.survey.survey.option <em>option</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>option</em>'.
   * @see org.xtext.example.survey.survey.option
   * @generated
   */
  EClass getoption();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.survey.survey.option#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see org.xtext.example.survey.survey.option#getText()
   * @see #getoption()
   * @generated
   */
  EAttribute getoption_Text();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SurveyFactory getSurveyFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.survey.survey.impl.surveyImpl <em>survey</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.survey.survey.impl.surveyImpl
     * @see org.xtext.example.survey.survey.impl.SurveyPackageImpl#getsurvey()
     * @generated
     */
    EClass SURVEY = eINSTANCE.getsurvey();

    /**
     * The meta object literal for the '<em><b>Polls</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SURVEY__POLLS = eINSTANCE.getsurvey_Polls();

    /**
     * The meta object literal for the '{@link org.xtext.example.survey.survey.impl.PollImpl <em>Poll</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.survey.survey.impl.PollImpl
     * @see org.xtext.example.survey.survey.impl.SurveyPackageImpl#getPoll()
     * @generated
     */
    EClass POLL = eINSTANCE.getPoll();

    /**
     * The meta object literal for the '<em><b>Questions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POLL__QUESTIONS = eINSTANCE.getPoll_Questions();

    /**
     * The meta object literal for the '{@link org.xtext.example.survey.survey.impl.QuestionImpl <em>Question</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.survey.survey.impl.QuestionImpl
     * @see org.xtext.example.survey.survey.impl.SurveyPackageImpl#getQuestion()
     * @generated
     */
    EClass QUESTION = eINSTANCE.getQuestion();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUESTION__NAME = eINSTANCE.getQuestion_Name();

    /**
     * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUESTION__OPTIONS = eINSTANCE.getQuestion_Options();

    /**
     * The meta object literal for the '{@link org.xtext.example.survey.survey.impl.optionImpl <em>option</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.survey.survey.impl.optionImpl
     * @see org.xtext.example.survey.survey.impl.SurveyPackageImpl#getoption()
     * @generated
     */
    EClass OPTION = eINSTANCE.getoption();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPTION__TEXT = eINSTANCE.getoption_Text();

  }

} //SurveyPackage
