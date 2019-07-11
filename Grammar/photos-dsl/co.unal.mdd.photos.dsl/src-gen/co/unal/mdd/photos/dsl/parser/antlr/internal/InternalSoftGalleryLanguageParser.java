package co.unal.mdd.photos.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import co.unal.mdd.photos.dsl.services.SoftGalleryLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSoftGalleryLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'System'", "':'", "'{'", "'}'", "'Domain'", "'Entities'", "'Photo'", "'Album'", "'UserDomain'", "'Functionalities'", "'ProfileManagement'", "'ViewProfilePhoto'", "'EditProfileInfo'", "'AppAccess'", "'Login'", "'Register'", "'AlbumManagement'", "'CreateAlbum'", "'SelectAlbum'", "'PhotoActions'", "'ViewAllPhotos'", "'ViewExtendedPhoto'", "'LoadPhoto'", "'LandingActions'", "'ViewCarousel'", "'PassPhoto'", "'DomainRelations'", "'Architecture:'", "'Layers'", "'LayersRelations'", "'ArchitectureComponents'", "'PresentationLayer'", "'PresentationSegments'", "'PresentationView'", "'PresentationComponent'", "'PresentationAction'", "'BusinessLogicLayer'", "'BusinessLogicSegments'", "'ControllerSegment'", "'ModelSegment'", "'RepositorySegment'", "'SecuritySegment'", "'DataPersistenceLayer'", "'DataPersistenceSegments'", "'PostgreSLQSegment'", "'AmazonS3Storage'", "'SegmentStructure'", "'Directories'", "'Directory'", "'SingleFile'", "'CommonFile'", "'AllowedToUse'", "'AllowToUseBelow'", "'source'", "'target'", "'PersistenceDataLayer'", "'SystemComponents'", "'FrontEndComponent'", "'BackEndComponent'", "'PersistenceDataComponent'", "'Connectors'", "'REST'", "'PostgreSQLConnection'", "'AmazonS3API'", "'AmazonService'", "'Technology'", "'Spring'", "'SpringBootApplication'", "'Configuration'", "'EnableGlobalMethodSecurity'", "'EnableAuthorizationServer'", "'EnableResourceServer'", "'EnableWebSecurity'", "'SpringComponent'", "'OrderSpring'", "'SpringRepositories'", "'SpringRepository'", "'RestController'", "'Specification'", "'Predicate'", "'SearchCriteria'", "'Autowired'", "'AutowiredType'", "'RequestMapping'", "'RequestPart'", "'RequestMappingType'", "'PostMapping'", "'GetMapping'", "'PutMapping'", "'DeleteMapping'", "'ExceptionHandler'", "'ExceptionProcess'", "'SpringEntity'", "'SpringTable'", "'SpringTableId'", "'GeneratedValue'", "'Column'", "'NameNativeQuery'", "'React'", "'ReactModules'", "'ReactConfiguration'", "'DependenciesStruct'", "'DependencyType'", "'PackageName'", "'PackageVersion'", "'ReactDOMConfigurations'", "'RoutingConf'", "'ServiceWorker'", "'HTMLStructure'", "'Manifest'", "'RepositoriesConf'", "'ReactComponents'", "'LogicComponents'", "'RoutingComponents'", "'AppComponent'", "'IndexComponent'", "'UIComponents'", "'ViewComponent'", "'Subcomponents'", "'import'", "'Constructor'", "'State'", "'String'", "'Array'", "'Object'", "'Number'", "'null'", "'Boolean'", "'FunctionBindingDeclaration'", "'ComponentDidMount'", "'FunctionStructure'", "'ComponentDidUpdate'", "'ComponentWillUnmount'", "'Render'", "'RenderContent'", "'Props'", "'ReactActions'", "'ServiceType'", "'ServiceContent'", "'ServicesRelations'", "'Wrapper'", "'AuxWrapper'", "'ReactLibraries'", "'LibraryContent'", "'ReactDesign'", "'ReactRouting'", "'ComponentManagement'", "'StoreManagement'", "'ReactDeployment'", "'ConfigurationLibrary'", "'ReactInformation'", "'InformationContent'", "'ReactReadme'", "'ReactAditionalInfo'", "'PostgreSQL'", "'Database'", "'Schema'", "'Index_p'", "'ViewSchema'", "'Table_p'", "'ForeignKey'", "'ForeingKeyName'", "'ForeignKeyRef'", "'RefTable_p'", "'DatatypeDB'", "'Constraint'", "'Row'", "'Policy'", "'Trigger'", "'Function'", "'PostgresUser'", "'Privilege'", "'Query'", "'Clause'", "'AmazonWebServices'", "'AmazonSimpleStorageService'", "'BatchOperation'", "'Bucket'", "'BucketAccess'", "'PublicAccess'", "'ObjectsPublic'", "'BucketObjectsNotPublic'", "'OnlyAuthorized'", "'AmazonFolder'", "'AmazonFile'", "'Metadata'", "'AmazonElasticComputeCloud'"
    };
    public static final int T__144=144;
    public static final int T__143=143;
    public static final int T__146=146;
    public static final int T__50=50;
    public static final int T__145=145;
    public static final int T__140=140;
    public static final int T__142=142;
    public static final int T__141=141;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__137=137;
    public static final int T__52=52;
    public static final int T__136=136;
    public static final int T__53=53;
    public static final int T__139=139;
    public static final int T__54=54;
    public static final int T__138=138;
    public static final int T__133=133;
    public static final int T__132=132;
    public static final int T__60=60;
    public static final int T__135=135;
    public static final int T__61=61;
    public static final int T__134=134;
    public static final int RULE_ID=4;
    public static final int T__131=131;
    public static final int T__130=130;
    public static final int RULE_INT=5;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__129=129;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__126=126;
    public static final int T__63=63;
    public static final int T__125=125;
    public static final int T__64=64;
    public static final int T__128=128;
    public static final int T__65=65;
    public static final int T__127=127;
    public static final int T__166=166;
    public static final int T__165=165;
    public static final int T__168=168;
    public static final int T__167=167;
    public static final int T__162=162;
    public static final int T__161=161;
    public static final int T__164=164;
    public static final int T__163=163;
    public static final int T__160=160;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__159=159;
    public static final int T__30=30;
    public static final int T__158=158;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__155=155;
    public static final int T__154=154;
    public static final int T__157=157;
    public static final int T__156=156;
    public static final int T__151=151;
    public static final int T__150=150;
    public static final int T__153=153;
    public static final int T__152=152;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__148=148;
    public static final int T__41=41;
    public static final int T__147=147;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__149=149;
    public static final int T__100=100;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__122=122;
    public static final int T__121=121;
    public static final int T__124=124;
    public static final int T__123=123;
    public static final int T__120=120;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__119=119;
    public static final int T__118=118;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__114=114;
    public static final int T__117=117;
    public static final int T__116=116;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int T__113=113;
    public static final int T__112=112;
    public static final int T__108=108;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__104=104;
    public static final int T__103=103;
    public static final int T__106=106;
    public static final int T__105=105;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__91=91;
    public static final int T__188=188;
    public static final int T__92=92;
    public static final int T__187=187;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__189=189;
    public static final int T__184=184;
    public static final int T__183=183;
    public static final int T__186=186;
    public static final int T__90=90;
    public static final int T__185=185;
    public static final int T__180=180;
    public static final int T__182=182;
    public static final int T__181=181;
    public static final int T__99=99;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__177=177;
    public static final int T__176=176;
    public static final int T__179=179;
    public static final int T__178=178;
    public static final int T__173=173;
    public static final int T__172=172;
    public static final int T__175=175;
    public static final int T__174=174;
    public static final int T__171=171;
    public static final int T__170=170;
    public static final int T__169=169;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=6;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__195=195;
    public static final int T__194=194;
    public static final int RULE_WS=9;
    public static final int T__197=197;
    public static final int T__196=196;
    public static final int T__191=191;
    public static final int T__190=190;
    public static final int T__193=193;
    public static final int T__192=192;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

    // delegates
    // delegators


        public InternalSoftGalleryLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSoftGalleryLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSoftGalleryLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSoftGalleryLanguage.g"; }



     	private SoftGalleryLanguageGrammarAccess grammarAccess;

        public InternalSoftGalleryLanguageParser(TokenStream input, SoftGalleryLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected SoftGalleryLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalSoftGalleryLanguage.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalSoftGalleryLanguage.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalSoftGalleryLanguage.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalSoftGalleryLanguage.g:71:1: ruleModel returns [EObject current=null] : (otherlv_0= 'System' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleDomain ) ) ( (lv_elements_4_0= ruleArchitecture ) ) ( (lv_elements_5_0= ruleTechnology ) ) otherlv_6= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_elements_3_0 = null;

        EObject lv_elements_4_0 = null;

        EObject lv_elements_5_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:77:2: ( (otherlv_0= 'System' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleDomain ) ) ( (lv_elements_4_0= ruleArchitecture ) ) ( (lv_elements_5_0= ruleTechnology ) ) otherlv_6= '}' ) )
            // InternalSoftGalleryLanguage.g:78:2: (otherlv_0= 'System' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleDomain ) ) ( (lv_elements_4_0= ruleArchitecture ) ) ( (lv_elements_5_0= ruleTechnology ) ) otherlv_6= '}' )
            {
            // InternalSoftGalleryLanguage.g:78:2: (otherlv_0= 'System' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleDomain ) ) ( (lv_elements_4_0= ruleArchitecture ) ) ( (lv_elements_5_0= ruleTechnology ) ) otherlv_6= '}' )
            // InternalSoftGalleryLanguage.g:79:3: otherlv_0= 'System' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleDomain ) ) ( (lv_elements_4_0= ruleArchitecture ) ) ( (lv_elements_5_0= ruleTechnology ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getSystemKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getModelAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSoftGalleryLanguage.g:91:3: ( (lv_elements_3_0= ruleDomain ) )
            // InternalSoftGalleryLanguage.g:92:4: (lv_elements_3_0= ruleDomain )
            {
            // InternalSoftGalleryLanguage.g:92:4: (lv_elements_3_0= ruleDomain )
            // InternalSoftGalleryLanguage.g:93:5: lv_elements_3_0= ruleDomain
            {

            					newCompositeNode(grammarAccess.getModelAccess().getElementsDomainParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_elements_3_0=ruleDomain();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_3_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.Domain");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftGalleryLanguage.g:110:3: ( (lv_elements_4_0= ruleArchitecture ) )
            // InternalSoftGalleryLanguage.g:111:4: (lv_elements_4_0= ruleArchitecture )
            {
            // InternalSoftGalleryLanguage.g:111:4: (lv_elements_4_0= ruleArchitecture )
            // InternalSoftGalleryLanguage.g:112:5: lv_elements_4_0= ruleArchitecture
            {

            					newCompositeNode(grammarAccess.getModelAccess().getElementsArchitectureParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_elements_4_0=ruleArchitecture();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_4_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.Architecture");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftGalleryLanguage.g:129:3: ( (lv_elements_5_0= ruleTechnology ) )
            // InternalSoftGalleryLanguage.g:130:4: (lv_elements_5_0= ruleTechnology )
            {
            // InternalSoftGalleryLanguage.g:130:4: (lv_elements_5_0= ruleTechnology )
            // InternalSoftGalleryLanguage.g:131:5: lv_elements_5_0= ruleTechnology
            {

            					newCompositeNode(grammarAccess.getModelAccess().getElementsTechnologyParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_elements_5_0=ruleTechnology();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_5_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.Technology");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleDomain"
    // InternalSoftGalleryLanguage.g:156:1: entryRuleDomain returns [EObject current=null] : iv_ruleDomain= ruleDomain EOF ;
    public final EObject entryRuleDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomain = null;


        try {
            // InternalSoftGalleryLanguage.g:156:47: (iv_ruleDomain= ruleDomain EOF )
            // InternalSoftGalleryLanguage.g:157:2: iv_ruleDomain= ruleDomain EOF
            {
             newCompositeNode(grammarAccess.getDomainRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDomain=ruleDomain();

            state._fsp--;

             current =iv_ruleDomain; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDomain"


    // $ANTLR start "ruleDomain"
    // InternalSoftGalleryLanguage.g:163:1: ruleDomain returns [EObject current=null] : (otherlv_0= 'Domain' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleEntity ) ) ( (lv_elements_5_0= ruleFunctionality ) ) ( (lv_elements_6_0= ruleDomainConnection ) ) otherlv_7= '}' ) ;
    public final EObject ruleDomain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_7=null;
        EObject lv_elements_4_0 = null;

        EObject lv_elements_5_0 = null;

        EObject lv_elements_6_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:169:2: ( (otherlv_0= 'Domain' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleEntity ) ) ( (lv_elements_5_0= ruleFunctionality ) ) ( (lv_elements_6_0= ruleDomainConnection ) ) otherlv_7= '}' ) )
            // InternalSoftGalleryLanguage.g:170:2: (otherlv_0= 'Domain' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleEntity ) ) ( (lv_elements_5_0= ruleFunctionality ) ) ( (lv_elements_6_0= ruleDomainConnection ) ) otherlv_7= '}' )
            {
            // InternalSoftGalleryLanguage.g:170:2: (otherlv_0= 'Domain' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleEntity ) ) ( (lv_elements_5_0= ruleFunctionality ) ) ( (lv_elements_6_0= ruleDomainConnection ) ) otherlv_7= '}' )
            // InternalSoftGalleryLanguage.g:171:3: otherlv_0= 'Domain' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleEntity ) ) ( (lv_elements_5_0= ruleFunctionality ) ) ( (lv_elements_6_0= ruleDomainConnection ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getDomainAccess().getDomainKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:175:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:176:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:176:4: (lv_name_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:177:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDomainAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDomainRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getDomainAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getDomainAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSoftGalleryLanguage.g:201:3: ( (lv_elements_4_0= ruleEntity ) )
            // InternalSoftGalleryLanguage.g:202:4: (lv_elements_4_0= ruleEntity )
            {
            // InternalSoftGalleryLanguage.g:202:4: (lv_elements_4_0= ruleEntity )
            // InternalSoftGalleryLanguage.g:203:5: lv_elements_4_0= ruleEntity
            {

            					newCompositeNode(grammarAccess.getDomainAccess().getElementsEntityParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_11);
            lv_elements_4_0=ruleEntity();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDomainRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_4_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.Entity");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftGalleryLanguage.g:220:3: ( (lv_elements_5_0= ruleFunctionality ) )
            // InternalSoftGalleryLanguage.g:221:4: (lv_elements_5_0= ruleFunctionality )
            {
            // InternalSoftGalleryLanguage.g:221:4: (lv_elements_5_0= ruleFunctionality )
            // InternalSoftGalleryLanguage.g:222:5: lv_elements_5_0= ruleFunctionality
            {

            					newCompositeNode(grammarAccess.getDomainAccess().getElementsFunctionalityParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_12);
            lv_elements_5_0=ruleFunctionality();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDomainRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_5_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.Functionality");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftGalleryLanguage.g:239:3: ( (lv_elements_6_0= ruleDomainConnection ) )
            // InternalSoftGalleryLanguage.g:240:4: (lv_elements_6_0= ruleDomainConnection )
            {
            // InternalSoftGalleryLanguage.g:240:4: (lv_elements_6_0= ruleDomainConnection )
            // InternalSoftGalleryLanguage.g:241:5: lv_elements_6_0= ruleDomainConnection
            {

            					newCompositeNode(grammarAccess.getDomainAccess().getElementsDomainConnectionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_8);
            lv_elements_6_0=ruleDomainConnection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDomainRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_6_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.DomainConnection");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getDomainAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDomain"


    // $ANTLR start "entryRuleEntity"
    // InternalSoftGalleryLanguage.g:266:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalSoftGalleryLanguage.g:266:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalSoftGalleryLanguage.g:267:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalSoftGalleryLanguage.g:273:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'Entities' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleEntities ) ) otherlv_4= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:279:2: ( (otherlv_0= 'Entities' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleEntities ) ) otherlv_4= '}' ) )
            // InternalSoftGalleryLanguage.g:280:2: (otherlv_0= 'Entities' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleEntities ) ) otherlv_4= '}' )
            {
            // InternalSoftGalleryLanguage.g:280:2: (otherlv_0= 'Entities' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleEntities ) ) otherlv_4= '}' )
            // InternalSoftGalleryLanguage.g:281:3: otherlv_0= 'Entities' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleEntities ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntitiesKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSoftGalleryLanguage.g:293:3: ( (lv_elements_3_0= ruleEntities ) )
            // InternalSoftGalleryLanguage.g:294:4: (lv_elements_3_0= ruleEntities )
            {
            // InternalSoftGalleryLanguage.g:294:4: (lv_elements_3_0= ruleEntities )
            // InternalSoftGalleryLanguage.g:295:5: lv_elements_3_0= ruleEntities
            {

            					newCompositeNode(grammarAccess.getEntityAccess().getElementsEntitiesParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_elements_3_0=ruleEntities();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntityRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_3_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.Entities");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleEntities"
    // InternalSoftGalleryLanguage.g:320:1: entryRuleEntities returns [EObject current=null] : iv_ruleEntities= ruleEntities EOF ;
    public final EObject entryRuleEntities() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntities = null;


        try {
            // InternalSoftGalleryLanguage.g:320:49: (iv_ruleEntities= ruleEntities EOF )
            // InternalSoftGalleryLanguage.g:321:2: iv_ruleEntities= ruleEntities EOF
            {
             newCompositeNode(grammarAccess.getEntitiesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntities=ruleEntities();

            state._fsp--;

             current =iv_ruleEntities; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntities"


    // $ANTLR start "ruleEntities"
    // InternalSoftGalleryLanguage.g:327:1: ruleEntities returns [EObject current=null] : ( ( (lv_photoelements_0_0= rulePhoto ) )+ ( (lv_albumelements_1_0= ruleAlbum ) )+ ( (lv_userdomainelements_2_0= ruleUserDomain ) )+ ) ;
    public final EObject ruleEntities() throws RecognitionException {
        EObject current = null;

        EObject lv_photoelements_0_0 = null;

        EObject lv_albumelements_1_0 = null;

        EObject lv_userdomainelements_2_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:333:2: ( ( ( (lv_photoelements_0_0= rulePhoto ) )+ ( (lv_albumelements_1_0= ruleAlbum ) )+ ( (lv_userdomainelements_2_0= ruleUserDomain ) )+ ) )
            // InternalSoftGalleryLanguage.g:334:2: ( ( (lv_photoelements_0_0= rulePhoto ) )+ ( (lv_albumelements_1_0= ruleAlbum ) )+ ( (lv_userdomainelements_2_0= ruleUserDomain ) )+ )
            {
            // InternalSoftGalleryLanguage.g:334:2: ( ( (lv_photoelements_0_0= rulePhoto ) )+ ( (lv_albumelements_1_0= ruleAlbum ) )+ ( (lv_userdomainelements_2_0= ruleUserDomain ) )+ )
            // InternalSoftGalleryLanguage.g:335:3: ( (lv_photoelements_0_0= rulePhoto ) )+ ( (lv_albumelements_1_0= ruleAlbum ) )+ ( (lv_userdomainelements_2_0= ruleUserDomain ) )+
            {
            // InternalSoftGalleryLanguage.g:335:3: ( (lv_photoelements_0_0= rulePhoto ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSoftGalleryLanguage.g:336:4: (lv_photoelements_0_0= rulePhoto )
            	    {
            	    // InternalSoftGalleryLanguage.g:336:4: (lv_photoelements_0_0= rulePhoto )
            	    // InternalSoftGalleryLanguage.g:337:5: lv_photoelements_0_0= rulePhoto
            	    {

            	    					newCompositeNode(grammarAccess.getEntitiesAccess().getPhotoelementsPhotoParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_photoelements_0_0=rulePhoto();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntitiesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"photoelements",
            	    						lv_photoelements_0_0,
            	    						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.Photo");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // InternalSoftGalleryLanguage.g:354:3: ( (lv_albumelements_1_0= ruleAlbum ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSoftGalleryLanguage.g:355:4: (lv_albumelements_1_0= ruleAlbum )
            	    {
            	    // InternalSoftGalleryLanguage.g:355:4: (lv_albumelements_1_0= ruleAlbum )
            	    // InternalSoftGalleryLanguage.g:356:5: lv_albumelements_1_0= ruleAlbum
            	    {

            	    					newCompositeNode(grammarAccess.getEntitiesAccess().getAlbumelementsAlbumParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_albumelements_1_0=ruleAlbum();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntitiesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"albumelements",
            	    						lv_albumelements_1_0,
            	    						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.Album");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            // InternalSoftGalleryLanguage.g:373:3: ( (lv_userdomainelements_2_0= ruleUserDomain ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==19) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSoftGalleryLanguage.g:374:4: (lv_userdomainelements_2_0= ruleUserDomain )
            	    {
            	    // InternalSoftGalleryLanguage.g:374:4: (lv_userdomainelements_2_0= ruleUserDomain )
            	    // InternalSoftGalleryLanguage.g:375:5: lv_userdomainelements_2_0= ruleUserDomain
            	    {

            	    					newCompositeNode(grammarAccess.getEntitiesAccess().getUserdomainelementsUserDomainParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_userdomainelements_2_0=ruleUserDomain();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntitiesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"userdomainelements",
            	    						lv_userdomainelements_2_0,
            	    						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.UserDomain");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntities"


    // $ANTLR start "entryRulePhoto"
    // InternalSoftGalleryLanguage.g:396:1: entryRulePhoto returns [EObject current=null] : iv_rulePhoto= rulePhoto EOF ;
    public final EObject entryRulePhoto() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhoto = null;


        try {
            // InternalSoftGalleryLanguage.g:396:46: (iv_rulePhoto= rulePhoto EOF )
            // InternalSoftGalleryLanguage.g:397:2: iv_rulePhoto= rulePhoto EOF
            {
             newCompositeNode(grammarAccess.getPhotoRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePhoto=rulePhoto();

            state._fsp--;

             current =iv_rulePhoto; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePhoto"


    // $ANTLR start "rulePhoto"
    // InternalSoftGalleryLanguage.g:403:1: rulePhoto returns [EObject current=null] : (otherlv_0= 'Photo' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePhoto() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:409:2: ( (otherlv_0= 'Photo' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftGalleryLanguage.g:410:2: (otherlv_0= 'Photo' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftGalleryLanguage.g:410:2: (otherlv_0= 'Photo' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftGalleryLanguage.g:411:3: otherlv_0= 'Photo' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getPhotoAccess().getPhotoKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:415:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:416:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:416:4: (lv_name_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:417:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPhotoAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPhotoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePhoto"


    // $ANTLR start "entryRuleAlbum"
    // InternalSoftGalleryLanguage.g:437:1: entryRuleAlbum returns [EObject current=null] : iv_ruleAlbum= ruleAlbum EOF ;
    public final EObject entryRuleAlbum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlbum = null;


        try {
            // InternalSoftGalleryLanguage.g:437:46: (iv_ruleAlbum= ruleAlbum EOF )
            // InternalSoftGalleryLanguage.g:438:2: iv_ruleAlbum= ruleAlbum EOF
            {
             newCompositeNode(grammarAccess.getAlbumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlbum=ruleAlbum();

            state._fsp--;

             current =iv_ruleAlbum; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlbum"


    // $ANTLR start "ruleAlbum"
    // InternalSoftGalleryLanguage.g:444:1: ruleAlbum returns [EObject current=null] : (otherlv_0= 'Album' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAlbum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:450:2: ( (otherlv_0= 'Album' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftGalleryLanguage.g:451:2: (otherlv_0= 'Album' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftGalleryLanguage.g:451:2: (otherlv_0= 'Album' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftGalleryLanguage.g:452:3: otherlv_0= 'Album' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getAlbumAccess().getAlbumKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:456:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:457:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:457:4: (lv_name_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:458:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAlbumAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAlbumRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlbum"


    // $ANTLR start "entryRuleUserDomain"
    // InternalSoftGalleryLanguage.g:478:1: entryRuleUserDomain returns [EObject current=null] : iv_ruleUserDomain= ruleUserDomain EOF ;
    public final EObject entryRuleUserDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUserDomain = null;


        try {
            // InternalSoftGalleryLanguage.g:478:51: (iv_ruleUserDomain= ruleUserDomain EOF )
            // InternalSoftGalleryLanguage.g:479:2: iv_ruleUserDomain= ruleUserDomain EOF
            {
             newCompositeNode(grammarAccess.getUserDomainRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUserDomain=ruleUserDomain();

            state._fsp--;

             current =iv_ruleUserDomain; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUserDomain"


    // $ANTLR start "ruleUserDomain"
    // InternalSoftGalleryLanguage.g:485:1: ruleUserDomain returns [EObject current=null] : (otherlv_0= 'UserDomain' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleUserDomain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:491:2: ( (otherlv_0= 'UserDomain' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftGalleryLanguage.g:492:2: (otherlv_0= 'UserDomain' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftGalleryLanguage.g:492:2: (otherlv_0= 'UserDomain' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftGalleryLanguage.g:493:3: otherlv_0= 'UserDomain' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getUserDomainAccess().getUserDomainKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:497:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:498:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:498:4: (lv_name_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:499:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getUserDomainAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUserDomainRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUserDomain"


    // $ANTLR start "entryRuleFunctionality"
    // InternalSoftGalleryLanguage.g:519:1: entryRuleFunctionality returns [EObject current=null] : iv_ruleFunctionality= ruleFunctionality EOF ;
    public final EObject entryRuleFunctionality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionality = null;


        try {
            // InternalSoftGalleryLanguage.g:519:54: (iv_ruleFunctionality= ruleFunctionality EOF )
            // InternalSoftGalleryLanguage.g:520:2: iv_ruleFunctionality= ruleFunctionality EOF
            {
             newCompositeNode(grammarAccess.getFunctionalityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionality=ruleFunctionality();

            state._fsp--;

             current =iv_ruleFunctionality; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionality"


    // $ANTLR start "ruleFunctionality"
    // InternalSoftGalleryLanguage.g:526:1: ruleFunctionality returns [EObject current=null] : (otherlv_0= 'Functionalities' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleFunctionalities ) ) otherlv_4= '}' ) ;
    public final EObject ruleFunctionality() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:532:2: ( (otherlv_0= 'Functionalities' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleFunctionalities ) ) otherlv_4= '}' ) )
            // InternalSoftGalleryLanguage.g:533:2: (otherlv_0= 'Functionalities' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleFunctionalities ) ) otherlv_4= '}' )
            {
            // InternalSoftGalleryLanguage.g:533:2: (otherlv_0= 'Functionalities' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleFunctionalities ) ) otherlv_4= '}' )
            // InternalSoftGalleryLanguage.g:534:3: otherlv_0= 'Functionalities' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleFunctionalities ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionalityAccess().getFunctionalitiesKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getFunctionalityAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getFunctionalityAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSoftGalleryLanguage.g:546:3: ( (lv_elements_3_0= ruleFunctionalities ) )
            // InternalSoftGalleryLanguage.g:547:4: (lv_elements_3_0= ruleFunctionalities )
            {
            // InternalSoftGalleryLanguage.g:547:4: (lv_elements_3_0= ruleFunctionalities )
            // InternalSoftGalleryLanguage.g:548:5: lv_elements_3_0= ruleFunctionalities
            {

            					newCompositeNode(grammarAccess.getFunctionalityAccess().getElementsFunctionalitiesParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_elements_3_0=ruleFunctionalities();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionalityRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_3_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.Functionalities");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getFunctionalityAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionality"


    // $ANTLR start "entryRuleFunctionalities"
    // InternalSoftGalleryLanguage.g:573:1: entryRuleFunctionalities returns [EObject current=null] : iv_ruleFunctionalities= ruleFunctionalities EOF ;
    public final EObject entryRuleFunctionalities() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionalities = null;


        try {
            // InternalSoftGalleryLanguage.g:573:56: (iv_ruleFunctionalities= ruleFunctionalities EOF )
            // InternalSoftGalleryLanguage.g:574:2: iv_ruleFunctionalities= ruleFunctionalities EOF
            {
             newCompositeNode(grammarAccess.getFunctionalitiesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionalities=ruleFunctionalities();

            state._fsp--;

             current =iv_ruleFunctionalities; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionalities"


    // $ANTLR start "ruleFunctionalities"
    // InternalSoftGalleryLanguage.g:580:1: ruleFunctionalities returns [EObject current=null] : ( ( (lv_functions_0_0= ruleProfileManagement ) ) ( (lv_elements_1_0= ruleAppAccess ) ) ( (lv_items_2_0= ruleAlbumManagement ) ) ( (lv_resources_3_0= rulePhotoActions ) ) ( (lv_aditionals_4_0= ruleLandingActions ) ) ) ;
    public final EObject ruleFunctionalities() throws RecognitionException {
        EObject current = null;

        EObject lv_functions_0_0 = null;

        EObject lv_elements_1_0 = null;

        EObject lv_items_2_0 = null;

        EObject lv_resources_3_0 = null;

        EObject lv_aditionals_4_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:586:2: ( ( ( (lv_functions_0_0= ruleProfileManagement ) ) ( (lv_elements_1_0= ruleAppAccess ) ) ( (lv_items_2_0= ruleAlbumManagement ) ) ( (lv_resources_3_0= rulePhotoActions ) ) ( (lv_aditionals_4_0= ruleLandingActions ) ) ) )
            // InternalSoftGalleryLanguage.g:587:2: ( ( (lv_functions_0_0= ruleProfileManagement ) ) ( (lv_elements_1_0= ruleAppAccess ) ) ( (lv_items_2_0= ruleAlbumManagement ) ) ( (lv_resources_3_0= rulePhotoActions ) ) ( (lv_aditionals_4_0= ruleLandingActions ) ) )
            {
            // InternalSoftGalleryLanguage.g:587:2: ( ( (lv_functions_0_0= ruleProfileManagement ) ) ( (lv_elements_1_0= ruleAppAccess ) ) ( (lv_items_2_0= ruleAlbumManagement ) ) ( (lv_resources_3_0= rulePhotoActions ) ) ( (lv_aditionals_4_0= ruleLandingActions ) ) )
            // InternalSoftGalleryLanguage.g:588:3: ( (lv_functions_0_0= ruleProfileManagement ) ) ( (lv_elements_1_0= ruleAppAccess ) ) ( (lv_items_2_0= ruleAlbumManagement ) ) ( (lv_resources_3_0= rulePhotoActions ) ) ( (lv_aditionals_4_0= ruleLandingActions ) )
            {
            // InternalSoftGalleryLanguage.g:588:3: ( (lv_functions_0_0= ruleProfileManagement ) )
            // InternalSoftGalleryLanguage.g:589:4: (lv_functions_0_0= ruleProfileManagement )
            {
            // InternalSoftGalleryLanguage.g:589:4: (lv_functions_0_0= ruleProfileManagement )
            // InternalSoftGalleryLanguage.g:590:5: lv_functions_0_0= ruleProfileManagement
            {

            					newCompositeNode(grammarAccess.getFunctionalitiesAccess().getFunctionsProfileManagementParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_18);
            lv_functions_0_0=ruleProfileManagement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionalitiesRule());
            					}
            					add(
            						current,
            						"functions",
            						lv_functions_0_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.ProfileManagement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftGalleryLanguage.g:607:3: ( (lv_elements_1_0= ruleAppAccess ) )
            // InternalSoftGalleryLanguage.g:608:4: (lv_elements_1_0= ruleAppAccess )
            {
            // InternalSoftGalleryLanguage.g:608:4: (lv_elements_1_0= ruleAppAccess )
            // InternalSoftGalleryLanguage.g:609:5: lv_elements_1_0= ruleAppAccess
            {

            					newCompositeNode(grammarAccess.getFunctionalitiesAccess().getElementsAppAccessParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
            lv_elements_1_0=ruleAppAccess();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionalitiesRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_1_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.AppAccess");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftGalleryLanguage.g:626:3: ( (lv_items_2_0= ruleAlbumManagement ) )
            // InternalSoftGalleryLanguage.g:627:4: (lv_items_2_0= ruleAlbumManagement )
            {
            // InternalSoftGalleryLanguage.g:627:4: (lv_items_2_0= ruleAlbumManagement )
            // InternalSoftGalleryLanguage.g:628:5: lv_items_2_0= ruleAlbumManagement
            {

            					newCompositeNode(grammarAccess.getFunctionalitiesAccess().getItemsAlbumManagementParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_20);
            lv_items_2_0=ruleAlbumManagement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionalitiesRule());
            					}
            					add(
            						current,
            						"items",
            						lv_items_2_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.AlbumManagement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftGalleryLanguage.g:645:3: ( (lv_resources_3_0= rulePhotoActions ) )
            // InternalSoftGalleryLanguage.g:646:4: (lv_resources_3_0= rulePhotoActions )
            {
            // InternalSoftGalleryLanguage.g:646:4: (lv_resources_3_0= rulePhotoActions )
            // InternalSoftGalleryLanguage.g:647:5: lv_resources_3_0= rulePhotoActions
            {

            					newCompositeNode(grammarAccess.getFunctionalitiesAccess().getResourcesPhotoActionsParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_21);
            lv_resources_3_0=rulePhotoActions();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionalitiesRule());
            					}
            					add(
            						current,
            						"resources",
            						lv_resources_3_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.PhotoActions");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftGalleryLanguage.g:664:3: ( (lv_aditionals_4_0= ruleLandingActions ) )
            // InternalSoftGalleryLanguage.g:665:4: (lv_aditionals_4_0= ruleLandingActions )
            {
            // InternalSoftGalleryLanguage.g:665:4: (lv_aditionals_4_0= ruleLandingActions )
            // InternalSoftGalleryLanguage.g:666:5: lv_aditionals_4_0= ruleLandingActions
            {

            					newCompositeNode(grammarAccess.getFunctionalitiesAccess().getAditionalsLandingActionsParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_aditionals_4_0=ruleLandingActions();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionalitiesRule());
            					}
            					add(
            						current,
            						"aditionals",
            						lv_aditionals_4_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.LandingActions");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionalities"


    // $ANTLR start "entryRuleProfileManagement"
    // InternalSoftGalleryLanguage.g:687:1: entryRuleProfileManagement returns [EObject current=null] : iv_ruleProfileManagement= ruleProfileManagement EOF ;
    public final EObject entryRuleProfileManagement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProfileManagement = null;


        try {
            // InternalSoftGalleryLanguage.g:687:58: (iv_ruleProfileManagement= ruleProfileManagement EOF )
            // InternalSoftGalleryLanguage.g:688:2: iv_ruleProfileManagement= ruleProfileManagement EOF
            {
             newCompositeNode(grammarAccess.getProfileManagementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProfileManagement=ruleProfileManagement();

            state._fsp--;

             current =iv_ruleProfileManagement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProfileManagement"


    // $ANTLR start "ruleProfileManagement"
    // InternalSoftGalleryLanguage.g:694:1: ruleProfileManagement returns [EObject current=null] : (otherlv_0= 'ProfileManagement' otherlv_1= ':' ( (lv_items_2_0= ruleProfileManagementFunctions ) ) ) ;
    public final EObject ruleProfileManagement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_items_2_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:700:2: ( (otherlv_0= 'ProfileManagement' otherlv_1= ':' ( (lv_items_2_0= ruleProfileManagementFunctions ) ) ) )
            // InternalSoftGalleryLanguage.g:701:2: (otherlv_0= 'ProfileManagement' otherlv_1= ':' ( (lv_items_2_0= ruleProfileManagementFunctions ) ) )
            {
            // InternalSoftGalleryLanguage.g:701:2: (otherlv_0= 'ProfileManagement' otherlv_1= ':' ( (lv_items_2_0= ruleProfileManagementFunctions ) ) )
            // InternalSoftGalleryLanguage.g:702:3: otherlv_0= 'ProfileManagement' otherlv_1= ':' ( (lv_items_2_0= ruleProfileManagementFunctions ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProfileManagementAccess().getProfileManagementKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getProfileManagementAccess().getColonKeyword_1());
            		
            // InternalSoftGalleryLanguage.g:710:3: ( (lv_items_2_0= ruleProfileManagementFunctions ) )
            // InternalSoftGalleryLanguage.g:711:4: (lv_items_2_0= ruleProfileManagementFunctions )
            {
            // InternalSoftGalleryLanguage.g:711:4: (lv_items_2_0= ruleProfileManagementFunctions )
            // InternalSoftGalleryLanguage.g:712:5: lv_items_2_0= ruleProfileManagementFunctions
            {

            					newCompositeNode(grammarAccess.getProfileManagementAccess().getItemsProfileManagementFunctionsParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_items_2_0=ruleProfileManagementFunctions();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProfileManagementRule());
            					}
            					add(
            						current,
            						"items",
            						lv_items_2_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.ProfileManagementFunctions");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProfileManagement"


    // $ANTLR start "entryRuleProfileManagementFunctions"
    // InternalSoftGalleryLanguage.g:733:1: entryRuleProfileManagementFunctions returns [EObject current=null] : iv_ruleProfileManagementFunctions= ruleProfileManagementFunctions EOF ;
    public final EObject entryRuleProfileManagementFunctions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProfileManagementFunctions = null;


        try {
            // InternalSoftGalleryLanguage.g:733:67: (iv_ruleProfileManagementFunctions= ruleProfileManagementFunctions EOF )
            // InternalSoftGalleryLanguage.g:734:2: iv_ruleProfileManagementFunctions= ruleProfileManagementFunctions EOF
            {
             newCompositeNode(grammarAccess.getProfileManagementFunctionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProfileManagementFunctions=ruleProfileManagementFunctions();

            state._fsp--;

             current =iv_ruleProfileManagementFunctions; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProfileManagementFunctions"


    // $ANTLR start "ruleProfileManagementFunctions"
    // InternalSoftGalleryLanguage.g:740:1: ruleProfileManagementFunctions returns [EObject current=null] : (otherlv_0= 'ViewProfilePhoto' ( (lv_viewprofileName_1_0= RULE_ID ) ) otherlv_2= 'EditProfileInfo' ( (lv_editProfileName_3_0= RULE_ID ) ) ) ;
    public final EObject ruleProfileManagementFunctions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_viewprofileName_1_0=null;
        Token otherlv_2=null;
        Token lv_editProfileName_3_0=null;


        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:746:2: ( (otherlv_0= 'ViewProfilePhoto' ( (lv_viewprofileName_1_0= RULE_ID ) ) otherlv_2= 'EditProfileInfo' ( (lv_editProfileName_3_0= RULE_ID ) ) ) )
            // InternalSoftGalleryLanguage.g:747:2: (otherlv_0= 'ViewProfilePhoto' ( (lv_viewprofileName_1_0= RULE_ID ) ) otherlv_2= 'EditProfileInfo' ( (lv_editProfileName_3_0= RULE_ID ) ) )
            {
            // InternalSoftGalleryLanguage.g:747:2: (otherlv_0= 'ViewProfilePhoto' ( (lv_viewprofileName_1_0= RULE_ID ) ) otherlv_2= 'EditProfileInfo' ( (lv_editProfileName_3_0= RULE_ID ) ) )
            // InternalSoftGalleryLanguage.g:748:3: otherlv_0= 'ViewProfilePhoto' ( (lv_viewprofileName_1_0= RULE_ID ) ) otherlv_2= 'EditProfileInfo' ( (lv_editProfileName_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getProfileManagementFunctionsAccess().getViewProfilePhotoKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:752:3: ( (lv_viewprofileName_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:753:4: (lv_viewprofileName_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:753:4: (lv_viewprofileName_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:754:5: lv_viewprofileName_1_0= RULE_ID
            {
            lv_viewprofileName_1_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(lv_viewprofileName_1_0, grammarAccess.getProfileManagementFunctionsAccess().getViewprofileNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProfileManagementFunctionsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"viewprofileName",
            						lv_viewprofileName_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getProfileManagementFunctionsAccess().getEditProfileInfoKeyword_2());
            		
            // InternalSoftGalleryLanguage.g:774:3: ( (lv_editProfileName_3_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:775:4: (lv_editProfileName_3_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:775:4: (lv_editProfileName_3_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:776:5: lv_editProfileName_3_0= RULE_ID
            {
            lv_editProfileName_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_editProfileName_3_0, grammarAccess.getProfileManagementFunctionsAccess().getEditProfileNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProfileManagementFunctionsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"editProfileName",
            						lv_editProfileName_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProfileManagementFunctions"


    // $ANTLR start "entryRuleAppAccess"
    // InternalSoftGalleryLanguage.g:796:1: entryRuleAppAccess returns [EObject current=null] : iv_ruleAppAccess= ruleAppAccess EOF ;
    public final EObject entryRuleAppAccess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppAccess = null;


        try {
            // InternalSoftGalleryLanguage.g:796:50: (iv_ruleAppAccess= ruleAppAccess EOF )
            // InternalSoftGalleryLanguage.g:797:2: iv_ruleAppAccess= ruleAppAccess EOF
            {
             newCompositeNode(grammarAccess.getAppAccessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAppAccess=ruleAppAccess();

            state._fsp--;

             current =iv_ruleAppAccess; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAppAccess"


    // $ANTLR start "ruleAppAccess"
    // InternalSoftGalleryLanguage.g:803:1: ruleAppAccess returns [EObject current=null] : (otherlv_0= 'AppAccess' otherlv_1= ':' ( (lv_items_2_0= ruleAppAccessFunctions ) ) ) ;
    public final EObject ruleAppAccess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_items_2_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:809:2: ( (otherlv_0= 'AppAccess' otherlv_1= ':' ( (lv_items_2_0= ruleAppAccessFunctions ) ) ) )
            // InternalSoftGalleryLanguage.g:810:2: (otherlv_0= 'AppAccess' otherlv_1= ':' ( (lv_items_2_0= ruleAppAccessFunctions ) ) )
            {
            // InternalSoftGalleryLanguage.g:810:2: (otherlv_0= 'AppAccess' otherlv_1= ':' ( (lv_items_2_0= ruleAppAccessFunctions ) ) )
            // InternalSoftGalleryLanguage.g:811:3: otherlv_0= 'AppAccess' otherlv_1= ':' ( (lv_items_2_0= ruleAppAccessFunctions ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAppAccessAccess().getAppAccessKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getAppAccessAccess().getColonKeyword_1());
            		
            // InternalSoftGalleryLanguage.g:819:3: ( (lv_items_2_0= ruleAppAccessFunctions ) )
            // InternalSoftGalleryLanguage.g:820:4: (lv_items_2_0= ruleAppAccessFunctions )
            {
            // InternalSoftGalleryLanguage.g:820:4: (lv_items_2_0= ruleAppAccessFunctions )
            // InternalSoftGalleryLanguage.g:821:5: lv_items_2_0= ruleAppAccessFunctions
            {

            					newCompositeNode(grammarAccess.getAppAccessAccess().getItemsAppAccessFunctionsParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_items_2_0=ruleAppAccessFunctions();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAppAccessRule());
            					}
            					add(
            						current,
            						"items",
            						lv_items_2_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.AppAccessFunctions");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAppAccess"


    // $ANTLR start "entryRuleAppAccessFunctions"
    // InternalSoftGalleryLanguage.g:842:1: entryRuleAppAccessFunctions returns [EObject current=null] : iv_ruleAppAccessFunctions= ruleAppAccessFunctions EOF ;
    public final EObject entryRuleAppAccessFunctions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppAccessFunctions = null;


        try {
            // InternalSoftGalleryLanguage.g:842:59: (iv_ruleAppAccessFunctions= ruleAppAccessFunctions EOF )
            // InternalSoftGalleryLanguage.g:843:2: iv_ruleAppAccessFunctions= ruleAppAccessFunctions EOF
            {
             newCompositeNode(grammarAccess.getAppAccessFunctionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAppAccessFunctions=ruleAppAccessFunctions();

            state._fsp--;

             current =iv_ruleAppAccessFunctions; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAppAccessFunctions"


    // $ANTLR start "ruleAppAccessFunctions"
    // InternalSoftGalleryLanguage.g:849:1: ruleAppAccessFunctions returns [EObject current=null] : (otherlv_0= 'Login' ( (lv_loginName_1_0= RULE_ID ) ) otherlv_2= 'Register' ( (lv_registerName_3_0= RULE_ID ) ) ) ;
    public final EObject ruleAppAccessFunctions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_loginName_1_0=null;
        Token otherlv_2=null;
        Token lv_registerName_3_0=null;


        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:855:2: ( (otherlv_0= 'Login' ( (lv_loginName_1_0= RULE_ID ) ) otherlv_2= 'Register' ( (lv_registerName_3_0= RULE_ID ) ) ) )
            // InternalSoftGalleryLanguage.g:856:2: (otherlv_0= 'Login' ( (lv_loginName_1_0= RULE_ID ) ) otherlv_2= 'Register' ( (lv_registerName_3_0= RULE_ID ) ) )
            {
            // InternalSoftGalleryLanguage.g:856:2: (otherlv_0= 'Login' ( (lv_loginName_1_0= RULE_ID ) ) otherlv_2= 'Register' ( (lv_registerName_3_0= RULE_ID ) ) )
            // InternalSoftGalleryLanguage.g:857:3: otherlv_0= 'Login' ( (lv_loginName_1_0= RULE_ID ) ) otherlv_2= 'Register' ( (lv_registerName_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getAppAccessFunctionsAccess().getLoginKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:861:3: ( (lv_loginName_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:862:4: (lv_loginName_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:862:4: (lv_loginName_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:863:5: lv_loginName_1_0= RULE_ID
            {
            lv_loginName_1_0=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(lv_loginName_1_0, grammarAccess.getAppAccessFunctionsAccess().getLoginNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAppAccessFunctionsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"loginName",
            						lv_loginName_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getAppAccessFunctionsAccess().getRegisterKeyword_2());
            		
            // InternalSoftGalleryLanguage.g:883:3: ( (lv_registerName_3_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:884:4: (lv_registerName_3_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:884:4: (lv_registerName_3_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:885:5: lv_registerName_3_0= RULE_ID
            {
            lv_registerName_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_registerName_3_0, grammarAccess.getAppAccessFunctionsAccess().getRegisterNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAppAccessFunctionsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"registerName",
            						lv_registerName_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAppAccessFunctions"


    // $ANTLR start "entryRuleAlbumManagement"
    // InternalSoftGalleryLanguage.g:905:1: entryRuleAlbumManagement returns [EObject current=null] : iv_ruleAlbumManagement= ruleAlbumManagement EOF ;
    public final EObject entryRuleAlbumManagement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlbumManagement = null;


        try {
            // InternalSoftGalleryLanguage.g:905:56: (iv_ruleAlbumManagement= ruleAlbumManagement EOF )
            // InternalSoftGalleryLanguage.g:906:2: iv_ruleAlbumManagement= ruleAlbumManagement EOF
            {
             newCompositeNode(grammarAccess.getAlbumManagementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlbumManagement=ruleAlbumManagement();

            state._fsp--;

             current =iv_ruleAlbumManagement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlbumManagement"


    // $ANTLR start "ruleAlbumManagement"
    // InternalSoftGalleryLanguage.g:912:1: ruleAlbumManagement returns [EObject current=null] : (otherlv_0= 'AlbumManagement' otherlv_1= ':' ( (lv_items_2_0= ruleAlbumManagementFunctions ) ) ) ;
    public final EObject ruleAlbumManagement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_items_2_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:918:2: ( (otherlv_0= 'AlbumManagement' otherlv_1= ':' ( (lv_items_2_0= ruleAlbumManagementFunctions ) ) ) )
            // InternalSoftGalleryLanguage.g:919:2: (otherlv_0= 'AlbumManagement' otherlv_1= ':' ( (lv_items_2_0= ruleAlbumManagementFunctions ) ) )
            {
            // InternalSoftGalleryLanguage.g:919:2: (otherlv_0= 'AlbumManagement' otherlv_1= ':' ( (lv_items_2_0= ruleAlbumManagementFunctions ) ) )
            // InternalSoftGalleryLanguage.g:920:3: otherlv_0= 'AlbumManagement' otherlv_1= ':' ( (lv_items_2_0= ruleAlbumManagementFunctions ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAlbumManagementAccess().getAlbumManagementKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getAlbumManagementAccess().getColonKeyword_1());
            		
            // InternalSoftGalleryLanguage.g:928:3: ( (lv_items_2_0= ruleAlbumManagementFunctions ) )
            // InternalSoftGalleryLanguage.g:929:4: (lv_items_2_0= ruleAlbumManagementFunctions )
            {
            // InternalSoftGalleryLanguage.g:929:4: (lv_items_2_0= ruleAlbumManagementFunctions )
            // InternalSoftGalleryLanguage.g:930:5: lv_items_2_0= ruleAlbumManagementFunctions
            {

            					newCompositeNode(grammarAccess.getAlbumManagementAccess().getItemsAlbumManagementFunctionsParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_items_2_0=ruleAlbumManagementFunctions();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAlbumManagementRule());
            					}
            					add(
            						current,
            						"items",
            						lv_items_2_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.AlbumManagementFunctions");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlbumManagement"


    // $ANTLR start "entryRuleAlbumManagementFunctions"
    // InternalSoftGalleryLanguage.g:951:1: entryRuleAlbumManagementFunctions returns [EObject current=null] : iv_ruleAlbumManagementFunctions= ruleAlbumManagementFunctions EOF ;
    public final EObject entryRuleAlbumManagementFunctions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlbumManagementFunctions = null;


        try {
            // InternalSoftGalleryLanguage.g:951:65: (iv_ruleAlbumManagementFunctions= ruleAlbumManagementFunctions EOF )
            // InternalSoftGalleryLanguage.g:952:2: iv_ruleAlbumManagementFunctions= ruleAlbumManagementFunctions EOF
            {
             newCompositeNode(grammarAccess.getAlbumManagementFunctionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlbumManagementFunctions=ruleAlbumManagementFunctions();

            state._fsp--;

             current =iv_ruleAlbumManagementFunctions; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlbumManagementFunctions"


    // $ANTLR start "ruleAlbumManagementFunctions"
    // InternalSoftGalleryLanguage.g:958:1: ruleAlbumManagementFunctions returns [EObject current=null] : (otherlv_0= 'CreateAlbum' ( (lv_createdAlbName_1_0= RULE_ID ) ) otherlv_2= 'SelectAlbum' ( (lv_selectAlbName_3_0= RULE_ID ) ) ) ;
    public final EObject ruleAlbumManagementFunctions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_createdAlbName_1_0=null;
        Token otherlv_2=null;
        Token lv_selectAlbName_3_0=null;


        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:964:2: ( (otherlv_0= 'CreateAlbum' ( (lv_createdAlbName_1_0= RULE_ID ) ) otherlv_2= 'SelectAlbum' ( (lv_selectAlbName_3_0= RULE_ID ) ) ) )
            // InternalSoftGalleryLanguage.g:965:2: (otherlv_0= 'CreateAlbum' ( (lv_createdAlbName_1_0= RULE_ID ) ) otherlv_2= 'SelectAlbum' ( (lv_selectAlbName_3_0= RULE_ID ) ) )
            {
            // InternalSoftGalleryLanguage.g:965:2: (otherlv_0= 'CreateAlbum' ( (lv_createdAlbName_1_0= RULE_ID ) ) otherlv_2= 'SelectAlbum' ( (lv_selectAlbName_3_0= RULE_ID ) ) )
            // InternalSoftGalleryLanguage.g:966:3: otherlv_0= 'CreateAlbum' ( (lv_createdAlbName_1_0= RULE_ID ) ) otherlv_2= 'SelectAlbum' ( (lv_selectAlbName_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getAlbumManagementFunctionsAccess().getCreateAlbumKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:970:3: ( (lv_createdAlbName_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:971:4: (lv_createdAlbName_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:971:4: (lv_createdAlbName_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:972:5: lv_createdAlbName_1_0= RULE_ID
            {
            lv_createdAlbName_1_0=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(lv_createdAlbName_1_0, grammarAccess.getAlbumManagementFunctionsAccess().getCreatedAlbNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAlbumManagementFunctionsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"createdAlbName",
            						lv_createdAlbName_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getAlbumManagementFunctionsAccess().getSelectAlbumKeyword_2());
            		
            // InternalSoftGalleryLanguage.g:992:3: ( (lv_selectAlbName_3_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:993:4: (lv_selectAlbName_3_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:993:4: (lv_selectAlbName_3_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:994:5: lv_selectAlbName_3_0= RULE_ID
            {
            lv_selectAlbName_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_selectAlbName_3_0, grammarAccess.getAlbumManagementFunctionsAccess().getSelectAlbNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAlbumManagementFunctionsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"selectAlbName",
            						lv_selectAlbName_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlbumManagementFunctions"


    // $ANTLR start "entryRulePhotoActions"
    // InternalSoftGalleryLanguage.g:1014:1: entryRulePhotoActions returns [EObject current=null] : iv_rulePhotoActions= rulePhotoActions EOF ;
    public final EObject entryRulePhotoActions() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhotoActions = null;


        try {
            // InternalSoftGalleryLanguage.g:1014:53: (iv_rulePhotoActions= rulePhotoActions EOF )
            // InternalSoftGalleryLanguage.g:1015:2: iv_rulePhotoActions= rulePhotoActions EOF
            {
             newCompositeNode(grammarAccess.getPhotoActionsRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePhotoActions=rulePhotoActions();

            state._fsp--;

             current =iv_rulePhotoActions; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePhotoActions"


    // $ANTLR start "rulePhotoActions"
    // InternalSoftGalleryLanguage.g:1021:1: rulePhotoActions returns [EObject current=null] : (otherlv_0= 'PhotoActions' otherlv_1= ':' ( (lv_items_2_0= rulePhotoActionsFunctions ) ) ) ;
    public final EObject rulePhotoActions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_items_2_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:1027:2: ( (otherlv_0= 'PhotoActions' otherlv_1= ':' ( (lv_items_2_0= rulePhotoActionsFunctions ) ) ) )
            // InternalSoftGalleryLanguage.g:1028:2: (otherlv_0= 'PhotoActions' otherlv_1= ':' ( (lv_items_2_0= rulePhotoActionsFunctions ) ) )
            {
            // InternalSoftGalleryLanguage.g:1028:2: (otherlv_0= 'PhotoActions' otherlv_1= ':' ( (lv_items_2_0= rulePhotoActionsFunctions ) ) )
            // InternalSoftGalleryLanguage.g:1029:3: otherlv_0= 'PhotoActions' otherlv_1= ':' ( (lv_items_2_0= rulePhotoActionsFunctions ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPhotoActionsAccess().getPhotoActionsKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getPhotoActionsAccess().getColonKeyword_1());
            		
            // InternalSoftGalleryLanguage.g:1037:3: ( (lv_items_2_0= rulePhotoActionsFunctions ) )
            // InternalSoftGalleryLanguage.g:1038:4: (lv_items_2_0= rulePhotoActionsFunctions )
            {
            // InternalSoftGalleryLanguage.g:1038:4: (lv_items_2_0= rulePhotoActionsFunctions )
            // InternalSoftGalleryLanguage.g:1039:5: lv_items_2_0= rulePhotoActionsFunctions
            {

            					newCompositeNode(grammarAccess.getPhotoActionsAccess().getItemsPhotoActionsFunctionsParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_items_2_0=rulePhotoActionsFunctions();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPhotoActionsRule());
            					}
            					add(
            						current,
            						"items",
            						lv_items_2_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.PhotoActionsFunctions");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePhotoActions"


    // $ANTLR start "entryRulePhotoActionsFunctions"
    // InternalSoftGalleryLanguage.g:1060:1: entryRulePhotoActionsFunctions returns [EObject current=null] : iv_rulePhotoActionsFunctions= rulePhotoActionsFunctions EOF ;
    public final EObject entryRulePhotoActionsFunctions() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhotoActionsFunctions = null;


        try {
            // InternalSoftGalleryLanguage.g:1060:62: (iv_rulePhotoActionsFunctions= rulePhotoActionsFunctions EOF )
            // InternalSoftGalleryLanguage.g:1061:2: iv_rulePhotoActionsFunctions= rulePhotoActionsFunctions EOF
            {
             newCompositeNode(grammarAccess.getPhotoActionsFunctionsRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePhotoActionsFunctions=rulePhotoActionsFunctions();

            state._fsp--;

             current =iv_rulePhotoActionsFunctions; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePhotoActionsFunctions"


    // $ANTLR start "rulePhotoActionsFunctions"
    // InternalSoftGalleryLanguage.g:1067:1: rulePhotoActionsFunctions returns [EObject current=null] : (otherlv_0= 'ViewAllPhotos' ( (lv_nameGenerico_1_0= RULE_ID ) ) otherlv_2= 'ViewExtendedPhoto' ( (lv_namePhoto_3_0= RULE_ID ) ) otherlv_4= 'LoadPhoto' ( (lv_nameLoad_5_0= RULE_ID ) ) ) ;
    public final EObject rulePhotoActionsFunctions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nameGenerico_1_0=null;
        Token otherlv_2=null;
        Token lv_namePhoto_3_0=null;
        Token otherlv_4=null;
        Token lv_nameLoad_5_0=null;


        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:1073:2: ( (otherlv_0= 'ViewAllPhotos' ( (lv_nameGenerico_1_0= RULE_ID ) ) otherlv_2= 'ViewExtendedPhoto' ( (lv_namePhoto_3_0= RULE_ID ) ) otherlv_4= 'LoadPhoto' ( (lv_nameLoad_5_0= RULE_ID ) ) ) )
            // InternalSoftGalleryLanguage.g:1074:2: (otherlv_0= 'ViewAllPhotos' ( (lv_nameGenerico_1_0= RULE_ID ) ) otherlv_2= 'ViewExtendedPhoto' ( (lv_namePhoto_3_0= RULE_ID ) ) otherlv_4= 'LoadPhoto' ( (lv_nameLoad_5_0= RULE_ID ) ) )
            {
            // InternalSoftGalleryLanguage.g:1074:2: (otherlv_0= 'ViewAllPhotos' ( (lv_nameGenerico_1_0= RULE_ID ) ) otherlv_2= 'ViewExtendedPhoto' ( (lv_namePhoto_3_0= RULE_ID ) ) otherlv_4= 'LoadPhoto' ( (lv_nameLoad_5_0= RULE_ID ) ) )
            // InternalSoftGalleryLanguage.g:1075:3: otherlv_0= 'ViewAllPhotos' ( (lv_nameGenerico_1_0= RULE_ID ) ) otherlv_2= 'ViewExtendedPhoto' ( (lv_namePhoto_3_0= RULE_ID ) ) otherlv_4= 'LoadPhoto' ( (lv_nameLoad_5_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getPhotoActionsFunctionsAccess().getViewAllPhotosKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:1079:3: ( (lv_nameGenerico_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:1080:4: (lv_nameGenerico_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:1080:4: (lv_nameGenerico_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:1081:5: lv_nameGenerico_1_0= RULE_ID
            {
            lv_nameGenerico_1_0=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(lv_nameGenerico_1_0, grammarAccess.getPhotoActionsFunctionsAccess().getNameGenericoIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPhotoActionsFunctionsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nameGenerico",
            						lv_nameGenerico_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,32,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getPhotoActionsFunctionsAccess().getViewExtendedPhotoKeyword_2());
            		
            // InternalSoftGalleryLanguage.g:1101:3: ( (lv_namePhoto_3_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:1102:4: (lv_namePhoto_3_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:1102:4: (lv_namePhoto_3_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:1103:5: lv_namePhoto_3_0= RULE_ID
            {
            lv_namePhoto_3_0=(Token)match(input,RULE_ID,FOLLOW_30); 

            					newLeafNode(lv_namePhoto_3_0, grammarAccess.getPhotoActionsFunctionsAccess().getNamePhotoIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPhotoActionsFunctionsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"namePhoto",
            						lv_namePhoto_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,33,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getPhotoActionsFunctionsAccess().getLoadPhotoKeyword_4());
            		
            // InternalSoftGalleryLanguage.g:1123:3: ( (lv_nameLoad_5_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:1124:4: (lv_nameLoad_5_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:1124:4: (lv_nameLoad_5_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:1125:5: lv_nameLoad_5_0= RULE_ID
            {
            lv_nameLoad_5_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_nameLoad_5_0, grammarAccess.getPhotoActionsFunctionsAccess().getNameLoadIDTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPhotoActionsFunctionsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nameLoad",
            						lv_nameLoad_5_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePhotoActionsFunctions"


    // $ANTLR start "entryRuleLandingActions"
    // InternalSoftGalleryLanguage.g:1145:1: entryRuleLandingActions returns [EObject current=null] : iv_ruleLandingActions= ruleLandingActions EOF ;
    public final EObject entryRuleLandingActions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLandingActions = null;


        try {
            // InternalSoftGalleryLanguage.g:1145:55: (iv_ruleLandingActions= ruleLandingActions EOF )
            // InternalSoftGalleryLanguage.g:1146:2: iv_ruleLandingActions= ruleLandingActions EOF
            {
             newCompositeNode(grammarAccess.getLandingActionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLandingActions=ruleLandingActions();

            state._fsp--;

             current =iv_ruleLandingActions; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLandingActions"


    // $ANTLR start "ruleLandingActions"
    // InternalSoftGalleryLanguage.g:1152:1: ruleLandingActions returns [EObject current=null] : (otherlv_0= 'LandingActions' otherlv_1= ':' ( (lv_items_2_0= ruleLandingFunctions ) ) ) ;
    public final EObject ruleLandingActions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_items_2_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:1158:2: ( (otherlv_0= 'LandingActions' otherlv_1= ':' ( (lv_items_2_0= ruleLandingFunctions ) ) ) )
            // InternalSoftGalleryLanguage.g:1159:2: (otherlv_0= 'LandingActions' otherlv_1= ':' ( (lv_items_2_0= ruleLandingFunctions ) ) )
            {
            // InternalSoftGalleryLanguage.g:1159:2: (otherlv_0= 'LandingActions' otherlv_1= ':' ( (lv_items_2_0= ruleLandingFunctions ) ) )
            // InternalSoftGalleryLanguage.g:1160:3: otherlv_0= 'LandingActions' otherlv_1= ':' ( (lv_items_2_0= ruleLandingFunctions ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLandingActionsAccess().getLandingActionsKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getLandingActionsAccess().getColonKeyword_1());
            		
            // InternalSoftGalleryLanguage.g:1168:3: ( (lv_items_2_0= ruleLandingFunctions ) )
            // InternalSoftGalleryLanguage.g:1169:4: (lv_items_2_0= ruleLandingFunctions )
            {
            // InternalSoftGalleryLanguage.g:1169:4: (lv_items_2_0= ruleLandingFunctions )
            // InternalSoftGalleryLanguage.g:1170:5: lv_items_2_0= ruleLandingFunctions
            {

            					newCompositeNode(grammarAccess.getLandingActionsAccess().getItemsLandingFunctionsParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_items_2_0=ruleLandingFunctions();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLandingActionsRule());
            					}
            					add(
            						current,
            						"items",
            						lv_items_2_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.LandingFunctions");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLandingActions"


    // $ANTLR start "entryRuleLandingFunctions"
    // InternalSoftGalleryLanguage.g:1191:1: entryRuleLandingFunctions returns [EObject current=null] : iv_ruleLandingFunctions= ruleLandingFunctions EOF ;
    public final EObject entryRuleLandingFunctions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLandingFunctions = null;


        try {
            // InternalSoftGalleryLanguage.g:1191:57: (iv_ruleLandingFunctions= ruleLandingFunctions EOF )
            // InternalSoftGalleryLanguage.g:1192:2: iv_ruleLandingFunctions= ruleLandingFunctions EOF
            {
             newCompositeNode(grammarAccess.getLandingFunctionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLandingFunctions=ruleLandingFunctions();

            state._fsp--;

             current =iv_ruleLandingFunctions; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLandingFunctions"


    // $ANTLR start "ruleLandingFunctions"
    // InternalSoftGalleryLanguage.g:1198:1: ruleLandingFunctions returns [EObject current=null] : (otherlv_0= 'ViewCarousel' ( (lv_nameCarouselName_1_0= RULE_ID ) ) otherlv_2= 'PassPhoto' ( (lv_passPhotoName_3_0= RULE_ID ) ) ) ;
    public final EObject ruleLandingFunctions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nameCarouselName_1_0=null;
        Token otherlv_2=null;
        Token lv_passPhotoName_3_0=null;


        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:1204:2: ( (otherlv_0= 'ViewCarousel' ( (lv_nameCarouselName_1_0= RULE_ID ) ) otherlv_2= 'PassPhoto' ( (lv_passPhotoName_3_0= RULE_ID ) ) ) )
            // InternalSoftGalleryLanguage.g:1205:2: (otherlv_0= 'ViewCarousel' ( (lv_nameCarouselName_1_0= RULE_ID ) ) otherlv_2= 'PassPhoto' ( (lv_passPhotoName_3_0= RULE_ID ) ) )
            {
            // InternalSoftGalleryLanguage.g:1205:2: (otherlv_0= 'ViewCarousel' ( (lv_nameCarouselName_1_0= RULE_ID ) ) otherlv_2= 'PassPhoto' ( (lv_passPhotoName_3_0= RULE_ID ) ) )
            // InternalSoftGalleryLanguage.g:1206:3: otherlv_0= 'ViewCarousel' ( (lv_nameCarouselName_1_0= RULE_ID ) ) otherlv_2= 'PassPhoto' ( (lv_passPhotoName_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getLandingFunctionsAccess().getViewCarouselKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:1210:3: ( (lv_nameCarouselName_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:1211:4: (lv_nameCarouselName_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:1211:4: (lv_nameCarouselName_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:1212:5: lv_nameCarouselName_1_0= RULE_ID
            {
            lv_nameCarouselName_1_0=(Token)match(input,RULE_ID,FOLLOW_32); 

            					newLeafNode(lv_nameCarouselName_1_0, grammarAccess.getLandingFunctionsAccess().getNameCarouselNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLandingFunctionsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nameCarouselName",
            						lv_nameCarouselName_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,36,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getLandingFunctionsAccess().getPassPhotoKeyword_2());
            		
            // InternalSoftGalleryLanguage.g:1232:3: ( (lv_passPhotoName_3_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:1233:4: (lv_passPhotoName_3_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:1233:4: (lv_passPhotoName_3_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:1234:5: lv_passPhotoName_3_0= RULE_ID
            {
            lv_passPhotoName_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_passPhotoName_3_0, grammarAccess.getLandingFunctionsAccess().getPassPhotoNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLandingFunctionsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"passPhotoName",
            						lv_passPhotoName_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLandingFunctions"


    // $ANTLR start "entryRuleDomainConnection"
    // InternalSoftGalleryLanguage.g:1254:1: entryRuleDomainConnection returns [EObject current=null] : iv_ruleDomainConnection= ruleDomainConnection EOF ;
    public final EObject entryRuleDomainConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainConnection = null;


        try {
            // InternalSoftGalleryLanguage.g:1254:57: (iv_ruleDomainConnection= ruleDomainConnection EOF )
            // InternalSoftGalleryLanguage.g:1255:2: iv_ruleDomainConnection= ruleDomainConnection EOF
            {
             newCompositeNode(grammarAccess.getDomainConnectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDomainConnection=ruleDomainConnection();

            state._fsp--;

             current =iv_ruleDomainConnection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDomainConnection"


    // $ANTLR start "ruleDomainConnection"
    // InternalSoftGalleryLanguage.g:1261:1: ruleDomainConnection returns [EObject current=null] : (otherlv_0= 'DomainRelations' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleDomainRelations ) ) otherlv_4= '}' ) ;
    public final EObject ruleDomainConnection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:1267:2: ( (otherlv_0= 'DomainRelations' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleDomainRelations ) ) otherlv_4= '}' ) )
            // InternalSoftGalleryLanguage.g:1268:2: (otherlv_0= 'DomainRelations' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleDomainRelations ) ) otherlv_4= '}' )
            {
            // InternalSoftGalleryLanguage.g:1268:2: (otherlv_0= 'DomainRelations' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleDomainRelations ) ) otherlv_4= '}' )
            // InternalSoftGalleryLanguage.g:1269:3: otherlv_0= 'DomainRelations' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleDomainRelations ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDomainConnectionAccess().getDomainRelationsKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getDomainConnectionAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getDomainConnectionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSoftGalleryLanguage.g:1281:3: ( (lv_elements_3_0= ruleDomainRelations ) )
            // InternalSoftGalleryLanguage.g:1282:4: (lv_elements_3_0= ruleDomainRelations )
            {
            // InternalSoftGalleryLanguage.g:1282:4: (lv_elements_3_0= ruleDomainRelations )
            // InternalSoftGalleryLanguage.g:1283:5: lv_elements_3_0= ruleDomainRelations
            {

            					newCompositeNode(grammarAccess.getDomainConnectionAccess().getElementsDomainRelationsParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_elements_3_0=ruleDomainRelations();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDomainConnectionRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_3_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.DomainRelations");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDomainConnectionAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDomainConnection"


    // $ANTLR start "entryRuleDomainRelations"
    // InternalSoftGalleryLanguage.g:1308:1: entryRuleDomainRelations returns [EObject current=null] : iv_ruleDomainRelations= ruleDomainRelations EOF ;
    public final EObject entryRuleDomainRelations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainRelations = null;


        try {
            // InternalSoftGalleryLanguage.g:1308:56: (iv_ruleDomainRelations= ruleDomainRelations EOF )
            // InternalSoftGalleryLanguage.g:1309:2: iv_ruleDomainRelations= ruleDomainRelations EOF
            {
             newCompositeNode(grammarAccess.getDomainRelationsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDomainRelations=ruleDomainRelations();

            state._fsp--;

             current =iv_ruleDomainRelations; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDomainRelations"


    // $ANTLR start "ruleDomainRelations"
    // InternalSoftGalleryLanguage.g:1315:1: ruleDomainRelations returns [EObject current=null] : ( ( (lv_userdelements_0_0= ruleUserDomain ) ) ( (lv_userDname_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleFunctionalities ) ) otherlv_5= '}' ( (lv_albumdelements_6_0= ruleAlbum ) ) ( (lv_albumDname_7_0= RULE_ID ) ) otherlv_8= ':' otherlv_9= '{' ( (lv_elements_10_0= ruleAlbumManagementFunctions ) ) otherlv_11= '}' ( (lv_photodelements_12_0= rulePhoto ) ) ( (lv_photoDname_13_0= RULE_ID ) ) otherlv_14= ':' otherlv_15= '{' ( (lv_elements_16_0= rulePhotoActionsFunctions ) ) otherlv_17= '}' ( (lv_photoactdelements_18_0= rulePhotoActions ) ) ( (lv_photoactDname_19_0= RULE_ID ) ) otherlv_20= ':' otherlv_21= '{' ( (lv_elements_22_0= ruleAlbumManagement ) ) otherlv_23= '}' ) ;
    public final EObject ruleDomainRelations() throws RecognitionException {
        EObject current = null;

        Token lv_userDname_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_albumDname_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token lv_photoDname_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token lv_photoactDname_19_0=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        EObject lv_userdelements_0_0 = null;

        EObject lv_elements_4_0 = null;

        EObject lv_albumdelements_6_0 = null;

        EObject lv_elements_10_0 = null;

        EObject lv_photodelements_12_0 = null;

        EObject lv_elements_16_0 = null;

        EObject lv_photoactdelements_18_0 = null;

        EObject lv_elements_22_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:1321:2: ( ( ( (lv_userdelements_0_0= ruleUserDomain ) ) ( (lv_userDname_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleFunctionalities ) ) otherlv_5= '}' ( (lv_albumdelements_6_0= ruleAlbum ) ) ( (lv_albumDname_7_0= RULE_ID ) ) otherlv_8= ':' otherlv_9= '{' ( (lv_elements_10_0= ruleAlbumManagementFunctions ) ) otherlv_11= '}' ( (lv_photodelements_12_0= rulePhoto ) ) ( (lv_photoDname_13_0= RULE_ID ) ) otherlv_14= ':' otherlv_15= '{' ( (lv_elements_16_0= rulePhotoActionsFunctions ) ) otherlv_17= '}' ( (lv_photoactdelements_18_0= rulePhotoActions ) ) ( (lv_photoactDname_19_0= RULE_ID ) ) otherlv_20= ':' otherlv_21= '{' ( (lv_elements_22_0= ruleAlbumManagement ) ) otherlv_23= '}' ) )
            // InternalSoftGalleryLanguage.g:1322:2: ( ( (lv_userdelements_0_0= ruleUserDomain ) ) ( (lv_userDname_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleFunctionalities ) ) otherlv_5= '}' ( (lv_albumdelements_6_0= ruleAlbum ) ) ( (lv_albumDname_7_0= RULE_ID ) ) otherlv_8= ':' otherlv_9= '{' ( (lv_elements_10_0= ruleAlbumManagementFunctions ) ) otherlv_11= '}' ( (lv_photodelements_12_0= rulePhoto ) ) ( (lv_photoDname_13_0= RULE_ID ) ) otherlv_14= ':' otherlv_15= '{' ( (lv_elements_16_0= rulePhotoActionsFunctions ) ) otherlv_17= '}' ( (lv_photoactdelements_18_0= rulePhotoActions ) ) ( (lv_photoactDname_19_0= RULE_ID ) ) otherlv_20= ':' otherlv_21= '{' ( (lv_elements_22_0= ruleAlbumManagement ) ) otherlv_23= '}' )
            {
            // InternalSoftGalleryLanguage.g:1322:2: ( ( (lv_userdelements_0_0= ruleUserDomain ) ) ( (lv_userDname_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleFunctionalities ) ) otherlv_5= '}' ( (lv_albumdelements_6_0= ruleAlbum ) ) ( (lv_albumDname_7_0= RULE_ID ) ) otherlv_8= ':' otherlv_9= '{' ( (lv_elements_10_0= ruleAlbumManagementFunctions ) ) otherlv_11= '}' ( (lv_photodelements_12_0= rulePhoto ) ) ( (lv_photoDname_13_0= RULE_ID ) ) otherlv_14= ':' otherlv_15= '{' ( (lv_elements_16_0= rulePhotoActionsFunctions ) ) otherlv_17= '}' ( (lv_photoactdelements_18_0= rulePhotoActions ) ) ( (lv_photoactDname_19_0= RULE_ID ) ) otherlv_20= ':' otherlv_21= '{' ( (lv_elements_22_0= ruleAlbumManagement ) ) otherlv_23= '}' )
            // InternalSoftGalleryLanguage.g:1323:3: ( (lv_userdelements_0_0= ruleUserDomain ) ) ( (lv_userDname_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleFunctionalities ) ) otherlv_5= '}' ( (lv_albumdelements_6_0= ruleAlbum ) ) ( (lv_albumDname_7_0= RULE_ID ) ) otherlv_8= ':' otherlv_9= '{' ( (lv_elements_10_0= ruleAlbumManagementFunctions ) ) otherlv_11= '}' ( (lv_photodelements_12_0= rulePhoto ) ) ( (lv_photoDname_13_0= RULE_ID ) ) otherlv_14= ':' otherlv_15= '{' ( (lv_elements_16_0= rulePhotoActionsFunctions ) ) otherlv_17= '}' ( (lv_photoactdelements_18_0= rulePhotoActions ) ) ( (lv_photoactDname_19_0= RULE_ID ) ) otherlv_20= ':' otherlv_21= '{' ( (lv_elements_22_0= ruleAlbumManagement ) ) otherlv_23= '}'
            {
            // InternalSoftGalleryLanguage.g:1323:3: ( (lv_userdelements_0_0= ruleUserDomain ) )
            // InternalSoftGalleryLanguage.g:1324:4: (lv_userdelements_0_0= ruleUserDomain )
            {
            // InternalSoftGalleryLanguage.g:1324:4: (lv_userdelements_0_0= ruleUserDomain )
            // InternalSoftGalleryLanguage.g:1325:5: lv_userdelements_0_0= ruleUserDomain
            {

            					newCompositeNode(grammarAccess.getDomainRelationsAccess().getUserdelementsUserDomainParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
            lv_userdelements_0_0=ruleUserDomain();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDomainRelationsRule());
            					}
            					add(
            						current,
            						"userdelements",
            						lv_userdelements_0_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.UserDomain");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftGalleryLanguage.g:1342:3: ( (lv_userDname_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:1343:4: (lv_userDname_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:1343:4: (lv_userDname_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:1344:5: lv_userDname_1_0= RULE_ID
            {
            lv_userDname_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_userDname_1_0, grammarAccess.getDomainRelationsAccess().getUserDnameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDomainRelationsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"userDname",
            						lv_userDname_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getDomainRelationsAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getDomainRelationsAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSoftGalleryLanguage.g:1368:3: ( (lv_elements_4_0= ruleFunctionalities ) )
            // InternalSoftGalleryLanguage.g:1369:4: (lv_elements_4_0= ruleFunctionalities )
            {
            // InternalSoftGalleryLanguage.g:1369:4: (lv_elements_4_0= ruleFunctionalities )
            // InternalSoftGalleryLanguage.g:1370:5: lv_elements_4_0= ruleFunctionalities
            {

            					newCompositeNode(grammarAccess.getDomainRelationsAccess().getElementsFunctionalitiesParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_elements_4_0=ruleFunctionalities();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDomainRelationsRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_4_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.Functionalities");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_34); 

            			newLeafNode(otherlv_5, grammarAccess.getDomainRelationsAccess().getRightCurlyBracketKeyword_5());
            		
            // InternalSoftGalleryLanguage.g:1391:3: ( (lv_albumdelements_6_0= ruleAlbum ) )
            // InternalSoftGalleryLanguage.g:1392:4: (lv_albumdelements_6_0= ruleAlbum )
            {
            // InternalSoftGalleryLanguage.g:1392:4: (lv_albumdelements_6_0= ruleAlbum )
            // InternalSoftGalleryLanguage.g:1393:5: lv_albumdelements_6_0= ruleAlbum
            {

            					newCompositeNode(grammarAccess.getDomainRelationsAccess().getAlbumdelementsAlbumParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_9);
            lv_albumdelements_6_0=ruleAlbum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDomainRelationsRule());
            					}
            					add(
            						current,
            						"albumdelements",
            						lv_albumdelements_6_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.Album");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftGalleryLanguage.g:1410:3: ( (lv_albumDname_7_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:1411:4: (lv_albumDname_7_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:1411:4: (lv_albumDname_7_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:1412:5: lv_albumDname_7_0= RULE_ID
            {
            lv_albumDname_7_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_albumDname_7_0, grammarAccess.getDomainRelationsAccess().getAlbumDnameIDTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDomainRelationsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"albumDname",
            						lv_albumDname_7_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_8=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_8, grammarAccess.getDomainRelationsAccess().getColonKeyword_8());
            		
            otherlv_9=(Token)match(input,13,FOLLOW_26); 

            			newLeafNode(otherlv_9, grammarAccess.getDomainRelationsAccess().getLeftCurlyBracketKeyword_9());
            		
            // InternalSoftGalleryLanguage.g:1436:3: ( (lv_elements_10_0= ruleAlbumManagementFunctions ) )
            // InternalSoftGalleryLanguage.g:1437:4: (lv_elements_10_0= ruleAlbumManagementFunctions )
            {
            // InternalSoftGalleryLanguage.g:1437:4: (lv_elements_10_0= ruleAlbumManagementFunctions )
            // InternalSoftGalleryLanguage.g:1438:5: lv_elements_10_0= ruleAlbumManagementFunctions
            {

            					newCompositeNode(grammarAccess.getDomainRelationsAccess().getElementsAlbumManagementFunctionsParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_8);
            lv_elements_10_0=ruleAlbumManagementFunctions();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDomainRelationsRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_10_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.AlbumManagementFunctions");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_11, grammarAccess.getDomainRelationsAccess().getRightCurlyBracketKeyword_11());
            		
            // InternalSoftGalleryLanguage.g:1459:3: ( (lv_photodelements_12_0= rulePhoto ) )
            // InternalSoftGalleryLanguage.g:1460:4: (lv_photodelements_12_0= rulePhoto )
            {
            // InternalSoftGalleryLanguage.g:1460:4: (lv_photodelements_12_0= rulePhoto )
            // InternalSoftGalleryLanguage.g:1461:5: lv_photodelements_12_0= rulePhoto
            {

            					newCompositeNode(grammarAccess.getDomainRelationsAccess().getPhotodelementsPhotoParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_9);
            lv_photodelements_12_0=rulePhoto();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDomainRelationsRule());
            					}
            					add(
            						current,
            						"photodelements",
            						lv_photodelements_12_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.Photo");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftGalleryLanguage.g:1478:3: ( (lv_photoDname_13_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:1479:4: (lv_photoDname_13_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:1479:4: (lv_photoDname_13_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:1480:5: lv_photoDname_13_0= RULE_ID
            {
            lv_photoDname_13_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_photoDname_13_0, grammarAccess.getDomainRelationsAccess().getPhotoDnameIDTerminalRuleCall_13_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDomainRelationsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"photoDname",
            						lv_photoDname_13_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_14=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_14, grammarAccess.getDomainRelationsAccess().getColonKeyword_14());
            		
            otherlv_15=(Token)match(input,13,FOLLOW_28); 

            			newLeafNode(otherlv_15, grammarAccess.getDomainRelationsAccess().getLeftCurlyBracketKeyword_15());
            		
            // InternalSoftGalleryLanguage.g:1504:3: ( (lv_elements_16_0= rulePhotoActionsFunctions ) )
            // InternalSoftGalleryLanguage.g:1505:4: (lv_elements_16_0= rulePhotoActionsFunctions )
            {
            // InternalSoftGalleryLanguage.g:1505:4: (lv_elements_16_0= rulePhotoActionsFunctions )
            // InternalSoftGalleryLanguage.g:1506:5: lv_elements_16_0= rulePhotoActionsFunctions
            {

            					newCompositeNode(grammarAccess.getDomainRelationsAccess().getElementsPhotoActionsFunctionsParserRuleCall_16_0());
            				
            pushFollow(FOLLOW_8);
            lv_elements_16_0=rulePhotoActionsFunctions();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDomainRelationsRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_16_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.PhotoActionsFunctions");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_17=(Token)match(input,14,FOLLOW_20); 

            			newLeafNode(otherlv_17, grammarAccess.getDomainRelationsAccess().getRightCurlyBracketKeyword_17());
            		
            // InternalSoftGalleryLanguage.g:1527:3: ( (lv_photoactdelements_18_0= rulePhotoActions ) )
            // InternalSoftGalleryLanguage.g:1528:4: (lv_photoactdelements_18_0= rulePhotoActions )
            {
            // InternalSoftGalleryLanguage.g:1528:4: (lv_photoactdelements_18_0= rulePhotoActions )
            // InternalSoftGalleryLanguage.g:1529:5: lv_photoactdelements_18_0= rulePhotoActions
            {

            					newCompositeNode(grammarAccess.getDomainRelationsAccess().getPhotoactdelementsPhotoActionsParserRuleCall_18_0());
            				
            pushFollow(FOLLOW_9);
            lv_photoactdelements_18_0=rulePhotoActions();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDomainRelationsRule());
            					}
            					add(
            						current,
            						"photoactdelements",
            						lv_photoactdelements_18_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.PhotoActions");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftGalleryLanguage.g:1546:3: ( (lv_photoactDname_19_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:1547:4: (lv_photoactDname_19_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:1547:4: (lv_photoactDname_19_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:1548:5: lv_photoactDname_19_0= RULE_ID
            {
            lv_photoactDname_19_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_photoactDname_19_0, grammarAccess.getDomainRelationsAccess().getPhotoactDnameIDTerminalRuleCall_19_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDomainRelationsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"photoactDname",
            						lv_photoactDname_19_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_20=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_20, grammarAccess.getDomainRelationsAccess().getColonKeyword_20());
            		
            otherlv_21=(Token)match(input,13,FOLLOW_19); 

            			newLeafNode(otherlv_21, grammarAccess.getDomainRelationsAccess().getLeftCurlyBracketKeyword_21());
            		
            // InternalSoftGalleryLanguage.g:1572:3: ( (lv_elements_22_0= ruleAlbumManagement ) )
            // InternalSoftGalleryLanguage.g:1573:4: (lv_elements_22_0= ruleAlbumManagement )
            {
            // InternalSoftGalleryLanguage.g:1573:4: (lv_elements_22_0= ruleAlbumManagement )
            // InternalSoftGalleryLanguage.g:1574:5: lv_elements_22_0= ruleAlbumManagement
            {

            					newCompositeNode(grammarAccess.getDomainRelationsAccess().getElementsAlbumManagementParserRuleCall_22_0());
            				
            pushFollow(FOLLOW_8);
            lv_elements_22_0=ruleAlbumManagement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDomainRelationsRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_22_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.AlbumManagement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_23=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_23, grammarAccess.getDomainRelationsAccess().getRightCurlyBracketKeyword_23());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDomainRelations"


    // $ANTLR start "entryRuleArchitecture"
    // InternalSoftGalleryLanguage.g:1599:1: entryRuleArchitecture returns [EObject current=null] : iv_ruleArchitecture= ruleArchitecture EOF ;
    public final EObject entryRuleArchitecture() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArchitecture = null;


        try {
            // InternalSoftGalleryLanguage.g:1599:53: (iv_ruleArchitecture= ruleArchitecture EOF )
            // InternalSoftGalleryLanguage.g:1600:2: iv_ruleArchitecture= ruleArchitecture EOF
            {
             newCompositeNode(grammarAccess.getArchitectureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArchitecture=ruleArchitecture();

            state._fsp--;

             current =iv_ruleArchitecture; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArchitecture"


    // $ANTLR start "ruleArchitecture"
    // InternalSoftGalleryLanguage.g:1606:1: ruleArchitecture returns [EObject current=null] : (otherlv_0= 'Architecture:' otherlv_1= '{' ( (lv_elements_2_0= ruleNTiers ) )+ ( (lv_elements_3_0= ruleNTiersConnections ) )+ otherlv_4= '}' ) ;
    public final EObject ruleArchitecture() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:1612:2: ( (otherlv_0= 'Architecture:' otherlv_1= '{' ( (lv_elements_2_0= ruleNTiers ) )+ ( (lv_elements_3_0= ruleNTiersConnections ) )+ otherlv_4= '}' ) )
            // InternalSoftGalleryLanguage.g:1613:2: (otherlv_0= 'Architecture:' otherlv_1= '{' ( (lv_elements_2_0= ruleNTiers ) )+ ( (lv_elements_3_0= ruleNTiersConnections ) )+ otherlv_4= '}' )
            {
            // InternalSoftGalleryLanguage.g:1613:2: (otherlv_0= 'Architecture:' otherlv_1= '{' ( (lv_elements_2_0= ruleNTiers ) )+ ( (lv_elements_3_0= ruleNTiersConnections ) )+ otherlv_4= '}' )
            // InternalSoftGalleryLanguage.g:1614:3: otherlv_0= 'Architecture:' otherlv_1= '{' ( (lv_elements_2_0= ruleNTiers ) )+ ( (lv_elements_3_0= ruleNTiersConnections ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getArchitectureAccess().getArchitectureKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getArchitectureAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSoftGalleryLanguage.g:1622:3: ( (lv_elements_2_0= ruleNTiers ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==39) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSoftGalleryLanguage.g:1623:4: (lv_elements_2_0= ruleNTiers )
            	    {
            	    // InternalSoftGalleryLanguage.g:1623:4: (lv_elements_2_0= ruleNTiers )
            	    // InternalSoftGalleryLanguage.g:1624:5: lv_elements_2_0= ruleNTiers
            	    {

            	    					newCompositeNode(grammarAccess.getArchitectureAccess().getElementsNTiersParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_36);
            	    lv_elements_2_0=ruleNTiers();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getArchitectureRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_2_0,
            	    						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.NTiers");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            // InternalSoftGalleryLanguage.g:1641:3: ( (lv_elements_3_0= ruleNTiersConnections ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==71) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSoftGalleryLanguage.g:1642:4: (lv_elements_3_0= ruleNTiersConnections )
            	    {
            	    // InternalSoftGalleryLanguage.g:1642:4: (lv_elements_3_0= ruleNTiersConnections )
            	    // InternalSoftGalleryLanguage.g:1643:5: lv_elements_3_0= ruleNTiersConnections
            	    {

            	    					newCompositeNode(grammarAccess.getArchitectureAccess().getElementsNTiersConnectionsParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_37);
            	    lv_elements_3_0=ruleNTiersConnections();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getArchitectureRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_3_0,
            	    						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.NTiersConnections");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getArchitectureAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArchitecture"


    // $ANTLR start "entryRuleNTiers"
    // InternalSoftGalleryLanguage.g:1668:1: entryRuleNTiers returns [EObject current=null] : iv_ruleNTiers= ruleNTiers EOF ;
    public final EObject entryRuleNTiers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNTiers = null;


        try {
            // InternalSoftGalleryLanguage.g:1668:47: (iv_ruleNTiers= ruleNTiers EOF )
            // InternalSoftGalleryLanguage.g:1669:2: iv_ruleNTiers= ruleNTiers EOF
            {
             newCompositeNode(grammarAccess.getNTiersRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNTiers=ruleNTiers();

            state._fsp--;

             current =iv_ruleNTiers; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNTiers"


    // $ANTLR start "ruleNTiers"
    // InternalSoftGalleryLanguage.g:1675:1: ruleNTiers returns [EObject current=null] : (otherlv_0= 'Layers' ( (lv_elements_1_0= ruleLayer ) )+ otherlv_2= 'LayersRelations' ( (lv_elements_3_0= ruleLayerRelations ) )+ otherlv_4= 'ArchitectureComponents' ( (lv_elements_5_0= ruleArchitectureComponents ) )+ ) ;
    public final EObject ruleNTiers() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_1_0 = null;

        EObject lv_elements_3_0 = null;

        EObject lv_elements_5_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:1681:2: ( (otherlv_0= 'Layers' ( (lv_elements_1_0= ruleLayer ) )+ otherlv_2= 'LayersRelations' ( (lv_elements_3_0= ruleLayerRelations ) )+ otherlv_4= 'ArchitectureComponents' ( (lv_elements_5_0= ruleArchitectureComponents ) )+ ) )
            // InternalSoftGalleryLanguage.g:1682:2: (otherlv_0= 'Layers' ( (lv_elements_1_0= ruleLayer ) )+ otherlv_2= 'LayersRelations' ( (lv_elements_3_0= ruleLayerRelations ) )+ otherlv_4= 'ArchitectureComponents' ( (lv_elements_5_0= ruleArchitectureComponents ) )+ )
            {
            // InternalSoftGalleryLanguage.g:1682:2: (otherlv_0= 'Layers' ( (lv_elements_1_0= ruleLayer ) )+ otherlv_2= 'LayersRelations' ( (lv_elements_3_0= ruleLayerRelations ) )+ otherlv_4= 'ArchitectureComponents' ( (lv_elements_5_0= ruleArchitectureComponents ) )+ )
            // InternalSoftGalleryLanguage.g:1683:3: otherlv_0= 'Layers' ( (lv_elements_1_0= ruleLayer ) )+ otherlv_2= 'LayersRelations' ( (lv_elements_3_0= ruleLayerRelations ) )+ otherlv_4= 'ArchitectureComponents' ( (lv_elements_5_0= ruleArchitectureComponents ) )+
            {
            otherlv_0=(Token)match(input,39,FOLLOW_38); 

            			newLeafNode(otherlv_0, grammarAccess.getNTiersAccess().getLayersKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:1687:3: ( (lv_elements_1_0= ruleLayer ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==42) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSoftGalleryLanguage.g:1688:4: (lv_elements_1_0= ruleLayer )
            	    {
            	    // InternalSoftGalleryLanguage.g:1688:4: (lv_elements_1_0= ruleLayer )
            	    // InternalSoftGalleryLanguage.g:1689:5: lv_elements_1_0= ruleLayer
            	    {

            	    					newCompositeNode(grammarAccess.getNTiersAccess().getElementsLayerParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_39);
            	    lv_elements_1_0=ruleLayer();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNTiersRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_1_0,
            	    						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.Layer");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            otherlv_2=(Token)match(input,40,FOLLOW_40); 

            			newLeafNode(otherlv_2, grammarAccess.getNTiersAccess().getLayersRelationsKeyword_2());
            		
            // InternalSoftGalleryLanguage.g:1710:3: ( (lv_elements_3_0= ruleLayerRelations ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=62 && LA7_0<=63)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSoftGalleryLanguage.g:1711:4: (lv_elements_3_0= ruleLayerRelations )
            	    {
            	    // InternalSoftGalleryLanguage.g:1711:4: (lv_elements_3_0= ruleLayerRelations )
            	    // InternalSoftGalleryLanguage.g:1712:5: lv_elements_3_0= ruleLayerRelations
            	    {

            	    					newCompositeNode(grammarAccess.getNTiersAccess().getElementsLayerRelationsParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_41);
            	    lv_elements_3_0=ruleLayerRelations();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNTiersRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_3_0,
            	    						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.LayerRelations");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            otherlv_4=(Token)match(input,41,FOLLOW_42); 

            			newLeafNode(otherlv_4, grammarAccess.getNTiersAccess().getArchitectureComponentsKeyword_4());
            		
            // InternalSoftGalleryLanguage.g:1733:3: ( (lv_elements_5_0= ruleArchitectureComponents ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==67) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSoftGalleryLanguage.g:1734:4: (lv_elements_5_0= ruleArchitectureComponents )
            	    {
            	    // InternalSoftGalleryLanguage.g:1734:4: (lv_elements_5_0= ruleArchitectureComponents )
            	    // InternalSoftGalleryLanguage.g:1735:5: lv_elements_5_0= ruleArchitectureComponents
            	    {

            	    					newCompositeNode(grammarAccess.getNTiersAccess().getElementsArchitectureComponentsParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_43);
            	    lv_elements_5_0=ruleArchitectureComponents();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNTiersRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_5_0,
            	    						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.ArchitectureComponents");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNTiers"


    // $ANTLR start "entryRuleLayer"
    // InternalSoftGalleryLanguage.g:1756:1: entryRuleLayer returns [EObject current=null] : iv_ruleLayer= ruleLayer EOF ;
    public final EObject entryRuleLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayer = null;


        try {
            // InternalSoftGalleryLanguage.g:1756:46: (iv_ruleLayer= ruleLayer EOF )
            // InternalSoftGalleryLanguage.g:1757:2: iv_ruleLayer= ruleLayer EOF
            {
             newCompositeNode(grammarAccess.getLayerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLayer=ruleLayer();

            state._fsp--;

             current =iv_ruleLayer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLayer"


    // $ANTLR start "ruleLayer"
    // InternalSoftGalleryLanguage.g:1763:1: ruleLayer returns [EObject current=null] : ( ( (lv_elements_0_0= rulePresentationLayer ) ) ( (lv_elements_1_0= ruleBusinessLogicLayer ) ) ( (lv_elements_2_0= ruleDataPersistenceLayer ) ) ) ;
    public final EObject ruleLayer() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;

        EObject lv_elements_1_0 = null;

        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:1769:2: ( ( ( (lv_elements_0_0= rulePresentationLayer ) ) ( (lv_elements_1_0= ruleBusinessLogicLayer ) ) ( (lv_elements_2_0= ruleDataPersistenceLayer ) ) ) )
            // InternalSoftGalleryLanguage.g:1770:2: ( ( (lv_elements_0_0= rulePresentationLayer ) ) ( (lv_elements_1_0= ruleBusinessLogicLayer ) ) ( (lv_elements_2_0= ruleDataPersistenceLayer ) ) )
            {
            // InternalSoftGalleryLanguage.g:1770:2: ( ( (lv_elements_0_0= rulePresentationLayer ) ) ( (lv_elements_1_0= ruleBusinessLogicLayer ) ) ( (lv_elements_2_0= ruleDataPersistenceLayer ) ) )
            // InternalSoftGalleryLanguage.g:1771:3: ( (lv_elements_0_0= rulePresentationLayer ) ) ( (lv_elements_1_0= ruleBusinessLogicLayer ) ) ( (lv_elements_2_0= ruleDataPersistenceLayer ) )
            {
            // InternalSoftGalleryLanguage.g:1771:3: ( (lv_elements_0_0= rulePresentationLayer ) )
            // InternalSoftGalleryLanguage.g:1772:4: (lv_elements_0_0= rulePresentationLayer )
            {
            // InternalSoftGalleryLanguage.g:1772:4: (lv_elements_0_0= rulePresentationLayer )
            // InternalSoftGalleryLanguage.g:1773:5: lv_elements_0_0= rulePresentationLayer
            {

            					newCompositeNode(grammarAccess.getLayerAccess().getElementsPresentationLayerParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_44);
            lv_elements_0_0=rulePresentationLayer();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLayerRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_0_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.PresentationLayer");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftGalleryLanguage.g:1790:3: ( (lv_elements_1_0= ruleBusinessLogicLayer ) )
            // InternalSoftGalleryLanguage.g:1791:4: (lv_elements_1_0= ruleBusinessLogicLayer )
            {
            // InternalSoftGalleryLanguage.g:1791:4: (lv_elements_1_0= ruleBusinessLogicLayer )
            // InternalSoftGalleryLanguage.g:1792:5: lv_elements_1_0= ruleBusinessLogicLayer
            {

            					newCompositeNode(grammarAccess.getLayerAccess().getElementsBusinessLogicLayerParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_45);
            lv_elements_1_0=ruleBusinessLogicLayer();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLayerRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_1_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.BusinessLogicLayer");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftGalleryLanguage.g:1809:3: ( (lv_elements_2_0= ruleDataPersistenceLayer ) )
            // InternalSoftGalleryLanguage.g:1810:4: (lv_elements_2_0= ruleDataPersistenceLayer )
            {
            // InternalSoftGalleryLanguage.g:1810:4: (lv_elements_2_0= ruleDataPersistenceLayer )
            // InternalSoftGalleryLanguage.g:1811:5: lv_elements_2_0= ruleDataPersistenceLayer
            {

            					newCompositeNode(grammarAccess.getLayerAccess().getElementsDataPersistenceLayerParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_elements_2_0=ruleDataPersistenceLayer();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLayerRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_2_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.DataPersistenceLayer");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLayer"


    // $ANTLR start "entryRulePresentationLayer"
    // InternalSoftGalleryLanguage.g:1832:1: entryRulePresentationLayer returns [EObject current=null] : iv_rulePresentationLayer= rulePresentationLayer EOF ;
    public final EObject entryRulePresentationLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePresentationLayer = null;


        try {
            // InternalSoftGalleryLanguage.g:1832:58: (iv_rulePresentationLayer= rulePresentationLayer EOF )
            // InternalSoftGalleryLanguage.g:1833:2: iv_rulePresentationLayer= rulePresentationLayer EOF
            {
             newCompositeNode(grammarAccess.getPresentationLayerRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePresentationLayer=rulePresentationLayer();

            state._fsp--;

             current =iv_rulePresentationLayer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePresentationLayer"


    // $ANTLR start "rulePresentationLayer"
    // InternalSoftGalleryLanguage.g:1839:1: rulePresentationLayer returns [EObject current=null] : (otherlv_0= 'PresentationLayer' ( (lv_elements_1_0= rulePresentationContent ) ) ( (lv_elements_2_0= ruleSegmentStructure ) ) ) ;
    public final EObject rulePresentationLayer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_elements_1_0 = null;

        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:1845:2: ( (otherlv_0= 'PresentationLayer' ( (lv_elements_1_0= rulePresentationContent ) ) ( (lv_elements_2_0= ruleSegmentStructure ) ) ) )
            // InternalSoftGalleryLanguage.g:1846:2: (otherlv_0= 'PresentationLayer' ( (lv_elements_1_0= rulePresentationContent ) ) ( (lv_elements_2_0= ruleSegmentStructure ) ) )
            {
            // InternalSoftGalleryLanguage.g:1846:2: (otherlv_0= 'PresentationLayer' ( (lv_elements_1_0= rulePresentationContent ) ) ( (lv_elements_2_0= ruleSegmentStructure ) ) )
            // InternalSoftGalleryLanguage.g:1847:3: otherlv_0= 'PresentationLayer' ( (lv_elements_1_0= rulePresentationContent ) ) ( (lv_elements_2_0= ruleSegmentStructure ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_46); 

            			newLeafNode(otherlv_0, grammarAccess.getPresentationLayerAccess().getPresentationLayerKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:1851:3: ( (lv_elements_1_0= rulePresentationContent ) )
            // InternalSoftGalleryLanguage.g:1852:4: (lv_elements_1_0= rulePresentationContent )
            {
            // InternalSoftGalleryLanguage.g:1852:4: (lv_elements_1_0= rulePresentationContent )
            // InternalSoftGalleryLanguage.g:1853:5: lv_elements_1_0= rulePresentationContent
            {

            					newCompositeNode(grammarAccess.getPresentationLayerAccess().getElementsPresentationContentParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_47);
            lv_elements_1_0=rulePresentationContent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPresentationLayerRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_1_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.PresentationContent");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftGalleryLanguage.g:1870:3: ( (lv_elements_2_0= ruleSegmentStructure ) )
            // InternalSoftGalleryLanguage.g:1871:4: (lv_elements_2_0= ruleSegmentStructure )
            {
            // InternalSoftGalleryLanguage.g:1871:4: (lv_elements_2_0= ruleSegmentStructure )
            // InternalSoftGalleryLanguage.g:1872:5: lv_elements_2_0= ruleSegmentStructure
            {

            					newCompositeNode(grammarAccess.getPresentationLayerAccess().getElementsSegmentStructureParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_elements_2_0=ruleSegmentStructure();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPresentationLayerRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_2_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.SegmentStructure");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePresentationLayer"


    // $ANTLR start "entryRulePresentationContent"
    // InternalSoftGalleryLanguage.g:1893:1: entryRulePresentationContent returns [EObject current=null] : iv_rulePresentationContent= rulePresentationContent EOF ;
    public final EObject entryRulePresentationContent() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePresentationContent = null;


        try {
            // InternalSoftGalleryLanguage.g:1893:60: (iv_rulePresentationContent= rulePresentationContent EOF )
            // InternalSoftGalleryLanguage.g:1894:2: iv_rulePresentationContent= rulePresentationContent EOF
            {
             newCompositeNode(grammarAccess.getPresentationContentRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePresentationContent=rulePresentationContent();

            state._fsp--;

             current =iv_rulePresentationContent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePresentationContent"


    // $ANTLR start "rulePresentationContent"
    // InternalSoftGalleryLanguage.g:1900:1: rulePresentationContent returns [EObject current=null] : (otherlv_0= 'PresentationSegments' ( (lv_elements_1_0= rulePresentationSegments ) ) ) ;
    public final EObject rulePresentationContent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_elements_1_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:1906:2: ( (otherlv_0= 'PresentationSegments' ( (lv_elements_1_0= rulePresentationSegments ) ) ) )
            // InternalSoftGalleryLanguage.g:1907:2: (otherlv_0= 'PresentationSegments' ( (lv_elements_1_0= rulePresentationSegments ) ) )
            {
            // InternalSoftGalleryLanguage.g:1907:2: (otherlv_0= 'PresentationSegments' ( (lv_elements_1_0= rulePresentationSegments ) ) )
            // InternalSoftGalleryLanguage.g:1908:3: otherlv_0= 'PresentationSegments' ( (lv_elements_1_0= rulePresentationSegments ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_48); 

            			newLeafNode(otherlv_0, grammarAccess.getPresentationContentAccess().getPresentationSegmentsKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:1912:3: ( (lv_elements_1_0= rulePresentationSegments ) )
            // InternalSoftGalleryLanguage.g:1913:4: (lv_elements_1_0= rulePresentationSegments )
            {
            // InternalSoftGalleryLanguage.g:1913:4: (lv_elements_1_0= rulePresentationSegments )
            // InternalSoftGalleryLanguage.g:1914:5: lv_elements_1_0= rulePresentationSegments
            {

            					newCompositeNode(grammarAccess.getPresentationContentAccess().getElementsPresentationSegmentsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_elements_1_0=rulePresentationSegments();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPresentationContentRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_1_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.PresentationSegments");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePresentationContent"


    // $ANTLR start "entryRulePresentationSegments"
    // InternalSoftGalleryLanguage.g:1935:1: entryRulePresentationSegments returns [EObject current=null] : iv_rulePresentationSegments= rulePresentationSegments EOF ;
    public final EObject entryRulePresentationSegments() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePresentationSegments = null;


        try {
            // InternalSoftGalleryLanguage.g:1935:61: (iv_rulePresentationSegments= rulePresentationSegments EOF )
            // InternalSoftGalleryLanguage.g:1936:2: iv_rulePresentationSegments= rulePresentationSegments EOF
            {
             newCompositeNode(grammarAccess.getPresentationSegmentsRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePresentationSegments=rulePresentationSegments();

            state._fsp--;

             current =iv_rulePresentationSegments; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePresentationSegments"


    // $ANTLR start "rulePresentationSegments"
    // InternalSoftGalleryLanguage.g:1942:1: rulePresentationSegments returns [EObject current=null] : (otherlv_0= 'PresentationView' ( (lv_presentationSName_1_0= RULE_ID ) ) otherlv_2= 'PresentationComponent' ( (lv_presentationCName_3_0= RULE_ID ) ) otherlv_4= 'PresentationAction' ( (lv_presentationAName_5_0= RULE_ID ) ) ) ;
    public final EObject rulePresentationSegments() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_presentationSName_1_0=null;
        Token otherlv_2=null;
        Token lv_presentationCName_3_0=null;
        Token otherlv_4=null;
        Token lv_presentationAName_5_0=null;


        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:1948:2: ( (otherlv_0= 'PresentationView' ( (lv_presentationSName_1_0= RULE_ID ) ) otherlv_2= 'PresentationComponent' ( (lv_presentationCName_3_0= RULE_ID ) ) otherlv_4= 'PresentationAction' ( (lv_presentationAName_5_0= RULE_ID ) ) ) )
            // InternalSoftGalleryLanguage.g:1949:2: (otherlv_0= 'PresentationView' ( (lv_presentationSName_1_0= RULE_ID ) ) otherlv_2= 'PresentationComponent' ( (lv_presentationCName_3_0= RULE_ID ) ) otherlv_4= 'PresentationAction' ( (lv_presentationAName_5_0= RULE_ID ) ) )
            {
            // InternalSoftGalleryLanguage.g:1949:2: (otherlv_0= 'PresentationView' ( (lv_presentationSName_1_0= RULE_ID ) ) otherlv_2= 'PresentationComponent' ( (lv_presentationCName_3_0= RULE_ID ) ) otherlv_4= 'PresentationAction' ( (lv_presentationAName_5_0= RULE_ID ) ) )
            // InternalSoftGalleryLanguage.g:1950:3: otherlv_0= 'PresentationView' ( (lv_presentationSName_1_0= RULE_ID ) ) otherlv_2= 'PresentationComponent' ( (lv_presentationCName_3_0= RULE_ID ) ) otherlv_4= 'PresentationAction' ( (lv_presentationAName_5_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getPresentationSegmentsAccess().getPresentationViewKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:1954:3: ( (lv_presentationSName_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:1955:4: (lv_presentationSName_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:1955:4: (lv_presentationSName_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:1956:5: lv_presentationSName_1_0= RULE_ID
            {
            lv_presentationSName_1_0=(Token)match(input,RULE_ID,FOLLOW_49); 

            					newLeafNode(lv_presentationSName_1_0, grammarAccess.getPresentationSegmentsAccess().getPresentationSNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPresentationSegmentsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"presentationSName",
            						lv_presentationSName_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,45,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getPresentationSegmentsAccess().getPresentationComponentKeyword_2());
            		
            // InternalSoftGalleryLanguage.g:1976:3: ( (lv_presentationCName_3_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:1977:4: (lv_presentationCName_3_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:1977:4: (lv_presentationCName_3_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:1978:5: lv_presentationCName_3_0= RULE_ID
            {
            lv_presentationCName_3_0=(Token)match(input,RULE_ID,FOLLOW_50); 

            					newLeafNode(lv_presentationCName_3_0, grammarAccess.getPresentationSegmentsAccess().getPresentationCNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPresentationSegmentsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"presentationCName",
            						lv_presentationCName_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,46,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getPresentationSegmentsAccess().getPresentationActionKeyword_4());
            		
            // InternalSoftGalleryLanguage.g:1998:3: ( (lv_presentationAName_5_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:1999:4: (lv_presentationAName_5_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:1999:4: (lv_presentationAName_5_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:2000:5: lv_presentationAName_5_0= RULE_ID
            {
            lv_presentationAName_5_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_presentationAName_5_0, grammarAccess.getPresentationSegmentsAccess().getPresentationANameIDTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPresentationSegmentsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"presentationAName",
            						lv_presentationAName_5_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePresentationSegments"


    // $ANTLR start "entryRuleBusinessLogicLayer"
    // InternalSoftGalleryLanguage.g:2020:1: entryRuleBusinessLogicLayer returns [EObject current=null] : iv_ruleBusinessLogicLayer= ruleBusinessLogicLayer EOF ;
    public final EObject entryRuleBusinessLogicLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBusinessLogicLayer = null;


        try {
            // InternalSoftGalleryLanguage.g:2020:59: (iv_ruleBusinessLogicLayer= ruleBusinessLogicLayer EOF )
            // InternalSoftGalleryLanguage.g:2021:2: iv_ruleBusinessLogicLayer= ruleBusinessLogicLayer EOF
            {
             newCompositeNode(grammarAccess.getBusinessLogicLayerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBusinessLogicLayer=ruleBusinessLogicLayer();

            state._fsp--;

             current =iv_ruleBusinessLogicLayer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBusinessLogicLayer"


    // $ANTLR start "ruleBusinessLogicLayer"
    // InternalSoftGalleryLanguage.g:2027:1: ruleBusinessLogicLayer returns [EObject current=null] : (otherlv_0= 'BusinessLogicLayer' ( (lv_elements_1_0= ruleBusinessLogicContent ) ) ( (lv_elements_2_0= ruleSegmentStructure ) ) ) ;
    public final EObject ruleBusinessLogicLayer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_elements_1_0 = null;

        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:2033:2: ( (otherlv_0= 'BusinessLogicLayer' ( (lv_elements_1_0= ruleBusinessLogicContent ) ) ( (lv_elements_2_0= ruleSegmentStructure ) ) ) )
            // InternalSoftGalleryLanguage.g:2034:2: (otherlv_0= 'BusinessLogicLayer' ( (lv_elements_1_0= ruleBusinessLogicContent ) ) ( (lv_elements_2_0= ruleSegmentStructure ) ) )
            {
            // InternalSoftGalleryLanguage.g:2034:2: (otherlv_0= 'BusinessLogicLayer' ( (lv_elements_1_0= ruleBusinessLogicContent ) ) ( (lv_elements_2_0= ruleSegmentStructure ) ) )
            // InternalSoftGalleryLanguage.g:2035:3: otherlv_0= 'BusinessLogicLayer' ( (lv_elements_1_0= ruleBusinessLogicContent ) ) ( (lv_elements_2_0= ruleSegmentStructure ) )
            {
            otherlv_0=(Token)match(input,47,FOLLOW_51); 

            			newLeafNode(otherlv_0, grammarAccess.getBusinessLogicLayerAccess().getBusinessLogicLayerKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:2039:3: ( (lv_elements_1_0= ruleBusinessLogicContent ) )
            // InternalSoftGalleryLanguage.g:2040:4: (lv_elements_1_0= ruleBusinessLogicContent )
            {
            // InternalSoftGalleryLanguage.g:2040:4: (lv_elements_1_0= ruleBusinessLogicContent )
            // InternalSoftGalleryLanguage.g:2041:5: lv_elements_1_0= ruleBusinessLogicContent
            {

            					newCompositeNode(grammarAccess.getBusinessLogicLayerAccess().getElementsBusinessLogicContentParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_47);
            lv_elements_1_0=ruleBusinessLogicContent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBusinessLogicLayerRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_1_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.BusinessLogicContent");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftGalleryLanguage.g:2058:3: ( (lv_elements_2_0= ruleSegmentStructure ) )
            // InternalSoftGalleryLanguage.g:2059:4: (lv_elements_2_0= ruleSegmentStructure )
            {
            // InternalSoftGalleryLanguage.g:2059:4: (lv_elements_2_0= ruleSegmentStructure )
            // InternalSoftGalleryLanguage.g:2060:5: lv_elements_2_0= ruleSegmentStructure
            {

            					newCompositeNode(grammarAccess.getBusinessLogicLayerAccess().getElementsSegmentStructureParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_elements_2_0=ruleSegmentStructure();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBusinessLogicLayerRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_2_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.SegmentStructure");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBusinessLogicLayer"


    // $ANTLR start "entryRuleBusinessLogicContent"
    // InternalSoftGalleryLanguage.g:2081:1: entryRuleBusinessLogicContent returns [EObject current=null] : iv_ruleBusinessLogicContent= ruleBusinessLogicContent EOF ;
    public final EObject entryRuleBusinessLogicContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBusinessLogicContent = null;


        try {
            // InternalSoftGalleryLanguage.g:2081:61: (iv_ruleBusinessLogicContent= ruleBusinessLogicContent EOF )
            // InternalSoftGalleryLanguage.g:2082:2: iv_ruleBusinessLogicContent= ruleBusinessLogicContent EOF
            {
             newCompositeNode(grammarAccess.getBusinessLogicContentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBusinessLogicContent=ruleBusinessLogicContent();

            state._fsp--;

             current =iv_ruleBusinessLogicContent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBusinessLogicContent"


    // $ANTLR start "ruleBusinessLogicContent"
    // InternalSoftGalleryLanguage.g:2088:1: ruleBusinessLogicContent returns [EObject current=null] : (otherlv_0= 'BusinessLogicSegments' ( (lv_elements_1_0= ruleBusinessLogicSegments ) ) ) ;
    public final EObject ruleBusinessLogicContent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_elements_1_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:2094:2: ( (otherlv_0= 'BusinessLogicSegments' ( (lv_elements_1_0= ruleBusinessLogicSegments ) ) ) )
            // InternalSoftGalleryLanguage.g:2095:2: (otherlv_0= 'BusinessLogicSegments' ( (lv_elements_1_0= ruleBusinessLogicSegments ) ) )
            {
            // InternalSoftGalleryLanguage.g:2095:2: (otherlv_0= 'BusinessLogicSegments' ( (lv_elements_1_0= ruleBusinessLogicSegments ) ) )
            // InternalSoftGalleryLanguage.g:2096:3: otherlv_0= 'BusinessLogicSegments' ( (lv_elements_1_0= ruleBusinessLogicSegments ) )
            {
            otherlv_0=(Token)match(input,48,FOLLOW_52); 

            			newLeafNode(otherlv_0, grammarAccess.getBusinessLogicContentAccess().getBusinessLogicSegmentsKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:2100:3: ( (lv_elements_1_0= ruleBusinessLogicSegments ) )
            // InternalSoftGalleryLanguage.g:2101:4: (lv_elements_1_0= ruleBusinessLogicSegments )
            {
            // InternalSoftGalleryLanguage.g:2101:4: (lv_elements_1_0= ruleBusinessLogicSegments )
            // InternalSoftGalleryLanguage.g:2102:5: lv_elements_1_0= ruleBusinessLogicSegments
            {

            					newCompositeNode(grammarAccess.getBusinessLogicContentAccess().getElementsBusinessLogicSegmentsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_elements_1_0=ruleBusinessLogicSegments();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBusinessLogicContentRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_1_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.BusinessLogicSegments");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBusinessLogicContent"


    // $ANTLR start "entryRuleBusinessLogicSegments"
    // InternalSoftGalleryLanguage.g:2123:1: entryRuleBusinessLogicSegments returns [EObject current=null] : iv_ruleBusinessLogicSegments= ruleBusinessLogicSegments EOF ;
    public final EObject entryRuleBusinessLogicSegments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBusinessLogicSegments = null;


        try {
            // InternalSoftGalleryLanguage.g:2123:62: (iv_ruleBusinessLogicSegments= ruleBusinessLogicSegments EOF )
            // InternalSoftGalleryLanguage.g:2124:2: iv_ruleBusinessLogicSegments= ruleBusinessLogicSegments EOF
            {
             newCompositeNode(grammarAccess.getBusinessLogicSegmentsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBusinessLogicSegments=ruleBusinessLogicSegments();

            state._fsp--;

             current =iv_ruleBusinessLogicSegments; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBusinessLogicSegments"


    // $ANTLR start "ruleBusinessLogicSegments"
    // InternalSoftGalleryLanguage.g:2130:1: ruleBusinessLogicSegments returns [EObject current=null] : (otherlv_0= 'ControllerSegment' ( (lv_bussinessName_1_0= RULE_ID ) ) otherlv_2= 'ModelSegment' ( (lv_modelSegmentName_3_0= RULE_ID ) ) otherlv_4= 'RepositorySegment' ( (lv_repositoryName_5_0= RULE_ID ) ) otherlv_6= 'SecuritySegment' ( (lv_securitySName_7_0= RULE_ID ) ) ) ;
    public final EObject ruleBusinessLogicSegments() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_bussinessName_1_0=null;
        Token otherlv_2=null;
        Token lv_modelSegmentName_3_0=null;
        Token otherlv_4=null;
        Token lv_repositoryName_5_0=null;
        Token otherlv_6=null;
        Token lv_securitySName_7_0=null;


        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:2136:2: ( (otherlv_0= 'ControllerSegment' ( (lv_bussinessName_1_0= RULE_ID ) ) otherlv_2= 'ModelSegment' ( (lv_modelSegmentName_3_0= RULE_ID ) ) otherlv_4= 'RepositorySegment' ( (lv_repositoryName_5_0= RULE_ID ) ) otherlv_6= 'SecuritySegment' ( (lv_securitySName_7_0= RULE_ID ) ) ) )
            // InternalSoftGalleryLanguage.g:2137:2: (otherlv_0= 'ControllerSegment' ( (lv_bussinessName_1_0= RULE_ID ) ) otherlv_2= 'ModelSegment' ( (lv_modelSegmentName_3_0= RULE_ID ) ) otherlv_4= 'RepositorySegment' ( (lv_repositoryName_5_0= RULE_ID ) ) otherlv_6= 'SecuritySegment' ( (lv_securitySName_7_0= RULE_ID ) ) )
            {
            // InternalSoftGalleryLanguage.g:2137:2: (otherlv_0= 'ControllerSegment' ( (lv_bussinessName_1_0= RULE_ID ) ) otherlv_2= 'ModelSegment' ( (lv_modelSegmentName_3_0= RULE_ID ) ) otherlv_4= 'RepositorySegment' ( (lv_repositoryName_5_0= RULE_ID ) ) otherlv_6= 'SecuritySegment' ( (lv_securitySName_7_0= RULE_ID ) ) )
            // InternalSoftGalleryLanguage.g:2138:3: otherlv_0= 'ControllerSegment' ( (lv_bussinessName_1_0= RULE_ID ) ) otherlv_2= 'ModelSegment' ( (lv_modelSegmentName_3_0= RULE_ID ) ) otherlv_4= 'RepositorySegment' ( (lv_repositoryName_5_0= RULE_ID ) ) otherlv_6= 'SecuritySegment' ( (lv_securitySName_7_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,49,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getBusinessLogicSegmentsAccess().getControllerSegmentKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:2142:3: ( (lv_bussinessName_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:2143:4: (lv_bussinessName_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:2143:4: (lv_bussinessName_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:2144:5: lv_bussinessName_1_0= RULE_ID
            {
            lv_bussinessName_1_0=(Token)match(input,RULE_ID,FOLLOW_53); 

            					newLeafNode(lv_bussinessName_1_0, grammarAccess.getBusinessLogicSegmentsAccess().getBussinessNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBusinessLogicSegmentsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"bussinessName",
            						lv_bussinessName_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,50,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getBusinessLogicSegmentsAccess().getModelSegmentKeyword_2());
            		
            // InternalSoftGalleryLanguage.g:2164:3: ( (lv_modelSegmentName_3_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:2165:4: (lv_modelSegmentName_3_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:2165:4: (lv_modelSegmentName_3_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:2166:5: lv_modelSegmentName_3_0= RULE_ID
            {
            lv_modelSegmentName_3_0=(Token)match(input,RULE_ID,FOLLOW_54); 

            					newLeafNode(lv_modelSegmentName_3_0, grammarAccess.getBusinessLogicSegmentsAccess().getModelSegmentNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBusinessLogicSegmentsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"modelSegmentName",
            						lv_modelSegmentName_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,51,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getBusinessLogicSegmentsAccess().getRepositorySegmentKeyword_4());
            		
            // InternalSoftGalleryLanguage.g:2186:3: ( (lv_repositoryName_5_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:2187:4: (lv_repositoryName_5_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:2187:4: (lv_repositoryName_5_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:2188:5: lv_repositoryName_5_0= RULE_ID
            {
            lv_repositoryName_5_0=(Token)match(input,RULE_ID,FOLLOW_55); 

            					newLeafNode(lv_repositoryName_5_0, grammarAccess.getBusinessLogicSegmentsAccess().getRepositoryNameIDTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBusinessLogicSegmentsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"repositoryName",
            						lv_repositoryName_5_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_6=(Token)match(input,52,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getBusinessLogicSegmentsAccess().getSecuritySegmentKeyword_6());
            		
            // InternalSoftGalleryLanguage.g:2208:3: ( (lv_securitySName_7_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:2209:4: (lv_securitySName_7_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:2209:4: (lv_securitySName_7_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:2210:5: lv_securitySName_7_0= RULE_ID
            {
            lv_securitySName_7_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_securitySName_7_0, grammarAccess.getBusinessLogicSegmentsAccess().getSecuritySNameIDTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBusinessLogicSegmentsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"securitySName",
            						lv_securitySName_7_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBusinessLogicSegments"


    // $ANTLR start "entryRuleDataPersistenceLayer"
    // InternalSoftGalleryLanguage.g:2230:1: entryRuleDataPersistenceLayer returns [EObject current=null] : iv_ruleDataPersistenceLayer= ruleDataPersistenceLayer EOF ;
    public final EObject entryRuleDataPersistenceLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataPersistenceLayer = null;


        try {
            // InternalSoftGalleryLanguage.g:2230:61: (iv_ruleDataPersistenceLayer= ruleDataPersistenceLayer EOF )
            // InternalSoftGalleryLanguage.g:2231:2: iv_ruleDataPersistenceLayer= ruleDataPersistenceLayer EOF
            {
             newCompositeNode(grammarAccess.getDataPersistenceLayerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataPersistenceLayer=ruleDataPersistenceLayer();

            state._fsp--;

             current =iv_ruleDataPersistenceLayer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataPersistenceLayer"


    // $ANTLR start "ruleDataPersistenceLayer"
    // InternalSoftGalleryLanguage.g:2237:1: ruleDataPersistenceLayer returns [EObject current=null] : (otherlv_0= 'DataPersistenceLayer' ( (lv_elements_1_0= ruleDataPersistenceContent ) ) ) ;
    public final EObject ruleDataPersistenceLayer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_elements_1_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:2243:2: ( (otherlv_0= 'DataPersistenceLayer' ( (lv_elements_1_0= ruleDataPersistenceContent ) ) ) )
            // InternalSoftGalleryLanguage.g:2244:2: (otherlv_0= 'DataPersistenceLayer' ( (lv_elements_1_0= ruleDataPersistenceContent ) ) )
            {
            // InternalSoftGalleryLanguage.g:2244:2: (otherlv_0= 'DataPersistenceLayer' ( (lv_elements_1_0= ruleDataPersistenceContent ) ) )
            // InternalSoftGalleryLanguage.g:2245:3: otherlv_0= 'DataPersistenceLayer' ( (lv_elements_1_0= ruleDataPersistenceContent ) )
            {
            otherlv_0=(Token)match(input,53,FOLLOW_56); 

            			newLeafNode(otherlv_0, grammarAccess.getDataPersistenceLayerAccess().getDataPersistenceLayerKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:2249:3: ( (lv_elements_1_0= ruleDataPersistenceContent ) )
            // InternalSoftGalleryLanguage.g:2250:4: (lv_elements_1_0= ruleDataPersistenceContent )
            {
            // InternalSoftGalleryLanguage.g:2250:4: (lv_elements_1_0= ruleDataPersistenceContent )
            // InternalSoftGalleryLanguage.g:2251:5: lv_elements_1_0= ruleDataPersistenceContent
            {

            					newCompositeNode(grammarAccess.getDataPersistenceLayerAccess().getElementsDataPersistenceContentParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_elements_1_0=ruleDataPersistenceContent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataPersistenceLayerRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_1_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.DataPersistenceContent");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataPersistenceLayer"


    // $ANTLR start "entryRuleDataPersistenceContent"
    // InternalSoftGalleryLanguage.g:2272:1: entryRuleDataPersistenceContent returns [EObject current=null] : iv_ruleDataPersistenceContent= ruleDataPersistenceContent EOF ;
    public final EObject entryRuleDataPersistenceContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataPersistenceContent = null;


        try {
            // InternalSoftGalleryLanguage.g:2272:63: (iv_ruleDataPersistenceContent= ruleDataPersistenceContent EOF )
            // InternalSoftGalleryLanguage.g:2273:2: iv_ruleDataPersistenceContent= ruleDataPersistenceContent EOF
            {
             newCompositeNode(grammarAccess.getDataPersistenceContentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataPersistenceContent=ruleDataPersistenceContent();

            state._fsp--;

             current =iv_ruleDataPersistenceContent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataPersistenceContent"


    // $ANTLR start "ruleDataPersistenceContent"
    // InternalSoftGalleryLanguage.g:2279:1: ruleDataPersistenceContent returns [EObject current=null] : (otherlv_0= 'DataPersistenceSegments' ( (lv_elements_1_0= ruleDataPersistenceSegments ) ) ) ;
    public final EObject ruleDataPersistenceContent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_elements_1_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:2285:2: ( (otherlv_0= 'DataPersistenceSegments' ( (lv_elements_1_0= ruleDataPersistenceSegments ) ) ) )
            // InternalSoftGalleryLanguage.g:2286:2: (otherlv_0= 'DataPersistenceSegments' ( (lv_elements_1_0= ruleDataPersistenceSegments ) ) )
            {
            // InternalSoftGalleryLanguage.g:2286:2: (otherlv_0= 'DataPersistenceSegments' ( (lv_elements_1_0= ruleDataPersistenceSegments ) ) )
            // InternalSoftGalleryLanguage.g:2287:3: otherlv_0= 'DataPersistenceSegments' ( (lv_elements_1_0= ruleDataPersistenceSegments ) )
            {
            otherlv_0=(Token)match(input,54,FOLLOW_57); 

            			newLeafNode(otherlv_0, grammarAccess.getDataPersistenceContentAccess().getDataPersistenceSegmentsKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:2291:3: ( (lv_elements_1_0= ruleDataPersistenceSegments ) )
            // InternalSoftGalleryLanguage.g:2292:4: (lv_elements_1_0= ruleDataPersistenceSegments )
            {
            // InternalSoftGalleryLanguage.g:2292:4: (lv_elements_1_0= ruleDataPersistenceSegments )
            // InternalSoftGalleryLanguage.g:2293:5: lv_elements_1_0= ruleDataPersistenceSegments
            {

            					newCompositeNode(grammarAccess.getDataPersistenceContentAccess().getElementsDataPersistenceSegmentsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_elements_1_0=ruleDataPersistenceSegments();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataPersistenceContentRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_1_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.DataPersistenceSegments");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataPersistenceContent"


    // $ANTLR start "entryRuleDataPersistenceSegments"
    // InternalSoftGalleryLanguage.g:2314:1: entryRuleDataPersistenceSegments returns [EObject current=null] : iv_ruleDataPersistenceSegments= ruleDataPersistenceSegments EOF ;
    public final EObject entryRuleDataPersistenceSegments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataPersistenceSegments = null;


        try {
            // InternalSoftGalleryLanguage.g:2314:64: (iv_ruleDataPersistenceSegments= ruleDataPersistenceSegments EOF )
            // InternalSoftGalleryLanguage.g:2315:2: iv_ruleDataPersistenceSegments= ruleDataPersistenceSegments EOF
            {
             newCompositeNode(grammarAccess.getDataPersistenceSegmentsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataPersistenceSegments=ruleDataPersistenceSegments();

            state._fsp--;

             current =iv_ruleDataPersistenceSegments; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataPersistenceSegments"


    // $ANTLR start "ruleDataPersistenceSegments"
    // InternalSoftGalleryLanguage.g:2321:1: ruleDataPersistenceSegments returns [EObject current=null] : (otherlv_0= 'PostgreSLQSegment' ( (lv_postSName_1_0= RULE_ID ) ) otherlv_2= 'AmazonS3Storage' ( (lv_amazonSName_3_0= RULE_ID ) ) ) ;
    public final EObject ruleDataPersistenceSegments() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_postSName_1_0=null;
        Token otherlv_2=null;
        Token lv_amazonSName_3_0=null;


        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:2327:2: ( (otherlv_0= 'PostgreSLQSegment' ( (lv_postSName_1_0= RULE_ID ) ) otherlv_2= 'AmazonS3Storage' ( (lv_amazonSName_3_0= RULE_ID ) ) ) )
            // InternalSoftGalleryLanguage.g:2328:2: (otherlv_0= 'PostgreSLQSegment' ( (lv_postSName_1_0= RULE_ID ) ) otherlv_2= 'AmazonS3Storage' ( (lv_amazonSName_3_0= RULE_ID ) ) )
            {
            // InternalSoftGalleryLanguage.g:2328:2: (otherlv_0= 'PostgreSLQSegment' ( (lv_postSName_1_0= RULE_ID ) ) otherlv_2= 'AmazonS3Storage' ( (lv_amazonSName_3_0= RULE_ID ) ) )
            // InternalSoftGalleryLanguage.g:2329:3: otherlv_0= 'PostgreSLQSegment' ( (lv_postSName_1_0= RULE_ID ) ) otherlv_2= 'AmazonS3Storage' ( (lv_amazonSName_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,55,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getDataPersistenceSegmentsAccess().getPostgreSLQSegmentKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:2333:3: ( (lv_postSName_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:2334:4: (lv_postSName_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:2334:4: (lv_postSName_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:2335:5: lv_postSName_1_0= RULE_ID
            {
            lv_postSName_1_0=(Token)match(input,RULE_ID,FOLLOW_58); 

            					newLeafNode(lv_postSName_1_0, grammarAccess.getDataPersistenceSegmentsAccess().getPostSNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataPersistenceSegmentsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"postSName",
            						lv_postSName_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,56,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getDataPersistenceSegmentsAccess().getAmazonS3StorageKeyword_2());
            		
            // InternalSoftGalleryLanguage.g:2355:3: ( (lv_amazonSName_3_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:2356:4: (lv_amazonSName_3_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:2356:4: (lv_amazonSName_3_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:2357:5: lv_amazonSName_3_0= RULE_ID
            {
            lv_amazonSName_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_amazonSName_3_0, grammarAccess.getDataPersistenceSegmentsAccess().getAmazonSNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataPersistenceSegmentsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"amazonSName",
            						lv_amazonSName_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataPersistenceSegments"


    // $ANTLR start "entryRuleSegmentStructure"
    // InternalSoftGalleryLanguage.g:2377:1: entryRuleSegmentStructure returns [EObject current=null] : iv_ruleSegmentStructure= ruleSegmentStructure EOF ;
    public final EObject entryRuleSegmentStructure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSegmentStructure = null;


        try {
            // InternalSoftGalleryLanguage.g:2377:57: (iv_ruleSegmentStructure= ruleSegmentStructure EOF )
            // InternalSoftGalleryLanguage.g:2378:2: iv_ruleSegmentStructure= ruleSegmentStructure EOF
            {
             newCompositeNode(grammarAccess.getSegmentStructureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSegmentStructure=ruleSegmentStructure();

            state._fsp--;

             current =iv_ruleSegmentStructure; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSegmentStructure"


    // $ANTLR start "ruleSegmentStructure"
    // InternalSoftGalleryLanguage.g:2384:1: ruleSegmentStructure returns [EObject current=null] : (otherlv_0= 'SegmentStructure' ( (lv_elements_1_0= ruleSegmentStructureContent ) ) ) ;
    public final EObject ruleSegmentStructure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_elements_1_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:2390:2: ( (otherlv_0= 'SegmentStructure' ( (lv_elements_1_0= ruleSegmentStructureContent ) ) ) )
            // InternalSoftGalleryLanguage.g:2391:2: (otherlv_0= 'SegmentStructure' ( (lv_elements_1_0= ruleSegmentStructureContent ) ) )
            {
            // InternalSoftGalleryLanguage.g:2391:2: (otherlv_0= 'SegmentStructure' ( (lv_elements_1_0= ruleSegmentStructureContent ) ) )
            // InternalSoftGalleryLanguage.g:2392:3: otherlv_0= 'SegmentStructure' ( (lv_elements_1_0= ruleSegmentStructureContent ) )
            {
            otherlv_0=(Token)match(input,57,FOLLOW_59); 

            			newLeafNode(otherlv_0, grammarAccess.getSegmentStructureAccess().getSegmentStructureKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:2396:3: ( (lv_elements_1_0= ruleSegmentStructureContent ) )
            // InternalSoftGalleryLanguage.g:2397:4: (lv_elements_1_0= ruleSegmentStructureContent )
            {
            // InternalSoftGalleryLanguage.g:2397:4: (lv_elements_1_0= ruleSegmentStructureContent )
            // InternalSoftGalleryLanguage.g:2398:5: lv_elements_1_0= ruleSegmentStructureContent
            {

            					newCompositeNode(grammarAccess.getSegmentStructureAccess().getElementsSegmentStructureContentParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_elements_1_0=ruleSegmentStructureContent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSegmentStructureRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_1_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.SegmentStructureContent");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSegmentStructure"


    // $ANTLR start "entryRuleSegmentStructureContent"
    // InternalSoftGalleryLanguage.g:2419:1: entryRuleSegmentStructureContent returns [EObject current=null] : iv_ruleSegmentStructureContent= ruleSegmentStructureContent EOF ;
    public final EObject entryRuleSegmentStructureContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSegmentStructureContent = null;


        try {
            // InternalSoftGalleryLanguage.g:2419:64: (iv_ruleSegmentStructureContent= ruleSegmentStructureContent EOF )
            // InternalSoftGalleryLanguage.g:2420:2: iv_ruleSegmentStructureContent= ruleSegmentStructureContent EOF
            {
             newCompositeNode(grammarAccess.getSegmentStructureContentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSegmentStructureContent=ruleSegmentStructureContent();

            state._fsp--;

             current =iv_ruleSegmentStructureContent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSegmentStructureContent"


    // $ANTLR start "ruleSegmentStructureContent"
    // InternalSoftGalleryLanguage.g:2426:1: ruleSegmentStructureContent returns [EObject current=null] : (otherlv_0= 'Directories' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleDirectoryContent ) )+ ) ;
    public final EObject ruleSegmentStructureContent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:2432:2: ( (otherlv_0= 'Directories' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleDirectoryContent ) )+ ) )
            // InternalSoftGalleryLanguage.g:2433:2: (otherlv_0= 'Directories' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleDirectoryContent ) )+ )
            {
            // InternalSoftGalleryLanguage.g:2433:2: (otherlv_0= 'Directories' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleDirectoryContent ) )+ )
            // InternalSoftGalleryLanguage.g:2434:3: otherlv_0= 'Directories' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleDirectoryContent ) )+
            {
            otherlv_0=(Token)match(input,58,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getSegmentStructureContentAccess().getDirectoriesKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:2438:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:2439:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:2439:4: (lv_name_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:2440:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_60); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSegmentStructureContentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSegmentStructureContentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSoftGalleryLanguage.g:2456:3: ( (lv_elements_2_0= ruleDirectoryContent ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=59 && LA9_0<=60)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSoftGalleryLanguage.g:2457:4: (lv_elements_2_0= ruleDirectoryContent )
            	    {
            	    // InternalSoftGalleryLanguage.g:2457:4: (lv_elements_2_0= ruleDirectoryContent )
            	    // InternalSoftGalleryLanguage.g:2458:5: lv_elements_2_0= ruleDirectoryContent
            	    {

            	    					newCompositeNode(grammarAccess.getSegmentStructureContentAccess().getElementsDirectoryContentParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_61);
            	    lv_elements_2_0=ruleDirectoryContent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSegmentStructureContentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_2_0,
            	    						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.DirectoryContent");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSegmentStructureContent"


    // $ANTLR start "entryRuleDirectoryContent"
    // InternalSoftGalleryLanguage.g:2479:1: entryRuleDirectoryContent returns [EObject current=null] : iv_ruleDirectoryContent= ruleDirectoryContent EOF ;
    public final EObject entryRuleDirectoryContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectoryContent = null;


        try {
            // InternalSoftGalleryLanguage.g:2479:57: (iv_ruleDirectoryContent= ruleDirectoryContent EOF )
            // InternalSoftGalleryLanguage.g:2480:2: iv_ruleDirectoryContent= ruleDirectoryContent EOF
            {
             newCompositeNode(grammarAccess.getDirectoryContentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDirectoryContent=ruleDirectoryContent();

            state._fsp--;

             current =iv_ruleDirectoryContent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDirectoryContent"


    // $ANTLR start "ruleDirectoryContent"
    // InternalSoftGalleryLanguage.g:2486:1: ruleDirectoryContent returns [EObject current=null] : ( (otherlv_0= 'Directory' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleDirectories ) ) ) | ( (lv_elements_3_0= ruleSingleFile ) ) ) ;
    public final EObject ruleDirectoryContent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:2492:2: ( ( (otherlv_0= 'Directory' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleDirectories ) ) ) | ( (lv_elements_3_0= ruleSingleFile ) ) ) )
            // InternalSoftGalleryLanguage.g:2493:2: ( (otherlv_0= 'Directory' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleDirectories ) ) ) | ( (lv_elements_3_0= ruleSingleFile ) ) )
            {
            // InternalSoftGalleryLanguage.g:2493:2: ( (otherlv_0= 'Directory' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleDirectories ) ) ) | ( (lv_elements_3_0= ruleSingleFile ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==59) ) {
                alt10=1;
            }
            else if ( (LA10_0==60) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalSoftGalleryLanguage.g:2494:3: (otherlv_0= 'Directory' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleDirectories ) ) )
                    {
                    // InternalSoftGalleryLanguage.g:2494:3: (otherlv_0= 'Directory' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleDirectories ) ) )
                    // InternalSoftGalleryLanguage.g:2495:4: otherlv_0= 'Directory' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleDirectories ) )
                    {
                    otherlv_0=(Token)match(input,59,FOLLOW_9); 

                    				newLeafNode(otherlv_0, grammarAccess.getDirectoryContentAccess().getDirectoryKeyword_0_0());
                    			
                    // InternalSoftGalleryLanguage.g:2499:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalSoftGalleryLanguage.g:2500:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalSoftGalleryLanguage.g:2500:5: (lv_name_1_0= RULE_ID )
                    // InternalSoftGalleryLanguage.g:2501:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_62); 

                    						newLeafNode(lv_name_1_0, grammarAccess.getDirectoryContentAccess().getNameIDTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDirectoryContentRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalSoftGalleryLanguage.g:2517:4: ( (lv_elements_2_0= ruleDirectories ) )
                    // InternalSoftGalleryLanguage.g:2518:5: (lv_elements_2_0= ruleDirectories )
                    {
                    // InternalSoftGalleryLanguage.g:2518:5: (lv_elements_2_0= ruleDirectories )
                    // InternalSoftGalleryLanguage.g:2519:6: lv_elements_2_0= ruleDirectories
                    {

                    						newCompositeNode(grammarAccess.getDirectoryContentAccess().getElementsDirectoriesParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_elements_2_0=ruleDirectories();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDirectoryContentRule());
                    						}
                    						add(
                    							current,
                    							"elements",
                    							lv_elements_2_0,
                    							"co.unal.mdd.photos.dsl.SoftGalleryLanguage.Directories");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSoftGalleryLanguage.g:2538:3: ( (lv_elements_3_0= ruleSingleFile ) )
                    {
                    // InternalSoftGalleryLanguage.g:2538:3: ( (lv_elements_3_0= ruleSingleFile ) )
                    // InternalSoftGalleryLanguage.g:2539:4: (lv_elements_3_0= ruleSingleFile )
                    {
                    // InternalSoftGalleryLanguage.g:2539:4: (lv_elements_3_0= ruleSingleFile )
                    // InternalSoftGalleryLanguage.g:2540:5: lv_elements_3_0= ruleSingleFile
                    {

                    					newCompositeNode(grammarAccess.getDirectoryContentAccess().getElementsSingleFileParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_elements_3_0=ruleSingleFile();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDirectoryContentRule());
                    					}
                    					add(
                    						current,
                    						"elements",
                    						lv_elements_3_0,
                    						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.SingleFile");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDirectoryContent"


    // $ANTLR start "entryRuleDirectories"
    // InternalSoftGalleryLanguage.g:2561:1: entryRuleDirectories returns [EObject current=null] : iv_ruleDirectories= ruleDirectories EOF ;
    public final EObject entryRuleDirectories() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectories = null;


        try {
            // InternalSoftGalleryLanguage.g:2561:52: (iv_ruleDirectories= ruleDirectories EOF )
            // InternalSoftGalleryLanguage.g:2562:2: iv_ruleDirectories= ruleDirectories EOF
            {
             newCompositeNode(grammarAccess.getDirectoriesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDirectories=ruleDirectories();

            state._fsp--;

             current =iv_ruleDirectories; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDirectories"


    // $ANTLR start "ruleDirectories"
    // InternalSoftGalleryLanguage.g:2568:1: ruleDirectories returns [EObject current=null] : ( (lv_elements_0_0= ruleMultipleFile ) ) ;
    public final EObject ruleDirectories() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:2574:2: ( ( (lv_elements_0_0= ruleMultipleFile ) ) )
            // InternalSoftGalleryLanguage.g:2575:2: ( (lv_elements_0_0= ruleMultipleFile ) )
            {
            // InternalSoftGalleryLanguage.g:2575:2: ( (lv_elements_0_0= ruleMultipleFile ) )
            // InternalSoftGalleryLanguage.g:2576:3: (lv_elements_0_0= ruleMultipleFile )
            {
            // InternalSoftGalleryLanguage.g:2576:3: (lv_elements_0_0= ruleMultipleFile )
            // InternalSoftGalleryLanguage.g:2577:4: lv_elements_0_0= ruleMultipleFile
            {

            				newCompositeNode(grammarAccess.getDirectoriesAccess().getElementsMultipleFileParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_elements_0_0=ruleMultipleFile();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getDirectoriesRule());
            				}
            				add(
            					current,
            					"elements",
            					lv_elements_0_0,
            					"co.unal.mdd.photos.dsl.SoftGalleryLanguage.MultipleFile");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDirectories"


    // $ANTLR start "entryRuleSingleFile"
    // InternalSoftGalleryLanguage.g:2597:1: entryRuleSingleFile returns [EObject current=null] : iv_ruleSingleFile= ruleSingleFile EOF ;
    public final EObject entryRuleSingleFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleFile = null;


        try {
            // InternalSoftGalleryLanguage.g:2597:51: (iv_ruleSingleFile= ruleSingleFile EOF )
            // InternalSoftGalleryLanguage.g:2598:2: iv_ruleSingleFile= ruleSingleFile EOF
            {
             newCompositeNode(grammarAccess.getSingleFileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSingleFile=ruleSingleFile();

            state._fsp--;

             current =iv_ruleSingleFile; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSingleFile"


    // $ANTLR start "ruleSingleFile"
    // InternalSoftGalleryLanguage.g:2604:1: ruleSingleFile returns [EObject current=null] : (otherlv_0= 'SingleFile' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleSingleFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:2610:2: ( (otherlv_0= 'SingleFile' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftGalleryLanguage.g:2611:2: (otherlv_0= 'SingleFile' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftGalleryLanguage.g:2611:2: (otherlv_0= 'SingleFile' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftGalleryLanguage.g:2612:3: otherlv_0= 'SingleFile' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,60,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getSingleFileAccess().getSingleFileKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:2616:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:2617:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:2617:4: (lv_name_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:2618:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSingleFileAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSingleFileRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSingleFile"


    // $ANTLR start "entryRuleMultipleFile"
    // InternalSoftGalleryLanguage.g:2638:1: entryRuleMultipleFile returns [EObject current=null] : iv_ruleMultipleFile= ruleMultipleFile EOF ;
    public final EObject entryRuleMultipleFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultipleFile = null;


        try {
            // InternalSoftGalleryLanguage.g:2638:53: (iv_ruleMultipleFile= ruleMultipleFile EOF )
            // InternalSoftGalleryLanguage.g:2639:2: iv_ruleMultipleFile= ruleMultipleFile EOF
            {
             newCompositeNode(grammarAccess.getMultipleFileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultipleFile=ruleMultipleFile();

            state._fsp--;

             current =iv_ruleMultipleFile; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultipleFile"


    // $ANTLR start "ruleMultipleFile"
    // InternalSoftGalleryLanguage.g:2645:1: ruleMultipleFile returns [EObject current=null] : (otherlv_0= 'CommonFile' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleMultipleFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:2651:2: ( (otherlv_0= 'CommonFile' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftGalleryLanguage.g:2652:2: (otherlv_0= 'CommonFile' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftGalleryLanguage.g:2652:2: (otherlv_0= 'CommonFile' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftGalleryLanguage.g:2653:3: otherlv_0= 'CommonFile' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,61,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getMultipleFileAccess().getCommonFileKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:2657:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:2658:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:2658:4: (lv_name_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:2659:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMultipleFileAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMultipleFileRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultipleFile"


    // $ANTLR start "entryRuleLayerRelations"
    // InternalSoftGalleryLanguage.g:2679:1: entryRuleLayerRelations returns [EObject current=null] : iv_ruleLayerRelations= ruleLayerRelations EOF ;
    public final EObject entryRuleLayerRelations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayerRelations = null;


        try {
            // InternalSoftGalleryLanguage.g:2679:55: (iv_ruleLayerRelations= ruleLayerRelations EOF )
            // InternalSoftGalleryLanguage.g:2680:2: iv_ruleLayerRelations= ruleLayerRelations EOF
            {
             newCompositeNode(grammarAccess.getLayerRelationsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLayerRelations=ruleLayerRelations();

            state._fsp--;

             current =iv_ruleLayerRelations; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLayerRelations"


    // $ANTLR start "ruleLayerRelations"
    // InternalSoftGalleryLanguage.g:2686:1: ruleLayerRelations returns [EObject current=null] : ( ( (lv_layerelations_0_0= ruleRelationType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_layerorigin_2_0= ruleLayerSource ) ) ( (lv_layertarget_3_0= ruleLayerTarget ) ) ) ;
    public final EObject ruleLayerRelations() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_layerelations_0_0 = null;

        EObject lv_layerorigin_2_0 = null;

        EObject lv_layertarget_3_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:2692:2: ( ( ( (lv_layerelations_0_0= ruleRelationType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_layerorigin_2_0= ruleLayerSource ) ) ( (lv_layertarget_3_0= ruleLayerTarget ) ) ) )
            // InternalSoftGalleryLanguage.g:2693:2: ( ( (lv_layerelations_0_0= ruleRelationType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_layerorigin_2_0= ruleLayerSource ) ) ( (lv_layertarget_3_0= ruleLayerTarget ) ) )
            {
            // InternalSoftGalleryLanguage.g:2693:2: ( ( (lv_layerelations_0_0= ruleRelationType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_layerorigin_2_0= ruleLayerSource ) ) ( (lv_layertarget_3_0= ruleLayerTarget ) ) )
            // InternalSoftGalleryLanguage.g:2694:3: ( (lv_layerelations_0_0= ruleRelationType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_layerorigin_2_0= ruleLayerSource ) ) ( (lv_layertarget_3_0= ruleLayerTarget ) )
            {
            // InternalSoftGalleryLanguage.g:2694:3: ( (lv_layerelations_0_0= ruleRelationType ) )
            // InternalSoftGalleryLanguage.g:2695:4: (lv_layerelations_0_0= ruleRelationType )
            {
            // InternalSoftGalleryLanguage.g:2695:4: (lv_layerelations_0_0= ruleRelationType )
            // InternalSoftGalleryLanguage.g:2696:5: lv_layerelations_0_0= ruleRelationType
            {

            					newCompositeNode(grammarAccess.getLayerRelationsAccess().getLayerelationsRelationTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
            lv_layerelations_0_0=ruleRelationType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLayerRelationsRule());
            					}
            					add(
            						current,
            						"layerelations",
            						lv_layerelations_0_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.RelationType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftGalleryLanguage.g:2713:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:2714:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:2714:4: (lv_name_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:2715:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_63); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLayerRelationsAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLayerRelationsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSoftGalleryLanguage.g:2731:3: ( (lv_layerorigin_2_0= ruleLayerSource ) )
            // InternalSoftGalleryLanguage.g:2732:4: (lv_layerorigin_2_0= ruleLayerSource )
            {
            // InternalSoftGalleryLanguage.g:2732:4: (lv_layerorigin_2_0= ruleLayerSource )
            // InternalSoftGalleryLanguage.g:2733:5: lv_layerorigin_2_0= ruleLayerSource
            {

            					newCompositeNode(grammarAccess.getLayerRelationsAccess().getLayeroriginLayerSourceParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_64);
            lv_layerorigin_2_0=ruleLayerSource();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLayerRelationsRule());
            					}
            					add(
            						current,
            						"layerorigin",
            						lv_layerorigin_2_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.LayerSource");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftGalleryLanguage.g:2750:3: ( (lv_layertarget_3_0= ruleLayerTarget ) )
            // InternalSoftGalleryLanguage.g:2751:4: (lv_layertarget_3_0= ruleLayerTarget )
            {
            // InternalSoftGalleryLanguage.g:2751:4: (lv_layertarget_3_0= ruleLayerTarget )
            // InternalSoftGalleryLanguage.g:2752:5: lv_layertarget_3_0= ruleLayerTarget
            {

            					newCompositeNode(grammarAccess.getLayerRelationsAccess().getLayertargetLayerTargetParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_layertarget_3_0=ruleLayerTarget();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLayerRelationsRule());
            					}
            					add(
            						current,
            						"layertarget",
            						lv_layertarget_3_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.LayerTarget");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLayerRelations"


    // $ANTLR start "entryRuleRelationType"
    // InternalSoftGalleryLanguage.g:2773:1: entryRuleRelationType returns [String current=null] : iv_ruleRelationType= ruleRelationType EOF ;
    public final String entryRuleRelationType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRelationType = null;


        try {
            // InternalSoftGalleryLanguage.g:2773:52: (iv_ruleRelationType= ruleRelationType EOF )
            // InternalSoftGalleryLanguage.g:2774:2: iv_ruleRelationType= ruleRelationType EOF
            {
             newCompositeNode(grammarAccess.getRelationTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationType=ruleRelationType();

            state._fsp--;

             current =iv_ruleRelationType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationType"


    // $ANTLR start "ruleRelationType"
    // InternalSoftGalleryLanguage.g:2780:1: ruleRelationType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'AllowedToUse' | kw= 'AllowToUseBelow' ) ;
    public final AntlrDatatypeRuleToken ruleRelationType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:2786:2: ( (kw= 'AllowedToUse' | kw= 'AllowToUseBelow' ) )
            // InternalSoftGalleryLanguage.g:2787:2: (kw= 'AllowedToUse' | kw= 'AllowToUseBelow' )
            {
            // InternalSoftGalleryLanguage.g:2787:2: (kw= 'AllowedToUse' | kw= 'AllowToUseBelow' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==62) ) {
                alt11=1;
            }
            else if ( (LA11_0==63) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalSoftGalleryLanguage.g:2788:3: kw= 'AllowedToUse'
                    {
                    kw=(Token)match(input,62,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRelationTypeAccess().getAllowedToUseKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSoftGalleryLanguage.g:2794:3: kw= 'AllowToUseBelow'
                    {
                    kw=(Token)match(input,63,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRelationTypeAccess().getAllowToUseBelowKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationType"


    // $ANTLR start "entryRuleLayerSource"
    // InternalSoftGalleryLanguage.g:2803:1: entryRuleLayerSource returns [EObject current=null] : iv_ruleLayerSource= ruleLayerSource EOF ;
    public final EObject entryRuleLayerSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayerSource = null;


        try {
            // InternalSoftGalleryLanguage.g:2803:52: (iv_ruleLayerSource= ruleLayerSource EOF )
            // InternalSoftGalleryLanguage.g:2804:2: iv_ruleLayerSource= ruleLayerSource EOF
            {
             newCompositeNode(grammarAccess.getLayerSourceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLayerSource=ruleLayerSource();

            state._fsp--;

             current =iv_ruleLayerSource; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLayerSource"


    // $ANTLR start "ruleLayerSource"
    // InternalSoftGalleryLanguage.g:2810:1: ruleLayerSource returns [EObject current=null] : (otherlv_0= 'source' ( (lv_layerelations_1_0= ruleLayerRelationName ) ) ) ;
    public final EObject ruleLayerSource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_layerelations_1_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:2816:2: ( (otherlv_0= 'source' ( (lv_layerelations_1_0= ruleLayerRelationName ) ) ) )
            // InternalSoftGalleryLanguage.g:2817:2: (otherlv_0= 'source' ( (lv_layerelations_1_0= ruleLayerRelationName ) ) )
            {
            // InternalSoftGalleryLanguage.g:2817:2: (otherlv_0= 'source' ( (lv_layerelations_1_0= ruleLayerRelationName ) ) )
            // InternalSoftGalleryLanguage.g:2818:3: otherlv_0= 'source' ( (lv_layerelations_1_0= ruleLayerRelationName ) )
            {
            otherlv_0=(Token)match(input,64,FOLLOW_65); 

            			newLeafNode(otherlv_0, grammarAccess.getLayerSourceAccess().getSourceKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:2822:3: ( (lv_layerelations_1_0= ruleLayerRelationName ) )
            // InternalSoftGalleryLanguage.g:2823:4: (lv_layerelations_1_0= ruleLayerRelationName )
            {
            // InternalSoftGalleryLanguage.g:2823:4: (lv_layerelations_1_0= ruleLayerRelationName )
            // InternalSoftGalleryLanguage.g:2824:5: lv_layerelations_1_0= ruleLayerRelationName
            {

            					newCompositeNode(grammarAccess.getLayerSourceAccess().getLayerelationsLayerRelationNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_layerelations_1_0=ruleLayerRelationName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLayerSourceRule());
            					}
            					add(
            						current,
            						"layerelations",
            						lv_layerelations_1_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.LayerRelationName");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLayerSource"


    // $ANTLR start "entryRuleLayerTarget"
    // InternalSoftGalleryLanguage.g:2845:1: entryRuleLayerTarget returns [EObject current=null] : iv_ruleLayerTarget= ruleLayerTarget EOF ;
    public final EObject entryRuleLayerTarget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayerTarget = null;


        try {
            // InternalSoftGalleryLanguage.g:2845:52: (iv_ruleLayerTarget= ruleLayerTarget EOF )
            // InternalSoftGalleryLanguage.g:2846:2: iv_ruleLayerTarget= ruleLayerTarget EOF
            {
             newCompositeNode(grammarAccess.getLayerTargetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLayerTarget=ruleLayerTarget();

            state._fsp--;

             current =iv_ruleLayerTarget; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLayerTarget"


    // $ANTLR start "ruleLayerTarget"
    // InternalSoftGalleryLanguage.g:2852:1: ruleLayerTarget returns [EObject current=null] : (otherlv_0= 'target' ( (lv_layerelations_1_0= ruleLayerRelationName ) ) ) ;
    public final EObject ruleLayerTarget() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_layerelations_1_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:2858:2: ( (otherlv_0= 'target' ( (lv_layerelations_1_0= ruleLayerRelationName ) ) ) )
            // InternalSoftGalleryLanguage.g:2859:2: (otherlv_0= 'target' ( (lv_layerelations_1_0= ruleLayerRelationName ) ) )
            {
            // InternalSoftGalleryLanguage.g:2859:2: (otherlv_0= 'target' ( (lv_layerelations_1_0= ruleLayerRelationName ) ) )
            // InternalSoftGalleryLanguage.g:2860:3: otherlv_0= 'target' ( (lv_layerelations_1_0= ruleLayerRelationName ) )
            {
            otherlv_0=(Token)match(input,65,FOLLOW_65); 

            			newLeafNode(otherlv_0, grammarAccess.getLayerTargetAccess().getTargetKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:2864:3: ( (lv_layerelations_1_0= ruleLayerRelationName ) )
            // InternalSoftGalleryLanguage.g:2865:4: (lv_layerelations_1_0= ruleLayerRelationName )
            {
            // InternalSoftGalleryLanguage.g:2865:4: (lv_layerelations_1_0= ruleLayerRelationName )
            // InternalSoftGalleryLanguage.g:2866:5: lv_layerelations_1_0= ruleLayerRelationName
            {

            					newCompositeNode(grammarAccess.getLayerTargetAccess().getLayerelationsLayerRelationNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_layerelations_1_0=ruleLayerRelationName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLayerTargetRule());
            					}
            					add(
            						current,
            						"layerelations",
            						lv_layerelations_1_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.LayerRelationName");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLayerTarget"


    // $ANTLR start "entryRuleLayerRelationName"
    // InternalSoftGalleryLanguage.g:2887:1: entryRuleLayerRelationName returns [String current=null] : iv_ruleLayerRelationName= ruleLayerRelationName EOF ;
    public final String entryRuleLayerRelationName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLayerRelationName = null;


        try {
            // InternalSoftGalleryLanguage.g:2887:57: (iv_ruleLayerRelationName= ruleLayerRelationName EOF )
            // InternalSoftGalleryLanguage.g:2888:2: iv_ruleLayerRelationName= ruleLayerRelationName EOF
            {
             newCompositeNode(grammarAccess.getLayerRelationNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLayerRelationName=ruleLayerRelationName();

            state._fsp--;

             current =iv_ruleLayerRelationName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLayerRelationName"


    // $ANTLR start "ruleLayerRelationName"
    // InternalSoftGalleryLanguage.g:2894:1: ruleLayerRelationName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'PresentationLayer' | kw= 'BusinessLogicLayer' | kw= 'PersistenceDataLayer' ) ;
    public final AntlrDatatypeRuleToken ruleLayerRelationName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:2900:2: ( (kw= 'PresentationLayer' | kw= 'BusinessLogicLayer' | kw= 'PersistenceDataLayer' ) )
            // InternalSoftGalleryLanguage.g:2901:2: (kw= 'PresentationLayer' | kw= 'BusinessLogicLayer' | kw= 'PersistenceDataLayer' )
            {
            // InternalSoftGalleryLanguage.g:2901:2: (kw= 'PresentationLayer' | kw= 'BusinessLogicLayer' | kw= 'PersistenceDataLayer' )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt12=1;
                }
                break;
            case 47:
                {
                alt12=2;
                }
                break;
            case 66:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalSoftGalleryLanguage.g:2902:3: kw= 'PresentationLayer'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLayerRelationNameAccess().getPresentationLayerKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSoftGalleryLanguage.g:2908:3: kw= 'BusinessLogicLayer'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLayerRelationNameAccess().getBusinessLogicLayerKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSoftGalleryLanguage.g:2914:3: kw= 'PersistenceDataLayer'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLayerRelationNameAccess().getPersistenceDataLayerKeyword_2());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLayerRelationName"


    // $ANTLR start "entryRuleArchitectureComponents"
    // InternalSoftGalleryLanguage.g:2923:1: entryRuleArchitectureComponents returns [EObject current=null] : iv_ruleArchitectureComponents= ruleArchitectureComponents EOF ;
    public final EObject entryRuleArchitectureComponents() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArchitectureComponents = null;


        try {
            // InternalSoftGalleryLanguage.g:2923:63: (iv_ruleArchitectureComponents= ruleArchitectureComponents EOF )
            // InternalSoftGalleryLanguage.g:2924:2: iv_ruleArchitectureComponents= ruleArchitectureComponents EOF
            {
             newCompositeNode(grammarAccess.getArchitectureComponentsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArchitectureComponents=ruleArchitectureComponents();

            state._fsp--;

             current =iv_ruleArchitectureComponents; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArchitectureComponents"


    // $ANTLR start "ruleArchitectureComponents"
    // InternalSoftGalleryLanguage.g:2930:1: ruleArchitectureComponents returns [EObject current=null] : (otherlv_0= 'SystemComponents' ( (lv_archcomponent_1_0= ruleFrontEnd ) ) ( (lv_archcomponent_2_0= ruleBackEnd ) ) ( (lv_archcomponent_3_0= rulePersistenceDataComponent ) ) ) ;
    public final EObject ruleArchitectureComponents() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_archcomponent_1_0 = null;

        EObject lv_archcomponent_2_0 = null;

        EObject lv_archcomponent_3_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:2936:2: ( (otherlv_0= 'SystemComponents' ( (lv_archcomponent_1_0= ruleFrontEnd ) ) ( (lv_archcomponent_2_0= ruleBackEnd ) ) ( (lv_archcomponent_3_0= rulePersistenceDataComponent ) ) ) )
            // InternalSoftGalleryLanguage.g:2937:2: (otherlv_0= 'SystemComponents' ( (lv_archcomponent_1_0= ruleFrontEnd ) ) ( (lv_archcomponent_2_0= ruleBackEnd ) ) ( (lv_archcomponent_3_0= rulePersistenceDataComponent ) ) )
            {
            // InternalSoftGalleryLanguage.g:2937:2: (otherlv_0= 'SystemComponents' ( (lv_archcomponent_1_0= ruleFrontEnd ) ) ( (lv_archcomponent_2_0= ruleBackEnd ) ) ( (lv_archcomponent_3_0= rulePersistenceDataComponent ) ) )
            // InternalSoftGalleryLanguage.g:2938:3: otherlv_0= 'SystemComponents' ( (lv_archcomponent_1_0= ruleFrontEnd ) ) ( (lv_archcomponent_2_0= ruleBackEnd ) ) ( (lv_archcomponent_3_0= rulePersistenceDataComponent ) )
            {
            otherlv_0=(Token)match(input,67,FOLLOW_66); 

            			newLeafNode(otherlv_0, grammarAccess.getArchitectureComponentsAccess().getSystemComponentsKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:2942:3: ( (lv_archcomponent_1_0= ruleFrontEnd ) )
            // InternalSoftGalleryLanguage.g:2943:4: (lv_archcomponent_1_0= ruleFrontEnd )
            {
            // InternalSoftGalleryLanguage.g:2943:4: (lv_archcomponent_1_0= ruleFrontEnd )
            // InternalSoftGalleryLanguage.g:2944:5: lv_archcomponent_1_0= ruleFrontEnd
            {

            					newCompositeNode(grammarAccess.getArchitectureComponentsAccess().getArchcomponentFrontEndParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_67);
            lv_archcomponent_1_0=ruleFrontEnd();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArchitectureComponentsRule());
            					}
            					add(
            						current,
            						"archcomponent",
            						lv_archcomponent_1_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.FrontEnd");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftGalleryLanguage.g:2961:3: ( (lv_archcomponent_2_0= ruleBackEnd ) )
            // InternalSoftGalleryLanguage.g:2962:4: (lv_archcomponent_2_0= ruleBackEnd )
            {
            // InternalSoftGalleryLanguage.g:2962:4: (lv_archcomponent_2_0= ruleBackEnd )
            // InternalSoftGalleryLanguage.g:2963:5: lv_archcomponent_2_0= ruleBackEnd
            {

            					newCompositeNode(grammarAccess.getArchitectureComponentsAccess().getArchcomponentBackEndParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_68);
            lv_archcomponent_2_0=ruleBackEnd();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArchitectureComponentsRule());
            					}
            					add(
            						current,
            						"archcomponent",
            						lv_archcomponent_2_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.BackEnd");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftGalleryLanguage.g:2980:3: ( (lv_archcomponent_3_0= rulePersistenceDataComponent ) )
            // InternalSoftGalleryLanguage.g:2981:4: (lv_archcomponent_3_0= rulePersistenceDataComponent )
            {
            // InternalSoftGalleryLanguage.g:2981:4: (lv_archcomponent_3_0= rulePersistenceDataComponent )
            // InternalSoftGalleryLanguage.g:2982:5: lv_archcomponent_3_0= rulePersistenceDataComponent
            {

            					newCompositeNode(grammarAccess.getArchitectureComponentsAccess().getArchcomponentPersistenceDataComponentParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_archcomponent_3_0=rulePersistenceDataComponent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArchitectureComponentsRule());
            					}
            					add(
            						current,
            						"archcomponent",
            						lv_archcomponent_3_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.PersistenceDataComponent");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArchitectureComponents"


    // $ANTLR start "entryRuleFrontEnd"
    // InternalSoftGalleryLanguage.g:3003:1: entryRuleFrontEnd returns [EObject current=null] : iv_ruleFrontEnd= ruleFrontEnd EOF ;
    public final EObject entryRuleFrontEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFrontEnd = null;


        try {
            // InternalSoftGalleryLanguage.g:3003:49: (iv_ruleFrontEnd= ruleFrontEnd EOF )
            // InternalSoftGalleryLanguage.g:3004:2: iv_ruleFrontEnd= ruleFrontEnd EOF
            {
             newCompositeNode(grammarAccess.getFrontEndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFrontEnd=ruleFrontEnd();

            state._fsp--;

             current =iv_ruleFrontEnd; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFrontEnd"


    // $ANTLR start "ruleFrontEnd"
    // InternalSoftGalleryLanguage.g:3010:1: ruleFrontEnd returns [EObject current=null] : (otherlv_0= 'FrontEndComponent' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleFrontEnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:3016:2: ( (otherlv_0= 'FrontEndComponent' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftGalleryLanguage.g:3017:2: (otherlv_0= 'FrontEndComponent' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftGalleryLanguage.g:3017:2: (otherlv_0= 'FrontEndComponent' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftGalleryLanguage.g:3018:3: otherlv_0= 'FrontEndComponent' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,68,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getFrontEndAccess().getFrontEndComponentKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:3022:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:3023:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:3023:4: (lv_name_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:3024:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFrontEndAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFrontEndRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFrontEnd"


    // $ANTLR start "entryRuleBackEnd"
    // InternalSoftGalleryLanguage.g:3044:1: entryRuleBackEnd returns [EObject current=null] : iv_ruleBackEnd= ruleBackEnd EOF ;
    public final EObject entryRuleBackEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBackEnd = null;


        try {
            // InternalSoftGalleryLanguage.g:3044:48: (iv_ruleBackEnd= ruleBackEnd EOF )
            // InternalSoftGalleryLanguage.g:3045:2: iv_ruleBackEnd= ruleBackEnd EOF
            {
             newCompositeNode(grammarAccess.getBackEndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBackEnd=ruleBackEnd();

            state._fsp--;

             current =iv_ruleBackEnd; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBackEnd"


    // $ANTLR start "ruleBackEnd"
    // InternalSoftGalleryLanguage.g:3051:1: ruleBackEnd returns [EObject current=null] : (otherlv_0= 'BackEndComponent' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleBackEnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:3057:2: ( (otherlv_0= 'BackEndComponent' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftGalleryLanguage.g:3058:2: (otherlv_0= 'BackEndComponent' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftGalleryLanguage.g:3058:2: (otherlv_0= 'BackEndComponent' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftGalleryLanguage.g:3059:3: otherlv_0= 'BackEndComponent' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,69,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getBackEndAccess().getBackEndComponentKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:3063:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:3064:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:3064:4: (lv_name_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:3065:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getBackEndAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBackEndRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBackEnd"


    // $ANTLR start "entryRulePersistenceDataComponent"
    // InternalSoftGalleryLanguage.g:3085:1: entryRulePersistenceDataComponent returns [EObject current=null] : iv_rulePersistenceDataComponent= rulePersistenceDataComponent EOF ;
    public final EObject entryRulePersistenceDataComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePersistenceDataComponent = null;


        try {
            // InternalSoftGalleryLanguage.g:3085:65: (iv_rulePersistenceDataComponent= rulePersistenceDataComponent EOF )
            // InternalSoftGalleryLanguage.g:3086:2: iv_rulePersistenceDataComponent= rulePersistenceDataComponent EOF
            {
             newCompositeNode(grammarAccess.getPersistenceDataComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePersistenceDataComponent=rulePersistenceDataComponent();

            state._fsp--;

             current =iv_rulePersistenceDataComponent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePersistenceDataComponent"


    // $ANTLR start "rulePersistenceDataComponent"
    // InternalSoftGalleryLanguage.g:3092:1: rulePersistenceDataComponent returns [EObject current=null] : (otherlv_0= 'PersistenceDataComponent' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePersistenceDataComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:3098:2: ( (otherlv_0= 'PersistenceDataComponent' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftGalleryLanguage.g:3099:2: (otherlv_0= 'PersistenceDataComponent' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftGalleryLanguage.g:3099:2: (otherlv_0= 'PersistenceDataComponent' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftGalleryLanguage.g:3100:3: otherlv_0= 'PersistenceDataComponent' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,70,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getPersistenceDataComponentAccess().getPersistenceDataComponentKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:3104:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:3105:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:3105:4: (lv_name_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:3106:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPersistenceDataComponentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPersistenceDataComponentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePersistenceDataComponent"


    // $ANTLR start "entryRuleNTiersConnections"
    // InternalSoftGalleryLanguage.g:3126:1: entryRuleNTiersConnections returns [EObject current=null] : iv_ruleNTiersConnections= ruleNTiersConnections EOF ;
    public final EObject entryRuleNTiersConnections() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNTiersConnections = null;


        try {
            // InternalSoftGalleryLanguage.g:3126:58: (iv_ruleNTiersConnections= ruleNTiersConnections EOF )
            // InternalSoftGalleryLanguage.g:3127:2: iv_ruleNTiersConnections= ruleNTiersConnections EOF
            {
             newCompositeNode(grammarAccess.getNTiersConnectionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNTiersConnections=ruleNTiersConnections();

            state._fsp--;

             current =iv_ruleNTiersConnections; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNTiersConnections"


    // $ANTLR start "ruleNTiersConnections"
    // InternalSoftGalleryLanguage.g:3133:1: ruleNTiersConnections returns [EObject current=null] : (otherlv_0= 'Connectors' ( (lv_ntierconnections_1_0= ruleNTierConnectionContent ) )+ ) ;
    public final EObject ruleNTiersConnections() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_ntierconnections_1_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:3139:2: ( (otherlv_0= 'Connectors' ( (lv_ntierconnections_1_0= ruleNTierConnectionContent ) )+ ) )
            // InternalSoftGalleryLanguage.g:3140:2: (otherlv_0= 'Connectors' ( (lv_ntierconnections_1_0= ruleNTierConnectionContent ) )+ )
            {
            // InternalSoftGalleryLanguage.g:3140:2: (otherlv_0= 'Connectors' ( (lv_ntierconnections_1_0= ruleNTierConnectionContent ) )+ )
            // InternalSoftGalleryLanguage.g:3141:3: otherlv_0= 'Connectors' ( (lv_ntierconnections_1_0= ruleNTierConnectionContent ) )+
            {
            otherlv_0=(Token)match(input,71,FOLLOW_69); 

            			newLeafNode(otherlv_0, grammarAccess.getNTiersConnectionsAccess().getConnectorsKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:3145:3: ( (lv_ntierconnections_1_0= ruleNTierConnectionContent ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=72 && LA13_0<=74)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSoftGalleryLanguage.g:3146:4: (lv_ntierconnections_1_0= ruleNTierConnectionContent )
            	    {
            	    // InternalSoftGalleryLanguage.g:3146:4: (lv_ntierconnections_1_0= ruleNTierConnectionContent )
            	    // InternalSoftGalleryLanguage.g:3147:5: lv_ntierconnections_1_0= ruleNTierConnectionContent
            	    {

            	    					newCompositeNode(grammarAccess.getNTiersConnectionsAccess().getNtierconnectionsNTierConnectionContentParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_70);
            	    lv_ntierconnections_1_0=ruleNTierConnectionContent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNTiersConnectionsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ntierconnections",
            	    						lv_ntierconnections_1_0,
            	    						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.NTierConnectionContent");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNTiersConnections"


    // $ANTLR start "entryRuleNTierConnectionContent"
    // InternalSoftGalleryLanguage.g:3168:1: entryRuleNTierConnectionContent returns [EObject current=null] : iv_ruleNTierConnectionContent= ruleNTierConnectionContent EOF ;
    public final EObject entryRuleNTierConnectionContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNTierConnectionContent = null;


        try {
            // InternalSoftGalleryLanguage.g:3168:63: (iv_ruleNTierConnectionContent= ruleNTierConnectionContent EOF )
            // InternalSoftGalleryLanguage.g:3169:2: iv_ruleNTierConnectionContent= ruleNTierConnectionContent EOF
            {
             newCompositeNode(grammarAccess.getNTierConnectionContentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNTierConnectionContent=ruleNTierConnectionContent();

            state._fsp--;

             current =iv_ruleNTierConnectionContent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNTierConnectionContent"


    // $ANTLR start "ruleNTierConnectionContent"
    // InternalSoftGalleryLanguage.g:3175:1: ruleNTierConnectionContent returns [EObject current=null] : ( ( (lv_ntierconnection_0_0= ruleConnectionType ) ) ( (lv_nTierName_1_0= RULE_ID ) ) ( (lv_ntierorigin_2_0= ruleNTierSource ) ) ( (lv_ntiertarget_3_0= ruleNTierTarget ) ) ) ;
    public final EObject ruleNTierConnectionContent() throws RecognitionException {
        EObject current = null;

        Token lv_nTierName_1_0=null;
        AntlrDatatypeRuleToken lv_ntierconnection_0_0 = null;

        EObject lv_ntierorigin_2_0 = null;

        EObject lv_ntiertarget_3_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:3181:2: ( ( ( (lv_ntierconnection_0_0= ruleConnectionType ) ) ( (lv_nTierName_1_0= RULE_ID ) ) ( (lv_ntierorigin_2_0= ruleNTierSource ) ) ( (lv_ntiertarget_3_0= ruleNTierTarget ) ) ) )
            // InternalSoftGalleryLanguage.g:3182:2: ( ( (lv_ntierconnection_0_0= ruleConnectionType ) ) ( (lv_nTierName_1_0= RULE_ID ) ) ( (lv_ntierorigin_2_0= ruleNTierSource ) ) ( (lv_ntiertarget_3_0= ruleNTierTarget ) ) )
            {
            // InternalSoftGalleryLanguage.g:3182:2: ( ( (lv_ntierconnection_0_0= ruleConnectionType ) ) ( (lv_nTierName_1_0= RULE_ID ) ) ( (lv_ntierorigin_2_0= ruleNTierSource ) ) ( (lv_ntiertarget_3_0= ruleNTierTarget ) ) )
            // InternalSoftGalleryLanguage.g:3183:3: ( (lv_ntierconnection_0_0= ruleConnectionType ) ) ( (lv_nTierName_1_0= RULE_ID ) ) ( (lv_ntierorigin_2_0= ruleNTierSource ) ) ( (lv_ntiertarget_3_0= ruleNTierTarget ) )
            {
            // InternalSoftGalleryLanguage.g:3183:3: ( (lv_ntierconnection_0_0= ruleConnectionType ) )
            // InternalSoftGalleryLanguage.g:3184:4: (lv_ntierconnection_0_0= ruleConnectionType )
            {
            // InternalSoftGalleryLanguage.g:3184:4: (lv_ntierconnection_0_0= ruleConnectionType )
            // InternalSoftGalleryLanguage.g:3185:5: lv_ntierconnection_0_0= ruleConnectionType
            {

            					newCompositeNode(grammarAccess.getNTierConnectionContentAccess().getNtierconnectionConnectionTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
            lv_ntierconnection_0_0=ruleConnectionType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNTierConnectionContentRule());
            					}
            					add(
            						current,
            						"ntierconnection",
            						lv_ntierconnection_0_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.ConnectionType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftGalleryLanguage.g:3202:3: ( (lv_nTierName_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:3203:4: (lv_nTierName_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:3203:4: (lv_nTierName_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:3204:5: lv_nTierName_1_0= RULE_ID
            {
            lv_nTierName_1_0=(Token)match(input,RULE_ID,FOLLOW_63); 

            					newLeafNode(lv_nTierName_1_0, grammarAccess.getNTierConnectionContentAccess().getNTierNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNTierConnectionContentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nTierName",
            						lv_nTierName_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSoftGalleryLanguage.g:3220:3: ( (lv_ntierorigin_2_0= ruleNTierSource ) )
            // InternalSoftGalleryLanguage.g:3221:4: (lv_ntierorigin_2_0= ruleNTierSource )
            {
            // InternalSoftGalleryLanguage.g:3221:4: (lv_ntierorigin_2_0= ruleNTierSource )
            // InternalSoftGalleryLanguage.g:3222:5: lv_ntierorigin_2_0= ruleNTierSource
            {

            					newCompositeNode(grammarAccess.getNTierConnectionContentAccess().getNtieroriginNTierSourceParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_64);
            lv_ntierorigin_2_0=ruleNTierSource();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNTierConnectionContentRule());
            					}
            					add(
            						current,
            						"ntierorigin",
            						lv_ntierorigin_2_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.NTierSource");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftGalleryLanguage.g:3239:3: ( (lv_ntiertarget_3_0= ruleNTierTarget ) )
            // InternalSoftGalleryLanguage.g:3240:4: (lv_ntiertarget_3_0= ruleNTierTarget )
            {
            // InternalSoftGalleryLanguage.g:3240:4: (lv_ntiertarget_3_0= ruleNTierTarget )
            // InternalSoftGalleryLanguage.g:3241:5: lv_ntiertarget_3_0= ruleNTierTarget
            {

            					newCompositeNode(grammarAccess.getNTierConnectionContentAccess().getNtiertargetNTierTargetParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_ntiertarget_3_0=ruleNTierTarget();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNTierConnectionContentRule());
            					}
            					add(
            						current,
            						"ntiertarget",
            						lv_ntiertarget_3_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.NTierTarget");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNTierConnectionContent"


    // $ANTLR start "entryRuleConnectionType"
    // InternalSoftGalleryLanguage.g:3262:1: entryRuleConnectionType returns [String current=null] : iv_ruleConnectionType= ruleConnectionType EOF ;
    public final String entryRuleConnectionType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConnectionType = null;


        try {
            // InternalSoftGalleryLanguage.g:3262:54: (iv_ruleConnectionType= ruleConnectionType EOF )
            // InternalSoftGalleryLanguage.g:3263:2: iv_ruleConnectionType= ruleConnectionType EOF
            {
             newCompositeNode(grammarAccess.getConnectionTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConnectionType=ruleConnectionType();

            state._fsp--;

             current =iv_ruleConnectionType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConnectionType"


    // $ANTLR start "ruleConnectionType"
    // InternalSoftGalleryLanguage.g:3269:1: ruleConnectionType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'REST' | kw= 'PostgreSQLConnection' | kw= 'AmazonS3API' ) ;
    public final AntlrDatatypeRuleToken ruleConnectionType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:3275:2: ( (kw= 'REST' | kw= 'PostgreSQLConnection' | kw= 'AmazonS3API' ) )
            // InternalSoftGalleryLanguage.g:3276:2: (kw= 'REST' | kw= 'PostgreSQLConnection' | kw= 'AmazonS3API' )
            {
            // InternalSoftGalleryLanguage.g:3276:2: (kw= 'REST' | kw= 'PostgreSQLConnection' | kw= 'AmazonS3API' )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt14=1;
                }
                break;
            case 73:
                {
                alt14=2;
                }
                break;
            case 74:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalSoftGalleryLanguage.g:3277:3: kw= 'REST'
                    {
                    kw=(Token)match(input,72,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getConnectionTypeAccess().getRESTKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSoftGalleryLanguage.g:3283:3: kw= 'PostgreSQLConnection'
                    {
                    kw=(Token)match(input,73,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getConnectionTypeAccess().getPostgreSQLConnectionKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSoftGalleryLanguage.g:3289:3: kw= 'AmazonS3API'
                    {
                    kw=(Token)match(input,74,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getConnectionTypeAccess().getAmazonS3APIKeyword_2());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConnectionType"


    // $ANTLR start "entryRuleNTierSource"
    // InternalSoftGalleryLanguage.g:3298:1: entryRuleNTierSource returns [EObject current=null] : iv_ruleNTierSource= ruleNTierSource EOF ;
    public final EObject entryRuleNTierSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNTierSource = null;


        try {
            // InternalSoftGalleryLanguage.g:3298:52: (iv_ruleNTierSource= ruleNTierSource EOF )
            // InternalSoftGalleryLanguage.g:3299:2: iv_ruleNTierSource= ruleNTierSource EOF
            {
             newCompositeNode(grammarAccess.getNTierSourceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNTierSource=ruleNTierSource();

            state._fsp--;

             current =iv_ruleNTierSource; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNTierSource"


    // $ANTLR start "ruleNTierSource"
    // InternalSoftGalleryLanguage.g:3305:1: ruleNTierSource returns [EObject current=null] : (otherlv_0= 'source' ( (lv_ntierconnection_1_0= ruleNTiersRelations ) ) ) ;
    public final EObject ruleNTierSource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_ntierconnection_1_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:3311:2: ( (otherlv_0= 'source' ( (lv_ntierconnection_1_0= ruleNTiersRelations ) ) ) )
            // InternalSoftGalleryLanguage.g:3312:2: (otherlv_0= 'source' ( (lv_ntierconnection_1_0= ruleNTiersRelations ) ) )
            {
            // InternalSoftGalleryLanguage.g:3312:2: (otherlv_0= 'source' ( (lv_ntierconnection_1_0= ruleNTiersRelations ) ) )
            // InternalSoftGalleryLanguage.g:3313:3: otherlv_0= 'source' ( (lv_ntierconnection_1_0= ruleNTiersRelations ) )
            {
            otherlv_0=(Token)match(input,64,FOLLOW_71); 

            			newLeafNode(otherlv_0, grammarAccess.getNTierSourceAccess().getSourceKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:3317:3: ( (lv_ntierconnection_1_0= ruleNTiersRelations ) )
            // InternalSoftGalleryLanguage.g:3318:4: (lv_ntierconnection_1_0= ruleNTiersRelations )
            {
            // InternalSoftGalleryLanguage.g:3318:4: (lv_ntierconnection_1_0= ruleNTiersRelations )
            // InternalSoftGalleryLanguage.g:3319:5: lv_ntierconnection_1_0= ruleNTiersRelations
            {

            					newCompositeNode(grammarAccess.getNTierSourceAccess().getNtierconnectionNTiersRelationsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_ntierconnection_1_0=ruleNTiersRelations();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNTierSourceRule());
            					}
            					add(
            						current,
            						"ntierconnection",
            						lv_ntierconnection_1_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.NTiersRelations");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNTierSource"


    // $ANTLR start "entryRuleNTierTarget"
    // InternalSoftGalleryLanguage.g:3340:1: entryRuleNTierTarget returns [EObject current=null] : iv_ruleNTierTarget= ruleNTierTarget EOF ;
    public final EObject entryRuleNTierTarget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNTierTarget = null;


        try {
            // InternalSoftGalleryLanguage.g:3340:52: (iv_ruleNTierTarget= ruleNTierTarget EOF )
            // InternalSoftGalleryLanguage.g:3341:2: iv_ruleNTierTarget= ruleNTierTarget EOF
            {
             newCompositeNode(grammarAccess.getNTierTargetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNTierTarget=ruleNTierTarget();

            state._fsp--;

             current =iv_ruleNTierTarget; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNTierTarget"


    // $ANTLR start "ruleNTierTarget"
    // InternalSoftGalleryLanguage.g:3347:1: ruleNTierTarget returns [EObject current=null] : (otherlv_0= 'target' ( (lv_ntierconnection_1_0= ruleNTiersRelations ) ) ) ;
    public final EObject ruleNTierTarget() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_ntierconnection_1_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:3353:2: ( (otherlv_0= 'target' ( (lv_ntierconnection_1_0= ruleNTiersRelations ) ) ) )
            // InternalSoftGalleryLanguage.g:3354:2: (otherlv_0= 'target' ( (lv_ntierconnection_1_0= ruleNTiersRelations ) ) )
            {
            // InternalSoftGalleryLanguage.g:3354:2: (otherlv_0= 'target' ( (lv_ntierconnection_1_0= ruleNTiersRelations ) ) )
            // InternalSoftGalleryLanguage.g:3355:3: otherlv_0= 'target' ( (lv_ntierconnection_1_0= ruleNTiersRelations ) )
            {
            otherlv_0=(Token)match(input,65,FOLLOW_71); 

            			newLeafNode(otherlv_0, grammarAccess.getNTierTargetAccess().getTargetKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:3359:3: ( (lv_ntierconnection_1_0= ruleNTiersRelations ) )
            // InternalSoftGalleryLanguage.g:3360:4: (lv_ntierconnection_1_0= ruleNTiersRelations )
            {
            // InternalSoftGalleryLanguage.g:3360:4: (lv_ntierconnection_1_0= ruleNTiersRelations )
            // InternalSoftGalleryLanguage.g:3361:5: lv_ntierconnection_1_0= ruleNTiersRelations
            {

            					newCompositeNode(grammarAccess.getNTierTargetAccess().getNtierconnectionNTiersRelationsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_ntierconnection_1_0=ruleNTiersRelations();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNTierTargetRule());
            					}
            					add(
            						current,
            						"ntierconnection",
            						lv_ntierconnection_1_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.NTiersRelations");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNTierTarget"


    // $ANTLR start "entryRuleNTiersRelations"
    // InternalSoftGalleryLanguage.g:3382:1: entryRuleNTiersRelations returns [EObject current=null] : iv_ruleNTiersRelations= ruleNTiersRelations EOF ;
    public final EObject entryRuleNTiersRelations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNTiersRelations = null;


        try {
            // InternalSoftGalleryLanguage.g:3382:56: (iv_ruleNTiersRelations= ruleNTiersRelations EOF )
            // InternalSoftGalleryLanguage.g:3383:2: iv_ruleNTiersRelations= ruleNTiersRelations EOF
            {
             newCompositeNode(grammarAccess.getNTiersRelationsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNTiersRelations=ruleNTiersRelations();

            state._fsp--;

             current =iv_ruleNTiersRelations; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNTiersRelations"


    // $ANTLR start "ruleNTiersRelations"
    // InternalSoftGalleryLanguage.g:3389:1: ruleNTiersRelations returns [EObject current=null] : ( (otherlv_0= 'FrontEndComponent' ( (lv_name_1_0= RULE_ID ) ) ) | (otherlv_2= 'BackEndComponent' ( (lv_name_3_0= RULE_ID ) ) ) | (otherlv_4= 'PersistenceDataComponent' ( (lv_name_5_0= RULE_ID ) ) ) | (otherlv_6= 'AmazonService' ( (lv_name_7_0= RULE_ID ) ) ) ) ;
    public final EObject ruleNTiersRelations() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token lv_name_7_0=null;


        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:3395:2: ( ( (otherlv_0= 'FrontEndComponent' ( (lv_name_1_0= RULE_ID ) ) ) | (otherlv_2= 'BackEndComponent' ( (lv_name_3_0= RULE_ID ) ) ) | (otherlv_4= 'PersistenceDataComponent' ( (lv_name_5_0= RULE_ID ) ) ) | (otherlv_6= 'AmazonService' ( (lv_name_7_0= RULE_ID ) ) ) ) )
            // InternalSoftGalleryLanguage.g:3396:2: ( (otherlv_0= 'FrontEndComponent' ( (lv_name_1_0= RULE_ID ) ) ) | (otherlv_2= 'BackEndComponent' ( (lv_name_3_0= RULE_ID ) ) ) | (otherlv_4= 'PersistenceDataComponent' ( (lv_name_5_0= RULE_ID ) ) ) | (otherlv_6= 'AmazonService' ( (lv_name_7_0= RULE_ID ) ) ) )
            {
            // InternalSoftGalleryLanguage.g:3396:2: ( (otherlv_0= 'FrontEndComponent' ( (lv_name_1_0= RULE_ID ) ) ) | (otherlv_2= 'BackEndComponent' ( (lv_name_3_0= RULE_ID ) ) ) | (otherlv_4= 'PersistenceDataComponent' ( (lv_name_5_0= RULE_ID ) ) ) | (otherlv_6= 'AmazonService' ( (lv_name_7_0= RULE_ID ) ) ) )
            int alt15=4;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt15=1;
                }
                break;
            case 69:
                {
                alt15=2;
                }
                break;
            case 70:
                {
                alt15=3;
                }
                break;
            case 75:
                {
                alt15=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalSoftGalleryLanguage.g:3397:3: (otherlv_0= 'FrontEndComponent' ( (lv_name_1_0= RULE_ID ) ) )
                    {
                    // InternalSoftGalleryLanguage.g:3397:3: (otherlv_0= 'FrontEndComponent' ( (lv_name_1_0= RULE_ID ) ) )
                    // InternalSoftGalleryLanguage.g:3398:4: otherlv_0= 'FrontEndComponent' ( (lv_name_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,68,FOLLOW_9); 

                    				newLeafNode(otherlv_0, grammarAccess.getNTiersRelationsAccess().getFrontEndComponentKeyword_0_0());
                    			
                    // InternalSoftGalleryLanguage.g:3402:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalSoftGalleryLanguage.g:3403:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalSoftGalleryLanguage.g:3403:5: (lv_name_1_0= RULE_ID )
                    // InternalSoftGalleryLanguage.g:3404:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_name_1_0, grammarAccess.getNTiersRelationsAccess().getNameIDTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNTiersRelationsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSoftGalleryLanguage.g:3422:3: (otherlv_2= 'BackEndComponent' ( (lv_name_3_0= RULE_ID ) ) )
                    {
                    // InternalSoftGalleryLanguage.g:3422:3: (otherlv_2= 'BackEndComponent' ( (lv_name_3_0= RULE_ID ) ) )
                    // InternalSoftGalleryLanguage.g:3423:4: otherlv_2= 'BackEndComponent' ( (lv_name_3_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,69,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getNTiersRelationsAccess().getBackEndComponentKeyword_1_0());
                    			
                    // InternalSoftGalleryLanguage.g:3427:4: ( (lv_name_3_0= RULE_ID ) )
                    // InternalSoftGalleryLanguage.g:3428:5: (lv_name_3_0= RULE_ID )
                    {
                    // InternalSoftGalleryLanguage.g:3428:5: (lv_name_3_0= RULE_ID )
                    // InternalSoftGalleryLanguage.g:3429:6: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_name_3_0, grammarAccess.getNTiersRelationsAccess().getNameIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNTiersRelationsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSoftGalleryLanguage.g:3447:3: (otherlv_4= 'PersistenceDataComponent' ( (lv_name_5_0= RULE_ID ) ) )
                    {
                    // InternalSoftGalleryLanguage.g:3447:3: (otherlv_4= 'PersistenceDataComponent' ( (lv_name_5_0= RULE_ID ) ) )
                    // InternalSoftGalleryLanguage.g:3448:4: otherlv_4= 'PersistenceDataComponent' ( (lv_name_5_0= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,70,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getNTiersRelationsAccess().getPersistenceDataComponentKeyword_2_0());
                    			
                    // InternalSoftGalleryLanguage.g:3452:4: ( (lv_name_5_0= RULE_ID ) )
                    // InternalSoftGalleryLanguage.g:3453:5: (lv_name_5_0= RULE_ID )
                    {
                    // InternalSoftGalleryLanguage.g:3453:5: (lv_name_5_0= RULE_ID )
                    // InternalSoftGalleryLanguage.g:3454:6: lv_name_5_0= RULE_ID
                    {
                    lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_name_5_0, grammarAccess.getNTiersRelationsAccess().getNameIDTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNTiersRelationsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_5_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalSoftGalleryLanguage.g:3472:3: (otherlv_6= 'AmazonService' ( (lv_name_7_0= RULE_ID ) ) )
                    {
                    // InternalSoftGalleryLanguage.g:3472:3: (otherlv_6= 'AmazonService' ( (lv_name_7_0= RULE_ID ) ) )
                    // InternalSoftGalleryLanguage.g:3473:4: otherlv_6= 'AmazonService' ( (lv_name_7_0= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,75,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getNTiersRelationsAccess().getAmazonServiceKeyword_3_0());
                    			
                    // InternalSoftGalleryLanguage.g:3477:4: ( (lv_name_7_0= RULE_ID ) )
                    // InternalSoftGalleryLanguage.g:3478:5: (lv_name_7_0= RULE_ID )
                    {
                    // InternalSoftGalleryLanguage.g:3478:5: (lv_name_7_0= RULE_ID )
                    // InternalSoftGalleryLanguage.g:3479:6: lv_name_7_0= RULE_ID
                    {
                    lv_name_7_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_name_7_0, grammarAccess.getNTiersRelationsAccess().getNameIDTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNTiersRelationsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_7_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNTiersRelations"


    // $ANTLR start "entryRuleTechnology"
    // InternalSoftGalleryLanguage.g:3500:1: entryRuleTechnology returns [EObject current=null] : iv_ruleTechnology= ruleTechnology EOF ;
    public final EObject entryRuleTechnology() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTechnology = null;


        try {
            // InternalSoftGalleryLanguage.g:3500:51: (iv_ruleTechnology= ruleTechnology EOF )
            // InternalSoftGalleryLanguage.g:3501:2: iv_ruleTechnology= ruleTechnology EOF
            {
             newCompositeNode(grammarAccess.getTechnologyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTechnology=ruleTechnology();

            state._fsp--;

             current =iv_ruleTechnology; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTechnology"


    // $ANTLR start "ruleTechnology"
    // InternalSoftGalleryLanguage.g:3507:1: ruleTechnology returns [EObject current=null] : (otherlv_0= 'Technology' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleTechnologies ) ) otherlv_5= '}' ) ;
    public final EObject ruleTechnology() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:3513:2: ( (otherlv_0= 'Technology' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleTechnologies ) ) otherlv_5= '}' ) )
            // InternalSoftGalleryLanguage.g:3514:2: (otherlv_0= 'Technology' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleTechnologies ) ) otherlv_5= '}' )
            {
            // InternalSoftGalleryLanguage.g:3514:2: (otherlv_0= 'Technology' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleTechnologies ) ) otherlv_5= '}' )
            // InternalSoftGalleryLanguage.g:3515:3: otherlv_0= 'Technology' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleTechnologies ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,76,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getTechnologyAccess().getTechnologyKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:3519:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:3520:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:3520:4: (lv_name_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:3521:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTechnologyAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTechnologyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getTechnologyAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_72); 

            			newLeafNode(otherlv_3, grammarAccess.getTechnologyAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSoftGalleryLanguage.g:3545:3: ( (lv_elements_4_0= ruleTechnologies ) )
            // InternalSoftGalleryLanguage.g:3546:4: (lv_elements_4_0= ruleTechnologies )
            {
            // InternalSoftGalleryLanguage.g:3546:4: (lv_elements_4_0= ruleTechnologies )
            // InternalSoftGalleryLanguage.g:3547:5: lv_elements_4_0= ruleTechnologies
            {

            					newCompositeNode(grammarAccess.getTechnologyAccess().getElementsTechnologiesParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_elements_4_0=ruleTechnologies();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTechnologyRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_4_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.Technologies");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getTechnologyAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTechnology"


    // $ANTLR start "entryRuleTechnologies"
    // InternalSoftGalleryLanguage.g:3572:1: entryRuleTechnologies returns [EObject current=null] : iv_ruleTechnologies= ruleTechnologies EOF ;
    public final EObject entryRuleTechnologies() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTechnologies = null;


        try {
            // InternalSoftGalleryLanguage.g:3572:53: (iv_ruleTechnologies= ruleTechnologies EOF )
            // InternalSoftGalleryLanguage.g:3573:2: iv_ruleTechnologies= ruleTechnologies EOF
            {
             newCompositeNode(grammarAccess.getTechnologiesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTechnologies=ruleTechnologies();

            state._fsp--;

             current =iv_ruleTechnologies; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTechnologies"


    // $ANTLR start "ruleTechnologies"
    // InternalSoftGalleryLanguage.g:3579:1: ruleTechnologies returns [EObject current=null] : ( ( (lv_techspring_0_0= ruleSpring ) ) ( (lv_techreact_1_0= ruleReact ) ) ( (lv_techpostgresql_2_0= rulePostgreSQL ) ) ( (lv_techamazon_3_0= ruleAmazonWebServices ) ) ) ;
    public final EObject ruleTechnologies() throws RecognitionException {
        EObject current = null;

        EObject lv_techspring_0_0 = null;

        EObject lv_techreact_1_0 = null;

        EObject lv_techpostgresql_2_0 = null;

        EObject lv_techamazon_3_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:3585:2: ( ( ( (lv_techspring_0_0= ruleSpring ) ) ( (lv_techreact_1_0= ruleReact ) ) ( (lv_techpostgresql_2_0= rulePostgreSQL ) ) ( (lv_techamazon_3_0= ruleAmazonWebServices ) ) ) )
            // InternalSoftGalleryLanguage.g:3586:2: ( ( (lv_techspring_0_0= ruleSpring ) ) ( (lv_techreact_1_0= ruleReact ) ) ( (lv_techpostgresql_2_0= rulePostgreSQL ) ) ( (lv_techamazon_3_0= ruleAmazonWebServices ) ) )
            {
            // InternalSoftGalleryLanguage.g:3586:2: ( ( (lv_techspring_0_0= ruleSpring ) ) ( (lv_techreact_1_0= ruleReact ) ) ( (lv_techpostgresql_2_0= rulePostgreSQL ) ) ( (lv_techamazon_3_0= ruleAmazonWebServices ) ) )
            // InternalSoftGalleryLanguage.g:3587:3: ( (lv_techspring_0_0= ruleSpring ) ) ( (lv_techreact_1_0= ruleReact ) ) ( (lv_techpostgresql_2_0= rulePostgreSQL ) ) ( (lv_techamazon_3_0= ruleAmazonWebServices ) )
            {
            // InternalSoftGalleryLanguage.g:3587:3: ( (lv_techspring_0_0= ruleSpring ) )
            // InternalSoftGalleryLanguage.g:3588:4: (lv_techspring_0_0= ruleSpring )
            {
            // InternalSoftGalleryLanguage.g:3588:4: (lv_techspring_0_0= ruleSpring )
            // InternalSoftGalleryLanguage.g:3589:5: lv_techspring_0_0= ruleSpring
            {

            					newCompositeNode(grammarAccess.getTechnologiesAccess().getTechspringSpringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_73);
            lv_techspring_0_0=ruleSpring();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTechnologiesRule());
            					}
            					add(
            						current,
            						"techspring",
            						lv_techspring_0_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.Spring");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftGalleryLanguage.g:3606:3: ( (lv_techreact_1_0= ruleReact ) )
            // InternalSoftGalleryLanguage.g:3607:4: (lv_techreact_1_0= ruleReact )
            {
            // InternalSoftGalleryLanguage.g:3607:4: (lv_techreact_1_0= ruleReact )
            // InternalSoftGalleryLanguage.g:3608:5: lv_techreact_1_0= ruleReact
            {

            					newCompositeNode(grammarAccess.getTechnologiesAccess().getTechreactReactParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_74);
            lv_techreact_1_0=ruleReact();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTechnologiesRule());
            					}
            					add(
            						current,
            						"techreact",
            						lv_techreact_1_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.React");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftGalleryLanguage.g:3625:3: ( (lv_techpostgresql_2_0= rulePostgreSQL ) )
            // InternalSoftGalleryLanguage.g:3626:4: (lv_techpostgresql_2_0= rulePostgreSQL )
            {
            // InternalSoftGalleryLanguage.g:3626:4: (lv_techpostgresql_2_0= rulePostgreSQL )
            // InternalSoftGalleryLanguage.g:3627:5: lv_techpostgresql_2_0= rulePostgreSQL
            {

            					newCompositeNode(grammarAccess.getTechnologiesAccess().getTechpostgresqlPostgreSQLParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_75);
            lv_techpostgresql_2_0=rulePostgreSQL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTechnologiesRule());
            					}
            					add(
            						current,
            						"techpostgresql",
            						lv_techpostgresql_2_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.PostgreSQL");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftGalleryLanguage.g:3644:3: ( (lv_techamazon_3_0= ruleAmazonWebServices ) )
            // InternalSoftGalleryLanguage.g:3645:4: (lv_techamazon_3_0= ruleAmazonWebServices )
            {
            // InternalSoftGalleryLanguage.g:3645:4: (lv_techamazon_3_0= ruleAmazonWebServices )
            // InternalSoftGalleryLanguage.g:3646:5: lv_techamazon_3_0= ruleAmazonWebServices
            {

            					newCompositeNode(grammarAccess.getTechnologiesAccess().getTechamazonAmazonWebServicesParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_techamazon_3_0=ruleAmazonWebServices();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTechnologiesRule());
            					}
            					add(
            						current,
            						"techamazon",
            						lv_techamazon_3_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.AmazonWebServices");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTechnologies"


    // $ANTLR start "entryRuleSpring"
    // InternalSoftGalleryLanguage.g:3667:1: entryRuleSpring returns [EObject current=null] : iv_ruleSpring= ruleSpring EOF ;
    public final EObject entryRuleSpring() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpring = null;


        try {
            // InternalSoftGalleryLanguage.g:3667:47: (iv_ruleSpring= ruleSpring EOF )
            // InternalSoftGalleryLanguage.g:3668:2: iv_ruleSpring= ruleSpring EOF
            {
             newCompositeNode(grammarAccess.getSpringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpring=ruleSpring();

            state._fsp--;

             current =iv_ruleSpring; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpring"


    // $ANTLR start "ruleSpring"
    // InternalSoftGalleryLanguage.g:3674:1: ruleSpring returns [EObject current=null] : (otherlv_0= 'Spring' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleSpringBootApplication ) ) otherlv_5= '}' ) ;
    public final EObject ruleSpring() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:3680:2: ( (otherlv_0= 'Spring' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleSpringBootApplication ) ) otherlv_5= '}' ) )
            // InternalSoftGalleryLanguage.g:3681:2: (otherlv_0= 'Spring' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleSpringBootApplication ) ) otherlv_5= '}' )
            {
            // InternalSoftGalleryLanguage.g:3681:2: (otherlv_0= 'Spring' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleSpringBootApplication ) ) otherlv_5= '}' )
            // InternalSoftGalleryLanguage.g:3682:3: otherlv_0= 'Spring' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleSpringBootApplication ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,77,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getSpringAccess().getSpringKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:3686:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:3687:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:3687:4: (lv_name_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:3688:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSpringAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSpringRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getSpringAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_76); 

            			newLeafNode(otherlv_3, grammarAccess.getSpringAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSoftGalleryLanguage.g:3712:3: ( (lv_elements_4_0= ruleSpringBootApplication ) )
            // InternalSoftGalleryLanguage.g:3713:4: (lv_elements_4_0= ruleSpringBootApplication )
            {
            // InternalSoftGalleryLanguage.g:3713:4: (lv_elements_4_0= ruleSpringBootApplication )
            // InternalSoftGalleryLanguage.g:3714:5: lv_elements_4_0= ruleSpringBootApplication
            {

            					newCompositeNode(grammarAccess.getSpringAccess().getElementsSpringBootApplicationParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_elements_4_0=ruleSpringBootApplication();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSpringRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_4_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.SpringBootApplication");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSpringAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpring"


    // $ANTLR start "entryRuleSpringBootApplication"
    // InternalSoftGalleryLanguage.g:3739:1: entryRuleSpringBootApplication returns [EObject current=null] : iv_ruleSpringBootApplication= ruleSpringBootApplication EOF ;
    public final EObject entryRuleSpringBootApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpringBootApplication = null;


        try {
            // InternalSoftGalleryLanguage.g:3739:62: (iv_ruleSpringBootApplication= ruleSpringBootApplication EOF )
            // InternalSoftGalleryLanguage.g:3740:2: iv_ruleSpringBootApplication= ruleSpringBootApplication EOF
            {
             newCompositeNode(grammarAccess.getSpringBootApplicationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpringBootApplication=ruleSpringBootApplication();

            state._fsp--;

             current =iv_ruleSpringBootApplication; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpringBootApplication"


    // $ANTLR start "ruleSpringBootApplication"
    // InternalSoftGalleryLanguage.g:3746:1: ruleSpringBootApplication returns [EObject current=null] : (otherlv_0= 'SpringBootApplication' ( (lv_elements_1_0= ruleConfiguration ) ) ( (lv_elements_2_0= ruleSpringComponent ) )+ ( (lv_elements_3_0= ruleSpringRepository ) )+ ( (lv_elements_4_0= ruleRestController ) )+ ( (lv_elements_5_0= ruleSpringEntity ) )+ ) ;
    public final EObject ruleSpringBootApplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_elements_1_0 = null;

        EObject lv_elements_2_0 = null;

        EObject lv_elements_3_0 = null;

        EObject lv_elements_4_0 = null;

        EObject lv_elements_5_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:3752:2: ( (otherlv_0= 'SpringBootApplication' ( (lv_elements_1_0= ruleConfiguration ) ) ( (lv_elements_2_0= ruleSpringComponent ) )+ ( (lv_elements_3_0= ruleSpringRepository ) )+ ( (lv_elements_4_0= ruleRestController ) )+ ( (lv_elements_5_0= ruleSpringEntity ) )+ ) )
            // InternalSoftGalleryLanguage.g:3753:2: (otherlv_0= 'SpringBootApplication' ( (lv_elements_1_0= ruleConfiguration ) ) ( (lv_elements_2_0= ruleSpringComponent ) )+ ( (lv_elements_3_0= ruleSpringRepository ) )+ ( (lv_elements_4_0= ruleRestController ) )+ ( (lv_elements_5_0= ruleSpringEntity ) )+ )
            {
            // InternalSoftGalleryLanguage.g:3753:2: (otherlv_0= 'SpringBootApplication' ( (lv_elements_1_0= ruleConfiguration ) ) ( (lv_elements_2_0= ruleSpringComponent ) )+ ( (lv_elements_3_0= ruleSpringRepository ) )+ ( (lv_elements_4_0= ruleRestController ) )+ ( (lv_elements_5_0= ruleSpringEntity ) )+ )
            // InternalSoftGalleryLanguage.g:3754:3: otherlv_0= 'SpringBootApplication' ( (lv_elements_1_0= ruleConfiguration ) ) ( (lv_elements_2_0= ruleSpringComponent ) )+ ( (lv_elements_3_0= ruleSpringRepository ) )+ ( (lv_elements_4_0= ruleRestController ) )+ ( (lv_elements_5_0= ruleSpringEntity ) )+
            {
            otherlv_0=(Token)match(input,78,FOLLOW_77); 

            			newLeafNode(otherlv_0, grammarAccess.getSpringBootApplicationAccess().getSpringBootApplicationKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:3758:3: ( (lv_elements_1_0= ruleConfiguration ) )
            // InternalSoftGalleryLanguage.g:3759:4: (lv_elements_1_0= ruleConfiguration )
            {
            // InternalSoftGalleryLanguage.g:3759:4: (lv_elements_1_0= ruleConfiguration )
            // InternalSoftGalleryLanguage.g:3760:5: lv_elements_1_0= ruleConfiguration
            {

            					newCompositeNode(grammarAccess.getSpringBootApplicationAccess().getElementsConfigurationParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_78);
            lv_elements_1_0=ruleConfiguration();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSpringBootApplicationRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_1_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.Configuration");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftGalleryLanguage.g:3777:3: ( (lv_elements_2_0= ruleSpringComponent ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==84) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalSoftGalleryLanguage.g:3778:4: (lv_elements_2_0= ruleSpringComponent )
            	    {
            	    // InternalSoftGalleryLanguage.g:3778:4: (lv_elements_2_0= ruleSpringComponent )
            	    // InternalSoftGalleryLanguage.g:3779:5: lv_elements_2_0= ruleSpringComponent
            	    {

            	    					newCompositeNode(grammarAccess.getSpringBootApplicationAccess().getElementsSpringComponentParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_79);
            	    lv_elements_2_0=ruleSpringComponent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSpringBootApplicationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_2_0,
            	    						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.SpringComponent");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);

            // InternalSoftGalleryLanguage.g:3796:3: ( (lv_elements_3_0= ruleSpringRepository ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==86) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalSoftGalleryLanguage.g:3797:4: (lv_elements_3_0= ruleSpringRepository )
            	    {
            	    // InternalSoftGalleryLanguage.g:3797:4: (lv_elements_3_0= ruleSpringRepository )
            	    // InternalSoftGalleryLanguage.g:3798:5: lv_elements_3_0= ruleSpringRepository
            	    {

            	    					newCompositeNode(grammarAccess.getSpringBootApplicationAccess().getElementsSpringRepositoryParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_80);
            	    lv_elements_3_0=ruleSpringRepository();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSpringBootApplicationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_3_0,
            	    						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.SpringRepository");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);

            // InternalSoftGalleryLanguage.g:3815:3: ( (lv_elements_4_0= ruleRestController ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==88) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalSoftGalleryLanguage.g:3816:4: (lv_elements_4_0= ruleRestController )
            	    {
            	    // InternalSoftGalleryLanguage.g:3816:4: (lv_elements_4_0= ruleRestController )
            	    // InternalSoftGalleryLanguage.g:3817:5: lv_elements_4_0= ruleRestController
            	    {

            	    					newCompositeNode(grammarAccess.getSpringBootApplicationAccess().getElementsRestControllerParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_81);
            	    lv_elements_4_0=ruleRestController();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSpringBootApplicationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_4_0,
            	    						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.RestController");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);

            // InternalSoftGalleryLanguage.g:3834:3: ( (lv_elements_5_0= ruleSpringEntity ) )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==103) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalSoftGalleryLanguage.g:3835:4: (lv_elements_5_0= ruleSpringEntity )
            	    {
            	    // InternalSoftGalleryLanguage.g:3835:4: (lv_elements_5_0= ruleSpringEntity )
            	    // InternalSoftGalleryLanguage.g:3836:5: lv_elements_5_0= ruleSpringEntity
            	    {

            	    					newCompositeNode(grammarAccess.getSpringBootApplicationAccess().getElementsSpringEntityParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_82);
            	    lv_elements_5_0=ruleSpringEntity();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSpringBootApplicationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_5_0,
            	    						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.SpringEntity");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpringBootApplication"


    // $ANTLR start "entryRuleConfiguration"
    // InternalSoftGalleryLanguage.g:3857:1: entryRuleConfiguration returns [EObject current=null] : iv_ruleConfiguration= ruleConfiguration EOF ;
    public final EObject entryRuleConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfiguration = null;


        try {
            // InternalSoftGalleryLanguage.g:3857:54: (iv_ruleConfiguration= ruleConfiguration EOF )
            // InternalSoftGalleryLanguage.g:3858:2: iv_ruleConfiguration= ruleConfiguration EOF
            {
             newCompositeNode(grammarAccess.getConfigurationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConfiguration=ruleConfiguration();

            state._fsp--;

             current =iv_ruleConfiguration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConfiguration"


    // $ANTLR start "ruleConfiguration"
    // InternalSoftGalleryLanguage.g:3864:1: ruleConfiguration returns [EObject current=null] : (otherlv_0= 'Configuration' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleEnableGlobalMethodSecurity ) ) ( (lv_elements_4_0= ruleEnableAuthorizationServer ) ) ( (lv_elements_5_0= ruleEnableResourceServer ) ) ( (lv_elements_6_0= ruleEnableWebSecurity ) ) otherlv_7= '}' ) ;
    public final EObject ruleConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_7=null;
        EObject lv_elements_3_0 = null;

        EObject lv_elements_4_0 = null;

        EObject lv_elements_5_0 = null;

        EObject lv_elements_6_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:3870:2: ( (otherlv_0= 'Configuration' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleEnableGlobalMethodSecurity ) ) ( (lv_elements_4_0= ruleEnableAuthorizationServer ) ) ( (lv_elements_5_0= ruleEnableResourceServer ) ) ( (lv_elements_6_0= ruleEnableWebSecurity ) ) otherlv_7= '}' ) )
            // InternalSoftGalleryLanguage.g:3871:2: (otherlv_0= 'Configuration' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleEnableGlobalMethodSecurity ) ) ( (lv_elements_4_0= ruleEnableAuthorizationServer ) ) ( (lv_elements_5_0= ruleEnableResourceServer ) ) ( (lv_elements_6_0= ruleEnableWebSecurity ) ) otherlv_7= '}' )
            {
            // InternalSoftGalleryLanguage.g:3871:2: (otherlv_0= 'Configuration' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleEnableGlobalMethodSecurity ) ) ( (lv_elements_4_0= ruleEnableAuthorizationServer ) ) ( (lv_elements_5_0= ruleEnableResourceServer ) ) ( (lv_elements_6_0= ruleEnableWebSecurity ) ) otherlv_7= '}' )
            // InternalSoftGalleryLanguage.g:3872:3: otherlv_0= 'Configuration' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleEnableGlobalMethodSecurity ) ) ( (lv_elements_4_0= ruleEnableAuthorizationServer ) ) ( (lv_elements_5_0= ruleEnableResourceServer ) ) ( (lv_elements_6_0= ruleEnableWebSecurity ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,79,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getConfigurationAccess().getConfigurationKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getConfigurationAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_83); 

            			newLeafNode(otherlv_2, grammarAccess.getConfigurationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSoftGalleryLanguage.g:3884:3: ( (lv_elements_3_0= ruleEnableGlobalMethodSecurity ) )
            // InternalSoftGalleryLanguage.g:3885:4: (lv_elements_3_0= ruleEnableGlobalMethodSecurity )
            {
            // InternalSoftGalleryLanguage.g:3885:4: (lv_elements_3_0= ruleEnableGlobalMethodSecurity )
            // InternalSoftGalleryLanguage.g:3886:5: lv_elements_3_0= ruleEnableGlobalMethodSecurity
            {

            					newCompositeNode(grammarAccess.getConfigurationAccess().getElementsEnableGlobalMethodSecurityParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_84);
            lv_elements_3_0=ruleEnableGlobalMethodSecurity();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConfigurationRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_3_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.EnableGlobalMethodSecurity");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftGalleryLanguage.g:3903:3: ( (lv_elements_4_0= ruleEnableAuthorizationServer ) )
            // InternalSoftGalleryLanguage.g:3904:4: (lv_elements_4_0= ruleEnableAuthorizationServer )
            {
            // InternalSoftGalleryLanguage.g:3904:4: (lv_elements_4_0= ruleEnableAuthorizationServer )
            // InternalSoftGalleryLanguage.g:3905:5: lv_elements_4_0= ruleEnableAuthorizationServer
            {

            					newCompositeNode(grammarAccess.getConfigurationAccess().getElementsEnableAuthorizationServerParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_85);
            lv_elements_4_0=ruleEnableAuthorizationServer();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConfigurationRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_4_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.EnableAuthorizationServer");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftGalleryLanguage.g:3922:3: ( (lv_elements_5_0= ruleEnableResourceServer ) )
            // InternalSoftGalleryLanguage.g:3923:4: (lv_elements_5_0= ruleEnableResourceServer )
            {
            // InternalSoftGalleryLanguage.g:3923:4: (lv_elements_5_0= ruleEnableResourceServer )
            // InternalSoftGalleryLanguage.g:3924:5: lv_elements_5_0= ruleEnableResourceServer
            {

            					newCompositeNode(grammarAccess.getConfigurationAccess().getElementsEnableResourceServerParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_86);
            lv_elements_5_0=ruleEnableResourceServer();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConfigurationRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_5_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.EnableResourceServer");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftGalleryLanguage.g:3941:3: ( (lv_elements_6_0= ruleEnableWebSecurity ) )
            // InternalSoftGalleryLanguage.g:3942:4: (lv_elements_6_0= ruleEnableWebSecurity )
            {
            // InternalSoftGalleryLanguage.g:3942:4: (lv_elements_6_0= ruleEnableWebSecurity )
            // InternalSoftGalleryLanguage.g:3943:5: lv_elements_6_0= ruleEnableWebSecurity
            {

            					newCompositeNode(grammarAccess.getConfigurationAccess().getElementsEnableWebSecurityParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_8);
            lv_elements_6_0=ruleEnableWebSecurity();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConfigurationRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_6_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.EnableWebSecurity");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getConfigurationAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConfiguration"


    // $ANTLR start "entryRuleEnableGlobalMethodSecurity"
    // InternalSoftGalleryLanguage.g:3968:1: entryRuleEnableGlobalMethodSecurity returns [EObject current=null] : iv_ruleEnableGlobalMethodSecurity= ruleEnableGlobalMethodSecurity EOF ;
    public final EObject entryRuleEnableGlobalMethodSecurity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnableGlobalMethodSecurity = null;


        try {
            // InternalSoftGalleryLanguage.g:3968:67: (iv_ruleEnableGlobalMethodSecurity= ruleEnableGlobalMethodSecurity EOF )
            // InternalSoftGalleryLanguage.g:3969:2: iv_ruleEnableGlobalMethodSecurity= ruleEnableGlobalMethodSecurity EOF
            {
             newCompositeNode(grammarAccess.getEnableGlobalMethodSecurityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnableGlobalMethodSecurity=ruleEnableGlobalMethodSecurity();

            state._fsp--;

             current =iv_ruleEnableGlobalMethodSecurity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnableGlobalMethodSecurity"


    // $ANTLR start "ruleEnableGlobalMethodSecurity"
    // InternalSoftGalleryLanguage.g:3975:1: ruleEnableGlobalMethodSecurity returns [EObject current=null] : (otherlv_0= 'EnableGlobalMethodSecurity' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEnableGlobalMethodSecurity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:3981:2: ( (otherlv_0= 'EnableGlobalMethodSecurity' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftGalleryLanguage.g:3982:2: (otherlv_0= 'EnableGlobalMethodSecurity' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftGalleryLanguage.g:3982:2: (otherlv_0= 'EnableGlobalMethodSecurity' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftGalleryLanguage.g:3983:3: otherlv_0= 'EnableGlobalMethodSecurity' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,80,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getEnableGlobalMethodSecurityAccess().getEnableGlobalMethodSecurityKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:3987:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:3988:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:3988:4: (lv_name_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:3989:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEnableGlobalMethodSecurityAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnableGlobalMethodSecurityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnableGlobalMethodSecurity"


    // $ANTLR start "entryRuleEnableAuthorizationServer"
    // InternalSoftGalleryLanguage.g:4009:1: entryRuleEnableAuthorizationServer returns [EObject current=null] : iv_ruleEnableAuthorizationServer= ruleEnableAuthorizationServer EOF ;
    public final EObject entryRuleEnableAuthorizationServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnableAuthorizationServer = null;


        try {
            // InternalSoftGalleryLanguage.g:4009:66: (iv_ruleEnableAuthorizationServer= ruleEnableAuthorizationServer EOF )
            // InternalSoftGalleryLanguage.g:4010:2: iv_ruleEnableAuthorizationServer= ruleEnableAuthorizationServer EOF
            {
             newCompositeNode(grammarAccess.getEnableAuthorizationServerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnableAuthorizationServer=ruleEnableAuthorizationServer();

            state._fsp--;

             current =iv_ruleEnableAuthorizationServer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnableAuthorizationServer"


    // $ANTLR start "ruleEnableAuthorizationServer"
    // InternalSoftGalleryLanguage.g:4016:1: ruleEnableAuthorizationServer returns [EObject current=null] : (otherlv_0= 'EnableAuthorizationServer' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEnableAuthorizationServer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:4022:2: ( (otherlv_0= 'EnableAuthorizationServer' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftGalleryLanguage.g:4023:2: (otherlv_0= 'EnableAuthorizationServer' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftGalleryLanguage.g:4023:2: (otherlv_0= 'EnableAuthorizationServer' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftGalleryLanguage.g:4024:3: otherlv_0= 'EnableAuthorizationServer' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,81,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getEnableAuthorizationServerAccess().getEnableAuthorizationServerKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:4028:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:4029:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:4029:4: (lv_name_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:4030:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEnableAuthorizationServerAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnableAuthorizationServerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnableAuthorizationServer"


    // $ANTLR start "entryRuleEnableResourceServer"
    // InternalSoftGalleryLanguage.g:4050:1: entryRuleEnableResourceServer returns [EObject current=null] : iv_ruleEnableResourceServer= ruleEnableResourceServer EOF ;
    public final EObject entryRuleEnableResourceServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnableResourceServer = null;


        try {
            // InternalSoftGalleryLanguage.g:4050:61: (iv_ruleEnableResourceServer= ruleEnableResourceServer EOF )
            // InternalSoftGalleryLanguage.g:4051:2: iv_ruleEnableResourceServer= ruleEnableResourceServer EOF
            {
             newCompositeNode(grammarAccess.getEnableResourceServerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnableResourceServer=ruleEnableResourceServer();

            state._fsp--;

             current =iv_ruleEnableResourceServer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnableResourceServer"


    // $ANTLR start "ruleEnableResourceServer"
    // InternalSoftGalleryLanguage.g:4057:1: ruleEnableResourceServer returns [EObject current=null] : (otherlv_0= 'EnableResourceServer' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEnableResourceServer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:4063:2: ( (otherlv_0= 'EnableResourceServer' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftGalleryLanguage.g:4064:2: (otherlv_0= 'EnableResourceServer' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftGalleryLanguage.g:4064:2: (otherlv_0= 'EnableResourceServer' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftGalleryLanguage.g:4065:3: otherlv_0= 'EnableResourceServer' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,82,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getEnableResourceServerAccess().getEnableResourceServerKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:4069:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:4070:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:4070:4: (lv_name_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:4071:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEnableResourceServerAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnableResourceServerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnableResourceServer"


    // $ANTLR start "entryRuleEnableWebSecurity"
    // InternalSoftGalleryLanguage.g:4091:1: entryRuleEnableWebSecurity returns [EObject current=null] : iv_ruleEnableWebSecurity= ruleEnableWebSecurity EOF ;
    public final EObject entryRuleEnableWebSecurity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnableWebSecurity = null;


        try {
            // InternalSoftGalleryLanguage.g:4091:58: (iv_ruleEnableWebSecurity= ruleEnableWebSecurity EOF )
            // InternalSoftGalleryLanguage.g:4092:2: iv_ruleEnableWebSecurity= ruleEnableWebSecurity EOF
            {
             newCompositeNode(grammarAccess.getEnableWebSecurityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnableWebSecurity=ruleEnableWebSecurity();

            state._fsp--;

             current =iv_ruleEnableWebSecurity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnableWebSecurity"


    // $ANTLR start "ruleEnableWebSecurity"
    // InternalSoftGalleryLanguage.g:4098:1: ruleEnableWebSecurity returns [EObject current=null] : (otherlv_0= 'EnableWebSecurity' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEnableWebSecurity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:4104:2: ( (otherlv_0= 'EnableWebSecurity' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftGalleryLanguage.g:4105:2: (otherlv_0= 'EnableWebSecurity' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftGalleryLanguage.g:4105:2: (otherlv_0= 'EnableWebSecurity' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftGalleryLanguage.g:4106:3: otherlv_0= 'EnableWebSecurity' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,83,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getEnableWebSecurityAccess().getEnableWebSecurityKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:4110:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:4111:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:4111:4: (lv_name_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:4112:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEnableWebSecurityAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnableWebSecurityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnableWebSecurity"


    // $ANTLR start "entryRuleSpringComponent"
    // InternalSoftGalleryLanguage.g:4132:1: entryRuleSpringComponent returns [EObject current=null] : iv_ruleSpringComponent= ruleSpringComponent EOF ;
    public final EObject entryRuleSpringComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpringComponent = null;


        try {
            // InternalSoftGalleryLanguage.g:4132:56: (iv_ruleSpringComponent= ruleSpringComponent EOF )
            // InternalSoftGalleryLanguage.g:4133:2: iv_ruleSpringComponent= ruleSpringComponent EOF
            {
             newCompositeNode(grammarAccess.getSpringComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpringComponent=ruleSpringComponent();

            state._fsp--;

             current =iv_ruleSpringComponent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpringComponent"


    // $ANTLR start "ruleSpringComponent"
    // InternalSoftGalleryLanguage.g:4139:1: ruleSpringComponent returns [EObject current=null] : (otherlv_0= 'SpringComponent' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleOrderSpring ) ) otherlv_4= '}' ) ;
    public final EObject ruleSpringComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:4145:2: ( (otherlv_0= 'SpringComponent' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleOrderSpring ) ) otherlv_4= '}' ) )
            // InternalSoftGalleryLanguage.g:4146:2: (otherlv_0= 'SpringComponent' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleOrderSpring ) ) otherlv_4= '}' )
            {
            // InternalSoftGalleryLanguage.g:4146:2: (otherlv_0= 'SpringComponent' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleOrderSpring ) ) otherlv_4= '}' )
            // InternalSoftGalleryLanguage.g:4147:3: otherlv_0= 'SpringComponent' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleOrderSpring ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,84,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSpringComponentAccess().getSpringComponentKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSpringComponentAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_87); 

            			newLeafNode(otherlv_2, grammarAccess.getSpringComponentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSoftGalleryLanguage.g:4159:3: ( (lv_elements_3_0= ruleOrderSpring ) )
            // InternalSoftGalleryLanguage.g:4160:4: (lv_elements_3_0= ruleOrderSpring )
            {
            // InternalSoftGalleryLanguage.g:4160:4: (lv_elements_3_0= ruleOrderSpring )
            // InternalSoftGalleryLanguage.g:4161:5: lv_elements_3_0= ruleOrderSpring
            {

            					newCompositeNode(grammarAccess.getSpringComponentAccess().getElementsOrderSpringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_elements_3_0=ruleOrderSpring();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSpringComponentRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_3_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.OrderSpring");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSpringComponentAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpringComponent"


    // $ANTLR start "entryRuleOrderSpring"
    // InternalSoftGalleryLanguage.g:4186:1: entryRuleOrderSpring returns [EObject current=null] : iv_ruleOrderSpring= ruleOrderSpring EOF ;
    public final EObject entryRuleOrderSpring() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderSpring = null;


        try {
            // InternalSoftGalleryLanguage.g:4186:52: (iv_ruleOrderSpring= ruleOrderSpring EOF )
            // InternalSoftGalleryLanguage.g:4187:2: iv_ruleOrderSpring= ruleOrderSpring EOF
            {
             newCompositeNode(grammarAccess.getOrderSpringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrderSpring=ruleOrderSpring();

            state._fsp--;

             current =iv_ruleOrderSpring; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrderSpring"


    // $ANTLR start "ruleOrderSpring"
    // InternalSoftGalleryLanguage.g:4193:1: ruleOrderSpring returns [EObject current=null] : (otherlv_0= 'OrderSpring' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleOrderSpring() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:4199:2: ( (otherlv_0= 'OrderSpring' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftGalleryLanguage.g:4200:2: (otherlv_0= 'OrderSpring' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftGalleryLanguage.g:4200:2: (otherlv_0= 'OrderSpring' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftGalleryLanguage.g:4201:3: otherlv_0= 'OrderSpring' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,85,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getOrderSpringAccess().getOrderSpringKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:4205:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:4206:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:4206:4: (lv_name_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:4207:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getOrderSpringAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOrderSpringRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrderSpring"


    // $ANTLR start "entryRuleSpringRepository"
    // InternalSoftGalleryLanguage.g:4227:1: entryRuleSpringRepository returns [EObject current=null] : iv_ruleSpringRepository= ruleSpringRepository EOF ;
    public final EObject entryRuleSpringRepository() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpringRepository = null;


        try {
            // InternalSoftGalleryLanguage.g:4227:57: (iv_ruleSpringRepository= ruleSpringRepository EOF )
            // InternalSoftGalleryLanguage.g:4228:2: iv_ruleSpringRepository= ruleSpringRepository EOF
            {
             newCompositeNode(grammarAccess.getSpringRepositoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpringRepository=ruleSpringRepository();

            state._fsp--;

             current =iv_ruleSpringRepository; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpringRepository"


    // $ANTLR start "ruleSpringRepository"
    // InternalSoftGalleryLanguage.g:4234:1: ruleSpringRepository returns [EObject current=null] : (otherlv_0= 'SpringRepositories' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleSpringRepositories ) )+ otherlv_4= '}' ) ;
    public final EObject ruleSpringRepository() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:4240:2: ( (otherlv_0= 'SpringRepositories' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleSpringRepositories ) )+ otherlv_4= '}' ) )
            // InternalSoftGalleryLanguage.g:4241:2: (otherlv_0= 'SpringRepositories' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleSpringRepositories ) )+ otherlv_4= '}' )
            {
            // InternalSoftGalleryLanguage.g:4241:2: (otherlv_0= 'SpringRepositories' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleSpringRepositories ) )+ otherlv_4= '}' )
            // InternalSoftGalleryLanguage.g:4242:3: otherlv_0= 'SpringRepositories' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleSpringRepositories ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,86,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSpringRepositoryAccess().getSpringRepositoriesKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSpringRepositoryAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_88); 

            			newLeafNode(otherlv_2, grammarAccess.getSpringRepositoryAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSoftGalleryLanguage.g:4254:3: ( (lv_elements_3_0= ruleSpringRepositories ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==87) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalSoftGalleryLanguage.g:4255:4: (lv_elements_3_0= ruleSpringRepositories )
            	    {
            	    // InternalSoftGalleryLanguage.g:4255:4: (lv_elements_3_0= ruleSpringRepositories )
            	    // InternalSoftGalleryLanguage.g:4256:5: lv_elements_3_0= ruleSpringRepositories
            	    {

            	    					newCompositeNode(grammarAccess.getSpringRepositoryAccess().getElementsSpringRepositoriesParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_89);
            	    lv_elements_3_0=ruleSpringRepositories();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSpringRepositoryRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_3_0,
            	    						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.SpringRepositories");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSpringRepositoryAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpringRepository"


    // $ANTLR start "entryRuleSpringRepositories"
    // InternalSoftGalleryLanguage.g:4281:1: entryRuleSpringRepositories returns [EObject current=null] : iv_ruleSpringRepositories= ruleSpringRepositories EOF ;
    public final EObject entryRuleSpringRepositories() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpringRepositories = null;


        try {
            // InternalSoftGalleryLanguage.g:4281:59: (iv_ruleSpringRepositories= ruleSpringRepositories EOF )
            // InternalSoftGalleryLanguage.g:4282:2: iv_ruleSpringRepositories= ruleSpringRepositories EOF
            {
             newCompositeNode(grammarAccess.getSpringRepositoriesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpringRepositories=ruleSpringRepositories();

            state._fsp--;

             current =iv_ruleSpringRepositories; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpringRepositories"


    // $ANTLR start "ruleSpringRepositories"
    // InternalSoftGalleryLanguage.g:4288:1: ruleSpringRepositories returns [EObject current=null] : (otherlv_0= 'SpringRepository' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleSpringRepositories() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:4294:2: ( (otherlv_0= 'SpringRepository' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftGalleryLanguage.g:4295:2: (otherlv_0= 'SpringRepository' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftGalleryLanguage.g:4295:2: (otherlv_0= 'SpringRepository' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftGalleryLanguage.g:4296:3: otherlv_0= 'SpringRepository' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,87,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getSpringRepositoriesAccess().getSpringRepositoryKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:4300:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:4301:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:4301:4: (lv_name_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:4302:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSpringRepositoriesAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSpringRepositoriesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpringRepositories"


    // $ANTLR start "entryRuleRestController"
    // InternalSoftGalleryLanguage.g:4322:1: entryRuleRestController returns [EObject current=null] : iv_ruleRestController= ruleRestController EOF ;
    public final EObject entryRuleRestController() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestController = null;


        try {
            // InternalSoftGalleryLanguage.g:4322:55: (iv_ruleRestController= ruleRestController EOF )
            // InternalSoftGalleryLanguage.g:4323:2: iv_ruleRestController= ruleRestController EOF
            {
             newCompositeNode(grammarAccess.getRestControllerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRestController=ruleRestController();

            state._fsp--;

             current =iv_ruleRestController; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRestController"


    // $ANTLR start "ruleRestController"
    // InternalSoftGalleryLanguage.g:4329:1: ruleRestController returns [EObject current=null] : (otherlv_0= 'RestController' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleSpecification ) ) ( (lv_elements_5_0= ruleAutowired ) )+ ( (lv_elements_6_0= ruleRequestMapping ) )+ ( (lv_elements_7_0= ruleExceptionHandler ) ) otherlv_8= '}' ) ;
    public final EObject ruleRestController() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_8=null;
        EObject lv_elements_4_0 = null;

        EObject lv_elements_5_0 = null;

        EObject lv_elements_6_0 = null;

        EObject lv_elements_7_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:4335:2: ( (otherlv_0= 'RestController' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleSpecification ) ) ( (lv_elements_5_0= ruleAutowired ) )+ ( (lv_elements_6_0= ruleRequestMapping ) )+ ( (lv_elements_7_0= ruleExceptionHandler ) ) otherlv_8= '}' ) )
            // InternalSoftGalleryLanguage.g:4336:2: (otherlv_0= 'RestController' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleSpecification ) ) ( (lv_elements_5_0= ruleAutowired ) )+ ( (lv_elements_6_0= ruleRequestMapping ) )+ ( (lv_elements_7_0= ruleExceptionHandler ) ) otherlv_8= '}' )
            {
            // InternalSoftGalleryLanguage.g:4336:2: (otherlv_0= 'RestController' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleSpecification ) ) ( (lv_elements_5_0= ruleAutowired ) )+ ( (lv_elements_6_0= ruleRequestMapping ) )+ ( (lv_elements_7_0= ruleExceptionHandler ) ) otherlv_8= '}' )
            // InternalSoftGalleryLanguage.g:4337:3: otherlv_0= 'RestController' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleSpecification ) ) ( (lv_elements_5_0= ruleAutowired ) )+ ( (lv_elements_6_0= ruleRequestMapping ) )+ ( (lv_elements_7_0= ruleExceptionHandler ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,88,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getRestControllerAccess().getRestControllerKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:4341:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:4342:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:4342:4: (lv_name_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:4343:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRestControllerAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRestControllerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getRestControllerAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_90); 

            			newLeafNode(otherlv_3, grammarAccess.getRestControllerAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSoftGalleryLanguage.g:4367:3: ( (lv_elements_4_0= ruleSpecification ) )
            // InternalSoftGalleryLanguage.g:4368:4: (lv_elements_4_0= ruleSpecification )
            {
            // InternalSoftGalleryLanguage.g:4368:4: (lv_elements_4_0= ruleSpecification )
            // InternalSoftGalleryLanguage.g:4369:5: lv_elements_4_0= ruleSpecification
            {

            					newCompositeNode(grammarAccess.getRestControllerAccess().getElementsSpecificationParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_91);
            lv_elements_4_0=ruleSpecification();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRestControllerRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_4_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.Specification");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftGalleryLanguage.g:4386:3: ( (lv_elements_5_0= ruleAutowired ) )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==92) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalSoftGalleryLanguage.g:4387:4: (lv_elements_5_0= ruleAutowired )
            	    {
            	    // InternalSoftGalleryLanguage.g:4387:4: (lv_elements_5_0= ruleAutowired )
            	    // InternalSoftGalleryLanguage.g:4388:5: lv_elements_5_0= ruleAutowired
            	    {

            	    					newCompositeNode(grammarAccess.getRestControllerAccess().getElementsAutowiredParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_92);
            	    lv_elements_5_0=ruleAutowired();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRestControllerRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_5_0,
            	    						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.Autowired");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);

            // InternalSoftGalleryLanguage.g:4405:3: ( (lv_elements_6_0= ruleRequestMapping ) )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==94) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalSoftGalleryLanguage.g:4406:4: (lv_elements_6_0= ruleRequestMapping )
            	    {
            	    // InternalSoftGalleryLanguage.g:4406:4: (lv_elements_6_0= ruleRequestMapping )
            	    // InternalSoftGalleryLanguage.g:4407:5: lv_elements_6_0= ruleRequestMapping
            	    {

            	    					newCompositeNode(grammarAccess.getRestControllerAccess().getElementsRequestMappingParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_93);
            	    lv_elements_6_0=ruleRequestMapping();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRestControllerRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_6_0,
            	    						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.RequestMapping");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);

            // InternalSoftGalleryLanguage.g:4424:3: ( (lv_elements_7_0= ruleExceptionHandler ) )
            // InternalSoftGalleryLanguage.g:4425:4: (lv_elements_7_0= ruleExceptionHandler )
            {
            // InternalSoftGalleryLanguage.g:4425:4: (lv_elements_7_0= ruleExceptionHandler )
            // InternalSoftGalleryLanguage.g:4426:5: lv_elements_7_0= ruleExceptionHandler
            {

            					newCompositeNode(grammarAccess.getRestControllerAccess().getElementsExceptionHandlerParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_8);
            lv_elements_7_0=ruleExceptionHandler();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRestControllerRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_7_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.ExceptionHandler");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getRestControllerAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRestController"


    // $ANTLR start "entryRuleSpecification"
    // InternalSoftGalleryLanguage.g:4451:1: entryRuleSpecification returns [EObject current=null] : iv_ruleSpecification= ruleSpecification EOF ;
    public final EObject entryRuleSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecification = null;


        try {
            // InternalSoftGalleryLanguage.g:4451:54: (iv_ruleSpecification= ruleSpecification EOF )
            // InternalSoftGalleryLanguage.g:4452:2: iv_ruleSpecification= ruleSpecification EOF
            {
             newCompositeNode(grammarAccess.getSpecificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpecification=ruleSpecification();

            state._fsp--;

             current =iv_ruleSpecification; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpecification"


    // $ANTLR start "ruleSpecification"
    // InternalSoftGalleryLanguage.g:4458:1: ruleSpecification returns [EObject current=null] : (otherlv_0= 'Specification' ( (lv_elements_1_0= rulePredicate ) )+ ( (lv_elements_2_0= ruleSearchCriteria ) ) ) ;
    public final EObject ruleSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_elements_1_0 = null;

        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:4464:2: ( (otherlv_0= 'Specification' ( (lv_elements_1_0= rulePredicate ) )+ ( (lv_elements_2_0= ruleSearchCriteria ) ) ) )
            // InternalSoftGalleryLanguage.g:4465:2: (otherlv_0= 'Specification' ( (lv_elements_1_0= rulePredicate ) )+ ( (lv_elements_2_0= ruleSearchCriteria ) ) )
            {
            // InternalSoftGalleryLanguage.g:4465:2: (otherlv_0= 'Specification' ( (lv_elements_1_0= rulePredicate ) )+ ( (lv_elements_2_0= ruleSearchCriteria ) ) )
            // InternalSoftGalleryLanguage.g:4466:3: otherlv_0= 'Specification' ( (lv_elements_1_0= rulePredicate ) )+ ( (lv_elements_2_0= ruleSearchCriteria ) )
            {
            otherlv_0=(Token)match(input,89,FOLLOW_94); 

            			newLeafNode(otherlv_0, grammarAccess.getSpecificationAccess().getSpecificationKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:4470:3: ( (lv_elements_1_0= rulePredicate ) )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==90) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalSoftGalleryLanguage.g:4471:4: (lv_elements_1_0= rulePredicate )
            	    {
            	    // InternalSoftGalleryLanguage.g:4471:4: (lv_elements_1_0= rulePredicate )
            	    // InternalSoftGalleryLanguage.g:4472:5: lv_elements_1_0= rulePredicate
            	    {

            	    					newCompositeNode(grammarAccess.getSpecificationAccess().getElementsPredicateParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_95);
            	    lv_elements_1_0=rulePredicate();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSpecificationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_1_0,
            	    						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.Predicate");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);

            // InternalSoftGalleryLanguage.g:4489:3: ( (lv_elements_2_0= ruleSearchCriteria ) )
            // InternalSoftGalleryLanguage.g:4490:4: (lv_elements_2_0= ruleSearchCriteria )
            {
            // InternalSoftGalleryLanguage.g:4490:4: (lv_elements_2_0= ruleSearchCriteria )
            // InternalSoftGalleryLanguage.g:4491:5: lv_elements_2_0= ruleSearchCriteria
            {

            					newCompositeNode(grammarAccess.getSpecificationAccess().getElementsSearchCriteriaParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_elements_2_0=ruleSearchCriteria();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSpecificationRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_2_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.SearchCriteria");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpecification"


    // $ANTLR start "entryRulePredicate"
    // InternalSoftGalleryLanguage.g:4512:1: entryRulePredicate returns [EObject current=null] : iv_rulePredicate= rulePredicate EOF ;
    public final EObject entryRulePredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicate = null;


        try {
            // InternalSoftGalleryLanguage.g:4512:50: (iv_rulePredicate= rulePredicate EOF )
            // InternalSoftGalleryLanguage.g:4513:2: iv_rulePredicate= rulePredicate EOF
            {
             newCompositeNode(grammarAccess.getPredicateRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePredicate=rulePredicate();

            state._fsp--;

             current =iv_rulePredicate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePredicate"


    // $ANTLR start "rulePredicate"
    // InternalSoftGalleryLanguage.g:4519:1: rulePredicate returns [EObject current=null] : (otherlv_0= 'Predicate' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePredicate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:4525:2: ( (otherlv_0= 'Predicate' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftGalleryLanguage.g:4526:2: (otherlv_0= 'Predicate' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftGalleryLanguage.g:4526:2: (otherlv_0= 'Predicate' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftGalleryLanguage.g:4527:3: otherlv_0= 'Predicate' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,90,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getPredicateAccess().getPredicateKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:4531:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:4532:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:4532:4: (lv_name_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:4533:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPredicateAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPredicateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePredicate"


    // $ANTLR start "entryRuleSearchCriteria"
    // InternalSoftGalleryLanguage.g:4553:1: entryRuleSearchCriteria returns [EObject current=null] : iv_ruleSearchCriteria= ruleSearchCriteria EOF ;
    public final EObject entryRuleSearchCriteria() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSearchCriteria = null;


        try {
            // InternalSoftGalleryLanguage.g:4553:55: (iv_ruleSearchCriteria= ruleSearchCriteria EOF )
            // InternalSoftGalleryLanguage.g:4554:2: iv_ruleSearchCriteria= ruleSearchCriteria EOF
            {
             newCompositeNode(grammarAccess.getSearchCriteriaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSearchCriteria=ruleSearchCriteria();

            state._fsp--;

             current =iv_ruleSearchCriteria; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSearchCriteria"


    // $ANTLR start "ruleSearchCriteria"
    // InternalSoftGalleryLanguage.g:4560:1: ruleSearchCriteria returns [EObject current=null] : (otherlv_0= 'SearchCriteria' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleSearchCriteria() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:4566:2: ( (otherlv_0= 'SearchCriteria' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftGalleryLanguage.g:4567:2: (otherlv_0= 'SearchCriteria' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftGalleryLanguage.g:4567:2: (otherlv_0= 'SearchCriteria' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftGalleryLanguage.g:4568:3: otherlv_0= 'SearchCriteria' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,91,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getSearchCriteriaAccess().getSearchCriteriaKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:4572:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:4573:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:4573:4: (lv_name_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:4574:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSearchCriteriaAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSearchCriteriaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSearchCriteria"


    // $ANTLR start "entryRuleAutowired"
    // InternalSoftGalleryLanguage.g:4594:1: entryRuleAutowired returns [EObject current=null] : iv_ruleAutowired= ruleAutowired EOF ;
    public final EObject entryRuleAutowired() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAutowired = null;


        try {
            // InternalSoftGalleryLanguage.g:4594:50: (iv_ruleAutowired= ruleAutowired EOF )
            // InternalSoftGalleryLanguage.g:4595:2: iv_ruleAutowired= ruleAutowired EOF
            {
             newCompositeNode(grammarAccess.getAutowiredRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAutowired=ruleAutowired();

            state._fsp--;

             current =iv_ruleAutowired; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAutowired"


    // $ANTLR start "ruleAutowired"
    // InternalSoftGalleryLanguage.g:4601:1: ruleAutowired returns [EObject current=null] : (otherlv_0= 'Autowired' ( (lv_elements_1_0= ruleAutowiredType ) ) ) ;
    public final EObject ruleAutowired() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_elements_1_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:4607:2: ( (otherlv_0= 'Autowired' ( (lv_elements_1_0= ruleAutowiredType ) ) ) )
            // InternalSoftGalleryLanguage.g:4608:2: (otherlv_0= 'Autowired' ( (lv_elements_1_0= ruleAutowiredType ) ) )
            {
            // InternalSoftGalleryLanguage.g:4608:2: (otherlv_0= 'Autowired' ( (lv_elements_1_0= ruleAutowiredType ) ) )
            // InternalSoftGalleryLanguage.g:4609:3: otherlv_0= 'Autowired' ( (lv_elements_1_0= ruleAutowiredType ) )
            {
            otherlv_0=(Token)match(input,92,FOLLOW_96); 

            			newLeafNode(otherlv_0, grammarAccess.getAutowiredAccess().getAutowiredKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:4613:3: ( (lv_elements_1_0= ruleAutowiredType ) )
            // InternalSoftGalleryLanguage.g:4614:4: (lv_elements_1_0= ruleAutowiredType )
            {
            // InternalSoftGalleryLanguage.g:4614:4: (lv_elements_1_0= ruleAutowiredType )
            // InternalSoftGalleryLanguage.g:4615:5: lv_elements_1_0= ruleAutowiredType
            {

            					newCompositeNode(grammarAccess.getAutowiredAccess().getElementsAutowiredTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_elements_1_0=ruleAutowiredType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAutowiredRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_1_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.AutowiredType");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAutowired"


    // $ANTLR start "entryRuleAutowiredType"
    // InternalSoftGalleryLanguage.g:4636:1: entryRuleAutowiredType returns [EObject current=null] : iv_ruleAutowiredType= ruleAutowiredType EOF ;
    public final EObject entryRuleAutowiredType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAutowiredType = null;


        try {
            // InternalSoftGalleryLanguage.g:4636:54: (iv_ruleAutowiredType= ruleAutowiredType EOF )
            // InternalSoftGalleryLanguage.g:4637:2: iv_ruleAutowiredType= ruleAutowiredType EOF
            {
             newCompositeNode(grammarAccess.getAutowiredTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAutowiredType=ruleAutowiredType();

            state._fsp--;

             current =iv_ruleAutowiredType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAutowiredType"


    // $ANTLR start "ruleAutowiredType"
    // InternalSoftGalleryLanguage.g:4643:1: ruleAutowiredType returns [EObject current=null] : (otherlv_0= 'AutowiredType' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAutowiredType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:4649:2: ( (otherlv_0= 'AutowiredType' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftGalleryLanguage.g:4650:2: (otherlv_0= 'AutowiredType' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftGalleryLanguage.g:4650:2: (otherlv_0= 'AutowiredType' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftGalleryLanguage.g:4651:3: otherlv_0= 'AutowiredType' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,93,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getAutowiredTypeAccess().getAutowiredTypeKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:4655:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:4656:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:4656:4: (lv_name_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:4657:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAutowiredTypeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAutowiredTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAutowiredType"


    // $ANTLR start "entryRuleRequestMapping"
    // InternalSoftGalleryLanguage.g:4677:1: entryRuleRequestMapping returns [EObject current=null] : iv_ruleRequestMapping= ruleRequestMapping EOF ;
    public final EObject entryRuleRequestMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequestMapping = null;


        try {
            // InternalSoftGalleryLanguage.g:4677:55: (iv_ruleRequestMapping= ruleRequestMapping EOF )
            // InternalSoftGalleryLanguage.g:4678:2: iv_ruleRequestMapping= ruleRequestMapping EOF
            {
             newCompositeNode(grammarAccess.getRequestMappingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequestMapping=ruleRequestMapping();

            state._fsp--;

             current =iv_ruleRequestMapping; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRequestMapping"


    // $ANTLR start "ruleRequestMapping"
    // InternalSoftGalleryLanguage.g:4684:1: ruleRequestMapping returns [EObject current=null] : (otherlv_0= 'RequestMapping' ( (lv_elements_1_0= ruleRequestPart ) )* ( (lv_elements_2_0= ruleRequestMappingType ) ) ) ;
    public final EObject ruleRequestMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_elements_1_0 = null;

        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:4690:2: ( (otherlv_0= 'RequestMapping' ( (lv_elements_1_0= ruleRequestPart ) )* ( (lv_elements_2_0= ruleRequestMappingType ) ) ) )
            // InternalSoftGalleryLanguage.g:4691:2: (otherlv_0= 'RequestMapping' ( (lv_elements_1_0= ruleRequestPart ) )* ( (lv_elements_2_0= ruleRequestMappingType ) ) )
            {
            // InternalSoftGalleryLanguage.g:4691:2: (otherlv_0= 'RequestMapping' ( (lv_elements_1_0= ruleRequestPart ) )* ( (lv_elements_2_0= ruleRequestMappingType ) ) )
            // InternalSoftGalleryLanguage.g:4692:3: otherlv_0= 'RequestMapping' ( (lv_elements_1_0= ruleRequestPart ) )* ( (lv_elements_2_0= ruleRequestMappingType ) )
            {
            otherlv_0=(Token)match(input,94,FOLLOW_97); 

            			newLeafNode(otherlv_0, grammarAccess.getRequestMappingAccess().getRequestMappingKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:4696:3: ( (lv_elements_1_0= ruleRequestPart ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==95) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalSoftGalleryLanguage.g:4697:4: (lv_elements_1_0= ruleRequestPart )
            	    {
            	    // InternalSoftGalleryLanguage.g:4697:4: (lv_elements_1_0= ruleRequestPart )
            	    // InternalSoftGalleryLanguage.g:4698:5: lv_elements_1_0= ruleRequestPart
            	    {

            	    					newCompositeNode(grammarAccess.getRequestMappingAccess().getElementsRequestPartParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_97);
            	    lv_elements_1_0=ruleRequestPart();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRequestMappingRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_1_0,
            	    						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.RequestPart");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            // InternalSoftGalleryLanguage.g:4715:3: ( (lv_elements_2_0= ruleRequestMappingType ) )
            // InternalSoftGalleryLanguage.g:4716:4: (lv_elements_2_0= ruleRequestMappingType )
            {
            // InternalSoftGalleryLanguage.g:4716:4: (lv_elements_2_0= ruleRequestMappingType )
            // InternalSoftGalleryLanguage.g:4717:5: lv_elements_2_0= ruleRequestMappingType
            {

            					newCompositeNode(grammarAccess.getRequestMappingAccess().getElementsRequestMappingTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_elements_2_0=ruleRequestMappingType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRequestMappingRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_2_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.RequestMappingType");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRequestMapping"


    // $ANTLR start "entryRuleRequestPart"
    // InternalSoftGalleryLanguage.g:4738:1: entryRuleRequestPart returns [EObject current=null] : iv_ruleRequestPart= ruleRequestPart EOF ;
    public final EObject entryRuleRequestPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequestPart = null;


        try {
            // InternalSoftGalleryLanguage.g:4738:52: (iv_ruleRequestPart= ruleRequestPart EOF )
            // InternalSoftGalleryLanguage.g:4739:2: iv_ruleRequestPart= ruleRequestPart EOF
            {
             newCompositeNode(grammarAccess.getRequestPartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequestPart=ruleRequestPart();

            state._fsp--;

             current =iv_ruleRequestPart; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRequestPart"


    // $ANTLR start "ruleRequestPart"
    // InternalSoftGalleryLanguage.g:4745:1: ruleRequestPart returns [EObject current=null] : (otherlv_0= 'RequestPart' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleRequestPart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:4751:2: ( (otherlv_0= 'RequestPart' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftGalleryLanguage.g:4752:2: (otherlv_0= 'RequestPart' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftGalleryLanguage.g:4752:2: (otherlv_0= 'RequestPart' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftGalleryLanguage.g:4753:3: otherlv_0= 'RequestPart' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,95,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getRequestPartAccess().getRequestPartKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:4757:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:4758:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:4758:4: (lv_name_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:4759:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRequestPartAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequestPartRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRequestPart"


    // $ANTLR start "entryRuleRequestMappingType"
    // InternalSoftGalleryLanguage.g:4779:1: entryRuleRequestMappingType returns [EObject current=null] : iv_ruleRequestMappingType= ruleRequestMappingType EOF ;
    public final EObject entryRuleRequestMappingType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequestMappingType = null;


        try {
            // InternalSoftGalleryLanguage.g:4779:59: (iv_ruleRequestMappingType= ruleRequestMappingType EOF )
            // InternalSoftGalleryLanguage.g:4780:2: iv_ruleRequestMappingType= ruleRequestMappingType EOF
            {
             newCompositeNode(grammarAccess.getRequestMappingTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequestMappingType=ruleRequestMappingType();

            state._fsp--;

             current =iv_ruleRequestMappingType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRequestMappingType"


    // $ANTLR start "ruleRequestMappingType"
    // InternalSoftGalleryLanguage.g:4786:1: ruleRequestMappingType returns [EObject current=null] : (otherlv_0= 'RequestMappingType' ( (lv_name_1_0= RULE_ID ) ) ruleRequestMappingTypeConf ) ;
    public final EObject ruleRequestMappingType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:4792:2: ( (otherlv_0= 'RequestMappingType' ( (lv_name_1_0= RULE_ID ) ) ruleRequestMappingTypeConf ) )
            // InternalSoftGalleryLanguage.g:4793:2: (otherlv_0= 'RequestMappingType' ( (lv_name_1_0= RULE_ID ) ) ruleRequestMappingTypeConf )
            {
            // InternalSoftGalleryLanguage.g:4793:2: (otherlv_0= 'RequestMappingType' ( (lv_name_1_0= RULE_ID ) ) ruleRequestMappingTypeConf )
            // InternalSoftGalleryLanguage.g:4794:3: otherlv_0= 'RequestMappingType' ( (lv_name_1_0= RULE_ID ) ) ruleRequestMappingTypeConf
            {
            otherlv_0=(Token)match(input,96,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getRequestMappingTypeAccess().getRequestMappingTypeKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:4798:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:4799:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:4799:4: (lv_name_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:4800:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_98); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRequestMappingTypeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequestMappingTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            			newCompositeNode(grammarAccess.getRequestMappingTypeAccess().getRequestMappingTypeConfParserRuleCall_2());
            		
            pushFollow(FOLLOW_2);
            ruleRequestMappingTypeConf();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRequestMappingType"


    // $ANTLR start "entryRuleRequestMappingTypeConf"
    // InternalSoftGalleryLanguage.g:4827:1: entryRuleRequestMappingTypeConf returns [String current=null] : iv_ruleRequestMappingTypeConf= ruleRequestMappingTypeConf EOF ;
    public final String entryRuleRequestMappingTypeConf() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRequestMappingTypeConf = null;


        try {
            // InternalSoftGalleryLanguage.g:4827:62: (iv_ruleRequestMappingTypeConf= ruleRequestMappingTypeConf EOF )
            // InternalSoftGalleryLanguage.g:4828:2: iv_ruleRequestMappingTypeConf= ruleRequestMappingTypeConf EOF
            {
             newCompositeNode(grammarAccess.getRequestMappingTypeConfRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequestMappingTypeConf=ruleRequestMappingTypeConf();

            state._fsp--;

             current =iv_ruleRequestMappingTypeConf.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRequestMappingTypeConf"


    // $ANTLR start "ruleRequestMappingTypeConf"
    // InternalSoftGalleryLanguage.g:4834:1: ruleRequestMappingTypeConf returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'PostMapping' | kw= 'GetMapping' | kw= 'PutMapping' | kw= 'DeleteMapping' ) ;
    public final AntlrDatatypeRuleToken ruleRequestMappingTypeConf() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:4840:2: ( (kw= 'PostMapping' | kw= 'GetMapping' | kw= 'PutMapping' | kw= 'DeleteMapping' ) )
            // InternalSoftGalleryLanguage.g:4841:2: (kw= 'PostMapping' | kw= 'GetMapping' | kw= 'PutMapping' | kw= 'DeleteMapping' )
            {
            // InternalSoftGalleryLanguage.g:4841:2: (kw= 'PostMapping' | kw= 'GetMapping' | kw= 'PutMapping' | kw= 'DeleteMapping' )
            int alt25=4;
            switch ( input.LA(1) ) {
            case 97:
                {
                alt25=1;
                }
                break;
            case 98:
                {
                alt25=2;
                }
                break;
            case 99:
                {
                alt25=3;
                }
                break;
            case 100:
                {
                alt25=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalSoftGalleryLanguage.g:4842:3: kw= 'PostMapping'
                    {
                    kw=(Token)match(input,97,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRequestMappingTypeConfAccess().getPostMappingKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSoftGalleryLanguage.g:4848:3: kw= 'GetMapping'
                    {
                    kw=(Token)match(input,98,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRequestMappingTypeConfAccess().getGetMappingKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSoftGalleryLanguage.g:4854:3: kw= 'PutMapping'
                    {
                    kw=(Token)match(input,99,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRequestMappingTypeConfAccess().getPutMappingKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalSoftGalleryLanguage.g:4860:3: kw= 'DeleteMapping'
                    {
                    kw=(Token)match(input,100,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRequestMappingTypeConfAccess().getDeleteMappingKeyword_3());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRequestMappingTypeConf"


    // $ANTLR start "entryRuleExceptionHandler"
    // InternalSoftGalleryLanguage.g:4869:1: entryRuleExceptionHandler returns [EObject current=null] : iv_ruleExceptionHandler= ruleExceptionHandler EOF ;
    public final EObject entryRuleExceptionHandler() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExceptionHandler = null;


        try {
            // InternalSoftGalleryLanguage.g:4869:57: (iv_ruleExceptionHandler= ruleExceptionHandler EOF )
            // InternalSoftGalleryLanguage.g:4870:2: iv_ruleExceptionHandler= ruleExceptionHandler EOF
            {
             newCompositeNode(grammarAccess.getExceptionHandlerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExceptionHandler=ruleExceptionHandler();

            state._fsp--;

             current =iv_ruleExceptionHandler; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExceptionHandler"


    // $ANTLR start "ruleExceptionHandler"
    // InternalSoftGalleryLanguage.g:4876:1: ruleExceptionHandler returns [EObject current=null] : (otherlv_0= 'ExceptionHandler' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleExceptionProcess ) )+ ) ;
    public final EObject ruleExceptionHandler() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:4882:2: ( (otherlv_0= 'ExceptionHandler' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleExceptionProcess ) )+ ) )
            // InternalSoftGalleryLanguage.g:4883:2: (otherlv_0= 'ExceptionHandler' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleExceptionProcess ) )+ )
            {
            // InternalSoftGalleryLanguage.g:4883:2: (otherlv_0= 'ExceptionHandler' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleExceptionProcess ) )+ )
            // InternalSoftGalleryLanguage.g:4884:3: otherlv_0= 'ExceptionHandler' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleExceptionProcess ) )+
            {
            otherlv_0=(Token)match(input,101,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getExceptionHandlerAccess().getExceptionHandlerKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:4888:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:4889:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:4889:4: (lv_name_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:4890:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_99); 

            					newLeafNode(lv_name_1_0, grammarAccess.getExceptionHandlerAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExceptionHandlerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSoftGalleryLanguage.g:4906:3: ( (lv_elements_2_0= ruleExceptionProcess ) )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==102) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalSoftGalleryLanguage.g:4907:4: (lv_elements_2_0= ruleExceptionProcess )
            	    {
            	    // InternalSoftGalleryLanguage.g:4907:4: (lv_elements_2_0= ruleExceptionProcess )
            	    // InternalSoftGalleryLanguage.g:4908:5: lv_elements_2_0= ruleExceptionProcess
            	    {

            	    					newCompositeNode(grammarAccess.getExceptionHandlerAccess().getElementsExceptionProcessParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_100);
            	    lv_elements_2_0=ruleExceptionProcess();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getExceptionHandlerRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_2_0,
            	    						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.ExceptionProcess");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExceptionHandler"


    // $ANTLR start "entryRuleExceptionProcess"
    // InternalSoftGalleryLanguage.g:4929:1: entryRuleExceptionProcess returns [EObject current=null] : iv_ruleExceptionProcess= ruleExceptionProcess EOF ;
    public final EObject entryRuleExceptionProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExceptionProcess = null;


        try {
            // InternalSoftGalleryLanguage.g:4929:57: (iv_ruleExceptionProcess= ruleExceptionProcess EOF )
            // InternalSoftGalleryLanguage.g:4930:2: iv_ruleExceptionProcess= ruleExceptionProcess EOF
            {
             newCompositeNode(grammarAccess.getExceptionProcessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExceptionProcess=ruleExceptionProcess();

            state._fsp--;

             current =iv_ruleExceptionProcess; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExceptionProcess"


    // $ANTLR start "ruleExceptionProcess"
    // InternalSoftGalleryLanguage.g:4936:1: ruleExceptionProcess returns [EObject current=null] : (otherlv_0= 'ExceptionProcess' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleExceptionProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:4942:2: ( (otherlv_0= 'ExceptionProcess' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftGalleryLanguage.g:4943:2: (otherlv_0= 'ExceptionProcess' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftGalleryLanguage.g:4943:2: (otherlv_0= 'ExceptionProcess' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftGalleryLanguage.g:4944:3: otherlv_0= 'ExceptionProcess' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,102,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getExceptionProcessAccess().getExceptionProcessKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:4948:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:4949:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:4949:4: (lv_name_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:4950:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getExceptionProcessAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExceptionProcessRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExceptionProcess"


    // $ANTLR start "entryRuleSpringEntity"
    // InternalSoftGalleryLanguage.g:4970:1: entryRuleSpringEntity returns [EObject current=null] : iv_ruleSpringEntity= ruleSpringEntity EOF ;
    public final EObject entryRuleSpringEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpringEntity = null;


        try {
            // InternalSoftGalleryLanguage.g:4970:53: (iv_ruleSpringEntity= ruleSpringEntity EOF )
            // InternalSoftGalleryLanguage.g:4971:2: iv_ruleSpringEntity= ruleSpringEntity EOF
            {
             newCompositeNode(grammarAccess.getSpringEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpringEntity=ruleSpringEntity();

            state._fsp--;

             current =iv_ruleSpringEntity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpringEntity"


    // $ANTLR start "ruleSpringEntity"
    // InternalSoftGalleryLanguage.g:4977:1: ruleSpringEntity returns [EObject current=null] : (otherlv_0= 'SpringEntity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleSpringTable ) )+ ( (lv_elements_5_0= ruleNameNativeQuery ) )* otherlv_6= '}' ) ;
    public final EObject ruleSpringEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_elements_4_0 = null;

        EObject lv_elements_5_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:4983:2: ( (otherlv_0= 'SpringEntity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleSpringTable ) )+ ( (lv_elements_5_0= ruleNameNativeQuery ) )* otherlv_6= '}' ) )
            // InternalSoftGalleryLanguage.g:4984:2: (otherlv_0= 'SpringEntity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleSpringTable ) )+ ( (lv_elements_5_0= ruleNameNativeQuery ) )* otherlv_6= '}' )
            {
            // InternalSoftGalleryLanguage.g:4984:2: (otherlv_0= 'SpringEntity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleSpringTable ) )+ ( (lv_elements_5_0= ruleNameNativeQuery ) )* otherlv_6= '}' )
            // InternalSoftGalleryLanguage.g:4985:3: otherlv_0= 'SpringEntity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleSpringTable ) )+ ( (lv_elements_5_0= ruleNameNativeQuery ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,103,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getSpringEntityAccess().getSpringEntityKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:4989:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:4990:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:4990:4: (lv_name_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:4991:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSpringEntityAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSpringEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getSpringEntityAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_101); 

            			newLeafNode(otherlv_3, grammarAccess.getSpringEntityAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSoftGalleryLanguage.g:5015:3: ( (lv_elements_4_0= ruleSpringTable ) )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==104) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalSoftGalleryLanguage.g:5016:4: (lv_elements_4_0= ruleSpringTable )
            	    {
            	    // InternalSoftGalleryLanguage.g:5016:4: (lv_elements_4_0= ruleSpringTable )
            	    // InternalSoftGalleryLanguage.g:5017:5: lv_elements_4_0= ruleSpringTable
            	    {

            	    					newCompositeNode(grammarAccess.getSpringEntityAccess().getElementsSpringTableParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_102);
            	    lv_elements_4_0=ruleSpringTable();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSpringEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_4_0,
            	    						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.SpringTable");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt27 >= 1 ) break loop27;
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
            } while (true);

            // InternalSoftGalleryLanguage.g:5034:3: ( (lv_elements_5_0= ruleNameNativeQuery ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==108) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalSoftGalleryLanguage.g:5035:4: (lv_elements_5_0= ruleNameNativeQuery )
            	    {
            	    // InternalSoftGalleryLanguage.g:5035:4: (lv_elements_5_0= ruleNameNativeQuery )
            	    // InternalSoftGalleryLanguage.g:5036:5: lv_elements_5_0= ruleNameNativeQuery
            	    {

            	    					newCompositeNode(grammarAccess.getSpringEntityAccess().getElementsNameNativeQueryParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_103);
            	    lv_elements_5_0=ruleNameNativeQuery();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSpringEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_5_0,
            	    						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.NameNativeQuery");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getSpringEntityAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpringEntity"


    // $ANTLR start "entryRuleSpringTable"
    // InternalSoftGalleryLanguage.g:5061:1: entryRuleSpringTable returns [EObject current=null] : iv_ruleSpringTable= ruleSpringTable EOF ;
    public final EObject entryRuleSpringTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpringTable = null;


        try {
            // InternalSoftGalleryLanguage.g:5061:52: (iv_ruleSpringTable= ruleSpringTable EOF )
            // InternalSoftGalleryLanguage.g:5062:2: iv_ruleSpringTable= ruleSpringTable EOF
            {
             newCompositeNode(grammarAccess.getSpringTableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpringTable=ruleSpringTable();

            state._fsp--;

             current =iv_ruleSpringTable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpringTable"


    // $ANTLR start "ruleSpringTable"
    // InternalSoftGalleryLanguage.g:5068:1: ruleSpringTable returns [EObject current=null] : (otherlv_0= 'SpringTable' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleSpringTableId ) ) ( (lv_elements_3_0= ruleColumns ) )+ ) ;
    public final EObject ruleSpringTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:5074:2: ( (otherlv_0= 'SpringTable' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleSpringTableId ) ) ( (lv_elements_3_0= ruleColumns ) )+ ) )
            // InternalSoftGalleryLanguage.g:5075:2: (otherlv_0= 'SpringTable' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleSpringTableId ) ) ( (lv_elements_3_0= ruleColumns ) )+ )
            {
            // InternalSoftGalleryLanguage.g:5075:2: (otherlv_0= 'SpringTable' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleSpringTableId ) ) ( (lv_elements_3_0= ruleColumns ) )+ )
            // InternalSoftGalleryLanguage.g:5076:3: otherlv_0= 'SpringTable' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleSpringTableId ) ) ( (lv_elements_3_0= ruleColumns ) )+
            {
            otherlv_0=(Token)match(input,104,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getSpringTableAccess().getSpringTableKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:5080:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:5081:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:5081:4: (lv_name_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:5082:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_104); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSpringTableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSpringTableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSoftGalleryLanguage.g:5098:3: ( (lv_elements_2_0= ruleSpringTableId ) )
            // InternalSoftGalleryLanguage.g:5099:4: (lv_elements_2_0= ruleSpringTableId )
            {
            // InternalSoftGalleryLanguage.g:5099:4: (lv_elements_2_0= ruleSpringTableId )
            // InternalSoftGalleryLanguage.g:5100:5: lv_elements_2_0= ruleSpringTableId
            {

            					newCompositeNode(grammarAccess.getSpringTableAccess().getElementsSpringTableIdParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_105);
            lv_elements_2_0=ruleSpringTableId();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSpringTableRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_2_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.SpringTableId");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftGalleryLanguage.g:5117:3: ( (lv_elements_3_0= ruleColumns ) )+
            int cnt29=0;
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==107) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalSoftGalleryLanguage.g:5118:4: (lv_elements_3_0= ruleColumns )
            	    {
            	    // InternalSoftGalleryLanguage.g:5118:4: (lv_elements_3_0= ruleColumns )
            	    // InternalSoftGalleryLanguage.g:5119:5: lv_elements_3_0= ruleColumns
            	    {

            	    					newCompositeNode(grammarAccess.getSpringTableAccess().getElementsColumnsParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_106);
            	    lv_elements_3_0=ruleColumns();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSpringTableRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_3_0,
            	    						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.Columns");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt29 >= 1 ) break loop29;
                        EarlyExitException eee =
                            new EarlyExitException(29, input);
                        throw eee;
                }
                cnt29++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpringTable"


    // $ANTLR start "entryRuleSpringTableId"
    // InternalSoftGalleryLanguage.g:5140:1: entryRuleSpringTableId returns [EObject current=null] : iv_ruleSpringTableId= ruleSpringTableId EOF ;
    public final EObject entryRuleSpringTableId() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpringTableId = null;


        try {
            // InternalSoftGalleryLanguage.g:5140:54: (iv_ruleSpringTableId= ruleSpringTableId EOF )
            // InternalSoftGalleryLanguage.g:5141:2: iv_ruleSpringTableId= ruleSpringTableId EOF
            {
             newCompositeNode(grammarAccess.getSpringTableIdRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpringTableId=ruleSpringTableId();

            state._fsp--;

             current =iv_ruleSpringTableId; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpringTableId"


    // $ANTLR start "ruleSpringTableId"
    // InternalSoftGalleryLanguage.g:5147:1: ruleSpringTableId returns [EObject current=null] : ( () otherlv_1= 'SpringTableId' ( (lv_elements_2_0= ruleGeneratedValue ) )* ) ;
    public final EObject ruleSpringTableId() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:5153:2: ( ( () otherlv_1= 'SpringTableId' ( (lv_elements_2_0= ruleGeneratedValue ) )* ) )
            // InternalSoftGalleryLanguage.g:5154:2: ( () otherlv_1= 'SpringTableId' ( (lv_elements_2_0= ruleGeneratedValue ) )* )
            {
            // InternalSoftGalleryLanguage.g:5154:2: ( () otherlv_1= 'SpringTableId' ( (lv_elements_2_0= ruleGeneratedValue ) )* )
            // InternalSoftGalleryLanguage.g:5155:3: () otherlv_1= 'SpringTableId' ( (lv_elements_2_0= ruleGeneratedValue ) )*
            {
            // InternalSoftGalleryLanguage.g:5155:3: ()
            // InternalSoftGalleryLanguage.g:5156:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSpringTableIdAccess().getSpringTableIdAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,105,FOLLOW_107); 

            			newLeafNode(otherlv_1, grammarAccess.getSpringTableIdAccess().getSpringTableIdKeyword_1());
            		
            // InternalSoftGalleryLanguage.g:5166:3: ( (lv_elements_2_0= ruleGeneratedValue ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==106) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalSoftGalleryLanguage.g:5167:4: (lv_elements_2_0= ruleGeneratedValue )
            	    {
            	    // InternalSoftGalleryLanguage.g:5167:4: (lv_elements_2_0= ruleGeneratedValue )
            	    // InternalSoftGalleryLanguage.g:5168:5: lv_elements_2_0= ruleGeneratedValue
            	    {

            	    					newCompositeNode(grammarAccess.getSpringTableIdAccess().getElementsGeneratedValueParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_107);
            	    lv_elements_2_0=ruleGeneratedValue();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSpringTableIdRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_2_0,
            	    						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.GeneratedValue");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpringTableId"


    // $ANTLR start "entryRuleGeneratedValue"
    // InternalSoftGalleryLanguage.g:5189:1: entryRuleGeneratedValue returns [EObject current=null] : iv_ruleGeneratedValue= ruleGeneratedValue EOF ;
    public final EObject entryRuleGeneratedValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneratedValue = null;


        try {
            // InternalSoftGalleryLanguage.g:5189:55: (iv_ruleGeneratedValue= ruleGeneratedValue EOF )
            // InternalSoftGalleryLanguage.g:5190:2: iv_ruleGeneratedValue= ruleGeneratedValue EOF
            {
             newCompositeNode(grammarAccess.getGeneratedValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGeneratedValue=ruleGeneratedValue();

            state._fsp--;

             current =iv_ruleGeneratedValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGeneratedValue"


    // $ANTLR start "ruleGeneratedValue"
    // InternalSoftGalleryLanguage.g:5196:1: ruleGeneratedValue returns [EObject current=null] : (otherlv_0= 'GeneratedValue' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleGeneratedValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:5202:2: ( (otherlv_0= 'GeneratedValue' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftGalleryLanguage.g:5203:2: (otherlv_0= 'GeneratedValue' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftGalleryLanguage.g:5203:2: (otherlv_0= 'GeneratedValue' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftGalleryLanguage.g:5204:3: otherlv_0= 'GeneratedValue' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,106,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getGeneratedValueAccess().getGeneratedValueKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:5208:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:5209:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:5209:4: (lv_name_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:5210:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getGeneratedValueAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeneratedValueRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGeneratedValue"


    // $ANTLR start "entryRuleColumns"
    // InternalSoftGalleryLanguage.g:5230:1: entryRuleColumns returns [EObject current=null] : iv_ruleColumns= ruleColumns EOF ;
    public final EObject entryRuleColumns() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumns = null;


        try {
            // InternalSoftGalleryLanguage.g:5230:48: (iv_ruleColumns= ruleColumns EOF )
            // InternalSoftGalleryLanguage.g:5231:2: iv_ruleColumns= ruleColumns EOF
            {
             newCompositeNode(grammarAccess.getColumnsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColumns=ruleColumns();

            state._fsp--;

             current =iv_ruleColumns; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColumns"


    // $ANTLR start "ruleColumns"
    // InternalSoftGalleryLanguage.g:5237:1: ruleColumns returns [EObject current=null] : (otherlv_0= 'Column' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleColumns() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:5243:2: ( (otherlv_0= 'Column' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftGalleryLanguage.g:5244:2: (otherlv_0= 'Column' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftGalleryLanguage.g:5244:2: (otherlv_0= 'Column' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftGalleryLanguage.g:5245:3: otherlv_0= 'Column' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,107,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getColumnsAccess().getColumnKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:5249:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:5250:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:5250:4: (lv_name_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:5251:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getColumnsAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getColumnsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColumns"


    // $ANTLR start "entryRuleNameNativeQuery"
    // InternalSoftGalleryLanguage.g:5271:1: entryRuleNameNativeQuery returns [EObject current=null] : iv_ruleNameNativeQuery= ruleNameNativeQuery EOF ;
    public final EObject entryRuleNameNativeQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameNativeQuery = null;


        try {
            // InternalSoftGalleryLanguage.g:5271:56: (iv_ruleNameNativeQuery= ruleNameNativeQuery EOF )
            // InternalSoftGalleryLanguage.g:5272:2: iv_ruleNameNativeQuery= ruleNameNativeQuery EOF
            {
             newCompositeNode(grammarAccess.getNameNativeQueryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNameNativeQuery=ruleNameNativeQuery();

            state._fsp--;

             current =iv_ruleNameNativeQuery; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNameNativeQuery"


    // $ANTLR start "ruleNameNativeQuery"
    // InternalSoftGalleryLanguage.g:5278:1: ruleNameNativeQuery returns [EObject current=null] : (otherlv_0= 'NameNativeQuery' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleNameNativeQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:5284:2: ( (otherlv_0= 'NameNativeQuery' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftGalleryLanguage.g:5285:2: (otherlv_0= 'NameNativeQuery' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftGalleryLanguage.g:5285:2: (otherlv_0= 'NameNativeQuery' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftGalleryLanguage.g:5286:3: otherlv_0= 'NameNativeQuery' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,108,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getNameNativeQueryAccess().getNameNativeQueryKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:5290:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:5291:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:5291:4: (lv_name_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:5292:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getNameNativeQueryAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNameNativeQueryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNameNativeQuery"


    // $ANTLR start "entryRuleReact"
    // InternalSoftGalleryLanguage.g:5312:1: entryRuleReact returns [EObject current=null] : iv_ruleReact= ruleReact EOF ;
    public final EObject entryRuleReact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReact = null;


        try {
            // InternalSoftGalleryLanguage.g:5312:46: (iv_ruleReact= ruleReact EOF )
            // InternalSoftGalleryLanguage.g:5313:2: iv_ruleReact= ruleReact EOF
            {
             newCompositeNode(grammarAccess.getReactRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReact=ruleReact();

            state._fsp--;

             current =iv_ruleReact; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReact"


    // $ANTLR start "ruleReact"
    // InternalSoftGalleryLanguage.g:5319:1: ruleReact returns [EObject current=null] : (otherlv_0= 'React' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_reacts_4_0= ruleReactModules ) ) otherlv_5= '}' ) ;
    public final EObject ruleReact() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_reacts_4_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:5325:2: ( (otherlv_0= 'React' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_reacts_4_0= ruleReactModules ) ) otherlv_5= '}' ) )
            // InternalSoftGalleryLanguage.g:5326:2: (otherlv_0= 'React' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_reacts_4_0= ruleReactModules ) ) otherlv_5= '}' )
            {
            // InternalSoftGalleryLanguage.g:5326:2: (otherlv_0= 'React' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_reacts_4_0= ruleReactModules ) ) otherlv_5= '}' )
            // InternalSoftGalleryLanguage.g:5327:3: otherlv_0= 'React' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_reacts_4_0= ruleReactModules ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,109,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getReactAccess().getReactKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:5331:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:5332:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:5332:4: (lv_name_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:5333:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getReactAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReactRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getReactAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_108); 

            			newLeafNode(otherlv_3, grammarAccess.getReactAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSoftGalleryLanguage.g:5357:3: ( (lv_reacts_4_0= ruleReactModules ) )
            // InternalSoftGalleryLanguage.g:5358:4: (lv_reacts_4_0= ruleReactModules )
            {
            // InternalSoftGalleryLanguage.g:5358:4: (lv_reacts_4_0= ruleReactModules )
            // InternalSoftGalleryLanguage.g:5359:5: lv_reacts_4_0= ruleReactModules
            {

            					newCompositeNode(grammarAccess.getReactAccess().getReactsReactModulesParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_reacts_4_0=ruleReactModules();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReactRule());
            					}
            					add(
            						current,
            						"reacts",
            						lv_reacts_4_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.ReactModules");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getReactAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReact"


    // $ANTLR start "entryRuleReactModules"
    // InternalSoftGalleryLanguage.g:5384:1: entryRuleReactModules returns [EObject current=null] : iv_ruleReactModules= ruleReactModules EOF ;
    public final EObject entryRuleReactModules() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactModules = null;


        try {
            // InternalSoftGalleryLanguage.g:5384:53: (iv_ruleReactModules= ruleReactModules EOF )
            // InternalSoftGalleryLanguage.g:5385:2: iv_ruleReactModules= ruleReactModules EOF
            {
             newCompositeNode(grammarAccess.getReactModulesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReactModules=ruleReactModules();

            state._fsp--;

             current =iv_ruleReactModules; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReactModules"


    // $ANTLR start "ruleReactModules"
    // InternalSoftGalleryLanguage.g:5391:1: ruleReactModules returns [EObject current=null] : (otherlv_0= 'ReactModules' otherlv_1= ':' otherlv_2= '{' ( (lv_reactmodules_3_0= ruleReactSubModules ) ) otherlv_4= '}' ) ;
    public final EObject ruleReactModules() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_reactmodules_3_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:5397:2: ( (otherlv_0= 'ReactModules' otherlv_1= ':' otherlv_2= '{' ( (lv_reactmodules_3_0= ruleReactSubModules ) ) otherlv_4= '}' ) )
            // InternalSoftGalleryLanguage.g:5398:2: (otherlv_0= 'ReactModules' otherlv_1= ':' otherlv_2= '{' ( (lv_reactmodules_3_0= ruleReactSubModules ) ) otherlv_4= '}' )
            {
            // InternalSoftGalleryLanguage.g:5398:2: (otherlv_0= 'ReactModules' otherlv_1= ':' otherlv_2= '{' ( (lv_reactmodules_3_0= ruleReactSubModules ) ) otherlv_4= '}' )
            // InternalSoftGalleryLanguage.g:5399:3: otherlv_0= 'ReactModules' otherlv_1= ':' otherlv_2= '{' ( (lv_reactmodules_3_0= ruleReactSubModules ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,110,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getReactModulesAccess().getReactModulesKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getReactModulesAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_109); 

            			newLeafNode(otherlv_2, grammarAccess.getReactModulesAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSoftGalleryLanguage.g:5411:3: ( (lv_reactmodules_3_0= ruleReactSubModules ) )
            // InternalSoftGalleryLanguage.g:5412:4: (lv_reactmodules_3_0= ruleReactSubModules )
            {
            // InternalSoftGalleryLanguage.g:5412:4: (lv_reactmodules_3_0= ruleReactSubModules )
            // InternalSoftGalleryLanguage.g:5413:5: lv_reactmodules_3_0= ruleReactSubModules
            {

            					newCompositeNode(grammarAccess.getReactModulesAccess().getReactmodulesReactSubModulesParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_reactmodules_3_0=ruleReactSubModules();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReactModulesRule());
            					}
            					add(
            						current,
            						"reactmodules",
            						lv_reactmodules_3_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.ReactSubModules");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getReactModulesAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReactModules"


    // $ANTLR start "entryRuleReactSubModules"
    // InternalSoftGalleryLanguage.g:5438:1: entryRuleReactSubModules returns [EObject current=null] : iv_ruleReactSubModules= ruleReactSubModules EOF ;
    public final EObject entryRuleReactSubModules() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactSubModules = null;


        try {
            // InternalSoftGalleryLanguage.g:5438:56: (iv_ruleReactSubModules= ruleReactSubModules EOF )
            // InternalSoftGalleryLanguage.g:5439:2: iv_ruleReactSubModules= ruleReactSubModules EOF
            {
             newCompositeNode(grammarAccess.getReactSubModulesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReactSubModules=ruleReactSubModules();

            state._fsp--;

             current =iv_ruleReactSubModules; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReactSubModules"


    // $ANTLR start "ruleReactSubModules"
    // InternalSoftGalleryLanguage.g:5445:1: ruleReactSubModules returns [EObject current=null] : ( ( (lv_reactmodulesconf_0_0= ruleReactConfiguration ) ) ( (lv_reactmodulescomp_1_0= ruleReactComponents ) ) ( (lv_reactmodulesact_2_0= ruleReactActions ) ) ( (lv_reactmoduleslib_3_0= ruleReactLibraries ) ) ( (lv_reactmodulesinf_4_0= ruleReactInfo ) ) ) ;
    public final EObject ruleReactSubModules() throws RecognitionException {
        EObject current = null;

        EObject lv_reactmodulesconf_0_0 = null;

        EObject lv_reactmodulescomp_1_0 = null;

        EObject lv_reactmodulesact_2_0 = null;

        EObject lv_reactmoduleslib_3_0 = null;

        EObject lv_reactmodulesinf_4_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:5451:2: ( ( ( (lv_reactmodulesconf_0_0= ruleReactConfiguration ) ) ( (lv_reactmodulescomp_1_0= ruleReactComponents ) ) ( (lv_reactmodulesact_2_0= ruleReactActions ) ) ( (lv_reactmoduleslib_3_0= ruleReactLibraries ) ) ( (lv_reactmodulesinf_4_0= ruleReactInfo ) ) ) )
            // InternalSoftGalleryLanguage.g:5452:2: ( ( (lv_reactmodulesconf_0_0= ruleReactConfiguration ) ) ( (lv_reactmodulescomp_1_0= ruleReactComponents ) ) ( (lv_reactmodulesact_2_0= ruleReactActions ) ) ( (lv_reactmoduleslib_3_0= ruleReactLibraries ) ) ( (lv_reactmodulesinf_4_0= ruleReactInfo ) ) )
            {
            // InternalSoftGalleryLanguage.g:5452:2: ( ( (lv_reactmodulesconf_0_0= ruleReactConfiguration ) ) ( (lv_reactmodulescomp_1_0= ruleReactComponents ) ) ( (lv_reactmodulesact_2_0= ruleReactActions ) ) ( (lv_reactmoduleslib_3_0= ruleReactLibraries ) ) ( (lv_reactmodulesinf_4_0= ruleReactInfo ) ) )
            // InternalSoftGalleryLanguage.g:5453:3: ( (lv_reactmodulesconf_0_0= ruleReactConfiguration ) ) ( (lv_reactmodulescomp_1_0= ruleReactComponents ) ) ( (lv_reactmodulesact_2_0= ruleReactActions ) ) ( (lv_reactmoduleslib_3_0= ruleReactLibraries ) ) ( (lv_reactmodulesinf_4_0= ruleReactInfo ) )
            {
            // InternalSoftGalleryLanguage.g:5453:3: ( (lv_reactmodulesconf_0_0= ruleReactConfiguration ) )
            // InternalSoftGalleryLanguage.g:5454:4: (lv_reactmodulesconf_0_0= ruleReactConfiguration )
            {
            // InternalSoftGalleryLanguage.g:5454:4: (lv_reactmodulesconf_0_0= ruleReactConfiguration )
            // InternalSoftGalleryLanguage.g:5455:5: lv_reactmodulesconf_0_0= ruleReactConfiguration
            {

            					newCompositeNode(grammarAccess.getReactSubModulesAccess().getReactmodulesconfReactConfigurationParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_110);
            lv_reactmodulesconf_0_0=ruleReactConfiguration();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReactSubModulesRule());
            					}
            					add(
            						current,
            						"reactmodulesconf",
            						lv_reactmodulesconf_0_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.ReactConfiguration");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftGalleryLanguage.g:5472:3: ( (lv_reactmodulescomp_1_0= ruleReactComponents ) )
            // InternalSoftGalleryLanguage.g:5473:4: (lv_reactmodulescomp_1_0= ruleReactComponents )
            {
            // InternalSoftGalleryLanguage.g:5473:4: (lv_reactmodulescomp_1_0= ruleReactComponents )
            // InternalSoftGalleryLanguage.g:5474:5: lv_reactmodulescomp_1_0= ruleReactComponents
            {

            					newCompositeNode(grammarAccess.getReactSubModulesAccess().getReactmodulescompReactComponentsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_111);
            lv_reactmodulescomp_1_0=ruleReactComponents();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReactSubModulesRule());
            					}
            					add(
            						current,
            						"reactmodulescomp",
            						lv_reactmodulescomp_1_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.ReactComponents");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftGalleryLanguage.g:5491:3: ( (lv_reactmodulesact_2_0= ruleReactActions ) )
            // InternalSoftGalleryLanguage.g:5492:4: (lv_reactmodulesact_2_0= ruleReactActions )
            {
            // InternalSoftGalleryLanguage.g:5492:4: (lv_reactmodulesact_2_0= ruleReactActions )
            // InternalSoftGalleryLanguage.g:5493:5: lv_reactmodulesact_2_0= ruleReactActions
            {

            					newCompositeNode(grammarAccess.getReactSubModulesAccess().getReactmodulesactReactActionsParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_112);
            lv_reactmodulesact_2_0=ruleReactActions();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReactSubModulesRule());
            					}
            					add(
            						current,
            						"reactmodulesact",
            						lv_reactmodulesact_2_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.ReactActions");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftGalleryLanguage.g:5510:3: ( (lv_reactmoduleslib_3_0= ruleReactLibraries ) )
            // InternalSoftGalleryLanguage.g:5511:4: (lv_reactmoduleslib_3_0= ruleReactLibraries )
            {
            // InternalSoftGalleryLanguage.g:5511:4: (lv_reactmoduleslib_3_0= ruleReactLibraries )
            // InternalSoftGalleryLanguage.g:5512:5: lv_reactmoduleslib_3_0= ruleReactLibraries
            {

            					newCompositeNode(grammarAccess.getReactSubModulesAccess().getReactmoduleslibReactLibrariesParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_113);
            lv_reactmoduleslib_3_0=ruleReactLibraries();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReactSubModulesRule());
            					}
            					add(
            						current,
            						"reactmoduleslib",
            						lv_reactmoduleslib_3_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.ReactLibraries");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftGalleryLanguage.g:5529:3: ( (lv_reactmodulesinf_4_0= ruleReactInfo ) )
            // InternalSoftGalleryLanguage.g:5530:4: (lv_reactmodulesinf_4_0= ruleReactInfo )
            {
            // InternalSoftGalleryLanguage.g:5530:4: (lv_reactmodulesinf_4_0= ruleReactInfo )
            // InternalSoftGalleryLanguage.g:5531:5: lv_reactmodulesinf_4_0= ruleReactInfo
            {

            					newCompositeNode(grammarAccess.getReactSubModulesAccess().getReactmodulesinfReactInfoParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_reactmodulesinf_4_0=ruleReactInfo();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReactSubModulesRule());
            					}
            					add(
            						current,
            						"reactmodulesinf",
            						lv_reactmodulesinf_4_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.ReactInfo");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReactSubModules"


    // $ANTLR start "entryRuleReactConfiguration"
    // InternalSoftGalleryLanguage.g:5552:1: entryRuleReactConfiguration returns [EObject current=null] : iv_ruleReactConfiguration= ruleReactConfiguration EOF ;
    public final EObject entryRuleReactConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactConfiguration = null;


        try {
            // InternalSoftGalleryLanguage.g:5552:59: (iv_ruleReactConfiguration= ruleReactConfiguration EOF )
            // InternalSoftGalleryLanguage.g:5553:2: iv_ruleReactConfiguration= ruleReactConfiguration EOF
            {
             newCompositeNode(grammarAccess.getReactConfigurationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReactConfiguration=ruleReactConfiguration();

            state._fsp--;

             current =iv_ruleReactConfiguration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReactConfiguration"


    // $ANTLR start "ruleReactConfiguration"
    // InternalSoftGalleryLanguage.g:5559:1: ruleReactConfiguration returns [EObject current=null] : (otherlv_0= 'ReactConfiguration' otherlv_1= ':' otherlv_2= '{' ( (lv_dependencies_3_0= ruleReactDependencies ) ) ( (lv_configurations_4_0= ruleReactConfigurations ) ) otherlv_5= '}' ) ;
    public final EObject ruleReactConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_dependencies_3_0 = null;

        EObject lv_configurations_4_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:5565:2: ( (otherlv_0= 'ReactConfiguration' otherlv_1= ':' otherlv_2= '{' ( (lv_dependencies_3_0= ruleReactDependencies ) ) ( (lv_configurations_4_0= ruleReactConfigurations ) ) otherlv_5= '}' ) )
            // InternalSoftGalleryLanguage.g:5566:2: (otherlv_0= 'ReactConfiguration' otherlv_1= ':' otherlv_2= '{' ( (lv_dependencies_3_0= ruleReactDependencies ) ) ( (lv_configurations_4_0= ruleReactConfigurations ) ) otherlv_5= '}' )
            {
            // InternalSoftGalleryLanguage.g:5566:2: (otherlv_0= 'ReactConfiguration' otherlv_1= ':' otherlv_2= '{' ( (lv_dependencies_3_0= ruleReactDependencies ) ) ( (lv_configurations_4_0= ruleReactConfigurations ) ) otherlv_5= '}' )
            // InternalSoftGalleryLanguage.g:5567:3: otherlv_0= 'ReactConfiguration' otherlv_1= ':' otherlv_2= '{' ( (lv_dependencies_3_0= ruleReactDependencies ) ) ( (lv_configurations_4_0= ruleReactConfigurations ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,111,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getReactConfigurationAccess().getReactConfigurationKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getReactConfigurationAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_114); 

            			newLeafNode(otherlv_2, grammarAccess.getReactConfigurationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSoftGalleryLanguage.g:5579:3: ( (lv_dependencies_3_0= ruleReactDependencies ) )
            // InternalSoftGalleryLanguage.g:5580:4: (lv_dependencies_3_0= ruleReactDependencies )
            {
            // InternalSoftGalleryLanguage.g:5580:4: (lv_dependencies_3_0= ruleReactDependencies )
            // InternalSoftGalleryLanguage.g:5581:5: lv_dependencies_3_0= ruleReactDependencies
            {

            					newCompositeNode(grammarAccess.getReactConfigurationAccess().getDependenciesReactDependenciesParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_115);
            lv_dependencies_3_0=ruleReactDependencies();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReactConfigurationRule());
            					}
            					add(
            						current,
            						"dependencies",
            						lv_dependencies_3_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.ReactDependencies");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftGalleryLanguage.g:5598:3: ( (lv_configurations_4_0= ruleReactConfigurations ) )
            // InternalSoftGalleryLanguage.g:5599:4: (lv_configurations_4_0= ruleReactConfigurations )
            {
            // InternalSoftGalleryLanguage.g:5599:4: (lv_configurations_4_0= ruleReactConfigurations )
            // InternalSoftGalleryLanguage.g:5600:5: lv_configurations_4_0= ruleReactConfigurations
            {

            					newCompositeNode(grammarAccess.getReactConfigurationAccess().getConfigurationsReactConfigurationsParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_configurations_4_0=ruleReactConfigurations();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReactConfigurationRule());
            					}
            					add(
            						current,
            						"configurations",
            						lv_configurations_4_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.ReactConfigurations");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getReactConfigurationAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReactConfiguration"


    // $ANTLR start "entryRuleReactDependencies"
    // InternalSoftGalleryLanguage.g:5625:1: entryRuleReactDependencies returns [EObject current=null] : iv_ruleReactDependencies= ruleReactDependencies EOF ;
    public final EObject entryRuleReactDependencies() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactDependencies = null;


        try {
            // InternalSoftGalleryLanguage.g:5625:58: (iv_ruleReactDependencies= ruleReactDependencies EOF )
            // InternalSoftGalleryLanguage.g:5626:2: iv_ruleReactDependencies= ruleReactDependencies EOF
            {
             newCompositeNode(grammarAccess.getReactDependenciesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReactDependencies=ruleReactDependencies();

            state._fsp--;

             current =iv_ruleReactDependencies; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReactDependencies"


    // $ANTLR start "ruleReactDependencies"
    // InternalSoftGalleryLanguage.g:5632:1: ruleReactDependencies returns [EObject current=null] : (otherlv_0= 'DependenciesStruct' ( (lv_dependencies_1_0= ruleReactDependenciesRules ) )+ ) ;
    public final EObject ruleReactDependencies() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_dependencies_1_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:5638:2: ( (otherlv_0= 'DependenciesStruct' ( (lv_dependencies_1_0= ruleReactDependenciesRules ) )+ ) )
            // InternalSoftGalleryLanguage.g:5639:2: (otherlv_0= 'DependenciesStruct' ( (lv_dependencies_1_0= ruleReactDependenciesRules ) )+ )
            {
            // InternalSoftGalleryLanguage.g:5639:2: (otherlv_0= 'DependenciesStruct' ( (lv_dependencies_1_0= ruleReactDependenciesRules ) )+ )
            // InternalSoftGalleryLanguage.g:5640:3: otherlv_0= 'DependenciesStruct' ( (lv_dependencies_1_0= ruleReactDependenciesRules ) )+
            {
            otherlv_0=(Token)match(input,112,FOLLOW_116); 

            			newLeafNode(otherlv_0, grammarAccess.getReactDependenciesAccess().getDependenciesStructKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:5644:3: ( (lv_dependencies_1_0= ruleReactDependenciesRules ) )+
            int cnt31=0;
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==113) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalSoftGalleryLanguage.g:5645:4: (lv_dependencies_1_0= ruleReactDependenciesRules )
            	    {
            	    // InternalSoftGalleryLanguage.g:5645:4: (lv_dependencies_1_0= ruleReactDependenciesRules )
            	    // InternalSoftGalleryLanguage.g:5646:5: lv_dependencies_1_0= ruleReactDependenciesRules
            	    {

            	    					newCompositeNode(grammarAccess.getReactDependenciesAccess().getDependenciesReactDependenciesRulesParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_117);
            	    lv_dependencies_1_0=ruleReactDependenciesRules();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getReactDependenciesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"dependencies",
            	    						lv_dependencies_1_0,
            	    						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.ReactDependenciesRules");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt31 >= 1 ) break loop31;
                        EarlyExitException eee =
                            new EarlyExitException(31, input);
                        throw eee;
                }
                cnt31++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReactDependencies"


    // $ANTLR start "entryRuleReactDependenciesRules"
    // InternalSoftGalleryLanguage.g:5667:1: entryRuleReactDependenciesRules returns [EObject current=null] : iv_ruleReactDependenciesRules= ruleReactDependenciesRules EOF ;
    public final EObject entryRuleReactDependenciesRules() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactDependenciesRules = null;


        try {
            // InternalSoftGalleryLanguage.g:5667:63: (iv_ruleReactDependenciesRules= ruleReactDependenciesRules EOF )
            // InternalSoftGalleryLanguage.g:5668:2: iv_ruleReactDependenciesRules= ruleReactDependenciesRules EOF
            {
             newCompositeNode(grammarAccess.getReactDependenciesRulesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReactDependenciesRules=ruleReactDependenciesRules();

            state._fsp--;

             current =iv_ruleReactDependenciesRules; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReactDependenciesRules"


    // $ANTLR start "ruleReactDependenciesRules"
    // InternalSoftGalleryLanguage.g:5674:1: ruleReactDependenciesRules returns [EObject current=null] : (otherlv_0= 'DependencyType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_dependencies_2_0= ruleReactDependenciesSubRules ) )+ ) ;
    public final EObject ruleReactDependenciesRules() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_dependencies_2_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:5680:2: ( (otherlv_0= 'DependencyType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_dependencies_2_0= ruleReactDependenciesSubRules ) )+ ) )
            // InternalSoftGalleryLanguage.g:5681:2: (otherlv_0= 'DependencyType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_dependencies_2_0= ruleReactDependenciesSubRules ) )+ )
            {
            // InternalSoftGalleryLanguage.g:5681:2: (otherlv_0= 'DependencyType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_dependencies_2_0= ruleReactDependenciesSubRules ) )+ )
            // InternalSoftGalleryLanguage.g:5682:3: otherlv_0= 'DependencyType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_dependencies_2_0= ruleReactDependenciesSubRules ) )+
            {
            otherlv_0=(Token)match(input,113,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getReactDependenciesRulesAccess().getDependencyTypeKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:5686:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:5687:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:5687:4: (lv_name_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:5688:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_118); 

            					newLeafNode(lv_name_1_0, grammarAccess.getReactDependenciesRulesAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReactDependenciesRulesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSoftGalleryLanguage.g:5704:3: ( (lv_dependencies_2_0= ruleReactDependenciesSubRules ) )+
            int cnt32=0;
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==114) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalSoftGalleryLanguage.g:5705:4: (lv_dependencies_2_0= ruleReactDependenciesSubRules )
            	    {
            	    // InternalSoftGalleryLanguage.g:5705:4: (lv_dependencies_2_0= ruleReactDependenciesSubRules )
            	    // InternalSoftGalleryLanguage.g:5706:5: lv_dependencies_2_0= ruleReactDependenciesSubRules
            	    {

            	    					newCompositeNode(grammarAccess.getReactDependenciesRulesAccess().getDependenciesReactDependenciesSubRulesParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_119);
            	    lv_dependencies_2_0=ruleReactDependenciesSubRules();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getReactDependenciesRulesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"dependencies",
            	    						lv_dependencies_2_0,
            	    						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.ReactDependenciesSubRules");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt32 >= 1 ) break loop32;
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        throw eee;
                }
                cnt32++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReactDependenciesRules"


    // $ANTLR start "entryRuleReactDependenciesSubRules"
    // InternalSoftGalleryLanguage.g:5727:1: entryRuleReactDependenciesSubRules returns [EObject current=null] : iv_ruleReactDependenciesSubRules= ruleReactDependenciesSubRules EOF ;
    public final EObject entryRuleReactDependenciesSubRules() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactDependenciesSubRules = null;


        try {
            // InternalSoftGalleryLanguage.g:5727:66: (iv_ruleReactDependenciesSubRules= ruleReactDependenciesSubRules EOF )
            // InternalSoftGalleryLanguage.g:5728:2: iv_ruleReactDependenciesSubRules= ruleReactDependenciesSubRules EOF
            {
             newCompositeNode(grammarAccess.getReactDependenciesSubRulesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReactDependenciesSubRules=ruleReactDependenciesSubRules();

            state._fsp--;

             current =iv_ruleReactDependenciesSubRules; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReactDependenciesSubRules"


    // $ANTLR start "ruleReactDependenciesSubRules"
    // InternalSoftGalleryLanguage.g:5734:1: ruleReactDependenciesSubRules returns [EObject current=null] : ( (lv_dependencies_0_0= ruleSingleDependencies ) ) ;
    public final EObject ruleReactDependenciesSubRules() throws RecognitionException {
        EObject current = null;

        EObject lv_dependencies_0_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:5740:2: ( ( (lv_dependencies_0_0= ruleSingleDependencies ) ) )
            // InternalSoftGalleryLanguage.g:5741:2: ( (lv_dependencies_0_0= ruleSingleDependencies ) )
            {
            // InternalSoftGalleryLanguage.g:5741:2: ( (lv_dependencies_0_0= ruleSingleDependencies ) )
            // InternalSoftGalleryLanguage.g:5742:3: (lv_dependencies_0_0= ruleSingleDependencies )
            {
            // InternalSoftGalleryLanguage.g:5742:3: (lv_dependencies_0_0= ruleSingleDependencies )
            // InternalSoftGalleryLanguage.g:5743:4: lv_dependencies_0_0= ruleSingleDependencies
            {

            				newCompositeNode(grammarAccess.getReactDependenciesSubRulesAccess().getDependenciesSingleDependenciesParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_dependencies_0_0=ruleSingleDependencies();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getReactDependenciesSubRulesRule());
            				}
            				add(
            					current,
            					"dependencies",
            					lv_dependencies_0_0,
            					"co.unal.mdd.photos.dsl.SoftGalleryLanguage.SingleDependencies");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReactDependenciesSubRules"


    // $ANTLR start "entryRuleSingleDependencies"
    // InternalSoftGalleryLanguage.g:5763:1: entryRuleSingleDependencies returns [EObject current=null] : iv_ruleSingleDependencies= ruleSingleDependencies EOF ;
    public final EObject entryRuleSingleDependencies() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleDependencies = null;


        try {
            // InternalSoftGalleryLanguage.g:5763:59: (iv_ruleSingleDependencies= ruleSingleDependencies EOF )
            // InternalSoftGalleryLanguage.g:5764:2: iv_ruleSingleDependencies= ruleSingleDependencies EOF
            {
             newCompositeNode(grammarAccess.getSingleDependenciesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSingleDependencies=ruleSingleDependencies();

            state._fsp--;

             current =iv_ruleSingleDependencies; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSingleDependencies"


    // $ANTLR start "ruleSingleDependencies"
    // InternalSoftGalleryLanguage.g:5770:1: ruleSingleDependencies returns [EObject current=null] : ( ( (lv_dependencies_0_0= rulePackageName ) ) ( (lv_dependencies_1_0= rulePackageVersion ) ) ) ;
    public final EObject ruleSingleDependencies() throws RecognitionException {
        EObject current = null;

        EObject lv_dependencies_0_0 = null;

        EObject lv_dependencies_1_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:5776:2: ( ( ( (lv_dependencies_0_0= rulePackageName ) ) ( (lv_dependencies_1_0= rulePackageVersion ) ) ) )
            // InternalSoftGalleryLanguage.g:5777:2: ( ( (lv_dependencies_0_0= rulePackageName ) ) ( (lv_dependencies_1_0= rulePackageVersion ) ) )
            {
            // InternalSoftGalleryLanguage.g:5777:2: ( ( (lv_dependencies_0_0= rulePackageName ) ) ( (lv_dependencies_1_0= rulePackageVersion ) ) )
            // InternalSoftGalleryLanguage.g:5778:3: ( (lv_dependencies_0_0= rulePackageName ) ) ( (lv_dependencies_1_0= rulePackageVersion ) )
            {
            // InternalSoftGalleryLanguage.g:5778:3: ( (lv_dependencies_0_0= rulePackageName ) )
            // InternalSoftGalleryLanguage.g:5779:4: (lv_dependencies_0_0= rulePackageName )
            {
            // InternalSoftGalleryLanguage.g:5779:4: (lv_dependencies_0_0= rulePackageName )
            // InternalSoftGalleryLanguage.g:5780:5: lv_dependencies_0_0= rulePackageName
            {

            					newCompositeNode(grammarAccess.getSingleDependenciesAccess().getDependenciesPackageNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_120);
            lv_dependencies_0_0=rulePackageName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSingleDependenciesRule());
            					}
            					add(
            						current,
            						"dependencies",
            						lv_dependencies_0_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.PackageName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftGalleryLanguage.g:5797:3: ( (lv_dependencies_1_0= rulePackageVersion ) )
            // InternalSoftGalleryLanguage.g:5798:4: (lv_dependencies_1_0= rulePackageVersion )
            {
            // InternalSoftGalleryLanguage.g:5798:4: (lv_dependencies_1_0= rulePackageVersion )
            // InternalSoftGalleryLanguage.g:5799:5: lv_dependencies_1_0= rulePackageVersion
            {

            					newCompositeNode(grammarAccess.getSingleDependenciesAccess().getDependenciesPackageVersionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_dependencies_1_0=rulePackageVersion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSingleDependenciesRule());
            					}
            					add(
            						current,
            						"dependencies",
            						lv_dependencies_1_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.PackageVersion");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSingleDependencies"


    // $ANTLR start "entryRulePackageName"
    // InternalSoftGalleryLanguage.g:5820:1: entryRulePackageName returns [EObject current=null] : iv_rulePackageName= rulePackageName EOF ;
    public final EObject entryRulePackageName() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageName = null;


        try {
            // InternalSoftGalleryLanguage.g:5820:52: (iv_rulePackageName= rulePackageName EOF )
            // InternalSoftGalleryLanguage.g:5821:2: iv_rulePackageName= rulePackageName EOF
            {
             newCompositeNode(grammarAccess.getPackageNameRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackageName=rulePackageName();

            state._fsp--;

             current =iv_rulePackageName; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackageName"


    // $ANTLR start "rulePackageName"
    // InternalSoftGalleryLanguage.g:5827:1: rulePackageName returns [EObject current=null] : (otherlv_0= 'PackageName' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePackageName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:5833:2: ( (otherlv_0= 'PackageName' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftGalleryLanguage.g:5834:2: (otherlv_0= 'PackageName' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftGalleryLanguage.g:5834:2: (otherlv_0= 'PackageName' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftGalleryLanguage.g:5835:3: otherlv_0= 'PackageName' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,114,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getPackageNameAccess().getPackageNameKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:5839:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:5840:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:5840:4: (lv_name_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:5841:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPackageNameAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPackageNameRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackageName"


    // $ANTLR start "entryRulePackageVersion"
    // InternalSoftGalleryLanguage.g:5861:1: entryRulePackageVersion returns [EObject current=null] : iv_rulePackageVersion= rulePackageVersion EOF ;
    public final EObject entryRulePackageVersion() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageVersion = null;


        try {
            // InternalSoftGalleryLanguage.g:5861:55: (iv_rulePackageVersion= rulePackageVersion EOF )
            // InternalSoftGalleryLanguage.g:5862:2: iv_rulePackageVersion= rulePackageVersion EOF
            {
             newCompositeNode(grammarAccess.getPackageVersionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackageVersion=rulePackageVersion();

            state._fsp--;

             current =iv_rulePackageVersion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackageVersion"


    // $ANTLR start "rulePackageVersion"
    // InternalSoftGalleryLanguage.g:5868:1: rulePackageVersion returns [EObject current=null] : (otherlv_0= 'PackageVersion' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePackageVersion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:5874:2: ( (otherlv_0= 'PackageVersion' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftGalleryLanguage.g:5875:2: (otherlv_0= 'PackageVersion' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftGalleryLanguage.g:5875:2: (otherlv_0= 'PackageVersion' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftGalleryLanguage.g:5876:3: otherlv_0= 'PackageVersion' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,115,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getPackageVersionAccess().getPackageVersionKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:5880:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:5881:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:5881:4: (lv_name_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:5882:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPackageVersionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPackageVersionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackageVersion"


    // $ANTLR start "entryRuleReactConfigurations"
    // InternalSoftGalleryLanguage.g:5902:1: entryRuleReactConfigurations returns [EObject current=null] : iv_ruleReactConfigurations= ruleReactConfigurations EOF ;
    public final EObject entryRuleReactConfigurations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactConfigurations = null;


        try {
            // InternalSoftGalleryLanguage.g:5902:60: (iv_ruleReactConfigurations= ruleReactConfigurations EOF )
            // InternalSoftGalleryLanguage.g:5903:2: iv_ruleReactConfigurations= ruleReactConfigurations EOF
            {
             newCompositeNode(grammarAccess.getReactConfigurationsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReactConfigurations=ruleReactConfigurations();

            state._fsp--;

             current =iv_ruleReactConfigurations; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReactConfigurations"


    // $ANTLR start "ruleReactConfigurations"
    // InternalSoftGalleryLanguage.g:5909:1: ruleReactConfigurations returns [EObject current=null] : (otherlv_0= 'ReactDOMConfigurations' ( (lv_name_1_0= RULE_ID ) ) ( (lv_configurations_2_0= ruleDOMConfigurations ) )+ ) ;
    public final EObject ruleReactConfigurations() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_configurations_2_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:5915:2: ( (otherlv_0= 'ReactDOMConfigurations' ( (lv_name_1_0= RULE_ID ) ) ( (lv_configurations_2_0= ruleDOMConfigurations ) )+ ) )
            // InternalSoftGalleryLanguage.g:5916:2: (otherlv_0= 'ReactDOMConfigurations' ( (lv_name_1_0= RULE_ID ) ) ( (lv_configurations_2_0= ruleDOMConfigurations ) )+ )
            {
            // InternalSoftGalleryLanguage.g:5916:2: (otherlv_0= 'ReactDOMConfigurations' ( (lv_name_1_0= RULE_ID ) ) ( (lv_configurations_2_0= ruleDOMConfigurations ) )+ )
            // InternalSoftGalleryLanguage.g:5917:3: otherlv_0= 'ReactDOMConfigurations' ( (lv_name_1_0= RULE_ID ) ) ( (lv_configurations_2_0= ruleDOMConfigurations ) )+
            {
            otherlv_0=(Token)match(input,116,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getReactConfigurationsAccess().getReactDOMConfigurationsKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:5921:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:5922:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:5922:4: (lv_name_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:5923:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_121); 

            					newLeafNode(lv_name_1_0, grammarAccess.getReactConfigurationsAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReactConfigurationsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSoftGalleryLanguage.g:5939:3: ( (lv_configurations_2_0= ruleDOMConfigurations ) )+
            int cnt33=0;
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=117 && LA33_0<=121)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalSoftGalleryLanguage.g:5940:4: (lv_configurations_2_0= ruleDOMConfigurations )
            	    {
            	    // InternalSoftGalleryLanguage.g:5940:4: (lv_configurations_2_0= ruleDOMConfigurations )
            	    // InternalSoftGalleryLanguage.g:5941:5: lv_configurations_2_0= ruleDOMConfigurations
            	    {

            	    					newCompositeNode(grammarAccess.getReactConfigurationsAccess().getConfigurationsDOMConfigurationsParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_122);
            	    lv_configurations_2_0=ruleDOMConfigurations();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getReactConfigurationsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"configurations",
            	    						lv_configurations_2_0,
            	    						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.DOMConfigurations");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt33 >= 1 ) break loop33;
                        EarlyExitException eee =
                            new EarlyExitException(33, input);
                        throw eee;
                }
                cnt33++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReactConfigurations"


    // $ANTLR start "entryRuleDOMConfigurations"
    // InternalSoftGalleryLanguage.g:5962:1: entryRuleDOMConfigurations returns [EObject current=null] : iv_ruleDOMConfigurations= ruleDOMConfigurations EOF ;
    public final EObject entryRuleDOMConfigurations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDOMConfigurations = null;


        try {
            // InternalSoftGalleryLanguage.g:5962:58: (iv_ruleDOMConfigurations= ruleDOMConfigurations EOF )
            // InternalSoftGalleryLanguage.g:5963:2: iv_ruleDOMConfigurations= ruleDOMConfigurations EOF
            {
             newCompositeNode(grammarAccess.getDOMConfigurationsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDOMConfigurations=ruleDOMConfigurations();

            state._fsp--;

             current =iv_ruleDOMConfigurations; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDOMConfigurations"


    // $ANTLR start "ruleDOMConfigurations"
    // InternalSoftGalleryLanguage.g:5969:1: ruleDOMConfigurations returns [EObject current=null] : ( ( (lv_elements_0_0= ruleDOMTypeConf ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDOMConfigurations() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:5975:2: ( ( ( (lv_elements_0_0= ruleDOMTypeConf ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftGalleryLanguage.g:5976:2: ( ( (lv_elements_0_0= ruleDOMTypeConf ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftGalleryLanguage.g:5976:2: ( ( (lv_elements_0_0= ruleDOMTypeConf ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftGalleryLanguage.g:5977:3: ( (lv_elements_0_0= ruleDOMTypeConf ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalSoftGalleryLanguage.g:5977:3: ( (lv_elements_0_0= ruleDOMTypeConf ) )
            // InternalSoftGalleryLanguage.g:5978:4: (lv_elements_0_0= ruleDOMTypeConf )
            {
            // InternalSoftGalleryLanguage.g:5978:4: (lv_elements_0_0= ruleDOMTypeConf )
            // InternalSoftGalleryLanguage.g:5979:5: lv_elements_0_0= ruleDOMTypeConf
            {

            					newCompositeNode(grammarAccess.getDOMConfigurationsAccess().getElementsDOMTypeConfParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
            lv_elements_0_0=ruleDOMTypeConf();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDOMConfigurationsRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_0_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.DOMTypeConf");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftGalleryLanguage.g:5996:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:5997:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:5997:4: (lv_name_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:5998:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDOMConfigurationsAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDOMConfigurationsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDOMConfigurations"


    // $ANTLR start "entryRuleDOMTypeConf"
    // InternalSoftGalleryLanguage.g:6018:1: entryRuleDOMTypeConf returns [String current=null] : iv_ruleDOMTypeConf= ruleDOMTypeConf EOF ;
    public final String entryRuleDOMTypeConf() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOMTypeConf = null;


        try {
            // InternalSoftGalleryLanguage.g:6018:51: (iv_ruleDOMTypeConf= ruleDOMTypeConf EOF )
            // InternalSoftGalleryLanguage.g:6019:2: iv_ruleDOMTypeConf= ruleDOMTypeConf EOF
            {
             newCompositeNode(grammarAccess.getDOMTypeConfRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDOMTypeConf=ruleDOMTypeConf();

            state._fsp--;

             current =iv_ruleDOMTypeConf.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDOMTypeConf"


    // $ANTLR start "ruleDOMTypeConf"
    // InternalSoftGalleryLanguage.g:6025:1: ruleDOMTypeConf returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'RoutingConf' | kw= 'ServiceWorker' | kw= 'HTMLStructure' | kw= 'Manifest' | kw= 'RepositoriesConf' ) ;
    public final AntlrDatatypeRuleToken ruleDOMTypeConf() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:6031:2: ( (kw= 'RoutingConf' | kw= 'ServiceWorker' | kw= 'HTMLStructure' | kw= 'Manifest' | kw= 'RepositoriesConf' ) )
            // InternalSoftGalleryLanguage.g:6032:2: (kw= 'RoutingConf' | kw= 'ServiceWorker' | kw= 'HTMLStructure' | kw= 'Manifest' | kw= 'RepositoriesConf' )
            {
            // InternalSoftGalleryLanguage.g:6032:2: (kw= 'RoutingConf' | kw= 'ServiceWorker' | kw= 'HTMLStructure' | kw= 'Manifest' | kw= 'RepositoriesConf' )
            int alt34=5;
            switch ( input.LA(1) ) {
            case 117:
                {
                alt34=1;
                }
                break;
            case 118:
                {
                alt34=2;
                }
                break;
            case 119:
                {
                alt34=3;
                }
                break;
            case 120:
                {
                alt34=4;
                }
                break;
            case 121:
                {
                alt34=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalSoftGalleryLanguage.g:6033:3: kw= 'RoutingConf'
                    {
                    kw=(Token)match(input,117,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDOMTypeConfAccess().getRoutingConfKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSoftGalleryLanguage.g:6039:3: kw= 'ServiceWorker'
                    {
                    kw=(Token)match(input,118,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDOMTypeConfAccess().getServiceWorkerKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSoftGalleryLanguage.g:6045:3: kw= 'HTMLStructure'
                    {
                    kw=(Token)match(input,119,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDOMTypeConfAccess().getHTMLStructureKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalSoftGalleryLanguage.g:6051:3: kw= 'Manifest'
                    {
                    kw=(Token)match(input,120,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDOMTypeConfAccess().getManifestKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalSoftGalleryLanguage.g:6057:3: kw= 'RepositoriesConf'
                    {
                    kw=(Token)match(input,121,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDOMTypeConfAccess().getRepositoriesConfKeyword_4());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDOMTypeConf"


    // $ANTLR start "entryRuleReactComponents"
    // InternalSoftGalleryLanguage.g:6066:1: entryRuleReactComponents returns [EObject current=null] : iv_ruleReactComponents= ruleReactComponents EOF ;
    public final EObject entryRuleReactComponents() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactComponents = null;


        try {
            // InternalSoftGalleryLanguage.g:6066:56: (iv_ruleReactComponents= ruleReactComponents EOF )
            // InternalSoftGalleryLanguage.g:6067:2: iv_ruleReactComponents= ruleReactComponents EOF
            {
             newCompositeNode(grammarAccess.getReactComponentsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReactComponents=ruleReactComponents();

            state._fsp--;

             current =iv_ruleReactComponents; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReactComponents"


    // $ANTLR start "ruleReactComponents"
    // InternalSoftGalleryLanguage.g:6073:1: ruleReactComponents returns [EObject current=null] : (otherlv_0= 'ReactComponents' otherlv_1= ':' otherlv_2= '{' ( (lv_componentslogic_3_0= ruleComponentsLogic ) ) ( (lv_componentsui_4_0= ruleComponentsUI ) ) otherlv_5= '}' ) ;
    public final EObject ruleReactComponents() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_componentslogic_3_0 = null;

        EObject lv_componentsui_4_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:6079:2: ( (otherlv_0= 'ReactComponents' otherlv_1= ':' otherlv_2= '{' ( (lv_componentslogic_3_0= ruleComponentsLogic ) ) ( (lv_componentsui_4_0= ruleComponentsUI ) ) otherlv_5= '}' ) )
            // InternalSoftGalleryLanguage.g:6080:2: (otherlv_0= 'ReactComponents' otherlv_1= ':' otherlv_2= '{' ( (lv_componentslogic_3_0= ruleComponentsLogic ) ) ( (lv_componentsui_4_0= ruleComponentsUI ) ) otherlv_5= '}' )
            {
            // InternalSoftGalleryLanguage.g:6080:2: (otherlv_0= 'ReactComponents' otherlv_1= ':' otherlv_2= '{' ( (lv_componentslogic_3_0= ruleComponentsLogic ) ) ( (lv_componentsui_4_0= ruleComponentsUI ) ) otherlv_5= '}' )
            // InternalSoftGalleryLanguage.g:6081:3: otherlv_0= 'ReactComponents' otherlv_1= ':' otherlv_2= '{' ( (lv_componentslogic_3_0= ruleComponentsLogic ) ) ( (lv_componentsui_4_0= ruleComponentsUI ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,122,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getReactComponentsAccess().getReactComponentsKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getReactComponentsAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_123); 

            			newLeafNode(otherlv_2, grammarAccess.getReactComponentsAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSoftGalleryLanguage.g:6093:3: ( (lv_componentslogic_3_0= ruleComponentsLogic ) )
            // InternalSoftGalleryLanguage.g:6094:4: (lv_componentslogic_3_0= ruleComponentsLogic )
            {
            // InternalSoftGalleryLanguage.g:6094:4: (lv_componentslogic_3_0= ruleComponentsLogic )
            // InternalSoftGalleryLanguage.g:6095:5: lv_componentslogic_3_0= ruleComponentsLogic
            {

            					newCompositeNode(grammarAccess.getReactComponentsAccess().getComponentslogicComponentsLogicParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_124);
            lv_componentslogic_3_0=ruleComponentsLogic();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReactComponentsRule());
            					}
            					add(
            						current,
            						"componentslogic",
            						lv_componentslogic_3_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.ComponentsLogic");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftGalleryLanguage.g:6112:3: ( (lv_componentsui_4_0= ruleComponentsUI ) )
            // InternalSoftGalleryLanguage.g:6113:4: (lv_componentsui_4_0= ruleComponentsUI )
            {
            // InternalSoftGalleryLanguage.g:6113:4: (lv_componentsui_4_0= ruleComponentsUI )
            // InternalSoftGalleryLanguage.g:6114:5: lv_componentsui_4_0= ruleComponentsUI
            {

            					newCompositeNode(grammarAccess.getReactComponentsAccess().getComponentsuiComponentsUIParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_componentsui_4_0=ruleComponentsUI();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReactComponentsRule());
            					}
            					add(
            						current,
            						"componentsui",
            						lv_componentsui_4_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.ComponentsUI");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getReactComponentsAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReactComponents"


    // $ANTLR start "entryRuleComponentsLogic"
    // InternalSoftGalleryLanguage.g:6139:1: entryRuleComponentsLogic returns [EObject current=null] : iv_ruleComponentsLogic= ruleComponentsLogic EOF ;
    public final EObject entryRuleComponentsLogic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentsLogic = null;


        try {
            // InternalSoftGalleryLanguage.g:6139:56: (iv_ruleComponentsLogic= ruleComponentsLogic EOF )
            // InternalSoftGalleryLanguage.g:6140:2: iv_ruleComponentsLogic= ruleComponentsLogic EOF
            {
             newCompositeNode(grammarAccess.getComponentsLogicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentsLogic=ruleComponentsLogic();

            state._fsp--;

             current =iv_ruleComponentsLogic; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponentsLogic"


    // $ANTLR start "ruleComponentsLogic"
    // InternalSoftGalleryLanguage.g:6146:1: ruleComponentsLogic returns [EObject current=null] : (otherlv_0= 'LogicComponents' ( (lv_name_1_0= RULE_ID ) ) ( (lv_logiccomponents_2_0= ruleLogicContent ) ) ) ;
    public final EObject ruleComponentsLogic() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_logiccomponents_2_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:6152:2: ( (otherlv_0= 'LogicComponents' ( (lv_name_1_0= RULE_ID ) ) ( (lv_logiccomponents_2_0= ruleLogicContent ) ) ) )
            // InternalSoftGalleryLanguage.g:6153:2: (otherlv_0= 'LogicComponents' ( (lv_name_1_0= RULE_ID ) ) ( (lv_logiccomponents_2_0= ruleLogicContent ) ) )
            {
            // InternalSoftGalleryLanguage.g:6153:2: (otherlv_0= 'LogicComponents' ( (lv_name_1_0= RULE_ID ) ) ( (lv_logiccomponents_2_0= ruleLogicContent ) ) )
            // InternalSoftGalleryLanguage.g:6154:3: otherlv_0= 'LogicComponents' ( (lv_name_1_0= RULE_ID ) ) ( (lv_logiccomponents_2_0= ruleLogicContent ) )
            {
            otherlv_0=(Token)match(input,123,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentsLogicAccess().getLogicComponentsKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:6158:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:6159:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:6159:4: (lv_name_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:6160:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_125); 

            					newLeafNode(lv_name_1_0, grammarAccess.getComponentsLogicAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentsLogicRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSoftGalleryLanguage.g:6176:3: ( (lv_logiccomponents_2_0= ruleLogicContent ) )
            // InternalSoftGalleryLanguage.g:6177:4: (lv_logiccomponents_2_0= ruleLogicContent )
            {
            // InternalSoftGalleryLanguage.g:6177:4: (lv_logiccomponents_2_0= ruleLogicContent )
            // InternalSoftGalleryLanguage.g:6178:5: lv_logiccomponents_2_0= ruleLogicContent
            {

            					newCompositeNode(grammarAccess.getComponentsLogicAccess().getLogiccomponentsLogicContentParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_logiccomponents_2_0=ruleLogicContent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentsLogicRule());
            					}
            					add(
            						current,
            						"logiccomponents",
            						lv_logiccomponents_2_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.LogicContent");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponentsLogic"


    // $ANTLR start "entryRuleLogicContent"
    // InternalSoftGalleryLanguage.g:6199:1: entryRuleLogicContent returns [EObject current=null] : iv_ruleLogicContent= ruleLogicContent EOF ;
    public final EObject entryRuleLogicContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicContent = null;


        try {
            // InternalSoftGalleryLanguage.g:6199:53: (iv_ruleLogicContent= ruleLogicContent EOF )
            // InternalSoftGalleryLanguage.g:6200:2: iv_ruleLogicContent= ruleLogicContent EOF
            {
             newCompositeNode(grammarAccess.getLogicContentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicContent=ruleLogicContent();

            state._fsp--;

             current =iv_ruleLogicContent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicContent"


    // $ANTLR start "ruleLogicContent"
    // InternalSoftGalleryLanguage.g:6206:1: ruleLogicContent returns [EObject current=null] : (otherlv_0= 'RoutingComponents' ( (lv_name_1_0= RULE_ID ) ) ( (lv_logiccomponents_2_0= ruleLogicStructure ) ) ) ;
    public final EObject ruleLogicContent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_logiccomponents_2_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:6212:2: ( (otherlv_0= 'RoutingComponents' ( (lv_name_1_0= RULE_ID ) ) ( (lv_logiccomponents_2_0= ruleLogicStructure ) ) ) )
            // InternalSoftGalleryLanguage.g:6213:2: (otherlv_0= 'RoutingComponents' ( (lv_name_1_0= RULE_ID ) ) ( (lv_logiccomponents_2_0= ruleLogicStructure ) ) )
            {
            // InternalSoftGalleryLanguage.g:6213:2: (otherlv_0= 'RoutingComponents' ( (lv_name_1_0= RULE_ID ) ) ( (lv_logiccomponents_2_0= ruleLogicStructure ) ) )
            // InternalSoftGalleryLanguage.g:6214:3: otherlv_0= 'RoutingComponents' ( (lv_name_1_0= RULE_ID ) ) ( (lv_logiccomponents_2_0= ruleLogicStructure ) )
            {
            otherlv_0=(Token)match(input,124,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicContentAccess().getRoutingComponentsKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:6218:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:6219:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:6219:4: (lv_name_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:6220:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_126); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLogicContentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicContentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSoftGalleryLanguage.g:6236:3: ( (lv_logiccomponents_2_0= ruleLogicStructure ) )
            // InternalSoftGalleryLanguage.g:6237:4: (lv_logiccomponents_2_0= ruleLogicStructure )
            {
            // InternalSoftGalleryLanguage.g:6237:4: (lv_logiccomponents_2_0= ruleLogicStructure )
            // InternalSoftGalleryLanguage.g:6238:5: lv_logiccomponents_2_0= ruleLogicStructure
            {

            					newCompositeNode(grammarAccess.getLogicContentAccess().getLogiccomponentsLogicStructureParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_logiccomponents_2_0=ruleLogicStructure();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLogicContentRule());
            					}
            					add(
            						current,
            						"logiccomponents",
            						lv_logiccomponents_2_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.LogicStructure");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogicContent"


    // $ANTLR start "entryRuleLogicStructure"
    // InternalSoftGalleryLanguage.g:6259:1: entryRuleLogicStructure returns [EObject current=null] : iv_ruleLogicStructure= ruleLogicStructure EOF ;
    public final EObject entryRuleLogicStructure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicStructure = null;


        try {
            // InternalSoftGalleryLanguage.g:6259:55: (iv_ruleLogicStructure= ruleLogicStructure EOF )
            // InternalSoftGalleryLanguage.g:6260:2: iv_ruleLogicStructure= ruleLogicStructure EOF
            {
             newCompositeNode(grammarAccess.getLogicStructureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicStructure=ruleLogicStructure();

            state._fsp--;

             current =iv_ruleLogicStructure; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicStructure"


    // $ANTLR start "ruleLogicStructure"
    // InternalSoftGalleryLanguage.g:6266:1: ruleLogicStructure returns [EObject current=null] : (otherlv_0= 'AppComponent' ( (lv_appComName_1_0= RULE_ID ) ) ( (lv_logiccomponents_2_0= ruleComponentClass ) ) otherlv_3= 'IndexComponent' ( (lv_indexCompName_4_0= RULE_ID ) ) ) ;
    public final EObject ruleLogicStructure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_appComName_1_0=null;
        Token otherlv_3=null;
        Token lv_indexCompName_4_0=null;
        EObject lv_logiccomponents_2_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:6272:2: ( (otherlv_0= 'AppComponent' ( (lv_appComName_1_0= RULE_ID ) ) ( (lv_logiccomponents_2_0= ruleComponentClass ) ) otherlv_3= 'IndexComponent' ( (lv_indexCompName_4_0= RULE_ID ) ) ) )
            // InternalSoftGalleryLanguage.g:6273:2: (otherlv_0= 'AppComponent' ( (lv_appComName_1_0= RULE_ID ) ) ( (lv_logiccomponents_2_0= ruleComponentClass ) ) otherlv_3= 'IndexComponent' ( (lv_indexCompName_4_0= RULE_ID ) ) )
            {
            // InternalSoftGalleryLanguage.g:6273:2: (otherlv_0= 'AppComponent' ( (lv_appComName_1_0= RULE_ID ) ) ( (lv_logiccomponents_2_0= ruleComponentClass ) ) otherlv_3= 'IndexComponent' ( (lv_indexCompName_4_0= RULE_ID ) ) )
            // InternalSoftGalleryLanguage.g:6274:3: otherlv_0= 'AppComponent' ( (lv_appComName_1_0= RULE_ID ) ) ( (lv_logiccomponents_2_0= ruleComponentClass ) ) otherlv_3= 'IndexComponent' ( (lv_indexCompName_4_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,125,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicStructureAccess().getAppComponentKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:6278:3: ( (lv_appComName_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:6279:4: (lv_appComName_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:6279:4: (lv_appComName_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:6280:5: lv_appComName_1_0= RULE_ID
            {
            lv_appComName_1_0=(Token)match(input,RULE_ID,FOLLOW_127); 

            					newLeafNode(lv_appComName_1_0, grammarAccess.getLogicStructureAccess().getAppComNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicStructureRule());
            					}
            					setWithLastConsumed(
            						current,
            						"appComName",
            						lv_appComName_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSoftGalleryLanguage.g:6296:3: ( (lv_logiccomponents_2_0= ruleComponentClass ) )
            // InternalSoftGalleryLanguage.g:6297:4: (lv_logiccomponents_2_0= ruleComponentClass )
            {
            // InternalSoftGalleryLanguage.g:6297:4: (lv_logiccomponents_2_0= ruleComponentClass )
            // InternalSoftGalleryLanguage.g:6298:5: lv_logiccomponents_2_0= ruleComponentClass
            {

            					newCompositeNode(grammarAccess.getLogicStructureAccess().getLogiccomponentsComponentClassParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_128);
            lv_logiccomponents_2_0=ruleComponentClass();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLogicStructureRule());
            					}
            					add(
            						current,
            						"logiccomponents",
            						lv_logiccomponents_2_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.ComponentClass");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,126,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getLogicStructureAccess().getIndexComponentKeyword_3());
            		
            // InternalSoftGalleryLanguage.g:6319:3: ( (lv_indexCompName_4_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:6320:4: (lv_indexCompName_4_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:6320:4: (lv_indexCompName_4_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:6321:5: lv_indexCompName_4_0= RULE_ID
            {
            lv_indexCompName_4_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_indexCompName_4_0, grammarAccess.getLogicStructureAccess().getIndexCompNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicStructureRule());
            					}
            					setWithLastConsumed(
            						current,
            						"indexCompName",
            						lv_indexCompName_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogicStructure"


    // $ANTLR start "entryRuleComponentsUI"
    // InternalSoftGalleryLanguage.g:6341:1: entryRuleComponentsUI returns [EObject current=null] : iv_ruleComponentsUI= ruleComponentsUI EOF ;
    public final EObject entryRuleComponentsUI() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentsUI = null;


        try {
            // InternalSoftGalleryLanguage.g:6341:53: (iv_ruleComponentsUI= ruleComponentsUI EOF )
            // InternalSoftGalleryLanguage.g:6342:2: iv_ruleComponentsUI= ruleComponentsUI EOF
            {
             newCompositeNode(grammarAccess.getComponentsUIRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentsUI=ruleComponentsUI();

            state._fsp--;

             current =iv_ruleComponentsUI; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponentsUI"


    // $ANTLR start "ruleComponentsUI"
    // InternalSoftGalleryLanguage.g:6348:1: ruleComponentsUI returns [EObject current=null] : (otherlv_0= 'UIComponents' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uicomponents_2_0= ruleUIContent ) ) ) ;
    public final EObject ruleComponentsUI() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_uicomponents_2_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:6354:2: ( (otherlv_0= 'UIComponents' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uicomponents_2_0= ruleUIContent ) ) ) )
            // InternalSoftGalleryLanguage.g:6355:2: (otherlv_0= 'UIComponents' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uicomponents_2_0= ruleUIContent ) ) )
            {
            // InternalSoftGalleryLanguage.g:6355:2: (otherlv_0= 'UIComponents' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uicomponents_2_0= ruleUIContent ) ) )
            // InternalSoftGalleryLanguage.g:6356:3: otherlv_0= 'UIComponents' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uicomponents_2_0= ruleUIContent ) )
            {
            otherlv_0=(Token)match(input,127,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentsUIAccess().getUIComponentsKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:6360:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:6361:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:6361:4: (lv_name_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:6362:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_129); 

            					newLeafNode(lv_name_1_0, grammarAccess.getComponentsUIAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentsUIRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSoftGalleryLanguage.g:6378:3: ( (lv_uicomponents_2_0= ruleUIContent ) )
            // InternalSoftGalleryLanguage.g:6379:4: (lv_uicomponents_2_0= ruleUIContent )
            {
            // InternalSoftGalleryLanguage.g:6379:4: (lv_uicomponents_2_0= ruleUIContent )
            // InternalSoftGalleryLanguage.g:6380:5: lv_uicomponents_2_0= ruleUIContent
            {

            					newCompositeNode(grammarAccess.getComponentsUIAccess().getUicomponentsUIContentParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_uicomponents_2_0=ruleUIContent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentsUIRule());
            					}
            					add(
            						current,
            						"uicomponents",
            						lv_uicomponents_2_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.UIContent");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponentsUI"


    // $ANTLR start "entryRuleUIContent"
    // InternalSoftGalleryLanguage.g:6401:1: entryRuleUIContent returns [EObject current=null] : iv_ruleUIContent= ruleUIContent EOF ;
    public final EObject entryRuleUIContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIContent = null;


        try {
            // InternalSoftGalleryLanguage.g:6401:50: (iv_ruleUIContent= ruleUIContent EOF )
            // InternalSoftGalleryLanguage.g:6402:2: iv_ruleUIContent= ruleUIContent EOF
            {
             newCompositeNode(grammarAccess.getUIContentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUIContent=ruleUIContent();

            state._fsp--;

             current =iv_ruleUIContent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUIContent"


    // $ANTLR start "ruleUIContent"
    // InternalSoftGalleryLanguage.g:6408:1: ruleUIContent returns [EObject current=null] : ( ( (lv_componentcontent_0_0= ruleViewComponentCont ) )+ ( (lv_subcomponentcontent_1_0= ruleSubcomponentCont ) )+ ) ;
    public final EObject ruleUIContent() throws RecognitionException {
        EObject current = null;

        EObject lv_componentcontent_0_0 = null;

        EObject lv_subcomponentcontent_1_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:6414:2: ( ( ( (lv_componentcontent_0_0= ruleViewComponentCont ) )+ ( (lv_subcomponentcontent_1_0= ruleSubcomponentCont ) )+ ) )
            // InternalSoftGalleryLanguage.g:6415:2: ( ( (lv_componentcontent_0_0= ruleViewComponentCont ) )+ ( (lv_subcomponentcontent_1_0= ruleSubcomponentCont ) )+ )
            {
            // InternalSoftGalleryLanguage.g:6415:2: ( ( (lv_componentcontent_0_0= ruleViewComponentCont ) )+ ( (lv_subcomponentcontent_1_0= ruleSubcomponentCont ) )+ )
            // InternalSoftGalleryLanguage.g:6416:3: ( (lv_componentcontent_0_0= ruleViewComponentCont ) )+ ( (lv_subcomponentcontent_1_0= ruleSubcomponentCont ) )+
            {
            // InternalSoftGalleryLanguage.g:6416:3: ( (lv_componentcontent_0_0= ruleViewComponentCont ) )+
            int cnt35=0;
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==128) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalSoftGalleryLanguage.g:6417:4: (lv_componentcontent_0_0= ruleViewComponentCont )
            	    {
            	    // InternalSoftGalleryLanguage.g:6417:4: (lv_componentcontent_0_0= ruleViewComponentCont )
            	    // InternalSoftGalleryLanguage.g:6418:5: lv_componentcontent_0_0= ruleViewComponentCont
            	    {

            	    					newCompositeNode(grammarAccess.getUIContentAccess().getComponentcontentViewComponentContParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_130);
            	    lv_componentcontent_0_0=ruleViewComponentCont();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getUIContentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"componentcontent",
            	    						lv_componentcontent_0_0,
            	    						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.ViewComponentCont");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt35 >= 1 ) break loop35;
                        EarlyExitException eee =
                            new EarlyExitException(35, input);
                        throw eee;
                }
                cnt35++;
            } while (true);

            // InternalSoftGalleryLanguage.g:6435:3: ( (lv_subcomponentcontent_1_0= ruleSubcomponentCont ) )+
            int cnt36=0;
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==129) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalSoftGalleryLanguage.g:6436:4: (lv_subcomponentcontent_1_0= ruleSubcomponentCont )
            	    {
            	    // InternalSoftGalleryLanguage.g:6436:4: (lv_subcomponentcontent_1_0= ruleSubcomponentCont )
            	    // InternalSoftGalleryLanguage.g:6437:5: lv_subcomponentcontent_1_0= ruleSubcomponentCont
            	    {

            	    					newCompositeNode(grammarAccess.getUIContentAccess().getSubcomponentcontentSubcomponentContParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_131);
            	    lv_subcomponentcontent_1_0=ruleSubcomponentCont();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getUIContentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"subcomponentcontent",
            	    						lv_subcomponentcontent_1_0,
            	    						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.SubcomponentCont");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt36 >= 1 ) break loop36;
                        EarlyExitException eee =
                            new EarlyExitException(36, input);
                        throw eee;
                }
                cnt36++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUIContent"


    // $ANTLR start "entryRuleViewComponentCont"
    // InternalSoftGalleryLanguage.g:6458:1: entryRuleViewComponentCont returns [EObject current=null] : iv_ruleViewComponentCont= ruleViewComponentCont EOF ;
    public final EObject entryRuleViewComponentCont() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViewComponentCont = null;


        try {
            // InternalSoftGalleryLanguage.g:6458:58: (iv_ruleViewComponentCont= ruleViewComponentCont EOF )
            // InternalSoftGalleryLanguage.g:6459:2: iv_ruleViewComponentCont= ruleViewComponentCont EOF
            {
             newCompositeNode(grammarAccess.getViewComponentContRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleViewComponentCont=ruleViewComponentCont();

            state._fsp--;

             current =iv_ruleViewComponentCont; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleViewComponentCont"


    // $ANTLR start "ruleViewComponentCont"
    // InternalSoftGalleryLanguage.g:6465:1: ruleViewComponentCont returns [EObject current=null] : (otherlv_0= 'ViewComponent' ( (lv_nameView_1_0= RULE_ID ) ) ( (lv_uicontent_2_0= ruleComponentClass ) ) ) ;
    public final EObject ruleViewComponentCont() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nameView_1_0=null;
        EObject lv_uicontent_2_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:6471:2: ( (otherlv_0= 'ViewComponent' ( (lv_nameView_1_0= RULE_ID ) ) ( (lv_uicontent_2_0= ruleComponentClass ) ) ) )
            // InternalSoftGalleryLanguage.g:6472:2: (otherlv_0= 'ViewComponent' ( (lv_nameView_1_0= RULE_ID ) ) ( (lv_uicontent_2_0= ruleComponentClass ) ) )
            {
            // InternalSoftGalleryLanguage.g:6472:2: (otherlv_0= 'ViewComponent' ( (lv_nameView_1_0= RULE_ID ) ) ( (lv_uicontent_2_0= ruleComponentClass ) ) )
            // InternalSoftGalleryLanguage.g:6473:3: otherlv_0= 'ViewComponent' ( (lv_nameView_1_0= RULE_ID ) ) ( (lv_uicontent_2_0= ruleComponentClass ) )
            {
            otherlv_0=(Token)match(input,128,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getViewComponentContAccess().getViewComponentKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:6477:3: ( (lv_nameView_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:6478:4: (lv_nameView_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:6478:4: (lv_nameView_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:6479:5: lv_nameView_1_0= RULE_ID
            {
            lv_nameView_1_0=(Token)match(input,RULE_ID,FOLLOW_127); 

            					newLeafNode(lv_nameView_1_0, grammarAccess.getViewComponentContAccess().getNameViewIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getViewComponentContRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nameView",
            						lv_nameView_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSoftGalleryLanguage.g:6495:3: ( (lv_uicontent_2_0= ruleComponentClass ) )
            // InternalSoftGalleryLanguage.g:6496:4: (lv_uicontent_2_0= ruleComponentClass )
            {
            // InternalSoftGalleryLanguage.g:6496:4: (lv_uicontent_2_0= ruleComponentClass )
            // InternalSoftGalleryLanguage.g:6497:5: lv_uicontent_2_0= ruleComponentClass
            {

            					newCompositeNode(grammarAccess.getViewComponentContAccess().getUicontentComponentClassParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_uicontent_2_0=ruleComponentClass();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getViewComponentContRule());
            					}
            					add(
            						current,
            						"uicontent",
            						lv_uicontent_2_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.ComponentClass");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleViewComponentCont"


    // $ANTLR start "entryRuleSubcomponentCont"
    // InternalSoftGalleryLanguage.g:6518:1: entryRuleSubcomponentCont returns [EObject current=null] : iv_ruleSubcomponentCont= ruleSubcomponentCont EOF ;
    public final EObject entryRuleSubcomponentCont() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubcomponentCont = null;


        try {
            // InternalSoftGalleryLanguage.g:6518:57: (iv_ruleSubcomponentCont= ruleSubcomponentCont EOF )
            // InternalSoftGalleryLanguage.g:6519:2: iv_ruleSubcomponentCont= ruleSubcomponentCont EOF
            {
             newCompositeNode(grammarAccess.getSubcomponentContRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubcomponentCont=ruleSubcomponentCont();

            state._fsp--;

             current =iv_ruleSubcomponentCont; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubcomponentCont"


    // $ANTLR start "ruleSubcomponentCont"
    // InternalSoftGalleryLanguage.g:6525:1: ruleSubcomponentCont returns [EObject current=null] : (otherlv_0= 'Subcomponents' ( (lv_nameSubComp_1_0= RULE_ID ) ) ( (lv_uicontent_2_0= ruleComponentClass ) ) ) ;
    public final EObject ruleSubcomponentCont() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nameSubComp_1_0=null;
        EObject lv_uicontent_2_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:6531:2: ( (otherlv_0= 'Subcomponents' ( (lv_nameSubComp_1_0= RULE_ID ) ) ( (lv_uicontent_2_0= ruleComponentClass ) ) ) )
            // InternalSoftGalleryLanguage.g:6532:2: (otherlv_0= 'Subcomponents' ( (lv_nameSubComp_1_0= RULE_ID ) ) ( (lv_uicontent_2_0= ruleComponentClass ) ) )
            {
            // InternalSoftGalleryLanguage.g:6532:2: (otherlv_0= 'Subcomponents' ( (lv_nameSubComp_1_0= RULE_ID ) ) ( (lv_uicontent_2_0= ruleComponentClass ) ) )
            // InternalSoftGalleryLanguage.g:6533:3: otherlv_0= 'Subcomponents' ( (lv_nameSubComp_1_0= RULE_ID ) ) ( (lv_uicontent_2_0= ruleComponentClass ) )
            {
            otherlv_0=(Token)match(input,129,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getSubcomponentContAccess().getSubcomponentsKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:6537:3: ( (lv_nameSubComp_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:6538:4: (lv_nameSubComp_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:6538:4: (lv_nameSubComp_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:6539:5: lv_nameSubComp_1_0= RULE_ID
            {
            lv_nameSubComp_1_0=(Token)match(input,RULE_ID,FOLLOW_127); 

            					newLeafNode(lv_nameSubComp_1_0, grammarAccess.getSubcomponentContAccess().getNameSubCompIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubcomponentContRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nameSubComp",
            						lv_nameSubComp_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSoftGalleryLanguage.g:6555:3: ( (lv_uicontent_2_0= ruleComponentClass ) )
            // InternalSoftGalleryLanguage.g:6556:4: (lv_uicontent_2_0= ruleComponentClass )
            {
            // InternalSoftGalleryLanguage.g:6556:4: (lv_uicontent_2_0= ruleComponentClass )
            // InternalSoftGalleryLanguage.g:6557:5: lv_uicontent_2_0= ruleComponentClass
            {

            					newCompositeNode(grammarAccess.getSubcomponentContAccess().getUicontentComponentClassParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_uicontent_2_0=ruleComponentClass();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubcomponentContRule());
            					}
            					add(
            						current,
            						"uicontent",
            						lv_uicontent_2_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.ComponentClass");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubcomponentCont"


    // $ANTLR start "entryRuleComponentClass"
    // InternalSoftGalleryLanguage.g:6578:1: entryRuleComponentClass returns [EObject current=null] : iv_ruleComponentClass= ruleComponentClass EOF ;
    public final EObject entryRuleComponentClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentClass = null;


        try {
            // InternalSoftGalleryLanguage.g:6578:55: (iv_ruleComponentClass= ruleComponentClass EOF )
            // InternalSoftGalleryLanguage.g:6579:2: iv_ruleComponentClass= ruleComponentClass EOF
            {
             newCompositeNode(grammarAccess.getComponentClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentClass=ruleComponentClass();

            state._fsp--;

             current =iv_ruleComponentClass; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponentClass"


    // $ANTLR start "ruleComponentClass"
    // InternalSoftGalleryLanguage.g:6585:1: ruleComponentClass returns [EObject current=null] : ( ( (lv_componentclassimp_0_0= ruleReactImports ) ) ( (lv_componentclassfunc_1_0= ruleReactFunctions ) ) ( (lv_componentclassprop_2_0= ruleProps ) ) ) ;
    public final EObject ruleComponentClass() throws RecognitionException {
        EObject current = null;

        EObject lv_componentclassimp_0_0 = null;

        EObject lv_componentclassfunc_1_0 = null;

        EObject lv_componentclassprop_2_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:6591:2: ( ( ( (lv_componentclassimp_0_0= ruleReactImports ) ) ( (lv_componentclassfunc_1_0= ruleReactFunctions ) ) ( (lv_componentclassprop_2_0= ruleProps ) ) ) )
            // InternalSoftGalleryLanguage.g:6592:2: ( ( (lv_componentclassimp_0_0= ruleReactImports ) ) ( (lv_componentclassfunc_1_0= ruleReactFunctions ) ) ( (lv_componentclassprop_2_0= ruleProps ) ) )
            {
            // InternalSoftGalleryLanguage.g:6592:2: ( ( (lv_componentclassimp_0_0= ruleReactImports ) ) ( (lv_componentclassfunc_1_0= ruleReactFunctions ) ) ( (lv_componentclassprop_2_0= ruleProps ) ) )
            // InternalSoftGalleryLanguage.g:6593:3: ( (lv_componentclassimp_0_0= ruleReactImports ) ) ( (lv_componentclassfunc_1_0= ruleReactFunctions ) ) ( (lv_componentclassprop_2_0= ruleProps ) )
            {
            // InternalSoftGalleryLanguage.g:6593:3: ( (lv_componentclassimp_0_0= ruleReactImports ) )
            // InternalSoftGalleryLanguage.g:6594:4: (lv_componentclassimp_0_0= ruleReactImports )
            {
            // InternalSoftGalleryLanguage.g:6594:4: (lv_componentclassimp_0_0= ruleReactImports )
            // InternalSoftGalleryLanguage.g:6595:5: lv_componentclassimp_0_0= ruleReactImports
            {

            					newCompositeNode(grammarAccess.getComponentClassAccess().getComponentclassimpReactImportsParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_127);
            lv_componentclassimp_0_0=ruleReactImports();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentClassRule());
            					}
            					add(
            						current,
            						"componentclassimp",
            						lv_componentclassimp_0_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.ReactImports");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftGalleryLanguage.g:6612:3: ( (lv_componentclassfunc_1_0= ruleReactFunctions ) )
            // InternalSoftGalleryLanguage.g:6613:4: (lv_componentclassfunc_1_0= ruleReactFunctions )
            {
            // InternalSoftGalleryLanguage.g:6613:4: (lv_componentclassfunc_1_0= ruleReactFunctions )
            // InternalSoftGalleryLanguage.g:6614:5: lv_componentclassfunc_1_0= ruleReactFunctions
            {

            					newCompositeNode(grammarAccess.getComponentClassAccess().getComponentclassfuncReactFunctionsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_132);
            lv_componentclassfunc_1_0=ruleReactFunctions();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentClassRule());
            					}
            					add(
            						current,
            						"componentclassfunc",
            						lv_componentclassfunc_1_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.ReactFunctions");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftGalleryLanguage.g:6631:3: ( (lv_componentclassprop_2_0= ruleProps ) )
            // InternalSoftGalleryLanguage.g:6632:4: (lv_componentclassprop_2_0= ruleProps )
            {
            // InternalSoftGalleryLanguage.g:6632:4: (lv_componentclassprop_2_0= ruleProps )
            // InternalSoftGalleryLanguage.g:6633:5: lv_componentclassprop_2_0= ruleProps
            {

            					newCompositeNode(grammarAccess.getComponentClassAccess().getComponentclasspropPropsParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_componentclassprop_2_0=ruleProps();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentClassRule());
            					}
            					add(
            						current,
            						"componentclassprop",
            						lv_componentclassprop_2_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.Props");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponentClass"


    // $ANTLR start "entryRuleReactImports"
    // InternalSoftGalleryLanguage.g:6654:1: entryRuleReactImports returns [EObject current=null] : iv_ruleReactImports= ruleReactImports EOF ;
    public final EObject entryRuleReactImports() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactImports = null;


        try {
            // InternalSoftGalleryLanguage.g:6654:53: (iv_ruleReactImports= ruleReactImports EOF )
            // InternalSoftGalleryLanguage.g:6655:2: iv_ruleReactImports= ruleReactImports EOF
            {
             newCompositeNode(grammarAccess.getReactImportsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReactImports=ruleReactImports();

            state._fsp--;

             current =iv_ruleReactImports; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReactImports"


    // $ANTLR start "ruleReactImports"
    // InternalSoftGalleryLanguage.g:6661:1: ruleReactImports returns [EObject current=null] : ( () ( (lv_reactsimports_1_0= ruleReactImportContent ) )* ) ;
    public final EObject ruleReactImports() throws RecognitionException {
        EObject current = null;

        EObject lv_reactsimports_1_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:6667:2: ( ( () ( (lv_reactsimports_1_0= ruleReactImportContent ) )* ) )
            // InternalSoftGalleryLanguage.g:6668:2: ( () ( (lv_reactsimports_1_0= ruleReactImportContent ) )* )
            {
            // InternalSoftGalleryLanguage.g:6668:2: ( () ( (lv_reactsimports_1_0= ruleReactImportContent ) )* )
            // InternalSoftGalleryLanguage.g:6669:3: () ( (lv_reactsimports_1_0= ruleReactImportContent ) )*
            {
            // InternalSoftGalleryLanguage.g:6669:3: ()
            // InternalSoftGalleryLanguage.g:6670:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReactImportsAccess().getReactImportsAction_0(),
            					current);
            			

            }

            // InternalSoftGalleryLanguage.g:6676:3: ( (lv_reactsimports_1_0= ruleReactImportContent ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==130) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalSoftGalleryLanguage.g:6677:4: (lv_reactsimports_1_0= ruleReactImportContent )
            	    {
            	    // InternalSoftGalleryLanguage.g:6677:4: (lv_reactsimports_1_0= ruleReactImportContent )
            	    // InternalSoftGalleryLanguage.g:6678:5: lv_reactsimports_1_0= ruleReactImportContent
            	    {

            	    					newCompositeNode(grammarAccess.getReactImportsAccess().getReactsimportsReactImportContentParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_133);
            	    lv_reactsimports_1_0=ruleReactImportContent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getReactImportsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"reactsimports",
            	    						lv_reactsimports_1_0,
            	    						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.ReactImportContent");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReactImports"


    // $ANTLR start "entryRuleReactImportContent"
    // InternalSoftGalleryLanguage.g:6699:1: entryRuleReactImportContent returns [EObject current=null] : iv_ruleReactImportContent= ruleReactImportContent EOF ;
    public final EObject entryRuleReactImportContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactImportContent = null;


        try {
            // InternalSoftGalleryLanguage.g:6699:59: (iv_ruleReactImportContent= ruleReactImportContent EOF )
            // InternalSoftGalleryLanguage.g:6700:2: iv_ruleReactImportContent= ruleReactImportContent EOF
            {
             newCompositeNode(grammarAccess.getReactImportContentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReactImportContent=ruleReactImportContent();

            state._fsp--;

             current =iv_ruleReactImportContent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReactImportContent"


    // $ANTLR start "ruleReactImportContent"
    // InternalSoftGalleryLanguage.g:6706:1: ruleReactImportContent returns [EObject current=null] : (otherlv_0= 'import' ( (lv_impName_1_0= RULE_ID ) ) ) ;
    public final EObject ruleReactImportContent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_impName_1_0=null;


        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:6712:2: ( (otherlv_0= 'import' ( (lv_impName_1_0= RULE_ID ) ) ) )
            // InternalSoftGalleryLanguage.g:6713:2: (otherlv_0= 'import' ( (lv_impName_1_0= RULE_ID ) ) )
            {
            // InternalSoftGalleryLanguage.g:6713:2: (otherlv_0= 'import' ( (lv_impName_1_0= RULE_ID ) ) )
            // InternalSoftGalleryLanguage.g:6714:3: otherlv_0= 'import' ( (lv_impName_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,130,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getReactImportContentAccess().getImportKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:6718:3: ( (lv_impName_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:6719:4: (lv_impName_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:6719:4: (lv_impName_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:6720:5: lv_impName_1_0= RULE_ID
            {
            lv_impName_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_impName_1_0, grammarAccess.getReactImportContentAccess().getImpNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReactImportContentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"impName",
            						lv_impName_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReactImportContent"


    // $ANTLR start "entryRuleReactFunctions"
    // InternalSoftGalleryLanguage.g:6740:1: entryRuleReactFunctions returns [EObject current=null] : iv_ruleReactFunctions= ruleReactFunctions EOF ;
    public final EObject entryRuleReactFunctions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactFunctions = null;


        try {
            // InternalSoftGalleryLanguage.g:6740:55: (iv_ruleReactFunctions= ruleReactFunctions EOF )
            // InternalSoftGalleryLanguage.g:6741:2: iv_ruleReactFunctions= ruleReactFunctions EOF
            {
             newCompositeNode(grammarAccess.getReactFunctionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReactFunctions=ruleReactFunctions();

            state._fsp--;

             current =iv_ruleReactFunctions; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReactFunctions"


    // $ANTLR start "ruleReactFunctions"
    // InternalSoftGalleryLanguage.g:6747:1: ruleReactFunctions returns [EObject current=null] : ( ( (lv_reactconstructors_0_0= ruleReactConstructor ) ) ( (lv_lifecycleclass_1_0= ruleReactLifeCycle ) )* ( (lv_reactcorefuncs_2_0= ruleReactCoreFunctions ) )* ( (lv_renderclass_3_0= ruleReactRender ) ) ) ;
    public final EObject ruleReactFunctions() throws RecognitionException {
        EObject current = null;

        EObject lv_reactconstructors_0_0 = null;

        AntlrDatatypeRuleToken lv_lifecycleclass_1_0 = null;

        EObject lv_reactcorefuncs_2_0 = null;

        AntlrDatatypeRuleToken lv_renderclass_3_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:6753:2: ( ( ( (lv_reactconstructors_0_0= ruleReactConstructor ) ) ( (lv_lifecycleclass_1_0= ruleReactLifeCycle ) )* ( (lv_reactcorefuncs_2_0= ruleReactCoreFunctions ) )* ( (lv_renderclass_3_0= ruleReactRender ) ) ) )
            // InternalSoftGalleryLanguage.g:6754:2: ( ( (lv_reactconstructors_0_0= ruleReactConstructor ) ) ( (lv_lifecycleclass_1_0= ruleReactLifeCycle ) )* ( (lv_reactcorefuncs_2_0= ruleReactCoreFunctions ) )* ( (lv_renderclass_3_0= ruleReactRender ) ) )
            {
            // InternalSoftGalleryLanguage.g:6754:2: ( ( (lv_reactconstructors_0_0= ruleReactConstructor ) ) ( (lv_lifecycleclass_1_0= ruleReactLifeCycle ) )* ( (lv_reactcorefuncs_2_0= ruleReactCoreFunctions ) )* ( (lv_renderclass_3_0= ruleReactRender ) ) )
            // InternalSoftGalleryLanguage.g:6755:3: ( (lv_reactconstructors_0_0= ruleReactConstructor ) ) ( (lv_lifecycleclass_1_0= ruleReactLifeCycle ) )* ( (lv_reactcorefuncs_2_0= ruleReactCoreFunctions ) )* ( (lv_renderclass_3_0= ruleReactRender ) )
            {
            // InternalSoftGalleryLanguage.g:6755:3: ( (lv_reactconstructors_0_0= ruleReactConstructor ) )
            // InternalSoftGalleryLanguage.g:6756:4: (lv_reactconstructors_0_0= ruleReactConstructor )
            {
            // InternalSoftGalleryLanguage.g:6756:4: (lv_reactconstructors_0_0= ruleReactConstructor )
            // InternalSoftGalleryLanguage.g:6757:5: lv_reactconstructors_0_0= ruleReactConstructor
            {

            					newCompositeNode(grammarAccess.getReactFunctionsAccess().getReactconstructorsReactConstructorParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_134);
            lv_reactconstructors_0_0=ruleReactConstructor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReactFunctionsRule());
            					}
            					add(
            						current,
            						"reactconstructors",
            						lv_reactconstructors_0_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.ReactConstructor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftGalleryLanguage.g:6774:3: ( (lv_lifecycleclass_1_0= ruleReactLifeCycle ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==140||(LA38_0>=142 && LA38_0<=143)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalSoftGalleryLanguage.g:6775:4: (lv_lifecycleclass_1_0= ruleReactLifeCycle )
            	    {
            	    // InternalSoftGalleryLanguage.g:6775:4: (lv_lifecycleclass_1_0= ruleReactLifeCycle )
            	    // InternalSoftGalleryLanguage.g:6776:5: lv_lifecycleclass_1_0= ruleReactLifeCycle
            	    {

            	    					newCompositeNode(grammarAccess.getReactFunctionsAccess().getLifecycleclassReactLifeCycleParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_134);
            	    lv_lifecycleclass_1_0=ruleReactLifeCycle();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getReactFunctionsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"lifecycleclass",
            	    						lv_lifecycleclass_1_0,
            	    						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.ReactLifeCycle");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            // InternalSoftGalleryLanguage.g:6793:3: ( (lv_reactcorefuncs_2_0= ruleReactCoreFunctions ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_ID) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalSoftGalleryLanguage.g:6794:4: (lv_reactcorefuncs_2_0= ruleReactCoreFunctions )
            	    {
            	    // InternalSoftGalleryLanguage.g:6794:4: (lv_reactcorefuncs_2_0= ruleReactCoreFunctions )
            	    // InternalSoftGalleryLanguage.g:6795:5: lv_reactcorefuncs_2_0= ruleReactCoreFunctions
            	    {

            	    					newCompositeNode(grammarAccess.getReactFunctionsAccess().getReactcorefuncsReactCoreFunctionsParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_134);
            	    lv_reactcorefuncs_2_0=ruleReactCoreFunctions();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getReactFunctionsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"reactcorefuncs",
            	    						lv_reactcorefuncs_2_0,
            	    						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.ReactCoreFunctions");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            // InternalSoftGalleryLanguage.g:6812:3: ( (lv_renderclass_3_0= ruleReactRender ) )
            // InternalSoftGalleryLanguage.g:6813:4: (lv_renderclass_3_0= ruleReactRender )
            {
            // InternalSoftGalleryLanguage.g:6813:4: (lv_renderclass_3_0= ruleReactRender )
            // InternalSoftGalleryLanguage.g:6814:5: lv_renderclass_3_0= ruleReactRender
            {

            					newCompositeNode(grammarAccess.getReactFunctionsAccess().getRenderclassReactRenderParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_renderclass_3_0=ruleReactRender();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReactFunctionsRule());
            					}
            					add(
            						current,
            						"renderclass",
            						lv_renderclass_3_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.ReactRender");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReactFunctions"


    // $ANTLR start "entryRuleReactConstructor"
    // InternalSoftGalleryLanguage.g:6835:1: entryRuleReactConstructor returns [EObject current=null] : iv_ruleReactConstructor= ruleReactConstructor EOF ;
    public final EObject entryRuleReactConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactConstructor = null;


        try {
            // InternalSoftGalleryLanguage.g:6835:57: (iv_ruleReactConstructor= ruleReactConstructor EOF )
            // InternalSoftGalleryLanguage.g:6836:2: iv_ruleReactConstructor= ruleReactConstructor EOF
            {
             newCompositeNode(grammarAccess.getReactConstructorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReactConstructor=ruleReactConstructor();

            state._fsp--;

             current =iv_ruleReactConstructor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReactConstructor"


    // $ANTLR start "ruleReactConstructor"
    // InternalSoftGalleryLanguage.g:6842:1: ruleReactConstructor returns [EObject current=null] : (otherlv_0= 'Constructor' ( (lv_componentclass_1_0= ruleState ) ) ( (lv_componentclass_2_0= ruleCoreFunctionsDeclaration ) )* ) ;
    public final EObject ruleReactConstructor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_componentclass_1_0 = null;

        EObject lv_componentclass_2_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:6848:2: ( (otherlv_0= 'Constructor' ( (lv_componentclass_1_0= ruleState ) ) ( (lv_componentclass_2_0= ruleCoreFunctionsDeclaration ) )* ) )
            // InternalSoftGalleryLanguage.g:6849:2: (otherlv_0= 'Constructor' ( (lv_componentclass_1_0= ruleState ) ) ( (lv_componentclass_2_0= ruleCoreFunctionsDeclaration ) )* )
            {
            // InternalSoftGalleryLanguage.g:6849:2: (otherlv_0= 'Constructor' ( (lv_componentclass_1_0= ruleState ) ) ( (lv_componentclass_2_0= ruleCoreFunctionsDeclaration ) )* )
            // InternalSoftGalleryLanguage.g:6850:3: otherlv_0= 'Constructor' ( (lv_componentclass_1_0= ruleState ) ) ( (lv_componentclass_2_0= ruleCoreFunctionsDeclaration ) )*
            {
            otherlv_0=(Token)match(input,131,FOLLOW_135); 

            			newLeafNode(otherlv_0, grammarAccess.getReactConstructorAccess().getConstructorKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:6854:3: ( (lv_componentclass_1_0= ruleState ) )
            // InternalSoftGalleryLanguage.g:6855:4: (lv_componentclass_1_0= ruleState )
            {
            // InternalSoftGalleryLanguage.g:6855:4: (lv_componentclass_1_0= ruleState )
            // InternalSoftGalleryLanguage.g:6856:5: lv_componentclass_1_0= ruleState
            {

            					newCompositeNode(grammarAccess.getReactConstructorAccess().getComponentclassStateParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_136);
            lv_componentclass_1_0=ruleState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReactConstructorRule());
            					}
            					add(
            						current,
            						"componentclass",
            						lv_componentclass_1_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.State");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftGalleryLanguage.g:6873:3: ( (lv_componentclass_2_0= ruleCoreFunctionsDeclaration ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_ID) ) {
                    int LA40_2 = input.LA(2);

                    if ( (LA40_2==139) ) {
                        alt40=1;
                    }


                }


                switch (alt40) {
            	case 1 :
            	    // InternalSoftGalleryLanguage.g:6874:4: (lv_componentclass_2_0= ruleCoreFunctionsDeclaration )
            	    {
            	    // InternalSoftGalleryLanguage.g:6874:4: (lv_componentclass_2_0= ruleCoreFunctionsDeclaration )
            	    // InternalSoftGalleryLanguage.g:6875:5: lv_componentclass_2_0= ruleCoreFunctionsDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getReactConstructorAccess().getComponentclassCoreFunctionsDeclarationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_136);
            	    lv_componentclass_2_0=ruleCoreFunctionsDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getReactConstructorRule());
            	    					}
            	    					add(
            	    						current,
            	    						"componentclass",
            	    						lv_componentclass_2_0,
            	    						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.CoreFunctionsDeclaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReactConstructor"


    // $ANTLR start "entryRuleState"
    // InternalSoftGalleryLanguage.g:6896:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalSoftGalleryLanguage.g:6896:46: (iv_ruleState= ruleState EOF )
            // InternalSoftGalleryLanguage.g:6897:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalSoftGalleryLanguage.g:6903:1: ruleState returns [EObject current=null] : ( () otherlv_1= 'State' ( (lv_statecontents_2_0= ruleStateContent ) )+ ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_statecontents_2_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:6909:2: ( ( () otherlv_1= 'State' ( (lv_statecontents_2_0= ruleStateContent ) )+ ) )
            // InternalSoftGalleryLanguage.g:6910:2: ( () otherlv_1= 'State' ( (lv_statecontents_2_0= ruleStateContent ) )+ )
            {
            // InternalSoftGalleryLanguage.g:6910:2: ( () otherlv_1= 'State' ( (lv_statecontents_2_0= ruleStateContent ) )+ )
            // InternalSoftGalleryLanguage.g:6911:3: () otherlv_1= 'State' ( (lv_statecontents_2_0= ruleStateContent ) )+
            {
            // InternalSoftGalleryLanguage.g:6911:3: ()
            // InternalSoftGalleryLanguage.g:6912:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStateAccess().getStateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,132,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getStateAccess().getStateKeyword_1());
            		
            // InternalSoftGalleryLanguage.g:6922:3: ( (lv_statecontents_2_0= ruleStateContent ) )+
            int cnt41=0;
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_ID) ) {
                    int LA41_1 = input.LA(2);

                    if ( ((LA41_1>=133 && LA41_1<=138)) ) {
                        alt41=1;
                    }


                }


                switch (alt41) {
            	case 1 :
            	    // InternalSoftGalleryLanguage.g:6923:4: (lv_statecontents_2_0= ruleStateContent )
            	    {
            	    // InternalSoftGalleryLanguage.g:6923:4: (lv_statecontents_2_0= ruleStateContent )
            	    // InternalSoftGalleryLanguage.g:6924:5: lv_statecontents_2_0= ruleStateContent
            	    {

            	    					newCompositeNode(grammarAccess.getStateAccess().getStatecontentsStateContentParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_136);
            	    lv_statecontents_2_0=ruleStateContent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStateRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statecontents",
            	    						lv_statecontents_2_0,
            	    						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.StateContent");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt41 >= 1 ) break loop41;
                        EarlyExitException eee =
                            new EarlyExitException(41, input);
                        throw eee;
                }
                cnt41++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleStateContent"
    // InternalSoftGalleryLanguage.g:6945:1: entryRuleStateContent returns [EObject current=null] : iv_ruleStateContent= ruleStateContent EOF ;
    public final EObject entryRuleStateContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateContent = null;


        try {
            // InternalSoftGalleryLanguage.g:6945:53: (iv_ruleStateContent= ruleStateContent EOF )
            // InternalSoftGalleryLanguage.g:6946:2: iv_ruleStateContent= ruleStateContent EOF
            {
             newCompositeNode(grammarAccess.getStateContentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStateContent=ruleStateContent();

            state._fsp--;

             current =iv_ruleStateContent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStateContent"


    // $ANTLR start "ruleStateContent"
    // InternalSoftGalleryLanguage.g:6952:1: ruleStateContent returns [EObject current=null] : ( ( (lv_stateName_0_0= RULE_ID ) ) ( (lv_componentdatatyp_1_0= ruleDataType ) ) ) ;
    public final EObject ruleStateContent() throws RecognitionException {
        EObject current = null;

        Token lv_stateName_0_0=null;
        AntlrDatatypeRuleToken lv_componentdatatyp_1_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:6958:2: ( ( ( (lv_stateName_0_0= RULE_ID ) ) ( (lv_componentdatatyp_1_0= ruleDataType ) ) ) )
            // InternalSoftGalleryLanguage.g:6959:2: ( ( (lv_stateName_0_0= RULE_ID ) ) ( (lv_componentdatatyp_1_0= ruleDataType ) ) )
            {
            // InternalSoftGalleryLanguage.g:6959:2: ( ( (lv_stateName_0_0= RULE_ID ) ) ( (lv_componentdatatyp_1_0= ruleDataType ) ) )
            // InternalSoftGalleryLanguage.g:6960:3: ( (lv_stateName_0_0= RULE_ID ) ) ( (lv_componentdatatyp_1_0= ruleDataType ) )
            {
            // InternalSoftGalleryLanguage.g:6960:3: ( (lv_stateName_0_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:6961:4: (lv_stateName_0_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:6961:4: (lv_stateName_0_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:6962:5: lv_stateName_0_0= RULE_ID
            {
            lv_stateName_0_0=(Token)match(input,RULE_ID,FOLLOW_137); 

            					newLeafNode(lv_stateName_0_0, grammarAccess.getStateContentAccess().getStateNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateContentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"stateName",
            						lv_stateName_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSoftGalleryLanguage.g:6978:3: ( (lv_componentdatatyp_1_0= ruleDataType ) )
            // InternalSoftGalleryLanguage.g:6979:4: (lv_componentdatatyp_1_0= ruleDataType )
            {
            // InternalSoftGalleryLanguage.g:6979:4: (lv_componentdatatyp_1_0= ruleDataType )
            // InternalSoftGalleryLanguage.g:6980:5: lv_componentdatatyp_1_0= ruleDataType
            {

            					newCompositeNode(grammarAccess.getStateContentAccess().getComponentdatatypDataTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_componentdatatyp_1_0=ruleDataType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateContentRule());
            					}
            					add(
            						current,
            						"componentdatatyp",
            						lv_componentdatatyp_1_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.DataType");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStateContent"


    // $ANTLR start "entryRuleDataType"
    // InternalSoftGalleryLanguage.g:7001:1: entryRuleDataType returns [String current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final String entryRuleDataType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDataType = null;


        try {
            // InternalSoftGalleryLanguage.g:7001:48: (iv_ruleDataType= ruleDataType EOF )
            // InternalSoftGalleryLanguage.g:7002:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalSoftGalleryLanguage.g:7008:1: ruleDataType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'String' | kw= 'Array' | kw= 'Object' | kw= 'Number' | kw= 'null' | kw= 'Boolean' ) ;
    public final AntlrDatatypeRuleToken ruleDataType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:7014:2: ( (kw= 'String' | kw= 'Array' | kw= 'Object' | kw= 'Number' | kw= 'null' | kw= 'Boolean' ) )
            // InternalSoftGalleryLanguage.g:7015:2: (kw= 'String' | kw= 'Array' | kw= 'Object' | kw= 'Number' | kw= 'null' | kw= 'Boolean' )
            {
            // InternalSoftGalleryLanguage.g:7015:2: (kw= 'String' | kw= 'Array' | kw= 'Object' | kw= 'Number' | kw= 'null' | kw= 'Boolean' )
            int alt42=6;
            switch ( input.LA(1) ) {
            case 133:
                {
                alt42=1;
                }
                break;
            case 134:
                {
                alt42=2;
                }
                break;
            case 135:
                {
                alt42=3;
                }
                break;
            case 136:
                {
                alt42=4;
                }
                break;
            case 137:
                {
                alt42=5;
                }
                break;
            case 138:
                {
                alt42=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // InternalSoftGalleryLanguage.g:7016:3: kw= 'String'
                    {
                    kw=(Token)match(input,133,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDataTypeAccess().getStringKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSoftGalleryLanguage.g:7022:3: kw= 'Array'
                    {
                    kw=(Token)match(input,134,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDataTypeAccess().getArrayKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSoftGalleryLanguage.g:7028:3: kw= 'Object'
                    {
                    kw=(Token)match(input,135,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDataTypeAccess().getObjectKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalSoftGalleryLanguage.g:7034:3: kw= 'Number'
                    {
                    kw=(Token)match(input,136,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDataTypeAccess().getNumberKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalSoftGalleryLanguage.g:7040:3: kw= 'null'
                    {
                    kw=(Token)match(input,137,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDataTypeAccess().getNullKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalSoftGalleryLanguage.g:7046:3: kw= 'Boolean'
                    {
                    kw=(Token)match(input,138,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDataTypeAccess().getBooleanKeyword_5());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleCoreFunctionsDeclaration"
    // InternalSoftGalleryLanguage.g:7055:1: entryRuleCoreFunctionsDeclaration returns [EObject current=null] : iv_ruleCoreFunctionsDeclaration= ruleCoreFunctionsDeclaration EOF ;
    public final EObject entryRuleCoreFunctionsDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoreFunctionsDeclaration = null;


        try {
            // InternalSoftGalleryLanguage.g:7055:65: (iv_ruleCoreFunctionsDeclaration= ruleCoreFunctionsDeclaration EOF )
            // InternalSoftGalleryLanguage.g:7056:2: iv_ruleCoreFunctionsDeclaration= ruleCoreFunctionsDeclaration EOF
            {
             newCompositeNode(grammarAccess.getCoreFunctionsDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCoreFunctionsDeclaration=ruleCoreFunctionsDeclaration();

            state._fsp--;

             current =iv_ruleCoreFunctionsDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCoreFunctionsDeclaration"


    // $ANTLR start "ruleCoreFunctionsDeclaration"
    // InternalSoftGalleryLanguage.g:7062:1: ruleCoreFunctionsDeclaration returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'FunctionBindingDeclaration' ) ;
    public final EObject ruleCoreFunctionsDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:7068:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'FunctionBindingDeclaration' ) )
            // InternalSoftGalleryLanguage.g:7069:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'FunctionBindingDeclaration' )
            {
            // InternalSoftGalleryLanguage.g:7069:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'FunctionBindingDeclaration' )
            // InternalSoftGalleryLanguage.g:7070:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'FunctionBindingDeclaration'
            {
            // InternalSoftGalleryLanguage.g:7070:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:7071:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:7071:4: (lv_name_0_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:7072:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_138); 

            					newLeafNode(lv_name_0_0, grammarAccess.getCoreFunctionsDeclarationAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCoreFunctionsDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,139,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getCoreFunctionsDeclarationAccess().getFunctionBindingDeclarationKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCoreFunctionsDeclaration"


    // $ANTLR start "entryRuleReactLifeCycle"
    // InternalSoftGalleryLanguage.g:7096:1: entryRuleReactLifeCycle returns [String current=null] : iv_ruleReactLifeCycle= ruleReactLifeCycle EOF ;
    public final String entryRuleReactLifeCycle() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReactLifeCycle = null;


        try {
            // InternalSoftGalleryLanguage.g:7096:54: (iv_ruleReactLifeCycle= ruleReactLifeCycle EOF )
            // InternalSoftGalleryLanguage.g:7097:2: iv_ruleReactLifeCycle= ruleReactLifeCycle EOF
            {
             newCompositeNode(grammarAccess.getReactLifeCycleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReactLifeCycle=ruleReactLifeCycle();

            state._fsp--;

             current =iv_ruleReactLifeCycle.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReactLifeCycle"


    // $ANTLR start "ruleReactLifeCycle"
    // InternalSoftGalleryLanguage.g:7103:1: ruleReactLifeCycle returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'ComponentDidMount' kw= 'FunctionStructure' ) | (kw= 'ComponentDidUpdate' kw= 'FunctionStructure' ) | (kw= 'ComponentWillUnmount' kw= 'FunctionStructure' ) ) ;
    public final AntlrDatatypeRuleToken ruleReactLifeCycle() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:7109:2: ( ( (kw= 'ComponentDidMount' kw= 'FunctionStructure' ) | (kw= 'ComponentDidUpdate' kw= 'FunctionStructure' ) | (kw= 'ComponentWillUnmount' kw= 'FunctionStructure' ) ) )
            // InternalSoftGalleryLanguage.g:7110:2: ( (kw= 'ComponentDidMount' kw= 'FunctionStructure' ) | (kw= 'ComponentDidUpdate' kw= 'FunctionStructure' ) | (kw= 'ComponentWillUnmount' kw= 'FunctionStructure' ) )
            {
            // InternalSoftGalleryLanguage.g:7110:2: ( (kw= 'ComponentDidMount' kw= 'FunctionStructure' ) | (kw= 'ComponentDidUpdate' kw= 'FunctionStructure' ) | (kw= 'ComponentWillUnmount' kw= 'FunctionStructure' ) )
            int alt43=3;
            switch ( input.LA(1) ) {
            case 140:
                {
                alt43=1;
                }
                break;
            case 142:
                {
                alt43=2;
                }
                break;
            case 143:
                {
                alt43=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // InternalSoftGalleryLanguage.g:7111:3: (kw= 'ComponentDidMount' kw= 'FunctionStructure' )
                    {
                    // InternalSoftGalleryLanguage.g:7111:3: (kw= 'ComponentDidMount' kw= 'FunctionStructure' )
                    // InternalSoftGalleryLanguage.g:7112:4: kw= 'ComponentDidMount' kw= 'FunctionStructure'
                    {
                    kw=(Token)match(input,140,FOLLOW_139); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getReactLifeCycleAccess().getComponentDidMountKeyword_0_0());
                    			
                    kw=(Token)match(input,141,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getReactLifeCycleAccess().getFunctionStructureKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSoftGalleryLanguage.g:7124:3: (kw= 'ComponentDidUpdate' kw= 'FunctionStructure' )
                    {
                    // InternalSoftGalleryLanguage.g:7124:3: (kw= 'ComponentDidUpdate' kw= 'FunctionStructure' )
                    // InternalSoftGalleryLanguage.g:7125:4: kw= 'ComponentDidUpdate' kw= 'FunctionStructure'
                    {
                    kw=(Token)match(input,142,FOLLOW_139); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getReactLifeCycleAccess().getComponentDidUpdateKeyword_1_0());
                    			
                    kw=(Token)match(input,141,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getReactLifeCycleAccess().getFunctionStructureKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSoftGalleryLanguage.g:7137:3: (kw= 'ComponentWillUnmount' kw= 'FunctionStructure' )
                    {
                    // InternalSoftGalleryLanguage.g:7137:3: (kw= 'ComponentWillUnmount' kw= 'FunctionStructure' )
                    // InternalSoftGalleryLanguage.g:7138:4: kw= 'ComponentWillUnmount' kw= 'FunctionStructure'
                    {
                    kw=(Token)match(input,143,FOLLOW_139); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getReactLifeCycleAccess().getComponentWillUnmountKeyword_2_0());
                    			
                    kw=(Token)match(input,141,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getReactLifeCycleAccess().getFunctionStructureKeyword_2_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReactLifeCycle"


    // $ANTLR start "entryRuleReactRender"
    // InternalSoftGalleryLanguage.g:7153:1: entryRuleReactRender returns [String current=null] : iv_ruleReactRender= ruleReactRender EOF ;
    public final String entryRuleReactRender() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReactRender = null;


        try {
            // InternalSoftGalleryLanguage.g:7153:51: (iv_ruleReactRender= ruleReactRender EOF )
            // InternalSoftGalleryLanguage.g:7154:2: iv_ruleReactRender= ruleReactRender EOF
            {
             newCompositeNode(grammarAccess.getReactRenderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReactRender=ruleReactRender();

            state._fsp--;

             current =iv_ruleReactRender.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReactRender"


    // $ANTLR start "ruleReactRender"
    // InternalSoftGalleryLanguage.g:7160:1: ruleReactRender returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Render' kw= 'RenderContent' ) ;
    public final AntlrDatatypeRuleToken ruleReactRender() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:7166:2: ( (kw= 'Render' kw= 'RenderContent' ) )
            // InternalSoftGalleryLanguage.g:7167:2: (kw= 'Render' kw= 'RenderContent' )
            {
            // InternalSoftGalleryLanguage.g:7167:2: (kw= 'Render' kw= 'RenderContent' )
            // InternalSoftGalleryLanguage.g:7168:3: kw= 'Render' kw= 'RenderContent'
            {
            kw=(Token)match(input,144,FOLLOW_140); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getReactRenderAccess().getRenderKeyword_0());
            		
            kw=(Token)match(input,145,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getReactRenderAccess().getRenderContentKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReactRender"


    // $ANTLR start "entryRuleProps"
    // InternalSoftGalleryLanguage.g:7182:1: entryRuleProps returns [EObject current=null] : iv_ruleProps= ruleProps EOF ;
    public final EObject entryRuleProps() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProps = null;


        try {
            // InternalSoftGalleryLanguage.g:7182:46: (iv_ruleProps= ruleProps EOF )
            // InternalSoftGalleryLanguage.g:7183:2: iv_ruleProps= ruleProps EOF
            {
             newCompositeNode(grammarAccess.getPropsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProps=ruleProps();

            state._fsp--;

             current =iv_ruleProps; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProps"


    // $ANTLR start "ruleProps"
    // InternalSoftGalleryLanguage.g:7189:1: ruleProps returns [EObject current=null] : ( () otherlv_1= 'Props' ( (lv_propsconts_2_0= rulePropsType ) )* ) ;
    public final EObject ruleProps() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_propsconts_2_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:7195:2: ( ( () otherlv_1= 'Props' ( (lv_propsconts_2_0= rulePropsType ) )* ) )
            // InternalSoftGalleryLanguage.g:7196:2: ( () otherlv_1= 'Props' ( (lv_propsconts_2_0= rulePropsType ) )* )
            {
            // InternalSoftGalleryLanguage.g:7196:2: ( () otherlv_1= 'Props' ( (lv_propsconts_2_0= rulePropsType ) )* )
            // InternalSoftGalleryLanguage.g:7197:3: () otherlv_1= 'Props' ( (lv_propsconts_2_0= rulePropsType ) )*
            {
            // InternalSoftGalleryLanguage.g:7197:3: ()
            // InternalSoftGalleryLanguage.g:7198:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPropsAccess().getPropsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,146,FOLLOW_136); 

            			newLeafNode(otherlv_1, grammarAccess.getPropsAccess().getPropsKeyword_1());
            		
            // InternalSoftGalleryLanguage.g:7208:3: ( (lv_propsconts_2_0= rulePropsType ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==RULE_ID) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalSoftGalleryLanguage.g:7209:4: (lv_propsconts_2_0= rulePropsType )
            	    {
            	    // InternalSoftGalleryLanguage.g:7209:4: (lv_propsconts_2_0= rulePropsType )
            	    // InternalSoftGalleryLanguage.g:7210:5: lv_propsconts_2_0= rulePropsType
            	    {

            	    					newCompositeNode(grammarAccess.getPropsAccess().getPropscontsPropsTypeParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_136);
            	    lv_propsconts_2_0=rulePropsType();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPropsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"propsconts",
            	    						lv_propsconts_2_0,
            	    						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.PropsType");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProps"


    // $ANTLR start "entryRulePropsType"
    // InternalSoftGalleryLanguage.g:7231:1: entryRulePropsType returns [EObject current=null] : iv_rulePropsType= rulePropsType EOF ;
    public final EObject entryRulePropsType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropsType = null;


        try {
            // InternalSoftGalleryLanguage.g:7231:50: (iv_rulePropsType= rulePropsType EOF )
            // InternalSoftGalleryLanguage.g:7232:2: iv_rulePropsType= rulePropsType EOF
            {
             newCompositeNode(grammarAccess.getPropsTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropsType=rulePropsType();

            state._fsp--;

             current =iv_rulePropsType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropsType"


    // $ANTLR start "rulePropsType"
    // InternalSoftGalleryLanguage.g:7238:1: rulePropsType returns [EObject current=null] : ( ( (lv_nameProps_0_0= RULE_ID ) ) ( (lv_propsdatas_1_0= ruleDataType ) ) ) ;
    public final EObject rulePropsType() throws RecognitionException {
        EObject current = null;

        Token lv_nameProps_0_0=null;
        AntlrDatatypeRuleToken lv_propsdatas_1_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:7244:2: ( ( ( (lv_nameProps_0_0= RULE_ID ) ) ( (lv_propsdatas_1_0= ruleDataType ) ) ) )
            // InternalSoftGalleryLanguage.g:7245:2: ( ( (lv_nameProps_0_0= RULE_ID ) ) ( (lv_propsdatas_1_0= ruleDataType ) ) )
            {
            // InternalSoftGalleryLanguage.g:7245:2: ( ( (lv_nameProps_0_0= RULE_ID ) ) ( (lv_propsdatas_1_0= ruleDataType ) ) )
            // InternalSoftGalleryLanguage.g:7246:3: ( (lv_nameProps_0_0= RULE_ID ) ) ( (lv_propsdatas_1_0= ruleDataType ) )
            {
            // InternalSoftGalleryLanguage.g:7246:3: ( (lv_nameProps_0_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:7247:4: (lv_nameProps_0_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:7247:4: (lv_nameProps_0_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:7248:5: lv_nameProps_0_0= RULE_ID
            {
            lv_nameProps_0_0=(Token)match(input,RULE_ID,FOLLOW_137); 

            					newLeafNode(lv_nameProps_0_0, grammarAccess.getPropsTypeAccess().getNamePropsIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropsTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nameProps",
            						lv_nameProps_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSoftGalleryLanguage.g:7264:3: ( (lv_propsdatas_1_0= ruleDataType ) )
            // InternalSoftGalleryLanguage.g:7265:4: (lv_propsdatas_1_0= ruleDataType )
            {
            // InternalSoftGalleryLanguage.g:7265:4: (lv_propsdatas_1_0= ruleDataType )
            // InternalSoftGalleryLanguage.g:7266:5: lv_propsdatas_1_0= ruleDataType
            {

            					newCompositeNode(grammarAccess.getPropsTypeAccess().getPropsdatasDataTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_propsdatas_1_0=ruleDataType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropsTypeRule());
            					}
            					add(
            						current,
            						"propsdatas",
            						lv_propsdatas_1_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.DataType");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropsType"


    // $ANTLR start "entryRuleReactCoreFunctions"
    // InternalSoftGalleryLanguage.g:7287:1: entryRuleReactCoreFunctions returns [EObject current=null] : iv_ruleReactCoreFunctions= ruleReactCoreFunctions EOF ;
    public final EObject entryRuleReactCoreFunctions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactCoreFunctions = null;


        try {
            // InternalSoftGalleryLanguage.g:7287:59: (iv_ruleReactCoreFunctions= ruleReactCoreFunctions EOF )
            // InternalSoftGalleryLanguage.g:7288:2: iv_ruleReactCoreFunctions= ruleReactCoreFunctions EOF
            {
             newCompositeNode(grammarAccess.getReactCoreFunctionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReactCoreFunctions=ruleReactCoreFunctions();

            state._fsp--;

             current =iv_ruleReactCoreFunctions; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReactCoreFunctions"


    // $ANTLR start "ruleReactCoreFunctions"
    // InternalSoftGalleryLanguage.g:7294:1: ruleReactCoreFunctions returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'FunctionStructure' ) ;
    public final EObject ruleReactCoreFunctions() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:7300:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'FunctionStructure' ) )
            // InternalSoftGalleryLanguage.g:7301:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'FunctionStructure' )
            {
            // InternalSoftGalleryLanguage.g:7301:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'FunctionStructure' )
            // InternalSoftGalleryLanguage.g:7302:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'FunctionStructure'
            {
            // InternalSoftGalleryLanguage.g:7302:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:7303:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:7303:4: (lv_name_0_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:7304:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_139); 

            					newLeafNode(lv_name_0_0, grammarAccess.getReactCoreFunctionsAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReactCoreFunctionsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,141,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getReactCoreFunctionsAccess().getFunctionStructureKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReactCoreFunctions"


    // $ANTLR start "entryRuleReactActions"
    // InternalSoftGalleryLanguage.g:7328:1: entryRuleReactActions returns [EObject current=null] : iv_ruleReactActions= ruleReactActions EOF ;
    public final EObject entryRuleReactActions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactActions = null;


        try {
            // InternalSoftGalleryLanguage.g:7328:53: (iv_ruleReactActions= ruleReactActions EOF )
            // InternalSoftGalleryLanguage.g:7329:2: iv_ruleReactActions= ruleReactActions EOF
            {
             newCompositeNode(grammarAccess.getReactActionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReactActions=ruleReactActions();

            state._fsp--;

             current =iv_ruleReactActions; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReactActions"


    // $ANTLR start "ruleReactActions"
    // InternalSoftGalleryLanguage.g:7335:1: ruleReactActions returns [EObject current=null] : (otherlv_0= 'ReactActions' otherlv_1= ':' otherlv_2= '{' ( (lv_reactactcontent_3_0= ruleReactActionsContent ) ) otherlv_4= '}' ) ;
    public final EObject ruleReactActions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_reactactcontent_3_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:7341:2: ( (otherlv_0= 'ReactActions' otherlv_1= ':' otherlv_2= '{' ( (lv_reactactcontent_3_0= ruleReactActionsContent ) ) otherlv_4= '}' ) )
            // InternalSoftGalleryLanguage.g:7342:2: (otherlv_0= 'ReactActions' otherlv_1= ':' otherlv_2= '{' ( (lv_reactactcontent_3_0= ruleReactActionsContent ) ) otherlv_4= '}' )
            {
            // InternalSoftGalleryLanguage.g:7342:2: (otherlv_0= 'ReactActions' otherlv_1= ':' otherlv_2= '{' ( (lv_reactactcontent_3_0= ruleReactActionsContent ) ) otherlv_4= '}' )
            // InternalSoftGalleryLanguage.g:7343:3: otherlv_0= 'ReactActions' otherlv_1= ':' otherlv_2= '{' ( (lv_reactactcontent_3_0= ruleReactActionsContent ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,147,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getReactActionsAccess().getReactActionsKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getReactActionsAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_141); 

            			newLeafNode(otherlv_2, grammarAccess.getReactActionsAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSoftGalleryLanguage.g:7355:3: ( (lv_reactactcontent_3_0= ruleReactActionsContent ) )
            // InternalSoftGalleryLanguage.g:7356:4: (lv_reactactcontent_3_0= ruleReactActionsContent )
            {
            // InternalSoftGalleryLanguage.g:7356:4: (lv_reactactcontent_3_0= ruleReactActionsContent )
            // InternalSoftGalleryLanguage.g:7357:5: lv_reactactcontent_3_0= ruleReactActionsContent
            {

            					newCompositeNode(grammarAccess.getReactActionsAccess().getReactactcontentReactActionsContentParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_reactactcontent_3_0=ruleReactActionsContent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReactActionsRule());
            					}
            					add(
            						current,
            						"reactactcontent",
            						lv_reactactcontent_3_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.ReactActionsContent");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getReactActionsAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReactActions"


    // $ANTLR start "entryRuleReactActionsContent"
    // InternalSoftGalleryLanguage.g:7382:1: entryRuleReactActionsContent returns [EObject current=null] : iv_ruleReactActionsContent= ruleReactActionsContent EOF ;
    public final EObject entryRuleReactActionsContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactActionsContent = null;


        try {
            // InternalSoftGalleryLanguage.g:7382:60: (iv_ruleReactActionsContent= ruleReactActionsContent EOF )
            // InternalSoftGalleryLanguage.g:7383:2: iv_ruleReactActionsContent= ruleReactActionsContent EOF
            {
             newCompositeNode(grammarAccess.getReactActionsContentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReactActionsContent=ruleReactActionsContent();

            state._fsp--;

             current =iv_ruleReactActionsContent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReactActionsContent"


    // $ANTLR start "ruleReactActionsContent"
    // InternalSoftGalleryLanguage.g:7389:1: ruleReactActionsContent returns [EObject current=null] : ( (lv_reactrelcontent_0_0= ruleReactServicesRelation ) )+ ;
    public final EObject ruleReactActionsContent() throws RecognitionException {
        EObject current = null;

        EObject lv_reactrelcontent_0_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:7395:2: ( ( (lv_reactrelcontent_0_0= ruleReactServicesRelation ) )+ )
            // InternalSoftGalleryLanguage.g:7396:2: ( (lv_reactrelcontent_0_0= ruleReactServicesRelation ) )+
            {
            // InternalSoftGalleryLanguage.g:7396:2: ( (lv_reactrelcontent_0_0= ruleReactServicesRelation ) )+
            int cnt45=0;
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==150) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalSoftGalleryLanguage.g:7397:3: (lv_reactrelcontent_0_0= ruleReactServicesRelation )
            	    {
            	    // InternalSoftGalleryLanguage.g:7397:3: (lv_reactrelcontent_0_0= ruleReactServicesRelation )
            	    // InternalSoftGalleryLanguage.g:7398:4: lv_reactrelcontent_0_0= ruleReactServicesRelation
            	    {

            	    				newCompositeNode(grammarAccess.getReactActionsContentAccess().getReactrelcontentReactServicesRelationParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_142);
            	    lv_reactrelcontent_0_0=ruleReactServicesRelation();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getReactActionsContentRule());
            	    				}
            	    				add(
            	    					current,
            	    					"reactrelcontent",
            	    					lv_reactrelcontent_0_0,
            	    					"co.unal.mdd.photos.dsl.SoftGalleryLanguage.ReactServicesRelation");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt45 >= 1 ) break loop45;
                        EarlyExitException eee =
                            new EarlyExitException(45, input);
                        throw eee;
                }
                cnt45++;
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReactActionsContent"


    // $ANTLR start "entryRuleReactServicesType"
    // InternalSoftGalleryLanguage.g:7418:1: entryRuleReactServicesType returns [EObject current=null] : iv_ruleReactServicesType= ruleReactServicesType EOF ;
    public final EObject entryRuleReactServicesType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactServicesType = null;


        try {
            // InternalSoftGalleryLanguage.g:7418:58: (iv_ruleReactServicesType= ruleReactServicesType EOF )
            // InternalSoftGalleryLanguage.g:7419:2: iv_ruleReactServicesType= ruleReactServicesType EOF
            {
             newCompositeNode(grammarAccess.getReactServicesTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReactServicesType=ruleReactServicesType();

            state._fsp--;

             current =iv_ruleReactServicesType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReactServicesType"


    // $ANTLR start "ruleReactServicesType"
    // InternalSoftGalleryLanguage.g:7425:1: ruleReactServicesType returns [EObject current=null] : (otherlv_0= 'ServiceType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ServiceContent' ) ;
    public final EObject ruleReactServicesType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:7431:2: ( (otherlv_0= 'ServiceType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ServiceContent' ) )
            // InternalSoftGalleryLanguage.g:7432:2: (otherlv_0= 'ServiceType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ServiceContent' )
            {
            // InternalSoftGalleryLanguage.g:7432:2: (otherlv_0= 'ServiceType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ServiceContent' )
            // InternalSoftGalleryLanguage.g:7433:3: otherlv_0= 'ServiceType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ServiceContent'
            {
            otherlv_0=(Token)match(input,148,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getReactServicesTypeAccess().getServiceTypeKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:7437:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:7438:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:7438:4: (lv_name_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:7439:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_143); 

            					newLeafNode(lv_name_1_0, grammarAccess.getReactServicesTypeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReactServicesTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,149,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getReactServicesTypeAccess().getServiceContentKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReactServicesType"


    // $ANTLR start "entryRuleReactServicesRelation"
    // InternalSoftGalleryLanguage.g:7463:1: entryRuleReactServicesRelation returns [EObject current=null] : iv_ruleReactServicesRelation= ruleReactServicesRelation EOF ;
    public final EObject entryRuleReactServicesRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactServicesRelation = null;


        try {
            // InternalSoftGalleryLanguage.g:7463:62: (iv_ruleReactServicesRelation= ruleReactServicesRelation EOF )
            // InternalSoftGalleryLanguage.g:7464:2: iv_ruleReactServicesRelation= ruleReactServicesRelation EOF
            {
             newCompositeNode(grammarAccess.getReactServicesRelationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReactServicesRelation=ruleReactServicesRelation();

            state._fsp--;

             current =iv_ruleReactServicesRelation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReactServicesRelation"


    // $ANTLR start "ruleReactServicesRelation"
    // InternalSoftGalleryLanguage.g:7470:1: ruleReactServicesRelation returns [EObject current=null] : (otherlv_0= 'ServicesRelations' ( (lv_servicesrels_1_0= ruleReactsRelationServ ) )+ ) ;
    public final EObject ruleReactServicesRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_servicesrels_1_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:7476:2: ( (otherlv_0= 'ServicesRelations' ( (lv_servicesrels_1_0= ruleReactsRelationServ ) )+ ) )
            // InternalSoftGalleryLanguage.g:7477:2: (otherlv_0= 'ServicesRelations' ( (lv_servicesrels_1_0= ruleReactsRelationServ ) )+ )
            {
            // InternalSoftGalleryLanguage.g:7477:2: (otherlv_0= 'ServicesRelations' ( (lv_servicesrels_1_0= ruleReactsRelationServ ) )+ )
            // InternalSoftGalleryLanguage.g:7478:3: otherlv_0= 'ServicesRelations' ( (lv_servicesrels_1_0= ruleReactsRelationServ ) )+
            {
            otherlv_0=(Token)match(input,150,FOLLOW_144); 

            			newLeafNode(otherlv_0, grammarAccess.getReactServicesRelationAccess().getServicesRelationsKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:7482:3: ( (lv_servicesrels_1_0= ruleReactsRelationServ ) )+
            int cnt46=0;
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==148) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalSoftGalleryLanguage.g:7483:4: (lv_servicesrels_1_0= ruleReactsRelationServ )
            	    {
            	    // InternalSoftGalleryLanguage.g:7483:4: (lv_servicesrels_1_0= ruleReactsRelationServ )
            	    // InternalSoftGalleryLanguage.g:7484:5: lv_servicesrels_1_0= ruleReactsRelationServ
            	    {

            	    					newCompositeNode(grammarAccess.getReactServicesRelationAccess().getServicesrelsReactsRelationServParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_145);
            	    lv_servicesrels_1_0=ruleReactsRelationServ();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getReactServicesRelationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"servicesrels",
            	    						lv_servicesrels_1_0,
            	    						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.ReactsRelationServ");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt46 >= 1 ) break loop46;
                        EarlyExitException eee =
                            new EarlyExitException(46, input);
                        throw eee;
                }
                cnt46++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReactServicesRelation"


    // $ANTLR start "entryRuleReactsRelationServ"
    // InternalSoftGalleryLanguage.g:7505:1: entryRuleReactsRelationServ returns [EObject current=null] : iv_ruleReactsRelationServ= ruleReactsRelationServ EOF ;
    public final EObject entryRuleReactsRelationServ() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactsRelationServ = null;


        try {
            // InternalSoftGalleryLanguage.g:7505:59: (iv_ruleReactsRelationServ= ruleReactsRelationServ EOF )
            // InternalSoftGalleryLanguage.g:7506:2: iv_ruleReactsRelationServ= ruleReactsRelationServ EOF
            {
             newCompositeNode(grammarAccess.getReactsRelationServRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReactsRelationServ=ruleReactsRelationServ();

            state._fsp--;

             current =iv_ruleReactsRelationServ; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReactsRelationServ"


    // $ANTLR start "ruleReactsRelationServ"
    // InternalSoftGalleryLanguage.g:7512:1: ruleReactsRelationServ returns [EObject current=null] : ( ( (lv_reactrelationcontent_0_0= ruleReactServicesType ) ) ( (lv_name_1_0= RULE_ID ) ) ruleReactRequest ) ;
    public final EObject ruleReactsRelationServ() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_reactrelationcontent_0_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:7518:2: ( ( ( (lv_reactrelationcontent_0_0= ruleReactServicesType ) ) ( (lv_name_1_0= RULE_ID ) ) ruleReactRequest ) )
            // InternalSoftGalleryLanguage.g:7519:2: ( ( (lv_reactrelationcontent_0_0= ruleReactServicesType ) ) ( (lv_name_1_0= RULE_ID ) ) ruleReactRequest )
            {
            // InternalSoftGalleryLanguage.g:7519:2: ( ( (lv_reactrelationcontent_0_0= ruleReactServicesType ) ) ( (lv_name_1_0= RULE_ID ) ) ruleReactRequest )
            // InternalSoftGalleryLanguage.g:7520:3: ( (lv_reactrelationcontent_0_0= ruleReactServicesType ) ) ( (lv_name_1_0= RULE_ID ) ) ruleReactRequest
            {
            // InternalSoftGalleryLanguage.g:7520:3: ( (lv_reactrelationcontent_0_0= ruleReactServicesType ) )
            // InternalSoftGalleryLanguage.g:7521:4: (lv_reactrelationcontent_0_0= ruleReactServicesType )
            {
            // InternalSoftGalleryLanguage.g:7521:4: (lv_reactrelationcontent_0_0= ruleReactServicesType )
            // InternalSoftGalleryLanguage.g:7522:5: lv_reactrelationcontent_0_0= ruleReactServicesType
            {

            					newCompositeNode(grammarAccess.getReactsRelationServAccess().getReactrelationcontentReactServicesTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
            lv_reactrelationcontent_0_0=ruleReactServicesType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReactsRelationServRule());
            					}
            					add(
            						current,
            						"reactrelationcontent",
            						lv_reactrelationcontent_0_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.ReactServicesType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftGalleryLanguage.g:7539:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:7540:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:7540:4: (lv_name_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:7541:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_146); 

            					newLeafNode(lv_name_1_0, grammarAccess.getReactsRelationServAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReactsRelationServRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            			newCompositeNode(grammarAccess.getReactsRelationServAccess().getReactRequestParserRuleCall_2());
            		
            pushFollow(FOLLOW_2);
            ruleReactRequest();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReactsRelationServ"


    // $ANTLR start "entryRuleReactRequest"
    // InternalSoftGalleryLanguage.g:7568:1: entryRuleReactRequest returns [String current=null] : iv_ruleReactRequest= ruleReactRequest EOF ;
    public final String entryRuleReactRequest() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReactRequest = null;


        try {
            // InternalSoftGalleryLanguage.g:7568:52: (iv_ruleReactRequest= ruleReactRequest EOF )
            // InternalSoftGalleryLanguage.g:7569:2: iv_ruleReactRequest= ruleReactRequest EOF
            {
             newCompositeNode(grammarAccess.getReactRequestRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReactRequest=ruleReactRequest();

            state._fsp--;

             current =iv_ruleReactRequest.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReactRequest"


    // $ANTLR start "ruleReactRequest"
    // InternalSoftGalleryLanguage.g:7575:1: ruleReactRequest returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Wrapper' | kw= 'AuxWrapper' ) ;
    public final AntlrDatatypeRuleToken ruleReactRequest() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:7581:2: ( (kw= 'Wrapper' | kw= 'AuxWrapper' ) )
            // InternalSoftGalleryLanguage.g:7582:2: (kw= 'Wrapper' | kw= 'AuxWrapper' )
            {
            // InternalSoftGalleryLanguage.g:7582:2: (kw= 'Wrapper' | kw= 'AuxWrapper' )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==151) ) {
                alt47=1;
            }
            else if ( (LA47_0==152) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalSoftGalleryLanguage.g:7583:3: kw= 'Wrapper'
                    {
                    kw=(Token)match(input,151,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReactRequestAccess().getWrapperKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSoftGalleryLanguage.g:7589:3: kw= 'AuxWrapper'
                    {
                    kw=(Token)match(input,152,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReactRequestAccess().getAuxWrapperKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReactRequest"


    // $ANTLR start "entryRuleReactLibraries"
    // InternalSoftGalleryLanguage.g:7598:1: entryRuleReactLibraries returns [EObject current=null] : iv_ruleReactLibraries= ruleReactLibraries EOF ;
    public final EObject entryRuleReactLibraries() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactLibraries = null;


        try {
            // InternalSoftGalleryLanguage.g:7598:55: (iv_ruleReactLibraries= ruleReactLibraries EOF )
            // InternalSoftGalleryLanguage.g:7599:2: iv_ruleReactLibraries= ruleReactLibraries EOF
            {
             newCompositeNode(grammarAccess.getReactLibrariesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReactLibraries=ruleReactLibraries();

            state._fsp--;

             current =iv_ruleReactLibraries; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReactLibraries"


    // $ANTLR start "ruleReactLibraries"
    // InternalSoftGalleryLanguage.g:7605:1: ruleReactLibraries returns [EObject current=null] : (otherlv_0= 'ReactLibraries' otherlv_1= ':' otherlv_2= '{' ( (lv_reactlibraries_3_0= ruleReactLibrary ) )+ otherlv_4= '}' ) ;
    public final EObject ruleReactLibraries() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_reactlibraries_3_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:7611:2: ( (otherlv_0= 'ReactLibraries' otherlv_1= ':' otherlv_2= '{' ( (lv_reactlibraries_3_0= ruleReactLibrary ) )+ otherlv_4= '}' ) )
            // InternalSoftGalleryLanguage.g:7612:2: (otherlv_0= 'ReactLibraries' otherlv_1= ':' otherlv_2= '{' ( (lv_reactlibraries_3_0= ruleReactLibrary ) )+ otherlv_4= '}' )
            {
            // InternalSoftGalleryLanguage.g:7612:2: (otherlv_0= 'ReactLibraries' otherlv_1= ':' otherlv_2= '{' ( (lv_reactlibraries_3_0= ruleReactLibrary ) )+ otherlv_4= '}' )
            // InternalSoftGalleryLanguage.g:7613:3: otherlv_0= 'ReactLibraries' otherlv_1= ':' otherlv_2= '{' ( (lv_reactlibraries_3_0= ruleReactLibrary ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,153,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getReactLibrariesAccess().getReactLibrariesKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getReactLibrariesAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_147); 

            			newLeafNode(otherlv_2, grammarAccess.getReactLibrariesAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSoftGalleryLanguage.g:7625:3: ( (lv_reactlibraries_3_0= ruleReactLibrary ) )+
            int cnt48=0;
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( ((LA48_0>=155 && LA48_0<=160)) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalSoftGalleryLanguage.g:7626:4: (lv_reactlibraries_3_0= ruleReactLibrary )
            	    {
            	    // InternalSoftGalleryLanguage.g:7626:4: (lv_reactlibraries_3_0= ruleReactLibrary )
            	    // InternalSoftGalleryLanguage.g:7627:5: lv_reactlibraries_3_0= ruleReactLibrary
            	    {

            	    					newCompositeNode(grammarAccess.getReactLibrariesAccess().getReactlibrariesReactLibraryParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_148);
            	    lv_reactlibraries_3_0=ruleReactLibrary();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getReactLibrariesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"reactlibraries",
            	    						lv_reactlibraries_3_0,
            	    						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.ReactLibrary");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt48 >= 1 ) break loop48;
                        EarlyExitException eee =
                            new EarlyExitException(48, input);
                        throw eee;
                }
                cnt48++;
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getReactLibrariesAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReactLibraries"


    // $ANTLR start "entryRuleReactLibrary"
    // InternalSoftGalleryLanguage.g:7652:1: entryRuleReactLibrary returns [EObject current=null] : iv_ruleReactLibrary= ruleReactLibrary EOF ;
    public final EObject entryRuleReactLibrary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactLibrary = null;


        try {
            // InternalSoftGalleryLanguage.g:7652:53: (iv_ruleReactLibrary= ruleReactLibrary EOF )
            // InternalSoftGalleryLanguage.g:7653:2: iv_ruleReactLibrary= ruleReactLibrary EOF
            {
             newCompositeNode(grammarAccess.getReactLibraryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReactLibrary=ruleReactLibrary();

            state._fsp--;

             current =iv_ruleReactLibrary; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReactLibrary"


    // $ANTLR start "ruleReactLibrary"
    // InternalSoftGalleryLanguage.g:7659:1: ruleReactLibrary returns [EObject current=null] : ( ruleReactLibraryType ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'LibraryContent' ) ;
    public final EObject ruleReactLibrary() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:7665:2: ( ( ruleReactLibraryType ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'LibraryContent' ) )
            // InternalSoftGalleryLanguage.g:7666:2: ( ruleReactLibraryType ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'LibraryContent' )
            {
            // InternalSoftGalleryLanguage.g:7666:2: ( ruleReactLibraryType ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'LibraryContent' )
            // InternalSoftGalleryLanguage.g:7667:3: ruleReactLibraryType ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'LibraryContent'
            {

            			newCompositeNode(grammarAccess.getReactLibraryAccess().getReactLibraryTypeParserRuleCall_0());
            		
            pushFollow(FOLLOW_9);
            ruleReactLibraryType();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalSoftGalleryLanguage.g:7674:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:7675:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:7675:4: (lv_name_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:7676:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_149); 

            					newLeafNode(lv_name_1_0, grammarAccess.getReactLibraryAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReactLibraryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,154,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getReactLibraryAccess().getLibraryContentKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReactLibrary"


    // $ANTLR start "entryRuleReactLibraryType"
    // InternalSoftGalleryLanguage.g:7700:1: entryRuleReactLibraryType returns [String current=null] : iv_ruleReactLibraryType= ruleReactLibraryType EOF ;
    public final String entryRuleReactLibraryType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReactLibraryType = null;


        try {
            // InternalSoftGalleryLanguage.g:7700:56: (iv_ruleReactLibraryType= ruleReactLibraryType EOF )
            // InternalSoftGalleryLanguage.g:7701:2: iv_ruleReactLibraryType= ruleReactLibraryType EOF
            {
             newCompositeNode(grammarAccess.getReactLibraryTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReactLibraryType=ruleReactLibraryType();

            state._fsp--;

             current =iv_ruleReactLibraryType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReactLibraryType"


    // $ANTLR start "ruleReactLibraryType"
    // InternalSoftGalleryLanguage.g:7707:1: ruleReactLibraryType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'ReactDesign' | kw= 'ReactRouting' | kw= 'ComponentManagement' | kw= 'StoreManagement' | kw= 'ReactDeployment' | kw= 'ConfigurationLibrary' ) ;
    public final AntlrDatatypeRuleToken ruleReactLibraryType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:7713:2: ( (kw= 'ReactDesign' | kw= 'ReactRouting' | kw= 'ComponentManagement' | kw= 'StoreManagement' | kw= 'ReactDeployment' | kw= 'ConfigurationLibrary' ) )
            // InternalSoftGalleryLanguage.g:7714:2: (kw= 'ReactDesign' | kw= 'ReactRouting' | kw= 'ComponentManagement' | kw= 'StoreManagement' | kw= 'ReactDeployment' | kw= 'ConfigurationLibrary' )
            {
            // InternalSoftGalleryLanguage.g:7714:2: (kw= 'ReactDesign' | kw= 'ReactRouting' | kw= 'ComponentManagement' | kw= 'StoreManagement' | kw= 'ReactDeployment' | kw= 'ConfigurationLibrary' )
            int alt49=6;
            switch ( input.LA(1) ) {
            case 155:
                {
                alt49=1;
                }
                break;
            case 156:
                {
                alt49=2;
                }
                break;
            case 157:
                {
                alt49=3;
                }
                break;
            case 158:
                {
                alt49=4;
                }
                break;
            case 159:
                {
                alt49=5;
                }
                break;
            case 160:
                {
                alt49=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // InternalSoftGalleryLanguage.g:7715:3: kw= 'ReactDesign'
                    {
                    kw=(Token)match(input,155,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReactLibraryTypeAccess().getReactDesignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSoftGalleryLanguage.g:7721:3: kw= 'ReactRouting'
                    {
                    kw=(Token)match(input,156,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReactLibraryTypeAccess().getReactRoutingKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSoftGalleryLanguage.g:7727:3: kw= 'ComponentManagement'
                    {
                    kw=(Token)match(input,157,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReactLibraryTypeAccess().getComponentManagementKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalSoftGalleryLanguage.g:7733:3: kw= 'StoreManagement'
                    {
                    kw=(Token)match(input,158,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReactLibraryTypeAccess().getStoreManagementKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalSoftGalleryLanguage.g:7739:3: kw= 'ReactDeployment'
                    {
                    kw=(Token)match(input,159,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReactLibraryTypeAccess().getReactDeploymentKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalSoftGalleryLanguage.g:7745:3: kw= 'ConfigurationLibrary'
                    {
                    kw=(Token)match(input,160,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReactLibraryTypeAccess().getConfigurationLibraryKeyword_5());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReactLibraryType"


    // $ANTLR start "entryRuleReactInfo"
    // InternalSoftGalleryLanguage.g:7754:1: entryRuleReactInfo returns [EObject current=null] : iv_ruleReactInfo= ruleReactInfo EOF ;
    public final EObject entryRuleReactInfo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactInfo = null;


        try {
            // InternalSoftGalleryLanguage.g:7754:50: (iv_ruleReactInfo= ruleReactInfo EOF )
            // InternalSoftGalleryLanguage.g:7755:2: iv_ruleReactInfo= ruleReactInfo EOF
            {
             newCompositeNode(grammarAccess.getReactInfoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReactInfo=ruleReactInfo();

            state._fsp--;

             current =iv_ruleReactInfo; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReactInfo"


    // $ANTLR start "ruleReactInfo"
    // InternalSoftGalleryLanguage.g:7761:1: ruleReactInfo returns [EObject current=null] : (otherlv_0= 'ReactInformation' otherlv_1= ':' otherlv_2= '{' ( (lv_reactinformation_3_0= ruleReactInformation ) )+ otherlv_4= '}' ) ;
    public final EObject ruleReactInfo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_reactinformation_3_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:7767:2: ( (otherlv_0= 'ReactInformation' otherlv_1= ':' otherlv_2= '{' ( (lv_reactinformation_3_0= ruleReactInformation ) )+ otherlv_4= '}' ) )
            // InternalSoftGalleryLanguage.g:7768:2: (otherlv_0= 'ReactInformation' otherlv_1= ':' otherlv_2= '{' ( (lv_reactinformation_3_0= ruleReactInformation ) )+ otherlv_4= '}' )
            {
            // InternalSoftGalleryLanguage.g:7768:2: (otherlv_0= 'ReactInformation' otherlv_1= ':' otherlv_2= '{' ( (lv_reactinformation_3_0= ruleReactInformation ) )+ otherlv_4= '}' )
            // InternalSoftGalleryLanguage.g:7769:3: otherlv_0= 'ReactInformation' otherlv_1= ':' otherlv_2= '{' ( (lv_reactinformation_3_0= ruleReactInformation ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,161,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getReactInfoAccess().getReactInformationKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getReactInfoAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_150); 

            			newLeafNode(otherlv_2, grammarAccess.getReactInfoAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSoftGalleryLanguage.g:7781:3: ( (lv_reactinformation_3_0= ruleReactInformation ) )+
            int cnt50=0;
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( ((LA50_0>=163 && LA50_0<=164)) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalSoftGalleryLanguage.g:7782:4: (lv_reactinformation_3_0= ruleReactInformation )
            	    {
            	    // InternalSoftGalleryLanguage.g:7782:4: (lv_reactinformation_3_0= ruleReactInformation )
            	    // InternalSoftGalleryLanguage.g:7783:5: lv_reactinformation_3_0= ruleReactInformation
            	    {

            	    					newCompositeNode(grammarAccess.getReactInfoAccess().getReactinformationReactInformationParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_151);
            	    lv_reactinformation_3_0=ruleReactInformation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getReactInfoRule());
            	    					}
            	    					add(
            	    						current,
            	    						"reactinformation",
            	    						lv_reactinformation_3_0,
            	    						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.ReactInformation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt50 >= 1 ) break loop50;
                        EarlyExitException eee =
                            new EarlyExitException(50, input);
                        throw eee;
                }
                cnt50++;
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getReactInfoAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReactInfo"


    // $ANTLR start "entryRuleReactInformation"
    // InternalSoftGalleryLanguage.g:7808:1: entryRuleReactInformation returns [EObject current=null] : iv_ruleReactInformation= ruleReactInformation EOF ;
    public final EObject entryRuleReactInformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactInformation = null;


        try {
            // InternalSoftGalleryLanguage.g:7808:57: (iv_ruleReactInformation= ruleReactInformation EOF )
            // InternalSoftGalleryLanguage.g:7809:2: iv_ruleReactInformation= ruleReactInformation EOF
            {
             newCompositeNode(grammarAccess.getReactInformationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReactInformation=ruleReactInformation();

            state._fsp--;

             current =iv_ruleReactInformation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReactInformation"


    // $ANTLR start "ruleReactInformation"
    // InternalSoftGalleryLanguage.g:7815:1: ruleReactInformation returns [EObject current=null] : ( ruleReactInformationType ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'InformationContent' ) ;
    public final EObject ruleReactInformation() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:7821:2: ( ( ruleReactInformationType ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'InformationContent' ) )
            // InternalSoftGalleryLanguage.g:7822:2: ( ruleReactInformationType ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'InformationContent' )
            {
            // InternalSoftGalleryLanguage.g:7822:2: ( ruleReactInformationType ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'InformationContent' )
            // InternalSoftGalleryLanguage.g:7823:3: ruleReactInformationType ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'InformationContent'
            {

            			newCompositeNode(grammarAccess.getReactInformationAccess().getReactInformationTypeParserRuleCall_0());
            		
            pushFollow(FOLLOW_9);
            ruleReactInformationType();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalSoftGalleryLanguage.g:7830:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:7831:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:7831:4: (lv_name_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:7832:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_152); 

            					newLeafNode(lv_name_1_0, grammarAccess.getReactInformationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReactInformationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,162,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getReactInformationAccess().getInformationContentKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReactInformation"


    // $ANTLR start "entryRuleReactInformationType"
    // InternalSoftGalleryLanguage.g:7856:1: entryRuleReactInformationType returns [String current=null] : iv_ruleReactInformationType= ruleReactInformationType EOF ;
    public final String entryRuleReactInformationType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReactInformationType = null;


        try {
            // InternalSoftGalleryLanguage.g:7856:60: (iv_ruleReactInformationType= ruleReactInformationType EOF )
            // InternalSoftGalleryLanguage.g:7857:2: iv_ruleReactInformationType= ruleReactInformationType EOF
            {
             newCompositeNode(grammarAccess.getReactInformationTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReactInformationType=ruleReactInformationType();

            state._fsp--;

             current =iv_ruleReactInformationType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReactInformationType"


    // $ANTLR start "ruleReactInformationType"
    // InternalSoftGalleryLanguage.g:7863:1: ruleReactInformationType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'ReactReadme' | kw= 'ReactAditionalInfo' ) ;
    public final AntlrDatatypeRuleToken ruleReactInformationType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:7869:2: ( (kw= 'ReactReadme' | kw= 'ReactAditionalInfo' ) )
            // InternalSoftGalleryLanguage.g:7870:2: (kw= 'ReactReadme' | kw= 'ReactAditionalInfo' )
            {
            // InternalSoftGalleryLanguage.g:7870:2: (kw= 'ReactReadme' | kw= 'ReactAditionalInfo' )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==163) ) {
                alt51=1;
            }
            else if ( (LA51_0==164) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // InternalSoftGalleryLanguage.g:7871:3: kw= 'ReactReadme'
                    {
                    kw=(Token)match(input,163,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReactInformationTypeAccess().getReactReadmeKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSoftGalleryLanguage.g:7877:3: kw= 'ReactAditionalInfo'
                    {
                    kw=(Token)match(input,164,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReactInformationTypeAccess().getReactAditionalInfoKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReactInformationType"


    // $ANTLR start "entryRulePostgreSQL"
    // InternalSoftGalleryLanguage.g:7886:1: entryRulePostgreSQL returns [EObject current=null] : iv_rulePostgreSQL= rulePostgreSQL EOF ;
    public final EObject entryRulePostgreSQL() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostgreSQL = null;


        try {
            // InternalSoftGalleryLanguage.g:7886:51: (iv_rulePostgreSQL= rulePostgreSQL EOF )
            // InternalSoftGalleryLanguage.g:7887:2: iv_rulePostgreSQL= rulePostgreSQL EOF
            {
             newCompositeNode(grammarAccess.getPostgreSQLRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePostgreSQL=rulePostgreSQL();

            state._fsp--;

             current =iv_rulePostgreSQL; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePostgreSQL"


    // $ANTLR start "rulePostgreSQL"
    // InternalSoftGalleryLanguage.g:7893:1: rulePostgreSQL returns [EObject current=null] : (otherlv_0= 'PostgreSQL' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleCluster ) ) otherlv_5= '}' ) ;
    public final EObject rulePostgreSQL() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:7899:2: ( (otherlv_0= 'PostgreSQL' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleCluster ) ) otherlv_5= '}' ) )
            // InternalSoftGalleryLanguage.g:7900:2: (otherlv_0= 'PostgreSQL' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleCluster ) ) otherlv_5= '}' )
            {
            // InternalSoftGalleryLanguage.g:7900:2: (otherlv_0= 'PostgreSQL' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleCluster ) ) otherlv_5= '}' )
            // InternalSoftGalleryLanguage.g:7901:3: otherlv_0= 'PostgreSQL' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleCluster ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,165,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getPostgreSQLAccess().getPostgreSQLKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:7905:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:7906:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:7906:4: (lv_name_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:7907:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPostgreSQLAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPostgreSQLRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getPostgreSQLAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_153); 

            			newLeafNode(otherlv_3, grammarAccess.getPostgreSQLAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSoftGalleryLanguage.g:7931:3: ( (lv_elements_4_0= ruleCluster ) )
            // InternalSoftGalleryLanguage.g:7932:4: (lv_elements_4_0= ruleCluster )
            {
            // InternalSoftGalleryLanguage.g:7932:4: (lv_elements_4_0= ruleCluster )
            // InternalSoftGalleryLanguage.g:7933:5: lv_elements_4_0= ruleCluster
            {

            					newCompositeNode(grammarAccess.getPostgreSQLAccess().getElementsClusterParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_elements_4_0=ruleCluster();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPostgreSQLRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_4_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.Cluster");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPostgreSQLAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePostgreSQL"


    // $ANTLR start "entryRuleCluster"
    // InternalSoftGalleryLanguage.g:7958:1: entryRuleCluster returns [EObject current=null] : iv_ruleCluster= ruleCluster EOF ;
    public final EObject entryRuleCluster() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCluster = null;


        try {
            // InternalSoftGalleryLanguage.g:7958:48: (iv_ruleCluster= ruleCluster EOF )
            // InternalSoftGalleryLanguage.g:7959:2: iv_ruleCluster= ruleCluster EOF
            {
             newCompositeNode(grammarAccess.getClusterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCluster=ruleCluster();

            state._fsp--;

             current =iv_ruleCluster; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCluster"


    // $ANTLR start "ruleCluster"
    // InternalSoftGalleryLanguage.g:7965:1: ruleCluster returns [EObject current=null] : (otherlv_0= 'Database' ( (lv_elements_1_0= ruleDatabase ) ) ( (lv_elements_2_0= rulePostgresUser ) )+ ) ;
    public final EObject ruleCluster() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_elements_1_0 = null;

        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:7971:2: ( (otherlv_0= 'Database' ( (lv_elements_1_0= ruleDatabase ) ) ( (lv_elements_2_0= rulePostgresUser ) )+ ) )
            // InternalSoftGalleryLanguage.g:7972:2: (otherlv_0= 'Database' ( (lv_elements_1_0= ruleDatabase ) ) ( (lv_elements_2_0= rulePostgresUser ) )+ )
            {
            // InternalSoftGalleryLanguage.g:7972:2: (otherlv_0= 'Database' ( (lv_elements_1_0= ruleDatabase ) ) ( (lv_elements_2_0= rulePostgresUser ) )+ )
            // InternalSoftGalleryLanguage.g:7973:3: otherlv_0= 'Database' ( (lv_elements_1_0= ruleDatabase ) ) ( (lv_elements_2_0= rulePostgresUser ) )+
            {
            otherlv_0=(Token)match(input,166,FOLLOW_154); 

            			newLeafNode(otherlv_0, grammarAccess.getClusterAccess().getDatabaseKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:7977:3: ( (lv_elements_1_0= ruleDatabase ) )
            // InternalSoftGalleryLanguage.g:7978:4: (lv_elements_1_0= ruleDatabase )
            {
            // InternalSoftGalleryLanguage.g:7978:4: (lv_elements_1_0= ruleDatabase )
            // InternalSoftGalleryLanguage.g:7979:5: lv_elements_1_0= ruleDatabase
            {

            					newCompositeNode(grammarAccess.getClusterAccess().getElementsDatabaseParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_155);
            lv_elements_1_0=ruleDatabase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClusterRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_1_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.Database");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftGalleryLanguage.g:7996:3: ( (lv_elements_2_0= rulePostgresUser ) )+
            int cnt52=0;
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==181) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalSoftGalleryLanguage.g:7997:4: (lv_elements_2_0= rulePostgresUser )
            	    {
            	    // InternalSoftGalleryLanguage.g:7997:4: (lv_elements_2_0= rulePostgresUser )
            	    // InternalSoftGalleryLanguage.g:7998:5: lv_elements_2_0= rulePostgresUser
            	    {

            	    					newCompositeNode(grammarAccess.getClusterAccess().getElementsPostgresUserParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_156);
            	    lv_elements_2_0=rulePostgresUser();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getClusterRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_2_0,
            	    						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.PostgresUser");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt52 >= 1 ) break loop52;
                        EarlyExitException eee =
                            new EarlyExitException(52, input);
                        throw eee;
                }
                cnt52++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCluster"


    // $ANTLR start "entryRuleDatabase"
    // InternalSoftGalleryLanguage.g:8019:1: entryRuleDatabase returns [EObject current=null] : iv_ruleDatabase= ruleDatabase EOF ;
    public final EObject entryRuleDatabase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatabase = null;


        try {
            // InternalSoftGalleryLanguage.g:8019:49: (iv_ruleDatabase= ruleDatabase EOF )
            // InternalSoftGalleryLanguage.g:8020:2: iv_ruleDatabase= ruleDatabase EOF
            {
             newCompositeNode(grammarAccess.getDatabaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDatabase=ruleDatabase();

            state._fsp--;

             current =iv_ruleDatabase; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDatabase"


    // $ANTLR start "ruleDatabase"
    // InternalSoftGalleryLanguage.g:8026:1: ruleDatabase returns [EObject current=null] : (otherlv_0= 'Schema' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleSchema ) ) ) ;
    public final EObject ruleDatabase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:8032:2: ( (otherlv_0= 'Schema' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleSchema ) ) ) )
            // InternalSoftGalleryLanguage.g:8033:2: (otherlv_0= 'Schema' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleSchema ) ) )
            {
            // InternalSoftGalleryLanguage.g:8033:2: (otherlv_0= 'Schema' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleSchema ) ) )
            // InternalSoftGalleryLanguage.g:8034:3: otherlv_0= 'Schema' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleSchema ) )
            {
            otherlv_0=(Token)match(input,167,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getDatabaseAccess().getSchemaKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:8038:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:8039:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:8039:4: (lv_name_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:8040:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_157); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDatabaseAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDatabaseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSoftGalleryLanguage.g:8056:3: ( (lv_elements_2_0= ruleSchema ) )
            // InternalSoftGalleryLanguage.g:8057:4: (lv_elements_2_0= ruleSchema )
            {
            // InternalSoftGalleryLanguage.g:8057:4: (lv_elements_2_0= ruleSchema )
            // InternalSoftGalleryLanguage.g:8058:5: lv_elements_2_0= ruleSchema
            {

            					newCompositeNode(grammarAccess.getDatabaseAccess().getElementsSchemaParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_elements_2_0=ruleSchema();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDatabaseRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_2_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.Schema");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDatabase"


    // $ANTLR start "entryRuleSchema"
    // InternalSoftGalleryLanguage.g:8079:1: entryRuleSchema returns [EObject current=null] : iv_ruleSchema= ruleSchema EOF ;
    public final EObject entryRuleSchema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchema = null;


        try {
            // InternalSoftGalleryLanguage.g:8079:47: (iv_ruleSchema= ruleSchema EOF )
            // InternalSoftGalleryLanguage.g:8080:2: iv_ruleSchema= ruleSchema EOF
            {
             newCompositeNode(grammarAccess.getSchemaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSchema=ruleSchema();

            state._fsp--;

             current =iv_ruleSchema; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSchema"


    // $ANTLR start "ruleSchema"
    // InternalSoftGalleryLanguage.g:8086:1: ruleSchema returns [EObject current=null] : ( ( (lv_elements_0_0= ruleIndex_p ) )* ( (lv_elements_1_0= ruleViewSchema ) )* ( (lv_elements_2_0= ruleTable_p ) )+ ( (lv_elements_3_0= ruleTrigger ) )* ( (lv_elements_4_0= ruleFunction ) ) ) ;
    public final EObject ruleSchema() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;

        EObject lv_elements_1_0 = null;

        EObject lv_elements_2_0 = null;

        EObject lv_elements_3_0 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:8092:2: ( ( ( (lv_elements_0_0= ruleIndex_p ) )* ( (lv_elements_1_0= ruleViewSchema ) )* ( (lv_elements_2_0= ruleTable_p ) )+ ( (lv_elements_3_0= ruleTrigger ) )* ( (lv_elements_4_0= ruleFunction ) ) ) )
            // InternalSoftGalleryLanguage.g:8093:2: ( ( (lv_elements_0_0= ruleIndex_p ) )* ( (lv_elements_1_0= ruleViewSchema ) )* ( (lv_elements_2_0= ruleTable_p ) )+ ( (lv_elements_3_0= ruleTrigger ) )* ( (lv_elements_4_0= ruleFunction ) ) )
            {
            // InternalSoftGalleryLanguage.g:8093:2: ( ( (lv_elements_0_0= ruleIndex_p ) )* ( (lv_elements_1_0= ruleViewSchema ) )* ( (lv_elements_2_0= ruleTable_p ) )+ ( (lv_elements_3_0= ruleTrigger ) )* ( (lv_elements_4_0= ruleFunction ) ) )
            // InternalSoftGalleryLanguage.g:8094:3: ( (lv_elements_0_0= ruleIndex_p ) )* ( (lv_elements_1_0= ruleViewSchema ) )* ( (lv_elements_2_0= ruleTable_p ) )+ ( (lv_elements_3_0= ruleTrigger ) )* ( (lv_elements_4_0= ruleFunction ) )
            {
            // InternalSoftGalleryLanguage.g:8094:3: ( (lv_elements_0_0= ruleIndex_p ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==168) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalSoftGalleryLanguage.g:8095:4: (lv_elements_0_0= ruleIndex_p )
            	    {
            	    // InternalSoftGalleryLanguage.g:8095:4: (lv_elements_0_0= ruleIndex_p )
            	    // InternalSoftGalleryLanguage.g:8096:5: lv_elements_0_0= ruleIndex_p
            	    {

            	    					newCompositeNode(grammarAccess.getSchemaAccess().getElementsIndex_pParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_157);
            	    lv_elements_0_0=ruleIndex_p();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_0_0,
            	    						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.Index_p");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            // InternalSoftGalleryLanguage.g:8113:3: ( (lv_elements_1_0= ruleViewSchema ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==169) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalSoftGalleryLanguage.g:8114:4: (lv_elements_1_0= ruleViewSchema )
            	    {
            	    // InternalSoftGalleryLanguage.g:8114:4: (lv_elements_1_0= ruleViewSchema )
            	    // InternalSoftGalleryLanguage.g:8115:5: lv_elements_1_0= ruleViewSchema
            	    {

            	    					newCompositeNode(grammarAccess.getSchemaAccess().getElementsViewSchemaParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_157);
            	    lv_elements_1_0=ruleViewSchema();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_1_0,
            	    						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.ViewSchema");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

            // InternalSoftGalleryLanguage.g:8132:3: ( (lv_elements_2_0= ruleTable_p ) )+
            int cnt55=0;
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==170) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalSoftGalleryLanguage.g:8133:4: (lv_elements_2_0= ruleTable_p )
            	    {
            	    // InternalSoftGalleryLanguage.g:8133:4: (lv_elements_2_0= ruleTable_p )
            	    // InternalSoftGalleryLanguage.g:8134:5: lv_elements_2_0= ruleTable_p
            	    {

            	    					newCompositeNode(grammarAccess.getSchemaAccess().getElementsTable_pParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_158);
            	    lv_elements_2_0=ruleTable_p();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_2_0,
            	    						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.Table_p");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt55 >= 1 ) break loop55;
                        EarlyExitException eee =
                            new EarlyExitException(55, input);
                        throw eee;
                }
                cnt55++;
            } while (true);

            // InternalSoftGalleryLanguage.g:8151:3: ( (lv_elements_3_0= ruleTrigger ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==179) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalSoftGalleryLanguage.g:8152:4: (lv_elements_3_0= ruleTrigger )
            	    {
            	    // InternalSoftGalleryLanguage.g:8152:4: (lv_elements_3_0= ruleTrigger )
            	    // InternalSoftGalleryLanguage.g:8153:5: lv_elements_3_0= ruleTrigger
            	    {

            	    					newCompositeNode(grammarAccess.getSchemaAccess().getElementsTriggerParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_159);
            	    lv_elements_3_0=ruleTrigger();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_3_0,
            	    						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.Trigger");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

            // InternalSoftGalleryLanguage.g:8170:3: ( (lv_elements_4_0= ruleFunction ) )
            // InternalSoftGalleryLanguage.g:8171:4: (lv_elements_4_0= ruleFunction )
            {
            // InternalSoftGalleryLanguage.g:8171:4: (lv_elements_4_0= ruleFunction )
            // InternalSoftGalleryLanguage.g:8172:5: lv_elements_4_0= ruleFunction
            {

            					newCompositeNode(grammarAccess.getSchemaAccess().getElementsFunctionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_elements_4_0=ruleFunction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSchemaRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_4_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.Function");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSchema"


    // $ANTLR start "entryRuleIndex_p"
    // InternalSoftGalleryLanguage.g:8193:1: entryRuleIndex_p returns [EObject current=null] : iv_ruleIndex_p= ruleIndex_p EOF ;
    public final EObject entryRuleIndex_p() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndex_p = null;


        try {
            // InternalSoftGalleryLanguage.g:8193:48: (iv_ruleIndex_p= ruleIndex_p EOF )
            // InternalSoftGalleryLanguage.g:8194:2: iv_ruleIndex_p= ruleIndex_p EOF
            {
             newCompositeNode(grammarAccess.getIndex_pRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIndex_p=ruleIndex_p();

            state._fsp--;

             current =iv_ruleIndex_p; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIndex_p"


    // $ANTLR start "ruleIndex_p"
    // InternalSoftGalleryLanguage.g:8200:1: ruleIndex_p returns [EObject current=null] : (otherlv_0= 'Index_p' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleIndex_p() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:8206:2: ( (otherlv_0= 'Index_p' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftGalleryLanguage.g:8207:2: (otherlv_0= 'Index_p' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftGalleryLanguage.g:8207:2: (otherlv_0= 'Index_p' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftGalleryLanguage.g:8208:3: otherlv_0= 'Index_p' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,168,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getIndex_pAccess().getIndex_pKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:8212:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:8213:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:8213:4: (lv_name_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:8214:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getIndex_pAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIndex_pRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIndex_p"


    // $ANTLR start "entryRuleViewSchema"
    // InternalSoftGalleryLanguage.g:8234:1: entryRuleViewSchema returns [EObject current=null] : iv_ruleViewSchema= ruleViewSchema EOF ;
    public final EObject entryRuleViewSchema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViewSchema = null;


        try {
            // InternalSoftGalleryLanguage.g:8234:51: (iv_ruleViewSchema= ruleViewSchema EOF )
            // InternalSoftGalleryLanguage.g:8235:2: iv_ruleViewSchema= ruleViewSchema EOF
            {
             newCompositeNode(grammarAccess.getViewSchemaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleViewSchema=ruleViewSchema();

            state._fsp--;

             current =iv_ruleViewSchema; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleViewSchema"


    // $ANTLR start "ruleViewSchema"
    // InternalSoftGalleryLanguage.g:8241:1: ruleViewSchema returns [EObject current=null] : (otherlv_0= 'ViewSchema' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleViewSchema() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:8247:2: ( (otherlv_0= 'ViewSchema' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftGalleryLanguage.g:8248:2: (otherlv_0= 'ViewSchema' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftGalleryLanguage.g:8248:2: (otherlv_0= 'ViewSchema' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftGalleryLanguage.g:8249:3: otherlv_0= 'ViewSchema' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,169,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getViewSchemaAccess().getViewSchemaKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:8253:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:8254:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:8254:4: (lv_name_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:8255:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getViewSchemaAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getViewSchemaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleViewSchema"


    // $ANTLR start "entryRuleTable_p"
    // InternalSoftGalleryLanguage.g:8275:1: entryRuleTable_p returns [EObject current=null] : iv_ruleTable_p= ruleTable_p EOF ;
    public final EObject entryRuleTable_p() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable_p = null;


        try {
            // InternalSoftGalleryLanguage.g:8275:48: (iv_ruleTable_p= ruleTable_p EOF )
            // InternalSoftGalleryLanguage.g:8276:2: iv_ruleTable_p= ruleTable_p EOF
            {
             newCompositeNode(grammarAccess.getTable_pRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTable_p=ruleTable_p();

            state._fsp--;

             current =iv_ruleTable_p; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTable_p"


    // $ANTLR start "ruleTable_p"
    // InternalSoftGalleryLanguage.g:8282:1: ruleTable_p returns [EObject current=null] : (otherlv_0= 'Table_p' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleForeignKey ) )+ ( (lv_elements_5_0= ruleColumn ) )+ ( (lv_elements_6_0= ruleRow ) )+ otherlv_7= '}' ) ;
    public final EObject ruleTable_p() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_7=null;
        EObject lv_elements_4_0 = null;

        EObject lv_elements_5_0 = null;

        EObject lv_elements_6_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:8288:2: ( (otherlv_0= 'Table_p' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleForeignKey ) )+ ( (lv_elements_5_0= ruleColumn ) )+ ( (lv_elements_6_0= ruleRow ) )+ otherlv_7= '}' ) )
            // InternalSoftGalleryLanguage.g:8289:2: (otherlv_0= 'Table_p' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleForeignKey ) )+ ( (lv_elements_5_0= ruleColumn ) )+ ( (lv_elements_6_0= ruleRow ) )+ otherlv_7= '}' )
            {
            // InternalSoftGalleryLanguage.g:8289:2: (otherlv_0= 'Table_p' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleForeignKey ) )+ ( (lv_elements_5_0= ruleColumn ) )+ ( (lv_elements_6_0= ruleRow ) )+ otherlv_7= '}' )
            // InternalSoftGalleryLanguage.g:8290:3: otherlv_0= 'Table_p' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleForeignKey ) )+ ( (lv_elements_5_0= ruleColumn ) )+ ( (lv_elements_6_0= ruleRow ) )+ otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,170,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getTable_pAccess().getTable_pKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:8294:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:8295:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:8295:4: (lv_name_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:8296:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTable_pAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTable_pRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getTable_pAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_160); 

            			newLeafNode(otherlv_3, grammarAccess.getTable_pAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSoftGalleryLanguage.g:8320:3: ( (lv_elements_4_0= ruleForeignKey ) )+
            int cnt57=0;
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==171) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalSoftGalleryLanguage.g:8321:4: (lv_elements_4_0= ruleForeignKey )
            	    {
            	    // InternalSoftGalleryLanguage.g:8321:4: (lv_elements_4_0= ruleForeignKey )
            	    // InternalSoftGalleryLanguage.g:8322:5: lv_elements_4_0= ruleForeignKey
            	    {

            	    					newCompositeNode(grammarAccess.getTable_pAccess().getElementsForeignKeyParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_161);
            	    lv_elements_4_0=ruleForeignKey();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTable_pRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_4_0,
            	    						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.ForeignKey");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt57 >= 1 ) break loop57;
                        EarlyExitException eee =
                            new EarlyExitException(57, input);
                        throw eee;
                }
                cnt57++;
            } while (true);

            // InternalSoftGalleryLanguage.g:8339:3: ( (lv_elements_5_0= ruleColumn ) )+
            int cnt58=0;
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==107) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalSoftGalleryLanguage.g:8340:4: (lv_elements_5_0= ruleColumn )
            	    {
            	    // InternalSoftGalleryLanguage.g:8340:4: (lv_elements_5_0= ruleColumn )
            	    // InternalSoftGalleryLanguage.g:8341:5: lv_elements_5_0= ruleColumn
            	    {

            	    					newCompositeNode(grammarAccess.getTable_pAccess().getElementsColumnParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_162);
            	    lv_elements_5_0=ruleColumn();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTable_pRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_5_0,
            	    						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.Column");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt58 >= 1 ) break loop58;
                        EarlyExitException eee =
                            new EarlyExitException(58, input);
                        throw eee;
                }
                cnt58++;
            } while (true);

            // InternalSoftGalleryLanguage.g:8358:3: ( (lv_elements_6_0= ruleRow ) )+
            int cnt59=0;
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==177) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalSoftGalleryLanguage.g:8359:4: (lv_elements_6_0= ruleRow )
            	    {
            	    // InternalSoftGalleryLanguage.g:8359:4: (lv_elements_6_0= ruleRow )
            	    // InternalSoftGalleryLanguage.g:8360:5: lv_elements_6_0= ruleRow
            	    {

            	    					newCompositeNode(grammarAccess.getTable_pAccess().getElementsRowParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_163);
            	    lv_elements_6_0=ruleRow();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTable_pRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_6_0,
            	    						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.Row");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt59 >= 1 ) break loop59;
                        EarlyExitException eee =
                            new EarlyExitException(59, input);
                        throw eee;
                }
                cnt59++;
            } while (true);

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getTable_pAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTable_p"


    // $ANTLR start "entryRuleForeignKey"
    // InternalSoftGalleryLanguage.g:8385:1: entryRuleForeignKey returns [EObject current=null] : iv_ruleForeignKey= ruleForeignKey EOF ;
    public final EObject entryRuleForeignKey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForeignKey = null;


        try {
            // InternalSoftGalleryLanguage.g:8385:51: (iv_ruleForeignKey= ruleForeignKey EOF )
            // InternalSoftGalleryLanguage.g:8386:2: iv_ruleForeignKey= ruleForeignKey EOF
            {
             newCompositeNode(grammarAccess.getForeignKeyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForeignKey=ruleForeignKey();

            state._fsp--;

             current =iv_ruleForeignKey; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForeignKey"


    // $ANTLR start "ruleForeignKey"
    // InternalSoftGalleryLanguage.g:8392:1: ruleForeignKey returns [EObject current=null] : (otherlv_0= 'ForeignKey' ( (lv_elements_1_0= ruleForeignKey_n ) ) ( (lv_elements_2_0= ruleForeignKeyRef ) ) ) ;
    public final EObject ruleForeignKey() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_elements_1_0 = null;

        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:8398:2: ( (otherlv_0= 'ForeignKey' ( (lv_elements_1_0= ruleForeignKey_n ) ) ( (lv_elements_2_0= ruleForeignKeyRef ) ) ) )
            // InternalSoftGalleryLanguage.g:8399:2: (otherlv_0= 'ForeignKey' ( (lv_elements_1_0= ruleForeignKey_n ) ) ( (lv_elements_2_0= ruleForeignKeyRef ) ) )
            {
            // InternalSoftGalleryLanguage.g:8399:2: (otherlv_0= 'ForeignKey' ( (lv_elements_1_0= ruleForeignKey_n ) ) ( (lv_elements_2_0= ruleForeignKeyRef ) ) )
            // InternalSoftGalleryLanguage.g:8400:3: otherlv_0= 'ForeignKey' ( (lv_elements_1_0= ruleForeignKey_n ) ) ( (lv_elements_2_0= ruleForeignKeyRef ) )
            {
            otherlv_0=(Token)match(input,171,FOLLOW_164); 

            			newLeafNode(otherlv_0, grammarAccess.getForeignKeyAccess().getForeignKeyKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:8404:3: ( (lv_elements_1_0= ruleForeignKey_n ) )
            // InternalSoftGalleryLanguage.g:8405:4: (lv_elements_1_0= ruleForeignKey_n )
            {
            // InternalSoftGalleryLanguage.g:8405:4: (lv_elements_1_0= ruleForeignKey_n )
            // InternalSoftGalleryLanguage.g:8406:5: lv_elements_1_0= ruleForeignKey_n
            {

            					newCompositeNode(grammarAccess.getForeignKeyAccess().getElementsForeignKey_nParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_165);
            lv_elements_1_0=ruleForeignKey_n();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForeignKeyRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_1_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.ForeignKey_n");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftGalleryLanguage.g:8423:3: ( (lv_elements_2_0= ruleForeignKeyRef ) )
            // InternalSoftGalleryLanguage.g:8424:4: (lv_elements_2_0= ruleForeignKeyRef )
            {
            // InternalSoftGalleryLanguage.g:8424:4: (lv_elements_2_0= ruleForeignKeyRef )
            // InternalSoftGalleryLanguage.g:8425:5: lv_elements_2_0= ruleForeignKeyRef
            {

            					newCompositeNode(grammarAccess.getForeignKeyAccess().getElementsForeignKeyRefParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_elements_2_0=ruleForeignKeyRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForeignKeyRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_2_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.ForeignKeyRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForeignKey"


    // $ANTLR start "entryRuleForeignKey_n"
    // InternalSoftGalleryLanguage.g:8446:1: entryRuleForeignKey_n returns [EObject current=null] : iv_ruleForeignKey_n= ruleForeignKey_n EOF ;
    public final EObject entryRuleForeignKey_n() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForeignKey_n = null;


        try {
            // InternalSoftGalleryLanguage.g:8446:53: (iv_ruleForeignKey_n= ruleForeignKey_n EOF )
            // InternalSoftGalleryLanguage.g:8447:2: iv_ruleForeignKey_n= ruleForeignKey_n EOF
            {
             newCompositeNode(grammarAccess.getForeignKey_nRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForeignKey_n=ruleForeignKey_n();

            state._fsp--;

             current =iv_ruleForeignKey_n; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForeignKey_n"


    // $ANTLR start "ruleForeignKey_n"
    // InternalSoftGalleryLanguage.g:8453:1: ruleForeignKey_n returns [EObject current=null] : (otherlv_0= 'ForeingKeyName' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleForeignKey_n() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:8459:2: ( (otherlv_0= 'ForeingKeyName' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftGalleryLanguage.g:8460:2: (otherlv_0= 'ForeingKeyName' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftGalleryLanguage.g:8460:2: (otherlv_0= 'ForeingKeyName' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftGalleryLanguage.g:8461:3: otherlv_0= 'ForeingKeyName' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,172,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getForeignKey_nAccess().getForeingKeyNameKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:8465:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:8466:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:8466:4: (lv_name_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:8467:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getForeignKey_nAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForeignKey_nRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForeignKey_n"


    // $ANTLR start "entryRuleForeignKeyRef"
    // InternalSoftGalleryLanguage.g:8487:1: entryRuleForeignKeyRef returns [EObject current=null] : iv_ruleForeignKeyRef= ruleForeignKeyRef EOF ;
    public final EObject entryRuleForeignKeyRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForeignKeyRef = null;


        try {
            // InternalSoftGalleryLanguage.g:8487:54: (iv_ruleForeignKeyRef= ruleForeignKeyRef EOF )
            // InternalSoftGalleryLanguage.g:8488:2: iv_ruleForeignKeyRef= ruleForeignKeyRef EOF
            {
             newCompositeNode(grammarAccess.getForeignKeyRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForeignKeyRef=ruleForeignKeyRef();

            state._fsp--;

             current =iv_ruleForeignKeyRef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForeignKeyRef"


    // $ANTLR start "ruleForeignKeyRef"
    // InternalSoftGalleryLanguage.g:8494:1: ruleForeignKeyRef returns [EObject current=null] : ( () otherlv_1= 'ForeignKeyRef' ( (lv_elements_2_0= ruleRefTable_p ) )* ) ;
    public final EObject ruleForeignKeyRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:8500:2: ( ( () otherlv_1= 'ForeignKeyRef' ( (lv_elements_2_0= ruleRefTable_p ) )* ) )
            // InternalSoftGalleryLanguage.g:8501:2: ( () otherlv_1= 'ForeignKeyRef' ( (lv_elements_2_0= ruleRefTable_p ) )* )
            {
            // InternalSoftGalleryLanguage.g:8501:2: ( () otherlv_1= 'ForeignKeyRef' ( (lv_elements_2_0= ruleRefTable_p ) )* )
            // InternalSoftGalleryLanguage.g:8502:3: () otherlv_1= 'ForeignKeyRef' ( (lv_elements_2_0= ruleRefTable_p ) )*
            {
            // InternalSoftGalleryLanguage.g:8502:3: ()
            // InternalSoftGalleryLanguage.g:8503:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getForeignKeyRefAccess().getForeignKeyRefAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,173,FOLLOW_166); 

            			newLeafNode(otherlv_1, grammarAccess.getForeignKeyRefAccess().getForeignKeyRefKeyword_1());
            		
            // InternalSoftGalleryLanguage.g:8513:3: ( (lv_elements_2_0= ruleRefTable_p ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==174) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalSoftGalleryLanguage.g:8514:4: (lv_elements_2_0= ruleRefTable_p )
            	    {
            	    // InternalSoftGalleryLanguage.g:8514:4: (lv_elements_2_0= ruleRefTable_p )
            	    // InternalSoftGalleryLanguage.g:8515:5: lv_elements_2_0= ruleRefTable_p
            	    {

            	    					newCompositeNode(grammarAccess.getForeignKeyRefAccess().getElementsRefTable_pParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_166);
            	    lv_elements_2_0=ruleRefTable_p();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getForeignKeyRefRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_2_0,
            	    						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.RefTable_p");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForeignKeyRef"


    // $ANTLR start "entryRuleRefTable_p"
    // InternalSoftGalleryLanguage.g:8536:1: entryRuleRefTable_p returns [EObject current=null] : iv_ruleRefTable_p= ruleRefTable_p EOF ;
    public final EObject entryRuleRefTable_p() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefTable_p = null;


        try {
            // InternalSoftGalleryLanguage.g:8536:51: (iv_ruleRefTable_p= ruleRefTable_p EOF )
            // InternalSoftGalleryLanguage.g:8537:2: iv_ruleRefTable_p= ruleRefTable_p EOF
            {
             newCompositeNode(grammarAccess.getRefTable_pRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRefTable_p=ruleRefTable_p();

            state._fsp--;

             current =iv_ruleRefTable_p; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRefTable_p"


    // $ANTLR start "ruleRefTable_p"
    // InternalSoftGalleryLanguage.g:8543:1: ruleRefTable_p returns [EObject current=null] : (otherlv_0= 'RefTable_p' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleRefTable_p() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:8549:2: ( (otherlv_0= 'RefTable_p' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftGalleryLanguage.g:8550:2: (otherlv_0= 'RefTable_p' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftGalleryLanguage.g:8550:2: (otherlv_0= 'RefTable_p' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftGalleryLanguage.g:8551:3: otherlv_0= 'RefTable_p' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,174,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getRefTable_pAccess().getRefTable_pKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:8555:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:8556:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:8556:4: (lv_name_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:8557:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRefTable_pAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRefTable_pRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRefTable_p"


    // $ANTLR start "entryRuleColumn"
    // InternalSoftGalleryLanguage.g:8577:1: entryRuleColumn returns [EObject current=null] : iv_ruleColumn= ruleColumn EOF ;
    public final EObject entryRuleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumn = null;


        try {
            // InternalSoftGalleryLanguage.g:8577:47: (iv_ruleColumn= ruleColumn EOF )
            // InternalSoftGalleryLanguage.g:8578:2: iv_ruleColumn= ruleColumn EOF
            {
             newCompositeNode(grammarAccess.getColumnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColumn=ruleColumn();

            state._fsp--;

             current =iv_ruleColumn; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColumn"


    // $ANTLR start "ruleColumn"
    // InternalSoftGalleryLanguage.g:8584:1: ruleColumn returns [EObject current=null] : (otherlv_0= 'Column' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleDatatypeDB ) ) ( (lv_elements_3_0= ruleConstraint ) )* ) ;
    public final EObject ruleColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:8590:2: ( (otherlv_0= 'Column' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleDatatypeDB ) ) ( (lv_elements_3_0= ruleConstraint ) )* ) )
            // InternalSoftGalleryLanguage.g:8591:2: (otherlv_0= 'Column' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleDatatypeDB ) ) ( (lv_elements_3_0= ruleConstraint ) )* )
            {
            // InternalSoftGalleryLanguage.g:8591:2: (otherlv_0= 'Column' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleDatatypeDB ) ) ( (lv_elements_3_0= ruleConstraint ) )* )
            // InternalSoftGalleryLanguage.g:8592:3: otherlv_0= 'Column' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleDatatypeDB ) ) ( (lv_elements_3_0= ruleConstraint ) )*
            {
            otherlv_0=(Token)match(input,107,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getColumnAccess().getColumnKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:8596:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:8597:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:8597:4: (lv_name_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:8598:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_167); 

            					newLeafNode(lv_name_1_0, grammarAccess.getColumnAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getColumnRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSoftGalleryLanguage.g:8614:3: ( (lv_elements_2_0= ruleDatatypeDB ) )
            // InternalSoftGalleryLanguage.g:8615:4: (lv_elements_2_0= ruleDatatypeDB )
            {
            // InternalSoftGalleryLanguage.g:8615:4: (lv_elements_2_0= ruleDatatypeDB )
            // InternalSoftGalleryLanguage.g:8616:5: lv_elements_2_0= ruleDatatypeDB
            {

            					newCompositeNode(grammarAccess.getColumnAccess().getElementsDatatypeDBParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_168);
            lv_elements_2_0=ruleDatatypeDB();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColumnRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_2_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.DatatypeDB");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftGalleryLanguage.g:8633:3: ( (lv_elements_3_0= ruleConstraint ) )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==176) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // InternalSoftGalleryLanguage.g:8634:4: (lv_elements_3_0= ruleConstraint )
            	    {
            	    // InternalSoftGalleryLanguage.g:8634:4: (lv_elements_3_0= ruleConstraint )
            	    // InternalSoftGalleryLanguage.g:8635:5: lv_elements_3_0= ruleConstraint
            	    {

            	    					newCompositeNode(grammarAccess.getColumnAccess().getElementsConstraintParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_168);
            	    lv_elements_3_0=ruleConstraint();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getColumnRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_3_0,
            	    						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.Constraint");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColumn"


    // $ANTLR start "entryRuleDatatypeDB"
    // InternalSoftGalleryLanguage.g:8656:1: entryRuleDatatypeDB returns [EObject current=null] : iv_ruleDatatypeDB= ruleDatatypeDB EOF ;
    public final EObject entryRuleDatatypeDB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatatypeDB = null;


        try {
            // InternalSoftGalleryLanguage.g:8656:51: (iv_ruleDatatypeDB= ruleDatatypeDB EOF )
            // InternalSoftGalleryLanguage.g:8657:2: iv_ruleDatatypeDB= ruleDatatypeDB EOF
            {
             newCompositeNode(grammarAccess.getDatatypeDBRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDatatypeDB=ruleDatatypeDB();

            state._fsp--;

             current =iv_ruleDatatypeDB; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDatatypeDB"


    // $ANTLR start "ruleDatatypeDB"
    // InternalSoftGalleryLanguage.g:8663:1: ruleDatatypeDB returns [EObject current=null] : (otherlv_0= 'DatatypeDB' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDatatypeDB() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:8669:2: ( (otherlv_0= 'DatatypeDB' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftGalleryLanguage.g:8670:2: (otherlv_0= 'DatatypeDB' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftGalleryLanguage.g:8670:2: (otherlv_0= 'DatatypeDB' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftGalleryLanguage.g:8671:3: otherlv_0= 'DatatypeDB' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,175,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getDatatypeDBAccess().getDatatypeDBKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:8675:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:8676:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:8676:4: (lv_name_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:8677:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDatatypeDBAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDatatypeDBRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDatatypeDB"


    // $ANTLR start "entryRuleConstraint"
    // InternalSoftGalleryLanguage.g:8697:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalSoftGalleryLanguage.g:8697:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalSoftGalleryLanguage.g:8698:2: iv_ruleConstraint= ruleConstraint EOF
            {
             newCompositeNode(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;

             current =iv_ruleConstraint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // InternalSoftGalleryLanguage.g:8704:1: ruleConstraint returns [EObject current=null] : (otherlv_0= 'Constraint' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:8710:2: ( (otherlv_0= 'Constraint' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftGalleryLanguage.g:8711:2: (otherlv_0= 'Constraint' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftGalleryLanguage.g:8711:2: (otherlv_0= 'Constraint' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftGalleryLanguage.g:8712:3: otherlv_0= 'Constraint' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,176,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getConstraintAccess().getConstraintKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:8716:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:8717:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:8717:4: (lv_name_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:8718:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getConstraintAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleRow"
    // InternalSoftGalleryLanguage.g:8738:1: entryRuleRow returns [EObject current=null] : iv_ruleRow= ruleRow EOF ;
    public final EObject entryRuleRow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRow = null;


        try {
            // InternalSoftGalleryLanguage.g:8738:44: (iv_ruleRow= ruleRow EOF )
            // InternalSoftGalleryLanguage.g:8739:2: iv_ruleRow= ruleRow EOF
            {
             newCompositeNode(grammarAccess.getRowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRow=ruleRow();

            state._fsp--;

             current =iv_ruleRow; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRow"


    // $ANTLR start "ruleRow"
    // InternalSoftGalleryLanguage.g:8745:1: ruleRow returns [EObject current=null] : (otherlv_0= 'Row' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= rulePolicy ) )* ) ;
    public final EObject ruleRow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:8751:2: ( (otherlv_0= 'Row' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= rulePolicy ) )* ) )
            // InternalSoftGalleryLanguage.g:8752:2: (otherlv_0= 'Row' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= rulePolicy ) )* )
            {
            // InternalSoftGalleryLanguage.g:8752:2: (otherlv_0= 'Row' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= rulePolicy ) )* )
            // InternalSoftGalleryLanguage.g:8753:3: otherlv_0= 'Row' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= rulePolicy ) )*
            {
            otherlv_0=(Token)match(input,177,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getRowAccess().getRowKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:8757:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:8758:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:8758:4: (lv_name_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:8759:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_169); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRowAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRowRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSoftGalleryLanguage.g:8775:3: ( (lv_elements_2_0= rulePolicy ) )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==178) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalSoftGalleryLanguage.g:8776:4: (lv_elements_2_0= rulePolicy )
            	    {
            	    // InternalSoftGalleryLanguage.g:8776:4: (lv_elements_2_0= rulePolicy )
            	    // InternalSoftGalleryLanguage.g:8777:5: lv_elements_2_0= rulePolicy
            	    {

            	    					newCompositeNode(grammarAccess.getRowAccess().getElementsPolicyParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_169);
            	    lv_elements_2_0=rulePolicy();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRowRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_2_0,
            	    						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.Policy");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRow"


    // $ANTLR start "entryRulePolicy"
    // InternalSoftGalleryLanguage.g:8798:1: entryRulePolicy returns [EObject current=null] : iv_rulePolicy= rulePolicy EOF ;
    public final EObject entryRulePolicy() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolicy = null;


        try {
            // InternalSoftGalleryLanguage.g:8798:47: (iv_rulePolicy= rulePolicy EOF )
            // InternalSoftGalleryLanguage.g:8799:2: iv_rulePolicy= rulePolicy EOF
            {
             newCompositeNode(grammarAccess.getPolicyRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePolicy=rulePolicy();

            state._fsp--;

             current =iv_rulePolicy; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePolicy"


    // $ANTLR start "rulePolicy"
    // InternalSoftGalleryLanguage.g:8805:1: rulePolicy returns [EObject current=null] : (otherlv_0= 'Policy' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePolicy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:8811:2: ( (otherlv_0= 'Policy' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftGalleryLanguage.g:8812:2: (otherlv_0= 'Policy' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftGalleryLanguage.g:8812:2: (otherlv_0= 'Policy' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftGalleryLanguage.g:8813:3: otherlv_0= 'Policy' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,178,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getPolicyAccess().getPolicyKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:8817:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:8818:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:8818:4: (lv_name_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:8819:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPolicyAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPolicyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePolicy"


    // $ANTLR start "entryRuleTrigger"
    // InternalSoftGalleryLanguage.g:8839:1: entryRuleTrigger returns [EObject current=null] : iv_ruleTrigger= ruleTrigger EOF ;
    public final EObject entryRuleTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrigger = null;


        try {
            // InternalSoftGalleryLanguage.g:8839:48: (iv_ruleTrigger= ruleTrigger EOF )
            // InternalSoftGalleryLanguage.g:8840:2: iv_ruleTrigger= ruleTrigger EOF
            {
             newCompositeNode(grammarAccess.getTriggerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTrigger=ruleTrigger();

            state._fsp--;

             current =iv_ruleTrigger; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTrigger"


    // $ANTLR start "ruleTrigger"
    // InternalSoftGalleryLanguage.g:8846:1: ruleTrigger returns [EObject current=null] : (otherlv_0= 'Trigger' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:8852:2: ( (otherlv_0= 'Trigger' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftGalleryLanguage.g:8853:2: (otherlv_0= 'Trigger' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftGalleryLanguage.g:8853:2: (otherlv_0= 'Trigger' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftGalleryLanguage.g:8854:3: otherlv_0= 'Trigger' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,179,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getTriggerAccess().getTriggerKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:8858:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:8859:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:8859:4: (lv_name_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:8860:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTriggerAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTriggerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTrigger"


    // $ANTLR start "entryRuleFunction"
    // InternalSoftGalleryLanguage.g:8880:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalSoftGalleryLanguage.g:8880:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalSoftGalleryLanguage.g:8881:2: iv_ruleFunction= ruleFunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunction=ruleFunction();

            state._fsp--;

             current =iv_ruleFunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalSoftGalleryLanguage.g:8887:1: ruleFunction returns [EObject current=null] : (otherlv_0= 'Function' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:8893:2: ( (otherlv_0= 'Function' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftGalleryLanguage.g:8894:2: (otherlv_0= 'Function' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftGalleryLanguage.g:8894:2: (otherlv_0= 'Function' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftGalleryLanguage.g:8895:3: otherlv_0= 'Function' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,180,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getFunctionKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:8899:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:8900:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:8900:4: (lv_name_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:8901:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRulePostgresUser"
    // InternalSoftGalleryLanguage.g:8921:1: entryRulePostgresUser returns [EObject current=null] : iv_rulePostgresUser= rulePostgresUser EOF ;
    public final EObject entryRulePostgresUser() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostgresUser = null;


        try {
            // InternalSoftGalleryLanguage.g:8921:53: (iv_rulePostgresUser= rulePostgresUser EOF )
            // InternalSoftGalleryLanguage.g:8922:2: iv_rulePostgresUser= rulePostgresUser EOF
            {
             newCompositeNode(grammarAccess.getPostgresUserRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePostgresUser=rulePostgresUser();

            state._fsp--;

             current =iv_rulePostgresUser; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePostgresUser"


    // $ANTLR start "rulePostgresUser"
    // InternalSoftGalleryLanguage.g:8928:1: rulePostgresUser returns [EObject current=null] : (otherlv_0= 'PostgresUser' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= rulePrivilege ) ) ( (lv_elements_5_0= ruleQuery ) )* otherlv_6= '}' ) ;
    public final EObject rulePostgresUser() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_elements_4_0 = null;

        EObject lv_elements_5_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:8934:2: ( (otherlv_0= 'PostgresUser' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= rulePrivilege ) ) ( (lv_elements_5_0= ruleQuery ) )* otherlv_6= '}' ) )
            // InternalSoftGalleryLanguage.g:8935:2: (otherlv_0= 'PostgresUser' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= rulePrivilege ) ) ( (lv_elements_5_0= ruleQuery ) )* otherlv_6= '}' )
            {
            // InternalSoftGalleryLanguage.g:8935:2: (otherlv_0= 'PostgresUser' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= rulePrivilege ) ) ( (lv_elements_5_0= ruleQuery ) )* otherlv_6= '}' )
            // InternalSoftGalleryLanguage.g:8936:3: otherlv_0= 'PostgresUser' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= rulePrivilege ) ) ( (lv_elements_5_0= ruleQuery ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,181,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getPostgresUserAccess().getPostgresUserKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:8940:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:8941:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:8941:4: (lv_name_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:8942:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPostgresUserAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPostgresUserRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getPostgresUserAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_170); 

            			newLeafNode(otherlv_3, grammarAccess.getPostgresUserAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSoftGalleryLanguage.g:8966:3: ( (lv_elements_4_0= rulePrivilege ) )
            // InternalSoftGalleryLanguage.g:8967:4: (lv_elements_4_0= rulePrivilege )
            {
            // InternalSoftGalleryLanguage.g:8967:4: (lv_elements_4_0= rulePrivilege )
            // InternalSoftGalleryLanguage.g:8968:5: lv_elements_4_0= rulePrivilege
            {

            					newCompositeNode(grammarAccess.getPostgresUserAccess().getElementsPrivilegeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_171);
            lv_elements_4_0=rulePrivilege();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPostgresUserRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_4_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.Privilege");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftGalleryLanguage.g:8985:3: ( (lv_elements_5_0= ruleQuery ) )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==183) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // InternalSoftGalleryLanguage.g:8986:4: (lv_elements_5_0= ruleQuery )
            	    {
            	    // InternalSoftGalleryLanguage.g:8986:4: (lv_elements_5_0= ruleQuery )
            	    // InternalSoftGalleryLanguage.g:8987:5: lv_elements_5_0= ruleQuery
            	    {

            	    					newCompositeNode(grammarAccess.getPostgresUserAccess().getElementsQueryParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_171);
            	    lv_elements_5_0=ruleQuery();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPostgresUserRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_5_0,
            	    						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.Query");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getPostgresUserAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePostgresUser"


    // $ANTLR start "entryRulePrivilege"
    // InternalSoftGalleryLanguage.g:9012:1: entryRulePrivilege returns [EObject current=null] : iv_rulePrivilege= rulePrivilege EOF ;
    public final EObject entryRulePrivilege() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrivilege = null;


        try {
            // InternalSoftGalleryLanguage.g:9012:50: (iv_rulePrivilege= rulePrivilege EOF )
            // InternalSoftGalleryLanguage.g:9013:2: iv_rulePrivilege= rulePrivilege EOF
            {
             newCompositeNode(grammarAccess.getPrivilegeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrivilege=rulePrivilege();

            state._fsp--;

             current =iv_rulePrivilege; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrivilege"


    // $ANTLR start "rulePrivilege"
    // InternalSoftGalleryLanguage.g:9019:1: rulePrivilege returns [EObject current=null] : (otherlv_0= 'Privilege' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePrivilege() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:9025:2: ( (otherlv_0= 'Privilege' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftGalleryLanguage.g:9026:2: (otherlv_0= 'Privilege' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftGalleryLanguage.g:9026:2: (otherlv_0= 'Privilege' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftGalleryLanguage.g:9027:3: otherlv_0= 'Privilege' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,182,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getPrivilegeAccess().getPrivilegeKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:9031:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:9032:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:9032:4: (lv_name_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:9033:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPrivilegeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPrivilegeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrivilege"


    // $ANTLR start "entryRuleQuery"
    // InternalSoftGalleryLanguage.g:9053:1: entryRuleQuery returns [EObject current=null] : iv_ruleQuery= ruleQuery EOF ;
    public final EObject entryRuleQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuery = null;


        try {
            // InternalSoftGalleryLanguage.g:9053:46: (iv_ruleQuery= ruleQuery EOF )
            // InternalSoftGalleryLanguage.g:9054:2: iv_ruleQuery= ruleQuery EOF
            {
             newCompositeNode(grammarAccess.getQueryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuery=ruleQuery();

            state._fsp--;

             current =iv_ruleQuery; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuery"


    // $ANTLR start "ruleQuery"
    // InternalSoftGalleryLanguage.g:9060:1: ruleQuery returns [EObject current=null] : (otherlv_0= 'Query' ( (lv_elements_1_0= ruleClause ) ) ) ;
    public final EObject ruleQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_elements_1_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:9066:2: ( (otherlv_0= 'Query' ( (lv_elements_1_0= ruleClause ) ) ) )
            // InternalSoftGalleryLanguage.g:9067:2: (otherlv_0= 'Query' ( (lv_elements_1_0= ruleClause ) ) )
            {
            // InternalSoftGalleryLanguage.g:9067:2: (otherlv_0= 'Query' ( (lv_elements_1_0= ruleClause ) ) )
            // InternalSoftGalleryLanguage.g:9068:3: otherlv_0= 'Query' ( (lv_elements_1_0= ruleClause ) )
            {
            otherlv_0=(Token)match(input,183,FOLLOW_172); 

            			newLeafNode(otherlv_0, grammarAccess.getQueryAccess().getQueryKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:9072:3: ( (lv_elements_1_0= ruleClause ) )
            // InternalSoftGalleryLanguage.g:9073:4: (lv_elements_1_0= ruleClause )
            {
            // InternalSoftGalleryLanguage.g:9073:4: (lv_elements_1_0= ruleClause )
            // InternalSoftGalleryLanguage.g:9074:5: lv_elements_1_0= ruleClause
            {

            					newCompositeNode(grammarAccess.getQueryAccess().getElementsClauseParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_elements_1_0=ruleClause();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQueryRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_1_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.Clause");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuery"


    // $ANTLR start "entryRuleClause"
    // InternalSoftGalleryLanguage.g:9095:1: entryRuleClause returns [EObject current=null] : iv_ruleClause= ruleClause EOF ;
    public final EObject entryRuleClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClause = null;


        try {
            // InternalSoftGalleryLanguage.g:9095:47: (iv_ruleClause= ruleClause EOF )
            // InternalSoftGalleryLanguage.g:9096:2: iv_ruleClause= ruleClause EOF
            {
             newCompositeNode(grammarAccess.getClauseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClause=ruleClause();

            state._fsp--;

             current =iv_ruleClause; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClause"


    // $ANTLR start "ruleClause"
    // InternalSoftGalleryLanguage.g:9102:1: ruleClause returns [EObject current=null] : (otherlv_0= 'Clause' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:9108:2: ( (otherlv_0= 'Clause' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftGalleryLanguage.g:9109:2: (otherlv_0= 'Clause' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftGalleryLanguage.g:9109:2: (otherlv_0= 'Clause' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftGalleryLanguage.g:9110:3: otherlv_0= 'Clause' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,184,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getClauseAccess().getClauseKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:9114:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:9115:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:9115:4: (lv_name_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:9116:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getClauseAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClauseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClause"


    // $ANTLR start "entryRuleAmazonWebServices"
    // InternalSoftGalleryLanguage.g:9136:1: entryRuleAmazonWebServices returns [EObject current=null] : iv_ruleAmazonWebServices= ruleAmazonWebServices EOF ;
    public final EObject entryRuleAmazonWebServices() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAmazonWebServices = null;


        try {
            // InternalSoftGalleryLanguage.g:9136:58: (iv_ruleAmazonWebServices= ruleAmazonWebServices EOF )
            // InternalSoftGalleryLanguage.g:9137:2: iv_ruleAmazonWebServices= ruleAmazonWebServices EOF
            {
             newCompositeNode(grammarAccess.getAmazonWebServicesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAmazonWebServices=ruleAmazonWebServices();

            state._fsp--;

             current =iv_ruleAmazonWebServices; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAmazonWebServices"


    // $ANTLR start "ruleAmazonWebServices"
    // InternalSoftGalleryLanguage.g:9143:1: ruleAmazonWebServices returns [EObject current=null] : (otherlv_0= 'AmazonWebServices' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleAmazonSimpleStorageService ) ) ( (lv_elements_5_0= ruleAmazonElasticComputeCloud ) ) otherlv_6= '}' ) ;
    public final EObject ruleAmazonWebServices() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_elements_4_0 = null;

        EObject lv_elements_5_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:9149:2: ( (otherlv_0= 'AmazonWebServices' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleAmazonSimpleStorageService ) ) ( (lv_elements_5_0= ruleAmazonElasticComputeCloud ) ) otherlv_6= '}' ) )
            // InternalSoftGalleryLanguage.g:9150:2: (otherlv_0= 'AmazonWebServices' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleAmazonSimpleStorageService ) ) ( (lv_elements_5_0= ruleAmazonElasticComputeCloud ) ) otherlv_6= '}' )
            {
            // InternalSoftGalleryLanguage.g:9150:2: (otherlv_0= 'AmazonWebServices' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleAmazonSimpleStorageService ) ) ( (lv_elements_5_0= ruleAmazonElasticComputeCloud ) ) otherlv_6= '}' )
            // InternalSoftGalleryLanguage.g:9151:3: otherlv_0= 'AmazonWebServices' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleAmazonSimpleStorageService ) ) ( (lv_elements_5_0= ruleAmazonElasticComputeCloud ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,185,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getAmazonWebServicesAccess().getAmazonWebServicesKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:9155:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:9156:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:9156:4: (lv_name_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:9157:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAmazonWebServicesAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAmazonWebServicesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getAmazonWebServicesAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_173); 

            			newLeafNode(otherlv_3, grammarAccess.getAmazonWebServicesAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSoftGalleryLanguage.g:9181:3: ( (lv_elements_4_0= ruleAmazonSimpleStorageService ) )
            // InternalSoftGalleryLanguage.g:9182:4: (lv_elements_4_0= ruleAmazonSimpleStorageService )
            {
            // InternalSoftGalleryLanguage.g:9182:4: (lv_elements_4_0= ruleAmazonSimpleStorageService )
            // InternalSoftGalleryLanguage.g:9183:5: lv_elements_4_0= ruleAmazonSimpleStorageService
            {

            					newCompositeNode(grammarAccess.getAmazonWebServicesAccess().getElementsAmazonSimpleStorageServiceParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_174);
            lv_elements_4_0=ruleAmazonSimpleStorageService();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAmazonWebServicesRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_4_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.AmazonSimpleStorageService");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftGalleryLanguage.g:9200:3: ( (lv_elements_5_0= ruleAmazonElasticComputeCloud ) )
            // InternalSoftGalleryLanguage.g:9201:4: (lv_elements_5_0= ruleAmazonElasticComputeCloud )
            {
            // InternalSoftGalleryLanguage.g:9201:4: (lv_elements_5_0= ruleAmazonElasticComputeCloud )
            // InternalSoftGalleryLanguage.g:9202:5: lv_elements_5_0= ruleAmazonElasticComputeCloud
            {

            					newCompositeNode(grammarAccess.getAmazonWebServicesAccess().getElementsAmazonElasticComputeCloudParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_elements_5_0=ruleAmazonElasticComputeCloud();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAmazonWebServicesRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_5_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.AmazonElasticComputeCloud");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getAmazonWebServicesAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAmazonWebServices"


    // $ANTLR start "entryRuleAmazonSimpleStorageService"
    // InternalSoftGalleryLanguage.g:9227:1: entryRuleAmazonSimpleStorageService returns [EObject current=null] : iv_ruleAmazonSimpleStorageService= ruleAmazonSimpleStorageService EOF ;
    public final EObject entryRuleAmazonSimpleStorageService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAmazonSimpleStorageService = null;


        try {
            // InternalSoftGalleryLanguage.g:9227:67: (iv_ruleAmazonSimpleStorageService= ruleAmazonSimpleStorageService EOF )
            // InternalSoftGalleryLanguage.g:9228:2: iv_ruleAmazonSimpleStorageService= ruleAmazonSimpleStorageService EOF
            {
             newCompositeNode(grammarAccess.getAmazonSimpleStorageServiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAmazonSimpleStorageService=ruleAmazonSimpleStorageService();

            state._fsp--;

             current =iv_ruleAmazonSimpleStorageService; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAmazonSimpleStorageService"


    // $ANTLR start "ruleAmazonSimpleStorageService"
    // InternalSoftGalleryLanguage.g:9234:1: ruleAmazonSimpleStorageService returns [EObject current=null] : (otherlv_0= 'AmazonSimpleStorageService' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleBatchOperation ) )* ( (lv_elements_4_0= ruleBucket ) ) otherlv_5= '}' ) ;
    public final EObject ruleAmazonSimpleStorageService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_elements_3_0 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:9240:2: ( (otherlv_0= 'AmazonSimpleStorageService' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleBatchOperation ) )* ( (lv_elements_4_0= ruleBucket ) ) otherlv_5= '}' ) )
            // InternalSoftGalleryLanguage.g:9241:2: (otherlv_0= 'AmazonSimpleStorageService' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleBatchOperation ) )* ( (lv_elements_4_0= ruleBucket ) ) otherlv_5= '}' )
            {
            // InternalSoftGalleryLanguage.g:9241:2: (otherlv_0= 'AmazonSimpleStorageService' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleBatchOperation ) )* ( (lv_elements_4_0= ruleBucket ) ) otherlv_5= '}' )
            // InternalSoftGalleryLanguage.g:9242:3: otherlv_0= 'AmazonSimpleStorageService' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleBatchOperation ) )* ( (lv_elements_4_0= ruleBucket ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,186,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAmazonSimpleStorageServiceAccess().getAmazonSimpleStorageServiceKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAmazonSimpleStorageServiceAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_175); 

            			newLeafNode(otherlv_2, grammarAccess.getAmazonSimpleStorageServiceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSoftGalleryLanguage.g:9254:3: ( (lv_elements_3_0= ruleBatchOperation ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==187) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // InternalSoftGalleryLanguage.g:9255:4: (lv_elements_3_0= ruleBatchOperation )
            	    {
            	    // InternalSoftGalleryLanguage.g:9255:4: (lv_elements_3_0= ruleBatchOperation )
            	    // InternalSoftGalleryLanguage.g:9256:5: lv_elements_3_0= ruleBatchOperation
            	    {

            	    					newCompositeNode(grammarAccess.getAmazonSimpleStorageServiceAccess().getElementsBatchOperationParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_175);
            	    lv_elements_3_0=ruleBatchOperation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAmazonSimpleStorageServiceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_3_0,
            	    						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.BatchOperation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);

            // InternalSoftGalleryLanguage.g:9273:3: ( (lv_elements_4_0= ruleBucket ) )
            // InternalSoftGalleryLanguage.g:9274:4: (lv_elements_4_0= ruleBucket )
            {
            // InternalSoftGalleryLanguage.g:9274:4: (lv_elements_4_0= ruleBucket )
            // InternalSoftGalleryLanguage.g:9275:5: lv_elements_4_0= ruleBucket
            {

            					newCompositeNode(grammarAccess.getAmazonSimpleStorageServiceAccess().getElementsBucketParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_elements_4_0=ruleBucket();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAmazonSimpleStorageServiceRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_4_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.Bucket");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getAmazonSimpleStorageServiceAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAmazonSimpleStorageService"


    // $ANTLR start "entryRuleBatchOperation"
    // InternalSoftGalleryLanguage.g:9300:1: entryRuleBatchOperation returns [EObject current=null] : iv_ruleBatchOperation= ruleBatchOperation EOF ;
    public final EObject entryRuleBatchOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBatchOperation = null;


        try {
            // InternalSoftGalleryLanguage.g:9300:55: (iv_ruleBatchOperation= ruleBatchOperation EOF )
            // InternalSoftGalleryLanguage.g:9301:2: iv_ruleBatchOperation= ruleBatchOperation EOF
            {
             newCompositeNode(grammarAccess.getBatchOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBatchOperation=ruleBatchOperation();

            state._fsp--;

             current =iv_ruleBatchOperation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBatchOperation"


    // $ANTLR start "ruleBatchOperation"
    // InternalSoftGalleryLanguage.g:9307:1: ruleBatchOperation returns [EObject current=null] : (otherlv_0= 'BatchOperation' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleBatchOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:9313:2: ( (otherlv_0= 'BatchOperation' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftGalleryLanguage.g:9314:2: (otherlv_0= 'BatchOperation' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftGalleryLanguage.g:9314:2: (otherlv_0= 'BatchOperation' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftGalleryLanguage.g:9315:3: otherlv_0= 'BatchOperation' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,187,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getBatchOperationAccess().getBatchOperationKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:9319:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:9320:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:9320:4: (lv_name_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:9321:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getBatchOperationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBatchOperationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBatchOperation"


    // $ANTLR start "entryRuleBucket"
    // InternalSoftGalleryLanguage.g:9341:1: entryRuleBucket returns [EObject current=null] : iv_ruleBucket= ruleBucket EOF ;
    public final EObject entryRuleBucket() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBucket = null;


        try {
            // InternalSoftGalleryLanguage.g:9341:47: (iv_ruleBucket= ruleBucket EOF )
            // InternalSoftGalleryLanguage.g:9342:2: iv_ruleBucket= ruleBucket EOF
            {
             newCompositeNode(grammarAccess.getBucketRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBucket=ruleBucket();

            state._fsp--;

             current =iv_ruleBucket; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBucket"


    // $ANTLR start "ruleBucket"
    // InternalSoftGalleryLanguage.g:9348:1: ruleBucket returns [EObject current=null] : (otherlv_0= 'Bucket' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleBucketAccess ) ) ( (lv_elements_3_0= ruleAmazonFolder ) )* ( (lv_elements_4_0= ruleAmazonFile ) )+ ) ;
    public final EObject ruleBucket() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_3_0 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:9354:2: ( (otherlv_0= 'Bucket' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleBucketAccess ) ) ( (lv_elements_3_0= ruleAmazonFolder ) )* ( (lv_elements_4_0= ruleAmazonFile ) )+ ) )
            // InternalSoftGalleryLanguage.g:9355:2: (otherlv_0= 'Bucket' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleBucketAccess ) ) ( (lv_elements_3_0= ruleAmazonFolder ) )* ( (lv_elements_4_0= ruleAmazonFile ) )+ )
            {
            // InternalSoftGalleryLanguage.g:9355:2: (otherlv_0= 'Bucket' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleBucketAccess ) ) ( (lv_elements_3_0= ruleAmazonFolder ) )* ( (lv_elements_4_0= ruleAmazonFile ) )+ )
            // InternalSoftGalleryLanguage.g:9356:3: otherlv_0= 'Bucket' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleBucketAccess ) ) ( (lv_elements_3_0= ruleAmazonFolder ) )* ( (lv_elements_4_0= ruleAmazonFile ) )+
            {
            otherlv_0=(Token)match(input,188,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getBucketAccess().getBucketKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:9360:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:9361:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:9361:4: (lv_name_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:9362:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_176); 

            					newLeafNode(lv_name_1_0, grammarAccess.getBucketAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBucketRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSoftGalleryLanguage.g:9378:3: ( (lv_elements_2_0= ruleBucketAccess ) )
            // InternalSoftGalleryLanguage.g:9379:4: (lv_elements_2_0= ruleBucketAccess )
            {
            // InternalSoftGalleryLanguage.g:9379:4: (lv_elements_2_0= ruleBucketAccess )
            // InternalSoftGalleryLanguage.g:9380:5: lv_elements_2_0= ruleBucketAccess
            {

            					newCompositeNode(grammarAccess.getBucketAccess().getElementsBucketAccessParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_177);
            lv_elements_2_0=ruleBucketAccess();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBucketRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_2_0,
            						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.BucketAccess");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftGalleryLanguage.g:9397:3: ( (lv_elements_3_0= ruleAmazonFolder ) )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==194) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // InternalSoftGalleryLanguage.g:9398:4: (lv_elements_3_0= ruleAmazonFolder )
            	    {
            	    // InternalSoftGalleryLanguage.g:9398:4: (lv_elements_3_0= ruleAmazonFolder )
            	    // InternalSoftGalleryLanguage.g:9399:5: lv_elements_3_0= ruleAmazonFolder
            	    {

            	    					newCompositeNode(grammarAccess.getBucketAccess().getElementsAmazonFolderParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_177);
            	    lv_elements_3_0=ruleAmazonFolder();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBucketRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_3_0,
            	    						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.AmazonFolder");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);

            // InternalSoftGalleryLanguage.g:9416:3: ( (lv_elements_4_0= ruleAmazonFile ) )+
            int cnt66=0;
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==195) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // InternalSoftGalleryLanguage.g:9417:4: (lv_elements_4_0= ruleAmazonFile )
            	    {
            	    // InternalSoftGalleryLanguage.g:9417:4: (lv_elements_4_0= ruleAmazonFile )
            	    // InternalSoftGalleryLanguage.g:9418:5: lv_elements_4_0= ruleAmazonFile
            	    {

            	    					newCompositeNode(grammarAccess.getBucketAccess().getElementsAmazonFileParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_178);
            	    lv_elements_4_0=ruleAmazonFile();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBucketRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_4_0,
            	    						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.AmazonFile");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt66 >= 1 ) break loop66;
                        EarlyExitException eee =
                            new EarlyExitException(66, input);
                        throw eee;
                }
                cnt66++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBucket"


    // $ANTLR start "entryRuleBucketAccess"
    // InternalSoftGalleryLanguage.g:9439:1: entryRuleBucketAccess returns [EObject current=null] : iv_ruleBucketAccess= ruleBucketAccess EOF ;
    public final EObject entryRuleBucketAccess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBucketAccess = null;


        try {
            // InternalSoftGalleryLanguage.g:9439:53: (iv_ruleBucketAccess= ruleBucketAccess EOF )
            // InternalSoftGalleryLanguage.g:9440:2: iv_ruleBucketAccess= ruleBucketAccess EOF
            {
             newCompositeNode(grammarAccess.getBucketAccessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBucketAccess=ruleBucketAccess();

            state._fsp--;

             current =iv_ruleBucketAccess; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBucketAccess"


    // $ANTLR start "ruleBucketAccess"
    // InternalSoftGalleryLanguage.g:9446:1: ruleBucketAccess returns [EObject current=null] : ( (otherlv_0= 'BucketAccess' ( (lv_elements_1_0= rulePublicAccess ) ) ) | ( (lv_elements_2_0= ruleObjectsPublic ) ) | ( (lv_elements_3_0= ruleBucketObjectsNotPublic ) ) | ( (lv_elements_4_0= ruleOnlyAuthorized ) ) ) ;
    public final EObject ruleBucketAccess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_elements_1_0 = null;

        EObject lv_elements_2_0 = null;

        EObject lv_elements_3_0 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:9452:2: ( ( (otherlv_0= 'BucketAccess' ( (lv_elements_1_0= rulePublicAccess ) ) ) | ( (lv_elements_2_0= ruleObjectsPublic ) ) | ( (lv_elements_3_0= ruleBucketObjectsNotPublic ) ) | ( (lv_elements_4_0= ruleOnlyAuthorized ) ) ) )
            // InternalSoftGalleryLanguage.g:9453:2: ( (otherlv_0= 'BucketAccess' ( (lv_elements_1_0= rulePublicAccess ) ) ) | ( (lv_elements_2_0= ruleObjectsPublic ) ) | ( (lv_elements_3_0= ruleBucketObjectsNotPublic ) ) | ( (lv_elements_4_0= ruleOnlyAuthorized ) ) )
            {
            // InternalSoftGalleryLanguage.g:9453:2: ( (otherlv_0= 'BucketAccess' ( (lv_elements_1_0= rulePublicAccess ) ) ) | ( (lv_elements_2_0= ruleObjectsPublic ) ) | ( (lv_elements_3_0= ruleBucketObjectsNotPublic ) ) | ( (lv_elements_4_0= ruleOnlyAuthorized ) ) )
            int alt67=4;
            switch ( input.LA(1) ) {
            case 189:
                {
                alt67=1;
                }
                break;
            case 191:
                {
                alt67=2;
                }
                break;
            case 192:
                {
                alt67=3;
                }
                break;
            case 193:
                {
                alt67=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }

            switch (alt67) {
                case 1 :
                    // InternalSoftGalleryLanguage.g:9454:3: (otherlv_0= 'BucketAccess' ( (lv_elements_1_0= rulePublicAccess ) ) )
                    {
                    // InternalSoftGalleryLanguage.g:9454:3: (otherlv_0= 'BucketAccess' ( (lv_elements_1_0= rulePublicAccess ) ) )
                    // InternalSoftGalleryLanguage.g:9455:4: otherlv_0= 'BucketAccess' ( (lv_elements_1_0= rulePublicAccess ) )
                    {
                    otherlv_0=(Token)match(input,189,FOLLOW_179); 

                    				newLeafNode(otherlv_0, grammarAccess.getBucketAccessAccess().getBucketAccessKeyword_0_0());
                    			
                    // InternalSoftGalleryLanguage.g:9459:4: ( (lv_elements_1_0= rulePublicAccess ) )
                    // InternalSoftGalleryLanguage.g:9460:5: (lv_elements_1_0= rulePublicAccess )
                    {
                    // InternalSoftGalleryLanguage.g:9460:5: (lv_elements_1_0= rulePublicAccess )
                    // InternalSoftGalleryLanguage.g:9461:6: lv_elements_1_0= rulePublicAccess
                    {

                    						newCompositeNode(grammarAccess.getBucketAccessAccess().getElementsPublicAccessParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_elements_1_0=rulePublicAccess();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBucketAccessRule());
                    						}
                    						add(
                    							current,
                    							"elements",
                    							lv_elements_1_0,
                    							"co.unal.mdd.photos.dsl.SoftGalleryLanguage.PublicAccess");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSoftGalleryLanguage.g:9480:3: ( (lv_elements_2_0= ruleObjectsPublic ) )
                    {
                    // InternalSoftGalleryLanguage.g:9480:3: ( (lv_elements_2_0= ruleObjectsPublic ) )
                    // InternalSoftGalleryLanguage.g:9481:4: (lv_elements_2_0= ruleObjectsPublic )
                    {
                    // InternalSoftGalleryLanguage.g:9481:4: (lv_elements_2_0= ruleObjectsPublic )
                    // InternalSoftGalleryLanguage.g:9482:5: lv_elements_2_0= ruleObjectsPublic
                    {

                    					newCompositeNode(grammarAccess.getBucketAccessAccess().getElementsObjectsPublicParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_elements_2_0=ruleObjectsPublic();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBucketAccessRule());
                    					}
                    					add(
                    						current,
                    						"elements",
                    						lv_elements_2_0,
                    						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.ObjectsPublic");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSoftGalleryLanguage.g:9500:3: ( (lv_elements_3_0= ruleBucketObjectsNotPublic ) )
                    {
                    // InternalSoftGalleryLanguage.g:9500:3: ( (lv_elements_3_0= ruleBucketObjectsNotPublic ) )
                    // InternalSoftGalleryLanguage.g:9501:4: (lv_elements_3_0= ruleBucketObjectsNotPublic )
                    {
                    // InternalSoftGalleryLanguage.g:9501:4: (lv_elements_3_0= ruleBucketObjectsNotPublic )
                    // InternalSoftGalleryLanguage.g:9502:5: lv_elements_3_0= ruleBucketObjectsNotPublic
                    {

                    					newCompositeNode(grammarAccess.getBucketAccessAccess().getElementsBucketObjectsNotPublicParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_elements_3_0=ruleBucketObjectsNotPublic();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBucketAccessRule());
                    					}
                    					add(
                    						current,
                    						"elements",
                    						lv_elements_3_0,
                    						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.BucketObjectsNotPublic");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalSoftGalleryLanguage.g:9520:3: ( (lv_elements_4_0= ruleOnlyAuthorized ) )
                    {
                    // InternalSoftGalleryLanguage.g:9520:3: ( (lv_elements_4_0= ruleOnlyAuthorized ) )
                    // InternalSoftGalleryLanguage.g:9521:4: (lv_elements_4_0= ruleOnlyAuthorized )
                    {
                    // InternalSoftGalleryLanguage.g:9521:4: (lv_elements_4_0= ruleOnlyAuthorized )
                    // InternalSoftGalleryLanguage.g:9522:5: lv_elements_4_0= ruleOnlyAuthorized
                    {

                    					newCompositeNode(grammarAccess.getBucketAccessAccess().getElementsOnlyAuthorizedParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_elements_4_0=ruleOnlyAuthorized();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBucketAccessRule());
                    					}
                    					add(
                    						current,
                    						"elements",
                    						lv_elements_4_0,
                    						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.OnlyAuthorized");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBucketAccess"


    // $ANTLR start "entryRulePublicAccess"
    // InternalSoftGalleryLanguage.g:9543:1: entryRulePublicAccess returns [EObject current=null] : iv_rulePublicAccess= rulePublicAccess EOF ;
    public final EObject entryRulePublicAccess() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePublicAccess = null;


        try {
            // InternalSoftGalleryLanguage.g:9543:53: (iv_rulePublicAccess= rulePublicAccess EOF )
            // InternalSoftGalleryLanguage.g:9544:2: iv_rulePublicAccess= rulePublicAccess EOF
            {
             newCompositeNode(grammarAccess.getPublicAccessRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePublicAccess=rulePublicAccess();

            state._fsp--;

             current =iv_rulePublicAccess; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePublicAccess"


    // $ANTLR start "rulePublicAccess"
    // InternalSoftGalleryLanguage.g:9550:1: rulePublicAccess returns [EObject current=null] : (otherlv_0= 'PublicAccess' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePublicAccess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:9556:2: ( (otherlv_0= 'PublicAccess' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftGalleryLanguage.g:9557:2: (otherlv_0= 'PublicAccess' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftGalleryLanguage.g:9557:2: (otherlv_0= 'PublicAccess' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftGalleryLanguage.g:9558:3: otherlv_0= 'PublicAccess' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,190,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getPublicAccessAccess().getPublicAccessKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:9562:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:9563:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:9563:4: (lv_name_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:9564:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPublicAccessAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPublicAccessRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePublicAccess"


    // $ANTLR start "entryRuleObjectsPublic"
    // InternalSoftGalleryLanguage.g:9584:1: entryRuleObjectsPublic returns [EObject current=null] : iv_ruleObjectsPublic= ruleObjectsPublic EOF ;
    public final EObject entryRuleObjectsPublic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectsPublic = null;


        try {
            // InternalSoftGalleryLanguage.g:9584:54: (iv_ruleObjectsPublic= ruleObjectsPublic EOF )
            // InternalSoftGalleryLanguage.g:9585:2: iv_ruleObjectsPublic= ruleObjectsPublic EOF
            {
             newCompositeNode(grammarAccess.getObjectsPublicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjectsPublic=ruleObjectsPublic();

            state._fsp--;

             current =iv_ruleObjectsPublic; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObjectsPublic"


    // $ANTLR start "ruleObjectsPublic"
    // InternalSoftGalleryLanguage.g:9591:1: ruleObjectsPublic returns [EObject current=null] : (otherlv_0= 'ObjectsPublic' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleObjectsPublic() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:9597:2: ( (otherlv_0= 'ObjectsPublic' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftGalleryLanguage.g:9598:2: (otherlv_0= 'ObjectsPublic' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftGalleryLanguage.g:9598:2: (otherlv_0= 'ObjectsPublic' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftGalleryLanguage.g:9599:3: otherlv_0= 'ObjectsPublic' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,191,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getObjectsPublicAccess().getObjectsPublicKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:9603:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:9604:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:9604:4: (lv_name_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:9605:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getObjectsPublicAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjectsPublicRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObjectsPublic"


    // $ANTLR start "entryRuleBucketObjectsNotPublic"
    // InternalSoftGalleryLanguage.g:9625:1: entryRuleBucketObjectsNotPublic returns [EObject current=null] : iv_ruleBucketObjectsNotPublic= ruleBucketObjectsNotPublic EOF ;
    public final EObject entryRuleBucketObjectsNotPublic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBucketObjectsNotPublic = null;


        try {
            // InternalSoftGalleryLanguage.g:9625:63: (iv_ruleBucketObjectsNotPublic= ruleBucketObjectsNotPublic EOF )
            // InternalSoftGalleryLanguage.g:9626:2: iv_ruleBucketObjectsNotPublic= ruleBucketObjectsNotPublic EOF
            {
             newCompositeNode(grammarAccess.getBucketObjectsNotPublicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBucketObjectsNotPublic=ruleBucketObjectsNotPublic();

            state._fsp--;

             current =iv_ruleBucketObjectsNotPublic; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBucketObjectsNotPublic"


    // $ANTLR start "ruleBucketObjectsNotPublic"
    // InternalSoftGalleryLanguage.g:9632:1: ruleBucketObjectsNotPublic returns [EObject current=null] : (otherlv_0= 'BucketObjectsNotPublic' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleBucketObjectsNotPublic() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:9638:2: ( (otherlv_0= 'BucketObjectsNotPublic' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftGalleryLanguage.g:9639:2: (otherlv_0= 'BucketObjectsNotPublic' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftGalleryLanguage.g:9639:2: (otherlv_0= 'BucketObjectsNotPublic' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftGalleryLanguage.g:9640:3: otherlv_0= 'BucketObjectsNotPublic' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,192,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getBucketObjectsNotPublicAccess().getBucketObjectsNotPublicKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:9644:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:9645:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:9645:4: (lv_name_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:9646:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getBucketObjectsNotPublicAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBucketObjectsNotPublicRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBucketObjectsNotPublic"


    // $ANTLR start "entryRuleOnlyAuthorized"
    // InternalSoftGalleryLanguage.g:9666:1: entryRuleOnlyAuthorized returns [EObject current=null] : iv_ruleOnlyAuthorized= ruleOnlyAuthorized EOF ;
    public final EObject entryRuleOnlyAuthorized() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnlyAuthorized = null;


        try {
            // InternalSoftGalleryLanguage.g:9666:55: (iv_ruleOnlyAuthorized= ruleOnlyAuthorized EOF )
            // InternalSoftGalleryLanguage.g:9667:2: iv_ruleOnlyAuthorized= ruleOnlyAuthorized EOF
            {
             newCompositeNode(grammarAccess.getOnlyAuthorizedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOnlyAuthorized=ruleOnlyAuthorized();

            state._fsp--;

             current =iv_ruleOnlyAuthorized; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOnlyAuthorized"


    // $ANTLR start "ruleOnlyAuthorized"
    // InternalSoftGalleryLanguage.g:9673:1: ruleOnlyAuthorized returns [EObject current=null] : (otherlv_0= 'OnlyAuthorized' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleOnlyAuthorized() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:9679:2: ( (otherlv_0= 'OnlyAuthorized' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftGalleryLanguage.g:9680:2: (otherlv_0= 'OnlyAuthorized' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftGalleryLanguage.g:9680:2: (otherlv_0= 'OnlyAuthorized' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftGalleryLanguage.g:9681:3: otherlv_0= 'OnlyAuthorized' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,193,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getOnlyAuthorizedAccess().getOnlyAuthorizedKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:9685:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:9686:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:9686:4: (lv_name_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:9687:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getOnlyAuthorizedAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOnlyAuthorizedRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOnlyAuthorized"


    // $ANTLR start "entryRuleAmazonFolder"
    // InternalSoftGalleryLanguage.g:9707:1: entryRuleAmazonFolder returns [EObject current=null] : iv_ruleAmazonFolder= ruleAmazonFolder EOF ;
    public final EObject entryRuleAmazonFolder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAmazonFolder = null;


        try {
            // InternalSoftGalleryLanguage.g:9707:53: (iv_ruleAmazonFolder= ruleAmazonFolder EOF )
            // InternalSoftGalleryLanguage.g:9708:2: iv_ruleAmazonFolder= ruleAmazonFolder EOF
            {
             newCompositeNode(grammarAccess.getAmazonFolderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAmazonFolder=ruleAmazonFolder();

            state._fsp--;

             current =iv_ruleAmazonFolder; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAmazonFolder"


    // $ANTLR start "ruleAmazonFolder"
    // InternalSoftGalleryLanguage.g:9714:1: ruleAmazonFolder returns [EObject current=null] : (otherlv_0= 'AmazonFolder' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAmazonFolder() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:9720:2: ( (otherlv_0= 'AmazonFolder' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftGalleryLanguage.g:9721:2: (otherlv_0= 'AmazonFolder' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftGalleryLanguage.g:9721:2: (otherlv_0= 'AmazonFolder' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftGalleryLanguage.g:9722:3: otherlv_0= 'AmazonFolder' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,194,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getAmazonFolderAccess().getAmazonFolderKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:9726:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:9727:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:9727:4: (lv_name_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:9728:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAmazonFolderAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAmazonFolderRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAmazonFolder"


    // $ANTLR start "entryRuleAmazonFile"
    // InternalSoftGalleryLanguage.g:9748:1: entryRuleAmazonFile returns [EObject current=null] : iv_ruleAmazonFile= ruleAmazonFile EOF ;
    public final EObject entryRuleAmazonFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAmazonFile = null;


        try {
            // InternalSoftGalleryLanguage.g:9748:51: (iv_ruleAmazonFile= ruleAmazonFile EOF )
            // InternalSoftGalleryLanguage.g:9749:2: iv_ruleAmazonFile= ruleAmazonFile EOF
            {
             newCompositeNode(grammarAccess.getAmazonFileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAmazonFile=ruleAmazonFile();

            state._fsp--;

             current =iv_ruleAmazonFile; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAmazonFile"


    // $ANTLR start "ruleAmazonFile"
    // InternalSoftGalleryLanguage.g:9755:1: ruleAmazonFile returns [EObject current=null] : (otherlv_0= 'AmazonFile' ( (lv_elements_1_0= ruleMetadata ) )+ ) ;
    public final EObject ruleAmazonFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_elements_1_0 = null;



        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:9761:2: ( (otherlv_0= 'AmazonFile' ( (lv_elements_1_0= ruleMetadata ) )+ ) )
            // InternalSoftGalleryLanguage.g:9762:2: (otherlv_0= 'AmazonFile' ( (lv_elements_1_0= ruleMetadata ) )+ )
            {
            // InternalSoftGalleryLanguage.g:9762:2: (otherlv_0= 'AmazonFile' ( (lv_elements_1_0= ruleMetadata ) )+ )
            // InternalSoftGalleryLanguage.g:9763:3: otherlv_0= 'AmazonFile' ( (lv_elements_1_0= ruleMetadata ) )+
            {
            otherlv_0=(Token)match(input,195,FOLLOW_180); 

            			newLeafNode(otherlv_0, grammarAccess.getAmazonFileAccess().getAmazonFileKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:9767:3: ( (lv_elements_1_0= ruleMetadata ) )+
            int cnt68=0;
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==196) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // InternalSoftGalleryLanguage.g:9768:4: (lv_elements_1_0= ruleMetadata )
            	    {
            	    // InternalSoftGalleryLanguage.g:9768:4: (lv_elements_1_0= ruleMetadata )
            	    // InternalSoftGalleryLanguage.g:9769:5: lv_elements_1_0= ruleMetadata
            	    {

            	    					newCompositeNode(grammarAccess.getAmazonFileAccess().getElementsMetadataParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_181);
            	    lv_elements_1_0=ruleMetadata();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAmazonFileRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_1_0,
            	    						"co.unal.mdd.photos.dsl.SoftGalleryLanguage.Metadata");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt68 >= 1 ) break loop68;
                        EarlyExitException eee =
                            new EarlyExitException(68, input);
                        throw eee;
                }
                cnt68++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAmazonFile"


    // $ANTLR start "entryRuleMetadata"
    // InternalSoftGalleryLanguage.g:9790:1: entryRuleMetadata returns [EObject current=null] : iv_ruleMetadata= ruleMetadata EOF ;
    public final EObject entryRuleMetadata() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetadata = null;


        try {
            // InternalSoftGalleryLanguage.g:9790:49: (iv_ruleMetadata= ruleMetadata EOF )
            // InternalSoftGalleryLanguage.g:9791:2: iv_ruleMetadata= ruleMetadata EOF
            {
             newCompositeNode(grammarAccess.getMetadataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMetadata=ruleMetadata();

            state._fsp--;

             current =iv_ruleMetadata; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMetadata"


    // $ANTLR start "ruleMetadata"
    // InternalSoftGalleryLanguage.g:9797:1: ruleMetadata returns [EObject current=null] : (otherlv_0= 'Metadata' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleMetadata() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:9803:2: ( (otherlv_0= 'Metadata' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftGalleryLanguage.g:9804:2: (otherlv_0= 'Metadata' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftGalleryLanguage.g:9804:2: (otherlv_0= 'Metadata' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftGalleryLanguage.g:9805:3: otherlv_0= 'Metadata' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,196,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getMetadataAccess().getMetadataKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:9809:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:9810:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:9810:4: (lv_name_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:9811:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMetadataAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMetadataRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMetadata"


    // $ANTLR start "entryRuleAmazonElasticComputeCloud"
    // InternalSoftGalleryLanguage.g:9831:1: entryRuleAmazonElasticComputeCloud returns [EObject current=null] : iv_ruleAmazonElasticComputeCloud= ruleAmazonElasticComputeCloud EOF ;
    public final EObject entryRuleAmazonElasticComputeCloud() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAmazonElasticComputeCloud = null;


        try {
            // InternalSoftGalleryLanguage.g:9831:66: (iv_ruleAmazonElasticComputeCloud= ruleAmazonElasticComputeCloud EOF )
            // InternalSoftGalleryLanguage.g:9832:2: iv_ruleAmazonElasticComputeCloud= ruleAmazonElasticComputeCloud EOF
            {
             newCompositeNode(grammarAccess.getAmazonElasticComputeCloudRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAmazonElasticComputeCloud=ruleAmazonElasticComputeCloud();

            state._fsp--;

             current =iv_ruleAmazonElasticComputeCloud; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAmazonElasticComputeCloud"


    // $ANTLR start "ruleAmazonElasticComputeCloud"
    // InternalSoftGalleryLanguage.g:9838:1: ruleAmazonElasticComputeCloud returns [EObject current=null] : (otherlv_0= 'AmazonElasticComputeCloud' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAmazonElasticComputeCloud() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftGalleryLanguage.g:9844:2: ( (otherlv_0= 'AmazonElasticComputeCloud' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftGalleryLanguage.g:9845:2: (otherlv_0= 'AmazonElasticComputeCloud' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftGalleryLanguage.g:9845:2: (otherlv_0= 'AmazonElasticComputeCloud' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftGalleryLanguage.g:9846:3: otherlv_0= 'AmazonElasticComputeCloud' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,197,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getAmazonElasticComputeCloudAccess().getAmazonElasticComputeCloudKeyword_0());
            		
            // InternalSoftGalleryLanguage.g:9850:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftGalleryLanguage.g:9851:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftGalleryLanguage.g:9851:4: (lv_name_1_0= RULE_ID )
            // InternalSoftGalleryLanguage.g:9852:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAmazonElasticComputeCloudAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAmazonElasticComputeCloudRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAmazonElasticComputeCloud"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000080L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000050000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0xC000000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0xC000020000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x1800000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x1800000000000002L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000840000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000700L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000700L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000870L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0x0000000000500000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000000L,0x0000000001400000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000000L,0x0000008001000000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000004000L,0x0000000000800000L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000000000L,0x0000000050000000L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000000000000L,0x0000002040000000L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000000000000000L,0x000000000C000000L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0000000000000000L,0x0000000180000000L});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x0000000000000000L,0x0000001E00000000L});
    public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_102 = new BitSet(new long[]{0x0000000000004000L,0x0000110000000000L});
    public static final BitSet FOLLOW_103 = new BitSet(new long[]{0x0000000000004000L,0x0000100000000000L});
    public static final BitSet FOLLOW_104 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_105 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_106 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000000L});
    public static final BitSet FOLLOW_107 = new BitSet(new long[]{0x0000000000000002L,0x0000040000000000L});
    public static final BitSet FOLLOW_108 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_109 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_110 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_111 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_112 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_113 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_114 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_115 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_116 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_117 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L});
    public static final BitSet FOLLOW_118 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_119 = new BitSet(new long[]{0x0000000000000002L,0x0004000000000000L});
    public static final BitSet FOLLOW_120 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_121 = new BitSet(new long[]{0x0000000000000000L,0x03E0000000000000L});
    public static final BitSet FOLLOW_122 = new BitSet(new long[]{0x0000000000000002L,0x03E0000000000000L});
    public static final BitSet FOLLOW_123 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_124 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_125 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_126 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_127 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_128 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_129 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_130 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_131 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_132 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_133 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_134 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000000L,0x000000000001D000L});
    public static final BitSet FOLLOW_135 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_136 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_137 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000007E0L});
    public static final BitSet FOLLOW_138 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_139 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_140 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_141 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_142 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_143 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_144 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_145 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_146 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_147 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000001F8000000L});
    public static final BitSet FOLLOW_148 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000000L,0x00000001F8000000L});
    public static final BitSet FOLLOW_149 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_150 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001800000000L});
    public static final BitSet FOLLOW_151 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000000L,0x0000001800000000L});
    public static final BitSet FOLLOW_152 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_153 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_154 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_155 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_156 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_157 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000070000000000L});
    public static final BitSet FOLLOW_158 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0018070000000000L});
    public static final BitSet FOLLOW_159 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0018000000000000L});
    public static final BitSet FOLLOW_160 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_161 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_162 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_163 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_164 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_165 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_166 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_167 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_168 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_169 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_170 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_171 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_172 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_173 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_174 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_175 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1800000000000000L});
    public static final BitSet FOLLOW_176 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xA000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_177 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_178 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_179 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_180 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_181 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});

}