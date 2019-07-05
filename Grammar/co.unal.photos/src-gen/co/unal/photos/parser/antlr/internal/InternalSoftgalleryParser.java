package co.unal.photos.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import co.unal.photos.services.SoftgalleryGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSoftgalleryParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'System'", "':'", "'{'", "'}'", "'Domain'", "'Entities'", "'Photo'", "'Album'", "'UserDomain'", "'Functionalities'", "'ProfileManagement'", "'ViewProfilePhoto'", "'EditProfileInfo'", "'AppAccess'", "'Login'", "'Register'", "'AlbumManagement'", "'CreateAlbum'", "'SelectAlbum'", "'PhotoActions'", "'ViewAllPhotos'", "'ViewExtendedPhoto'", "'LoadPhoto'", "'LandingActions'", "'ViewCarousel'", "'PassPhoto'", "'DomainRelations'", "'Architecture:'", "'Layers'", "'LayersRelations'", "'ArchitectureComponents'", "'PresentationLayer'", "'PresentationSegments'", "'PresentationView'", "'PresentationComponent'", "'PresentationAction'", "'BusinessLogicLayer'", "'BusinessLogicSegments'", "'ControllerSegment'", "'ModelSegment'", "'RepositorySegment'", "'SecuritySegment'", "'DataPersistenceLayer'", "'DataPersistenceSegments'", "'PostgreSLQSegment'", "'AmazonS3Storage'", "'SegmentStructure'", "'Directories'", "'Directory'", "'SingleFile'", "'CommonFile'", "'AllowedToUse'", "'AllowToUseBelow'", "'source'", "'target'", "'PersistenceDataLayer'", "'SystemComponents'", "'FrontEndComponent'", "'BackEndComponent'", "'PersistenceDataComponent'", "'Connectors'", "'REST'", "'PostgreSQLConnection'", "'AmazonS3API'", "'AmazonService'", "'Technology'", "'Spring'", "'SpringBootApplication'", "'Configuration'", "'EnableGlobalMethodSecurity'", "'EnableAuthorizationServer'", "'EnableResourceServer'", "'EnableWebSecurity'", "'SpringComponent'", "'OrderSpring'", "'SpringRepositories'", "'SpringRepository'", "'RestController'", "'Specification'", "'Predicate'", "'SearchCriteria'", "'Autowired'", "'AutowiredType'", "'RequestMapping'", "'RequestPart'", "'RequestMappingType'", "'PostMapping'", "'GetMapping'", "'PutMapping'", "'DeleteMapping'", "'ExceptionHandler'", "'ExceptionProcess'", "'SpringEntity'", "'SpringTable'", "'SpringTableId'", "'GeneratedValue'", "'Column'", "'NameNativeQuery'", "'React'", "'ReactModules'", "'ReactConfiguration'", "'DependenciesStruct'", "'DependencyType'", "'PackageName'", "'PackageVersion'", "'ReactDOMConfigurations'", "'RoutingConf'", "'ServiceWorker'", "'HTMLStructure'", "'Manifest'", "'RepositoriesConf'", "'ReactComponents'", "'LogicComponents'", "'RoutingComponents'", "'AppComponent'", "'IndexComponent'", "'UIComponents'", "'ViewComponent'", "'Subcomponents'", "'Constructor'", "'State'", "'String'", "'Array'", "'Object'", "'Number'", "'null'", "'Boolean'", "'FunctionBindingDeclaration'", "'ComponentDidMount'", "'FunctionStructure'", "'ComponentDidUpdate'", "'ComponentWillUnmount'", "'Render'", "'RenderContent'", "'Props'", "'ReactActions'", "'ServiceType'", "'ServiceContent'", "'ServicesRelations'", "'Wrapper'", "'AuxWrapper'", "'ReactLibraries'", "'LibraryContent'", "'ReactDesign'", "'ReactRouting'", "'ComponentManagement'", "'StoreManagement'", "'ReactDeployment'", "'ConfigurationLibrary'", "'ReactInformation'", "'InformationContent'", "'ReactReadme'", "'ReactAditionalInfo'", "'PostgreSQL'", "'Database'", "'Schema'", "'Index_p'", "'ViewSchema'", "'Table_p'", "'ForeignKey'", "'ForeingKeyName'", "'ForeignKeyRef'", "'RefTable_p'", "'DatatypeDB'", "'Constraint'", "'Row'", "'Policy'", "'Trigger'", "'Function'", "'PostgresUser'", "'Privilege'", "'Query'", "'Clause'", "'AmazonWebServices'", "'AmazonSimpleStorageService'", "'BatchOperation'", "'Bucket'", "'BucketAccess'", "'PublicAccess'", "'ObjectsPublic'", "'BucketObjectsNotPublic'", "'OnlyAuthorized'", "'AmazonFolder'", "'AmazonFile'", "'Metadata'", "'AmazonElasticComputeCloud'"
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


        public InternalSoftgalleryParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSoftgalleryParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSoftgalleryParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSoftgallery.g"; }



     	private SoftgalleryGrammarAccess grammarAccess;

        public InternalSoftgalleryParser(TokenStream input, SoftgalleryGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected SoftgalleryGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalSoftgallery.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalSoftgallery.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalSoftgallery.g:65:2: iv_ruleModel= ruleModel EOF
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
    // InternalSoftgallery.g:71:1: ruleModel returns [EObject current=null] : (otherlv_0= 'System' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleDomain ) ) ( (lv_elements_4_0= ruleArchitecture ) ) ( (lv_elements_5_0= ruleTechnology ) ) otherlv_6= '}' ) ;
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
            // InternalSoftgallery.g:77:2: ( (otherlv_0= 'System' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleDomain ) ) ( (lv_elements_4_0= ruleArchitecture ) ) ( (lv_elements_5_0= ruleTechnology ) ) otherlv_6= '}' ) )
            // InternalSoftgallery.g:78:2: (otherlv_0= 'System' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleDomain ) ) ( (lv_elements_4_0= ruleArchitecture ) ) ( (lv_elements_5_0= ruleTechnology ) ) otherlv_6= '}' )
            {
            // InternalSoftgallery.g:78:2: (otherlv_0= 'System' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleDomain ) ) ( (lv_elements_4_0= ruleArchitecture ) ) ( (lv_elements_5_0= ruleTechnology ) ) otherlv_6= '}' )
            // InternalSoftgallery.g:79:3: otherlv_0= 'System' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleDomain ) ) ( (lv_elements_4_0= ruleArchitecture ) ) ( (lv_elements_5_0= ruleTechnology ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getSystemKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getModelAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSoftgallery.g:91:3: ( (lv_elements_3_0= ruleDomain ) )
            // InternalSoftgallery.g:92:4: (lv_elements_3_0= ruleDomain )
            {
            // InternalSoftgallery.g:92:4: (lv_elements_3_0= ruleDomain )
            // InternalSoftgallery.g:93:5: lv_elements_3_0= ruleDomain
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
            						"co.unal.photos.Softgallery.Domain");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftgallery.g:110:3: ( (lv_elements_4_0= ruleArchitecture ) )
            // InternalSoftgallery.g:111:4: (lv_elements_4_0= ruleArchitecture )
            {
            // InternalSoftgallery.g:111:4: (lv_elements_4_0= ruleArchitecture )
            // InternalSoftgallery.g:112:5: lv_elements_4_0= ruleArchitecture
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
            						"co.unal.photos.Softgallery.Architecture");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftgallery.g:129:3: ( (lv_elements_5_0= ruleTechnology ) )
            // InternalSoftgallery.g:130:4: (lv_elements_5_0= ruleTechnology )
            {
            // InternalSoftgallery.g:130:4: (lv_elements_5_0= ruleTechnology )
            // InternalSoftgallery.g:131:5: lv_elements_5_0= ruleTechnology
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
            						"co.unal.photos.Softgallery.Technology");
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
    // InternalSoftgallery.g:156:1: entryRuleDomain returns [EObject current=null] : iv_ruleDomain= ruleDomain EOF ;
    public final EObject entryRuleDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomain = null;


        try {
            // InternalSoftgallery.g:156:47: (iv_ruleDomain= ruleDomain EOF )
            // InternalSoftgallery.g:157:2: iv_ruleDomain= ruleDomain EOF
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
    // InternalSoftgallery.g:163:1: ruleDomain returns [EObject current=null] : (otherlv_0= 'Domain' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleEntity ) ) ( (lv_elements_5_0= ruleFunctionality ) ) ( (lv_elements_6_0= ruleDomainConnection ) ) otherlv_7= '}' ) ;
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
            // InternalSoftgallery.g:169:2: ( (otherlv_0= 'Domain' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleEntity ) ) ( (lv_elements_5_0= ruleFunctionality ) ) ( (lv_elements_6_0= ruleDomainConnection ) ) otherlv_7= '}' ) )
            // InternalSoftgallery.g:170:2: (otherlv_0= 'Domain' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleEntity ) ) ( (lv_elements_5_0= ruleFunctionality ) ) ( (lv_elements_6_0= ruleDomainConnection ) ) otherlv_7= '}' )
            {
            // InternalSoftgallery.g:170:2: (otherlv_0= 'Domain' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleEntity ) ) ( (lv_elements_5_0= ruleFunctionality ) ) ( (lv_elements_6_0= ruleDomainConnection ) ) otherlv_7= '}' )
            // InternalSoftgallery.g:171:3: otherlv_0= 'Domain' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleEntity ) ) ( (lv_elements_5_0= ruleFunctionality ) ) ( (lv_elements_6_0= ruleDomainConnection ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getDomainAccess().getDomainKeyword_0());
            		
            // InternalSoftgallery.g:175:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:176:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:176:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:177:5: lv_name_1_0= RULE_ID
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
            		
            // InternalSoftgallery.g:201:3: ( (lv_elements_4_0= ruleEntity ) )
            // InternalSoftgallery.g:202:4: (lv_elements_4_0= ruleEntity )
            {
            // InternalSoftgallery.g:202:4: (lv_elements_4_0= ruleEntity )
            // InternalSoftgallery.g:203:5: lv_elements_4_0= ruleEntity
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
            						"co.unal.photos.Softgallery.Entity");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftgallery.g:220:3: ( (lv_elements_5_0= ruleFunctionality ) )
            // InternalSoftgallery.g:221:4: (lv_elements_5_0= ruleFunctionality )
            {
            // InternalSoftgallery.g:221:4: (lv_elements_5_0= ruleFunctionality )
            // InternalSoftgallery.g:222:5: lv_elements_5_0= ruleFunctionality
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
            						"co.unal.photos.Softgallery.Functionality");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftgallery.g:239:3: ( (lv_elements_6_0= ruleDomainConnection ) )
            // InternalSoftgallery.g:240:4: (lv_elements_6_0= ruleDomainConnection )
            {
            // InternalSoftgallery.g:240:4: (lv_elements_6_0= ruleDomainConnection )
            // InternalSoftgallery.g:241:5: lv_elements_6_0= ruleDomainConnection
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
            						"co.unal.photos.Softgallery.DomainConnection");
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
    // InternalSoftgallery.g:266:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalSoftgallery.g:266:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalSoftgallery.g:267:2: iv_ruleEntity= ruleEntity EOF
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
    // InternalSoftgallery.g:273:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'Entities' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleEntities ) ) otherlv_4= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalSoftgallery.g:279:2: ( (otherlv_0= 'Entities' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleEntities ) ) otherlv_4= '}' ) )
            // InternalSoftgallery.g:280:2: (otherlv_0= 'Entities' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleEntities ) ) otherlv_4= '}' )
            {
            // InternalSoftgallery.g:280:2: (otherlv_0= 'Entities' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleEntities ) ) otherlv_4= '}' )
            // InternalSoftgallery.g:281:3: otherlv_0= 'Entities' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleEntities ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntitiesKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSoftgallery.g:293:3: ( (lv_elements_3_0= ruleEntities ) )
            // InternalSoftgallery.g:294:4: (lv_elements_3_0= ruleEntities )
            {
            // InternalSoftgallery.g:294:4: (lv_elements_3_0= ruleEntities )
            // InternalSoftgallery.g:295:5: lv_elements_3_0= ruleEntities
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
            						"co.unal.photos.Softgallery.Entities");
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
    // InternalSoftgallery.g:320:1: entryRuleEntities returns [EObject current=null] : iv_ruleEntities= ruleEntities EOF ;
    public final EObject entryRuleEntities() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntities = null;


        try {
            // InternalSoftgallery.g:320:49: (iv_ruleEntities= ruleEntities EOF )
            // InternalSoftgallery.g:321:2: iv_ruleEntities= ruleEntities EOF
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
    // InternalSoftgallery.g:327:1: ruleEntities returns [EObject current=null] : ( ( (lv_elements_0_0= rulePhoto ) )+ ( (lv_elements_1_0= ruleAlbum ) )+ ( (lv_elements_2_0= ruleUserDomain ) )+ ) ;
    public final EObject ruleEntities() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;

        EObject lv_elements_1_0 = null;

        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalSoftgallery.g:333:2: ( ( ( (lv_elements_0_0= rulePhoto ) )+ ( (lv_elements_1_0= ruleAlbum ) )+ ( (lv_elements_2_0= ruleUserDomain ) )+ ) )
            // InternalSoftgallery.g:334:2: ( ( (lv_elements_0_0= rulePhoto ) )+ ( (lv_elements_1_0= ruleAlbum ) )+ ( (lv_elements_2_0= ruleUserDomain ) )+ )
            {
            // InternalSoftgallery.g:334:2: ( ( (lv_elements_0_0= rulePhoto ) )+ ( (lv_elements_1_0= ruleAlbum ) )+ ( (lv_elements_2_0= ruleUserDomain ) )+ )
            // InternalSoftgallery.g:335:3: ( (lv_elements_0_0= rulePhoto ) )+ ( (lv_elements_1_0= ruleAlbum ) )+ ( (lv_elements_2_0= ruleUserDomain ) )+
            {
            // InternalSoftgallery.g:335:3: ( (lv_elements_0_0= rulePhoto ) )+
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
            	    // InternalSoftgallery.g:336:4: (lv_elements_0_0= rulePhoto )
            	    {
            	    // InternalSoftgallery.g:336:4: (lv_elements_0_0= rulePhoto )
            	    // InternalSoftgallery.g:337:5: lv_elements_0_0= rulePhoto
            	    {

            	    					newCompositeNode(grammarAccess.getEntitiesAccess().getElementsPhotoParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_elements_0_0=rulePhoto();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntitiesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_0_0,
            	    						"co.unal.photos.Softgallery.Photo");
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

            // InternalSoftgallery.g:354:3: ( (lv_elements_1_0= ruleAlbum ) )+
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
            	    // InternalSoftgallery.g:355:4: (lv_elements_1_0= ruleAlbum )
            	    {
            	    // InternalSoftgallery.g:355:4: (lv_elements_1_0= ruleAlbum )
            	    // InternalSoftgallery.g:356:5: lv_elements_1_0= ruleAlbum
            	    {

            	    					newCompositeNode(grammarAccess.getEntitiesAccess().getElementsAlbumParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_elements_1_0=ruleAlbum();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntitiesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_1_0,
            	    						"co.unal.photos.Softgallery.Album");
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

            // InternalSoftgallery.g:373:3: ( (lv_elements_2_0= ruleUserDomain ) )+
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
            	    // InternalSoftgallery.g:374:4: (lv_elements_2_0= ruleUserDomain )
            	    {
            	    // InternalSoftgallery.g:374:4: (lv_elements_2_0= ruleUserDomain )
            	    // InternalSoftgallery.g:375:5: lv_elements_2_0= ruleUserDomain
            	    {

            	    					newCompositeNode(grammarAccess.getEntitiesAccess().getElementsUserDomainParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_elements_2_0=ruleUserDomain();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntitiesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_2_0,
            	    						"co.unal.photos.Softgallery.UserDomain");
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
    // InternalSoftgallery.g:396:1: entryRulePhoto returns [EObject current=null] : iv_rulePhoto= rulePhoto EOF ;
    public final EObject entryRulePhoto() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhoto = null;


        try {
            // InternalSoftgallery.g:396:46: (iv_rulePhoto= rulePhoto EOF )
            // InternalSoftgallery.g:397:2: iv_rulePhoto= rulePhoto EOF
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
    // InternalSoftgallery.g:403:1: rulePhoto returns [EObject current=null] : (otherlv_0= 'Photo' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePhoto() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftgallery.g:409:2: ( (otherlv_0= 'Photo' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftgallery.g:410:2: (otherlv_0= 'Photo' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftgallery.g:410:2: (otherlv_0= 'Photo' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftgallery.g:411:3: otherlv_0= 'Photo' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getPhotoAccess().getPhotoKeyword_0());
            		
            // InternalSoftgallery.g:415:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:416:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:416:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:417:5: lv_name_1_0= RULE_ID
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
    // InternalSoftgallery.g:437:1: entryRuleAlbum returns [EObject current=null] : iv_ruleAlbum= ruleAlbum EOF ;
    public final EObject entryRuleAlbum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlbum = null;


        try {
            // InternalSoftgallery.g:437:46: (iv_ruleAlbum= ruleAlbum EOF )
            // InternalSoftgallery.g:438:2: iv_ruleAlbum= ruleAlbum EOF
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
    // InternalSoftgallery.g:444:1: ruleAlbum returns [EObject current=null] : (otherlv_0= 'Album' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAlbum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftgallery.g:450:2: ( (otherlv_0= 'Album' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftgallery.g:451:2: (otherlv_0= 'Album' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftgallery.g:451:2: (otherlv_0= 'Album' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftgallery.g:452:3: otherlv_0= 'Album' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getAlbumAccess().getAlbumKeyword_0());
            		
            // InternalSoftgallery.g:456:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:457:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:457:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:458:5: lv_name_1_0= RULE_ID
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
    // InternalSoftgallery.g:478:1: entryRuleUserDomain returns [EObject current=null] : iv_ruleUserDomain= ruleUserDomain EOF ;
    public final EObject entryRuleUserDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUserDomain = null;


        try {
            // InternalSoftgallery.g:478:51: (iv_ruleUserDomain= ruleUserDomain EOF )
            // InternalSoftgallery.g:479:2: iv_ruleUserDomain= ruleUserDomain EOF
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
    // InternalSoftgallery.g:485:1: ruleUserDomain returns [EObject current=null] : (otherlv_0= 'UserDomain' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleUserDomain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftgallery.g:491:2: ( (otherlv_0= 'UserDomain' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftgallery.g:492:2: (otherlv_0= 'UserDomain' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftgallery.g:492:2: (otherlv_0= 'UserDomain' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftgallery.g:493:3: otherlv_0= 'UserDomain' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getUserDomainAccess().getUserDomainKeyword_0());
            		
            // InternalSoftgallery.g:497:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:498:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:498:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:499:5: lv_name_1_0= RULE_ID
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
    // InternalSoftgallery.g:519:1: entryRuleFunctionality returns [EObject current=null] : iv_ruleFunctionality= ruleFunctionality EOF ;
    public final EObject entryRuleFunctionality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionality = null;


        try {
            // InternalSoftgallery.g:519:54: (iv_ruleFunctionality= ruleFunctionality EOF )
            // InternalSoftgallery.g:520:2: iv_ruleFunctionality= ruleFunctionality EOF
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
    // InternalSoftgallery.g:526:1: ruleFunctionality returns [EObject current=null] : (otherlv_0= 'Functionalities' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleFunctionalities ) ) otherlv_4= '}' ) ;
    public final EObject ruleFunctionality() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalSoftgallery.g:532:2: ( (otherlv_0= 'Functionalities' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleFunctionalities ) ) otherlv_4= '}' ) )
            // InternalSoftgallery.g:533:2: (otherlv_0= 'Functionalities' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleFunctionalities ) ) otherlv_4= '}' )
            {
            // InternalSoftgallery.g:533:2: (otherlv_0= 'Functionalities' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleFunctionalities ) ) otherlv_4= '}' )
            // InternalSoftgallery.g:534:3: otherlv_0= 'Functionalities' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleFunctionalities ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionalityAccess().getFunctionalitiesKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getFunctionalityAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getFunctionalityAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSoftgallery.g:546:3: ( (lv_elements_3_0= ruleFunctionalities ) )
            // InternalSoftgallery.g:547:4: (lv_elements_3_0= ruleFunctionalities )
            {
            // InternalSoftgallery.g:547:4: (lv_elements_3_0= ruleFunctionalities )
            // InternalSoftgallery.g:548:5: lv_elements_3_0= ruleFunctionalities
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
            						"co.unal.photos.Softgallery.Functionalities");
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
    // InternalSoftgallery.g:573:1: entryRuleFunctionalities returns [EObject current=null] : iv_ruleFunctionalities= ruleFunctionalities EOF ;
    public final EObject entryRuleFunctionalities() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionalities = null;


        try {
            // InternalSoftgallery.g:573:56: (iv_ruleFunctionalities= ruleFunctionalities EOF )
            // InternalSoftgallery.g:574:2: iv_ruleFunctionalities= ruleFunctionalities EOF
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
    // InternalSoftgallery.g:580:1: ruleFunctionalities returns [EObject current=null] : ( ( (lv_functions_0_0= ruleProfileManagement ) ) ( (lv_elements_1_0= ruleAppAccess ) ) ( (lv_items_2_0= ruleAlbumManagement ) ) ( (lv_resources_3_0= rulePhotoActions ) ) ( (lv_aditionals_4_0= ruleLandingActions ) ) ) ;
    public final EObject ruleFunctionalities() throws RecognitionException {
        EObject current = null;

        EObject lv_functions_0_0 = null;

        EObject lv_elements_1_0 = null;

        EObject lv_items_2_0 = null;

        EObject lv_resources_3_0 = null;

        EObject lv_aditionals_4_0 = null;



        	enterRule();

        try {
            // InternalSoftgallery.g:586:2: ( ( ( (lv_functions_0_0= ruleProfileManagement ) ) ( (lv_elements_1_0= ruleAppAccess ) ) ( (lv_items_2_0= ruleAlbumManagement ) ) ( (lv_resources_3_0= rulePhotoActions ) ) ( (lv_aditionals_4_0= ruleLandingActions ) ) ) )
            // InternalSoftgallery.g:587:2: ( ( (lv_functions_0_0= ruleProfileManagement ) ) ( (lv_elements_1_0= ruleAppAccess ) ) ( (lv_items_2_0= ruleAlbumManagement ) ) ( (lv_resources_3_0= rulePhotoActions ) ) ( (lv_aditionals_4_0= ruleLandingActions ) ) )
            {
            // InternalSoftgallery.g:587:2: ( ( (lv_functions_0_0= ruleProfileManagement ) ) ( (lv_elements_1_0= ruleAppAccess ) ) ( (lv_items_2_0= ruleAlbumManagement ) ) ( (lv_resources_3_0= rulePhotoActions ) ) ( (lv_aditionals_4_0= ruleLandingActions ) ) )
            // InternalSoftgallery.g:588:3: ( (lv_functions_0_0= ruleProfileManagement ) ) ( (lv_elements_1_0= ruleAppAccess ) ) ( (lv_items_2_0= ruleAlbumManagement ) ) ( (lv_resources_3_0= rulePhotoActions ) ) ( (lv_aditionals_4_0= ruleLandingActions ) )
            {
            // InternalSoftgallery.g:588:3: ( (lv_functions_0_0= ruleProfileManagement ) )
            // InternalSoftgallery.g:589:4: (lv_functions_0_0= ruleProfileManagement )
            {
            // InternalSoftgallery.g:589:4: (lv_functions_0_0= ruleProfileManagement )
            // InternalSoftgallery.g:590:5: lv_functions_0_0= ruleProfileManagement
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
            						"co.unal.photos.Softgallery.ProfileManagement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftgallery.g:607:3: ( (lv_elements_1_0= ruleAppAccess ) )
            // InternalSoftgallery.g:608:4: (lv_elements_1_0= ruleAppAccess )
            {
            // InternalSoftgallery.g:608:4: (lv_elements_1_0= ruleAppAccess )
            // InternalSoftgallery.g:609:5: lv_elements_1_0= ruleAppAccess
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
            						"co.unal.photos.Softgallery.AppAccess");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftgallery.g:626:3: ( (lv_items_2_0= ruleAlbumManagement ) )
            // InternalSoftgallery.g:627:4: (lv_items_2_0= ruleAlbumManagement )
            {
            // InternalSoftgallery.g:627:4: (lv_items_2_0= ruleAlbumManagement )
            // InternalSoftgallery.g:628:5: lv_items_2_0= ruleAlbumManagement
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
            						"co.unal.photos.Softgallery.AlbumManagement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftgallery.g:645:3: ( (lv_resources_3_0= rulePhotoActions ) )
            // InternalSoftgallery.g:646:4: (lv_resources_3_0= rulePhotoActions )
            {
            // InternalSoftgallery.g:646:4: (lv_resources_3_0= rulePhotoActions )
            // InternalSoftgallery.g:647:5: lv_resources_3_0= rulePhotoActions
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
            						"co.unal.photos.Softgallery.PhotoActions");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftgallery.g:664:3: ( (lv_aditionals_4_0= ruleLandingActions ) )
            // InternalSoftgallery.g:665:4: (lv_aditionals_4_0= ruleLandingActions )
            {
            // InternalSoftgallery.g:665:4: (lv_aditionals_4_0= ruleLandingActions )
            // InternalSoftgallery.g:666:5: lv_aditionals_4_0= ruleLandingActions
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
            						"co.unal.photos.Softgallery.LandingActions");
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
    // InternalSoftgallery.g:687:1: entryRuleProfileManagement returns [EObject current=null] : iv_ruleProfileManagement= ruleProfileManagement EOF ;
    public final EObject entryRuleProfileManagement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProfileManagement = null;


        try {
            // InternalSoftgallery.g:687:58: (iv_ruleProfileManagement= ruleProfileManagement EOF )
            // InternalSoftgallery.g:688:2: iv_ruleProfileManagement= ruleProfileManagement EOF
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
    // InternalSoftgallery.g:694:1: ruleProfileManagement returns [EObject current=null] : (otherlv_0= 'ProfileManagement' otherlv_1= ':' ( (lv_items_2_0= ruleProfileManagementFunctions ) ) ) ;
    public final EObject ruleProfileManagement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_items_2_0 = null;



        	enterRule();

        try {
            // InternalSoftgallery.g:700:2: ( (otherlv_0= 'ProfileManagement' otherlv_1= ':' ( (lv_items_2_0= ruleProfileManagementFunctions ) ) ) )
            // InternalSoftgallery.g:701:2: (otherlv_0= 'ProfileManagement' otherlv_1= ':' ( (lv_items_2_0= ruleProfileManagementFunctions ) ) )
            {
            // InternalSoftgallery.g:701:2: (otherlv_0= 'ProfileManagement' otherlv_1= ':' ( (lv_items_2_0= ruleProfileManagementFunctions ) ) )
            // InternalSoftgallery.g:702:3: otherlv_0= 'ProfileManagement' otherlv_1= ':' ( (lv_items_2_0= ruleProfileManagementFunctions ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProfileManagementAccess().getProfileManagementKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getProfileManagementAccess().getColonKeyword_1());
            		
            // InternalSoftgallery.g:710:3: ( (lv_items_2_0= ruleProfileManagementFunctions ) )
            // InternalSoftgallery.g:711:4: (lv_items_2_0= ruleProfileManagementFunctions )
            {
            // InternalSoftgallery.g:711:4: (lv_items_2_0= ruleProfileManagementFunctions )
            // InternalSoftgallery.g:712:5: lv_items_2_0= ruleProfileManagementFunctions
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
            						"co.unal.photos.Softgallery.ProfileManagementFunctions");
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
    // InternalSoftgallery.g:733:1: entryRuleProfileManagementFunctions returns [EObject current=null] : iv_ruleProfileManagementFunctions= ruleProfileManagementFunctions EOF ;
    public final EObject entryRuleProfileManagementFunctions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProfileManagementFunctions = null;


        try {
            // InternalSoftgallery.g:733:67: (iv_ruleProfileManagementFunctions= ruleProfileManagementFunctions EOF )
            // InternalSoftgallery.g:734:2: iv_ruleProfileManagementFunctions= ruleProfileManagementFunctions EOF
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
    // InternalSoftgallery.g:740:1: ruleProfileManagementFunctions returns [EObject current=null] : (otherlv_0= 'ViewProfilePhoto' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'EditProfileInfo' ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleProfileManagementFunctions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;


        	enterRule();

        try {
            // InternalSoftgallery.g:746:2: ( (otherlv_0= 'ViewProfilePhoto' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'EditProfileInfo' ( (lv_name_3_0= RULE_ID ) ) ) )
            // InternalSoftgallery.g:747:2: (otherlv_0= 'ViewProfilePhoto' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'EditProfileInfo' ( (lv_name_3_0= RULE_ID ) ) )
            {
            // InternalSoftgallery.g:747:2: (otherlv_0= 'ViewProfilePhoto' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'EditProfileInfo' ( (lv_name_3_0= RULE_ID ) ) )
            // InternalSoftgallery.g:748:3: otherlv_0= 'ViewProfilePhoto' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'EditProfileInfo' ( (lv_name_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getProfileManagementFunctionsAccess().getViewProfilePhotoKeyword_0());
            		
            // InternalSoftgallery.g:752:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:753:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:753:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:754:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProfileManagementFunctionsAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProfileManagementFunctionsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getProfileManagementFunctionsAccess().getEditProfileInfoKeyword_2());
            		
            // InternalSoftgallery.g:774:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalSoftgallery.g:775:4: (lv_name_3_0= RULE_ID )
            {
            // InternalSoftgallery.g:775:4: (lv_name_3_0= RULE_ID )
            // InternalSoftgallery.g:776:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_3_0, grammarAccess.getProfileManagementFunctionsAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProfileManagementFunctionsRule());
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
    // InternalSoftgallery.g:796:1: entryRuleAppAccess returns [EObject current=null] : iv_ruleAppAccess= ruleAppAccess EOF ;
    public final EObject entryRuleAppAccess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppAccess = null;


        try {
            // InternalSoftgallery.g:796:50: (iv_ruleAppAccess= ruleAppAccess EOF )
            // InternalSoftgallery.g:797:2: iv_ruleAppAccess= ruleAppAccess EOF
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
    // InternalSoftgallery.g:803:1: ruleAppAccess returns [EObject current=null] : (otherlv_0= 'AppAccess' otherlv_1= ':' ( (lv_items_2_0= ruleAppAccessFunctions ) ) ) ;
    public final EObject ruleAppAccess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_items_2_0 = null;



        	enterRule();

        try {
            // InternalSoftgallery.g:809:2: ( (otherlv_0= 'AppAccess' otherlv_1= ':' ( (lv_items_2_0= ruleAppAccessFunctions ) ) ) )
            // InternalSoftgallery.g:810:2: (otherlv_0= 'AppAccess' otherlv_1= ':' ( (lv_items_2_0= ruleAppAccessFunctions ) ) )
            {
            // InternalSoftgallery.g:810:2: (otherlv_0= 'AppAccess' otherlv_1= ':' ( (lv_items_2_0= ruleAppAccessFunctions ) ) )
            // InternalSoftgallery.g:811:3: otherlv_0= 'AppAccess' otherlv_1= ':' ( (lv_items_2_0= ruleAppAccessFunctions ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAppAccessAccess().getAppAccessKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getAppAccessAccess().getColonKeyword_1());
            		
            // InternalSoftgallery.g:819:3: ( (lv_items_2_0= ruleAppAccessFunctions ) )
            // InternalSoftgallery.g:820:4: (lv_items_2_0= ruleAppAccessFunctions )
            {
            // InternalSoftgallery.g:820:4: (lv_items_2_0= ruleAppAccessFunctions )
            // InternalSoftgallery.g:821:5: lv_items_2_0= ruleAppAccessFunctions
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
            						"co.unal.photos.Softgallery.AppAccessFunctions");
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
    // InternalSoftgallery.g:842:1: entryRuleAppAccessFunctions returns [EObject current=null] : iv_ruleAppAccessFunctions= ruleAppAccessFunctions EOF ;
    public final EObject entryRuleAppAccessFunctions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppAccessFunctions = null;


        try {
            // InternalSoftgallery.g:842:59: (iv_ruleAppAccessFunctions= ruleAppAccessFunctions EOF )
            // InternalSoftgallery.g:843:2: iv_ruleAppAccessFunctions= ruleAppAccessFunctions EOF
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
    // InternalSoftgallery.g:849:1: ruleAppAccessFunctions returns [EObject current=null] : (otherlv_0= 'Login' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Register' ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleAppAccessFunctions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;


        	enterRule();

        try {
            // InternalSoftgallery.g:855:2: ( (otherlv_0= 'Login' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Register' ( (lv_name_3_0= RULE_ID ) ) ) )
            // InternalSoftgallery.g:856:2: (otherlv_0= 'Login' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Register' ( (lv_name_3_0= RULE_ID ) ) )
            {
            // InternalSoftgallery.g:856:2: (otherlv_0= 'Login' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Register' ( (lv_name_3_0= RULE_ID ) ) )
            // InternalSoftgallery.g:857:3: otherlv_0= 'Login' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Register' ( (lv_name_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getAppAccessFunctionsAccess().getLoginKeyword_0());
            		
            // InternalSoftgallery.g:861:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:862:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:862:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:863:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAppAccessFunctionsAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAppAccessFunctionsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getAppAccessFunctionsAccess().getRegisterKeyword_2());
            		
            // InternalSoftgallery.g:883:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalSoftgallery.g:884:4: (lv_name_3_0= RULE_ID )
            {
            // InternalSoftgallery.g:884:4: (lv_name_3_0= RULE_ID )
            // InternalSoftgallery.g:885:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_3_0, grammarAccess.getAppAccessFunctionsAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAppAccessFunctionsRule());
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
    // InternalSoftgallery.g:905:1: entryRuleAlbumManagement returns [EObject current=null] : iv_ruleAlbumManagement= ruleAlbumManagement EOF ;
    public final EObject entryRuleAlbumManagement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlbumManagement = null;


        try {
            // InternalSoftgallery.g:905:56: (iv_ruleAlbumManagement= ruleAlbumManagement EOF )
            // InternalSoftgallery.g:906:2: iv_ruleAlbumManagement= ruleAlbumManagement EOF
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
    // InternalSoftgallery.g:912:1: ruleAlbumManagement returns [EObject current=null] : (otherlv_0= 'AlbumManagement' otherlv_1= ':' ( (lv_items_2_0= ruleAlbumManagementFunctions ) ) ) ;
    public final EObject ruleAlbumManagement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_items_2_0 = null;



        	enterRule();

        try {
            // InternalSoftgallery.g:918:2: ( (otherlv_0= 'AlbumManagement' otherlv_1= ':' ( (lv_items_2_0= ruleAlbumManagementFunctions ) ) ) )
            // InternalSoftgallery.g:919:2: (otherlv_0= 'AlbumManagement' otherlv_1= ':' ( (lv_items_2_0= ruleAlbumManagementFunctions ) ) )
            {
            // InternalSoftgallery.g:919:2: (otherlv_0= 'AlbumManagement' otherlv_1= ':' ( (lv_items_2_0= ruleAlbumManagementFunctions ) ) )
            // InternalSoftgallery.g:920:3: otherlv_0= 'AlbumManagement' otherlv_1= ':' ( (lv_items_2_0= ruleAlbumManagementFunctions ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAlbumManagementAccess().getAlbumManagementKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getAlbumManagementAccess().getColonKeyword_1());
            		
            // InternalSoftgallery.g:928:3: ( (lv_items_2_0= ruleAlbumManagementFunctions ) )
            // InternalSoftgallery.g:929:4: (lv_items_2_0= ruleAlbumManagementFunctions )
            {
            // InternalSoftgallery.g:929:4: (lv_items_2_0= ruleAlbumManagementFunctions )
            // InternalSoftgallery.g:930:5: lv_items_2_0= ruleAlbumManagementFunctions
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
            						"co.unal.photos.Softgallery.AlbumManagementFunctions");
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
    // InternalSoftgallery.g:951:1: entryRuleAlbumManagementFunctions returns [EObject current=null] : iv_ruleAlbumManagementFunctions= ruleAlbumManagementFunctions EOF ;
    public final EObject entryRuleAlbumManagementFunctions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlbumManagementFunctions = null;


        try {
            // InternalSoftgallery.g:951:65: (iv_ruleAlbumManagementFunctions= ruleAlbumManagementFunctions EOF )
            // InternalSoftgallery.g:952:2: iv_ruleAlbumManagementFunctions= ruleAlbumManagementFunctions EOF
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
    // InternalSoftgallery.g:958:1: ruleAlbumManagementFunctions returns [EObject current=null] : (otherlv_0= 'CreateAlbum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'SelectAlbum' ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleAlbumManagementFunctions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;


        	enterRule();

        try {
            // InternalSoftgallery.g:964:2: ( (otherlv_0= 'CreateAlbum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'SelectAlbum' ( (lv_name_3_0= RULE_ID ) ) ) )
            // InternalSoftgallery.g:965:2: (otherlv_0= 'CreateAlbum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'SelectAlbum' ( (lv_name_3_0= RULE_ID ) ) )
            {
            // InternalSoftgallery.g:965:2: (otherlv_0= 'CreateAlbum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'SelectAlbum' ( (lv_name_3_0= RULE_ID ) ) )
            // InternalSoftgallery.g:966:3: otherlv_0= 'CreateAlbum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'SelectAlbum' ( (lv_name_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getAlbumManagementFunctionsAccess().getCreateAlbumKeyword_0());
            		
            // InternalSoftgallery.g:970:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:971:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:971:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:972:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAlbumManagementFunctionsAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAlbumManagementFunctionsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getAlbumManagementFunctionsAccess().getSelectAlbumKeyword_2());
            		
            // InternalSoftgallery.g:992:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalSoftgallery.g:993:4: (lv_name_3_0= RULE_ID )
            {
            // InternalSoftgallery.g:993:4: (lv_name_3_0= RULE_ID )
            // InternalSoftgallery.g:994:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_3_0, grammarAccess.getAlbumManagementFunctionsAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAlbumManagementFunctionsRule());
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
    // InternalSoftgallery.g:1014:1: entryRulePhotoActions returns [EObject current=null] : iv_rulePhotoActions= rulePhotoActions EOF ;
    public final EObject entryRulePhotoActions() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhotoActions = null;


        try {
            // InternalSoftgallery.g:1014:53: (iv_rulePhotoActions= rulePhotoActions EOF )
            // InternalSoftgallery.g:1015:2: iv_rulePhotoActions= rulePhotoActions EOF
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
    // InternalSoftgallery.g:1021:1: rulePhotoActions returns [EObject current=null] : (otherlv_0= 'PhotoActions' otherlv_1= ':' ( (lv_items_2_0= rulePhotoActionsFunctions ) ) ) ;
    public final EObject rulePhotoActions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_items_2_0 = null;



        	enterRule();

        try {
            // InternalSoftgallery.g:1027:2: ( (otherlv_0= 'PhotoActions' otherlv_1= ':' ( (lv_items_2_0= rulePhotoActionsFunctions ) ) ) )
            // InternalSoftgallery.g:1028:2: (otherlv_0= 'PhotoActions' otherlv_1= ':' ( (lv_items_2_0= rulePhotoActionsFunctions ) ) )
            {
            // InternalSoftgallery.g:1028:2: (otherlv_0= 'PhotoActions' otherlv_1= ':' ( (lv_items_2_0= rulePhotoActionsFunctions ) ) )
            // InternalSoftgallery.g:1029:3: otherlv_0= 'PhotoActions' otherlv_1= ':' ( (lv_items_2_0= rulePhotoActionsFunctions ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPhotoActionsAccess().getPhotoActionsKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getPhotoActionsAccess().getColonKeyword_1());
            		
            // InternalSoftgallery.g:1037:3: ( (lv_items_2_0= rulePhotoActionsFunctions ) )
            // InternalSoftgallery.g:1038:4: (lv_items_2_0= rulePhotoActionsFunctions )
            {
            // InternalSoftgallery.g:1038:4: (lv_items_2_0= rulePhotoActionsFunctions )
            // InternalSoftgallery.g:1039:5: lv_items_2_0= rulePhotoActionsFunctions
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
            						"co.unal.photos.Softgallery.PhotoActionsFunctions");
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
    // InternalSoftgallery.g:1060:1: entryRulePhotoActionsFunctions returns [EObject current=null] : iv_rulePhotoActionsFunctions= rulePhotoActionsFunctions EOF ;
    public final EObject entryRulePhotoActionsFunctions() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhotoActionsFunctions = null;


        try {
            // InternalSoftgallery.g:1060:62: (iv_rulePhotoActionsFunctions= rulePhotoActionsFunctions EOF )
            // InternalSoftgallery.g:1061:2: iv_rulePhotoActionsFunctions= rulePhotoActionsFunctions EOF
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
    // InternalSoftgallery.g:1067:1: rulePhotoActionsFunctions returns [EObject current=null] : (otherlv_0= 'ViewAllPhotos' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ViewExtendedPhoto' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'LoadPhoto' ( (lv_name_5_0= RULE_ID ) ) ) ;
    public final EObject rulePhotoActionsFunctions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;


        	enterRule();

        try {
            // InternalSoftgallery.g:1073:2: ( (otherlv_0= 'ViewAllPhotos' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ViewExtendedPhoto' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'LoadPhoto' ( (lv_name_5_0= RULE_ID ) ) ) )
            // InternalSoftgallery.g:1074:2: (otherlv_0= 'ViewAllPhotos' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ViewExtendedPhoto' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'LoadPhoto' ( (lv_name_5_0= RULE_ID ) ) )
            {
            // InternalSoftgallery.g:1074:2: (otherlv_0= 'ViewAllPhotos' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ViewExtendedPhoto' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'LoadPhoto' ( (lv_name_5_0= RULE_ID ) ) )
            // InternalSoftgallery.g:1075:3: otherlv_0= 'ViewAllPhotos' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ViewExtendedPhoto' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'LoadPhoto' ( (lv_name_5_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getPhotoActionsFunctionsAccess().getViewAllPhotosKeyword_0());
            		
            // InternalSoftgallery.g:1079:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:1080:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:1080:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:1081:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPhotoActionsFunctionsAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPhotoActionsFunctionsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,32,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getPhotoActionsFunctionsAccess().getViewExtendedPhotoKeyword_2());
            		
            // InternalSoftgallery.g:1101:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalSoftgallery.g:1102:4: (lv_name_3_0= RULE_ID )
            {
            // InternalSoftgallery.g:1102:4: (lv_name_3_0= RULE_ID )
            // InternalSoftgallery.g:1103:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_30); 

            					newLeafNode(lv_name_3_0, grammarAccess.getPhotoActionsFunctionsAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPhotoActionsFunctionsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,33,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getPhotoActionsFunctionsAccess().getLoadPhotoKeyword_4());
            		
            // InternalSoftgallery.g:1123:3: ( (lv_name_5_0= RULE_ID ) )
            // InternalSoftgallery.g:1124:4: (lv_name_5_0= RULE_ID )
            {
            // InternalSoftgallery.g:1124:4: (lv_name_5_0= RULE_ID )
            // InternalSoftgallery.g:1125:5: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_5_0, grammarAccess.getPhotoActionsFunctionsAccess().getNameIDTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPhotoActionsFunctionsRule());
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
    // InternalSoftgallery.g:1145:1: entryRuleLandingActions returns [EObject current=null] : iv_ruleLandingActions= ruleLandingActions EOF ;
    public final EObject entryRuleLandingActions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLandingActions = null;


        try {
            // InternalSoftgallery.g:1145:55: (iv_ruleLandingActions= ruleLandingActions EOF )
            // InternalSoftgallery.g:1146:2: iv_ruleLandingActions= ruleLandingActions EOF
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
    // InternalSoftgallery.g:1152:1: ruleLandingActions returns [EObject current=null] : (otherlv_0= 'LandingActions' otherlv_1= ':' ( (lv_items_2_0= ruleLandingFunctions ) ) ) ;
    public final EObject ruleLandingActions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_items_2_0 = null;



        	enterRule();

        try {
            // InternalSoftgallery.g:1158:2: ( (otherlv_0= 'LandingActions' otherlv_1= ':' ( (lv_items_2_0= ruleLandingFunctions ) ) ) )
            // InternalSoftgallery.g:1159:2: (otherlv_0= 'LandingActions' otherlv_1= ':' ( (lv_items_2_0= ruleLandingFunctions ) ) )
            {
            // InternalSoftgallery.g:1159:2: (otherlv_0= 'LandingActions' otherlv_1= ':' ( (lv_items_2_0= ruleLandingFunctions ) ) )
            // InternalSoftgallery.g:1160:3: otherlv_0= 'LandingActions' otherlv_1= ':' ( (lv_items_2_0= ruleLandingFunctions ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLandingActionsAccess().getLandingActionsKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getLandingActionsAccess().getColonKeyword_1());
            		
            // InternalSoftgallery.g:1168:3: ( (lv_items_2_0= ruleLandingFunctions ) )
            // InternalSoftgallery.g:1169:4: (lv_items_2_0= ruleLandingFunctions )
            {
            // InternalSoftgallery.g:1169:4: (lv_items_2_0= ruleLandingFunctions )
            // InternalSoftgallery.g:1170:5: lv_items_2_0= ruleLandingFunctions
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
            						"co.unal.photos.Softgallery.LandingFunctions");
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
    // InternalSoftgallery.g:1191:1: entryRuleLandingFunctions returns [EObject current=null] : iv_ruleLandingFunctions= ruleLandingFunctions EOF ;
    public final EObject entryRuleLandingFunctions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLandingFunctions = null;


        try {
            // InternalSoftgallery.g:1191:57: (iv_ruleLandingFunctions= ruleLandingFunctions EOF )
            // InternalSoftgallery.g:1192:2: iv_ruleLandingFunctions= ruleLandingFunctions EOF
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
    // InternalSoftgallery.g:1198:1: ruleLandingFunctions returns [EObject current=null] : (otherlv_0= 'ViewCarousel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'PassPhoto' ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleLandingFunctions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;


        	enterRule();

        try {
            // InternalSoftgallery.g:1204:2: ( (otherlv_0= 'ViewCarousel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'PassPhoto' ( (lv_name_3_0= RULE_ID ) ) ) )
            // InternalSoftgallery.g:1205:2: (otherlv_0= 'ViewCarousel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'PassPhoto' ( (lv_name_3_0= RULE_ID ) ) )
            {
            // InternalSoftgallery.g:1205:2: (otherlv_0= 'ViewCarousel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'PassPhoto' ( (lv_name_3_0= RULE_ID ) ) )
            // InternalSoftgallery.g:1206:3: otherlv_0= 'ViewCarousel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'PassPhoto' ( (lv_name_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getLandingFunctionsAccess().getViewCarouselKeyword_0());
            		
            // InternalSoftgallery.g:1210:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:1211:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:1211:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:1212:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_32); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLandingFunctionsAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLandingFunctionsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,36,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getLandingFunctionsAccess().getPassPhotoKeyword_2());
            		
            // InternalSoftgallery.g:1232:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalSoftgallery.g:1233:4: (lv_name_3_0= RULE_ID )
            {
            // InternalSoftgallery.g:1233:4: (lv_name_3_0= RULE_ID )
            // InternalSoftgallery.g:1234:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_3_0, grammarAccess.getLandingFunctionsAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLandingFunctionsRule());
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
    // InternalSoftgallery.g:1254:1: entryRuleDomainConnection returns [EObject current=null] : iv_ruleDomainConnection= ruleDomainConnection EOF ;
    public final EObject entryRuleDomainConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainConnection = null;


        try {
            // InternalSoftgallery.g:1254:57: (iv_ruleDomainConnection= ruleDomainConnection EOF )
            // InternalSoftgallery.g:1255:2: iv_ruleDomainConnection= ruleDomainConnection EOF
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
    // InternalSoftgallery.g:1261:1: ruleDomainConnection returns [EObject current=null] : (otherlv_0= 'DomainRelations' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleDomainRelations ) ) otherlv_4= '}' ) ;
    public final EObject ruleDomainConnection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalSoftgallery.g:1267:2: ( (otherlv_0= 'DomainRelations' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleDomainRelations ) ) otherlv_4= '}' ) )
            // InternalSoftgallery.g:1268:2: (otherlv_0= 'DomainRelations' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleDomainRelations ) ) otherlv_4= '}' )
            {
            // InternalSoftgallery.g:1268:2: (otherlv_0= 'DomainRelations' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleDomainRelations ) ) otherlv_4= '}' )
            // InternalSoftgallery.g:1269:3: otherlv_0= 'DomainRelations' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleDomainRelations ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDomainConnectionAccess().getDomainRelationsKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getDomainConnectionAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getDomainConnectionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSoftgallery.g:1281:3: ( (lv_elements_3_0= ruleDomainRelations ) )
            // InternalSoftgallery.g:1282:4: (lv_elements_3_0= ruleDomainRelations )
            {
            // InternalSoftgallery.g:1282:4: (lv_elements_3_0= ruleDomainRelations )
            // InternalSoftgallery.g:1283:5: lv_elements_3_0= ruleDomainRelations
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
            						"co.unal.photos.Softgallery.DomainRelations");
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
    // InternalSoftgallery.g:1308:1: entryRuleDomainRelations returns [EObject current=null] : iv_ruleDomainRelations= ruleDomainRelations EOF ;
    public final EObject entryRuleDomainRelations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainRelations = null;


        try {
            // InternalSoftgallery.g:1308:56: (iv_ruleDomainRelations= ruleDomainRelations EOF )
            // InternalSoftgallery.g:1309:2: iv_ruleDomainRelations= ruleDomainRelations EOF
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
    // InternalSoftgallery.g:1315:1: ruleDomainRelations returns [EObject current=null] : ( ( (lv_elements_0_0= ruleUserDomain ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleFunctionalities ) ) otherlv_5= '}' ( (lv_elements_6_0= ruleAlbum ) ) ( (lv_name_7_0= RULE_ID ) ) otherlv_8= ':' otherlv_9= '{' ( (lv_elements_10_0= ruleAlbumManagementFunctions ) ) otherlv_11= '}' ( (lv_elements_12_0= rulePhoto ) ) ( (lv_name_13_0= RULE_ID ) ) otherlv_14= ':' otherlv_15= '{' ( (lv_elements_16_0= rulePhotoActionsFunctions ) ) otherlv_17= '}' ( (lv_elements_18_0= rulePhotoActions ) ) ( (lv_name_19_0= RULE_ID ) ) otherlv_20= ':' otherlv_21= '{' ( (lv_elements_22_0= ruleAlbumManagement ) ) otherlv_23= '}' ) ;
    public final EObject ruleDomainRelations() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_name_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token lv_name_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token lv_name_19_0=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        EObject lv_elements_0_0 = null;

        EObject lv_elements_4_0 = null;

        EObject lv_elements_6_0 = null;

        EObject lv_elements_10_0 = null;

        EObject lv_elements_12_0 = null;

        EObject lv_elements_16_0 = null;

        EObject lv_elements_18_0 = null;

        EObject lv_elements_22_0 = null;



        	enterRule();

        try {
            // InternalSoftgallery.g:1321:2: ( ( ( (lv_elements_0_0= ruleUserDomain ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleFunctionalities ) ) otherlv_5= '}' ( (lv_elements_6_0= ruleAlbum ) ) ( (lv_name_7_0= RULE_ID ) ) otherlv_8= ':' otherlv_9= '{' ( (lv_elements_10_0= ruleAlbumManagementFunctions ) ) otherlv_11= '}' ( (lv_elements_12_0= rulePhoto ) ) ( (lv_name_13_0= RULE_ID ) ) otherlv_14= ':' otherlv_15= '{' ( (lv_elements_16_0= rulePhotoActionsFunctions ) ) otherlv_17= '}' ( (lv_elements_18_0= rulePhotoActions ) ) ( (lv_name_19_0= RULE_ID ) ) otherlv_20= ':' otherlv_21= '{' ( (lv_elements_22_0= ruleAlbumManagement ) ) otherlv_23= '}' ) )
            // InternalSoftgallery.g:1322:2: ( ( (lv_elements_0_0= ruleUserDomain ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleFunctionalities ) ) otherlv_5= '}' ( (lv_elements_6_0= ruleAlbum ) ) ( (lv_name_7_0= RULE_ID ) ) otherlv_8= ':' otherlv_9= '{' ( (lv_elements_10_0= ruleAlbumManagementFunctions ) ) otherlv_11= '}' ( (lv_elements_12_0= rulePhoto ) ) ( (lv_name_13_0= RULE_ID ) ) otherlv_14= ':' otherlv_15= '{' ( (lv_elements_16_0= rulePhotoActionsFunctions ) ) otherlv_17= '}' ( (lv_elements_18_0= rulePhotoActions ) ) ( (lv_name_19_0= RULE_ID ) ) otherlv_20= ':' otherlv_21= '{' ( (lv_elements_22_0= ruleAlbumManagement ) ) otherlv_23= '}' )
            {
            // InternalSoftgallery.g:1322:2: ( ( (lv_elements_0_0= ruleUserDomain ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleFunctionalities ) ) otherlv_5= '}' ( (lv_elements_6_0= ruleAlbum ) ) ( (lv_name_7_0= RULE_ID ) ) otherlv_8= ':' otherlv_9= '{' ( (lv_elements_10_0= ruleAlbumManagementFunctions ) ) otherlv_11= '}' ( (lv_elements_12_0= rulePhoto ) ) ( (lv_name_13_0= RULE_ID ) ) otherlv_14= ':' otherlv_15= '{' ( (lv_elements_16_0= rulePhotoActionsFunctions ) ) otherlv_17= '}' ( (lv_elements_18_0= rulePhotoActions ) ) ( (lv_name_19_0= RULE_ID ) ) otherlv_20= ':' otherlv_21= '{' ( (lv_elements_22_0= ruleAlbumManagement ) ) otherlv_23= '}' )
            // InternalSoftgallery.g:1323:3: ( (lv_elements_0_0= ruleUserDomain ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleFunctionalities ) ) otherlv_5= '}' ( (lv_elements_6_0= ruleAlbum ) ) ( (lv_name_7_0= RULE_ID ) ) otherlv_8= ':' otherlv_9= '{' ( (lv_elements_10_0= ruleAlbumManagementFunctions ) ) otherlv_11= '}' ( (lv_elements_12_0= rulePhoto ) ) ( (lv_name_13_0= RULE_ID ) ) otherlv_14= ':' otherlv_15= '{' ( (lv_elements_16_0= rulePhotoActionsFunctions ) ) otherlv_17= '}' ( (lv_elements_18_0= rulePhotoActions ) ) ( (lv_name_19_0= RULE_ID ) ) otherlv_20= ':' otherlv_21= '{' ( (lv_elements_22_0= ruleAlbumManagement ) ) otherlv_23= '}'
            {
            // InternalSoftgallery.g:1323:3: ( (lv_elements_0_0= ruleUserDomain ) )
            // InternalSoftgallery.g:1324:4: (lv_elements_0_0= ruleUserDomain )
            {
            // InternalSoftgallery.g:1324:4: (lv_elements_0_0= ruleUserDomain )
            // InternalSoftgallery.g:1325:5: lv_elements_0_0= ruleUserDomain
            {

            					newCompositeNode(grammarAccess.getDomainRelationsAccess().getElementsUserDomainParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
            lv_elements_0_0=ruleUserDomain();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDomainRelationsRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_0_0,
            						"co.unal.photos.Softgallery.UserDomain");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftgallery.g:1342:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:1343:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:1343:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:1344:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDomainRelationsAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDomainRelationsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getDomainRelationsAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getDomainRelationsAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSoftgallery.g:1368:3: ( (lv_elements_4_0= ruleFunctionalities ) )
            // InternalSoftgallery.g:1369:4: (lv_elements_4_0= ruleFunctionalities )
            {
            // InternalSoftgallery.g:1369:4: (lv_elements_4_0= ruleFunctionalities )
            // InternalSoftgallery.g:1370:5: lv_elements_4_0= ruleFunctionalities
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
            						"co.unal.photos.Softgallery.Functionalities");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_34); 

            			newLeafNode(otherlv_5, grammarAccess.getDomainRelationsAccess().getRightCurlyBracketKeyword_5());
            		
            // InternalSoftgallery.g:1391:3: ( (lv_elements_6_0= ruleAlbum ) )
            // InternalSoftgallery.g:1392:4: (lv_elements_6_0= ruleAlbum )
            {
            // InternalSoftgallery.g:1392:4: (lv_elements_6_0= ruleAlbum )
            // InternalSoftgallery.g:1393:5: lv_elements_6_0= ruleAlbum
            {

            					newCompositeNode(grammarAccess.getDomainRelationsAccess().getElementsAlbumParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_9);
            lv_elements_6_0=ruleAlbum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDomainRelationsRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_6_0,
            						"co.unal.photos.Softgallery.Album");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftgallery.g:1410:3: ( (lv_name_7_0= RULE_ID ) )
            // InternalSoftgallery.g:1411:4: (lv_name_7_0= RULE_ID )
            {
            // InternalSoftgallery.g:1411:4: (lv_name_7_0= RULE_ID )
            // InternalSoftgallery.g:1412:5: lv_name_7_0= RULE_ID
            {
            lv_name_7_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_7_0, grammarAccess.getDomainRelationsAccess().getNameIDTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDomainRelationsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_7_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_8=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_8, grammarAccess.getDomainRelationsAccess().getColonKeyword_8());
            		
            otherlv_9=(Token)match(input,13,FOLLOW_26); 

            			newLeafNode(otherlv_9, grammarAccess.getDomainRelationsAccess().getLeftCurlyBracketKeyword_9());
            		
            // InternalSoftgallery.g:1436:3: ( (lv_elements_10_0= ruleAlbumManagementFunctions ) )
            // InternalSoftgallery.g:1437:4: (lv_elements_10_0= ruleAlbumManagementFunctions )
            {
            // InternalSoftgallery.g:1437:4: (lv_elements_10_0= ruleAlbumManagementFunctions )
            // InternalSoftgallery.g:1438:5: lv_elements_10_0= ruleAlbumManagementFunctions
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
            						"co.unal.photos.Softgallery.AlbumManagementFunctions");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_11, grammarAccess.getDomainRelationsAccess().getRightCurlyBracketKeyword_11());
            		
            // InternalSoftgallery.g:1459:3: ( (lv_elements_12_0= rulePhoto ) )
            // InternalSoftgallery.g:1460:4: (lv_elements_12_0= rulePhoto )
            {
            // InternalSoftgallery.g:1460:4: (lv_elements_12_0= rulePhoto )
            // InternalSoftgallery.g:1461:5: lv_elements_12_0= rulePhoto
            {

            					newCompositeNode(grammarAccess.getDomainRelationsAccess().getElementsPhotoParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_9);
            lv_elements_12_0=rulePhoto();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDomainRelationsRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_12_0,
            						"co.unal.photos.Softgallery.Photo");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftgallery.g:1478:3: ( (lv_name_13_0= RULE_ID ) )
            // InternalSoftgallery.g:1479:4: (lv_name_13_0= RULE_ID )
            {
            // InternalSoftgallery.g:1479:4: (lv_name_13_0= RULE_ID )
            // InternalSoftgallery.g:1480:5: lv_name_13_0= RULE_ID
            {
            lv_name_13_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_13_0, grammarAccess.getDomainRelationsAccess().getNameIDTerminalRuleCall_13_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDomainRelationsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_13_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_14=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_14, grammarAccess.getDomainRelationsAccess().getColonKeyword_14());
            		
            otherlv_15=(Token)match(input,13,FOLLOW_28); 

            			newLeafNode(otherlv_15, grammarAccess.getDomainRelationsAccess().getLeftCurlyBracketKeyword_15());
            		
            // InternalSoftgallery.g:1504:3: ( (lv_elements_16_0= rulePhotoActionsFunctions ) )
            // InternalSoftgallery.g:1505:4: (lv_elements_16_0= rulePhotoActionsFunctions )
            {
            // InternalSoftgallery.g:1505:4: (lv_elements_16_0= rulePhotoActionsFunctions )
            // InternalSoftgallery.g:1506:5: lv_elements_16_0= rulePhotoActionsFunctions
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
            						"co.unal.photos.Softgallery.PhotoActionsFunctions");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_17=(Token)match(input,14,FOLLOW_20); 

            			newLeafNode(otherlv_17, grammarAccess.getDomainRelationsAccess().getRightCurlyBracketKeyword_17());
            		
            // InternalSoftgallery.g:1527:3: ( (lv_elements_18_0= rulePhotoActions ) )
            // InternalSoftgallery.g:1528:4: (lv_elements_18_0= rulePhotoActions )
            {
            // InternalSoftgallery.g:1528:4: (lv_elements_18_0= rulePhotoActions )
            // InternalSoftgallery.g:1529:5: lv_elements_18_0= rulePhotoActions
            {

            					newCompositeNode(grammarAccess.getDomainRelationsAccess().getElementsPhotoActionsParserRuleCall_18_0());
            				
            pushFollow(FOLLOW_9);
            lv_elements_18_0=rulePhotoActions();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDomainRelationsRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_18_0,
            						"co.unal.photos.Softgallery.PhotoActions");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftgallery.g:1546:3: ( (lv_name_19_0= RULE_ID ) )
            // InternalSoftgallery.g:1547:4: (lv_name_19_0= RULE_ID )
            {
            // InternalSoftgallery.g:1547:4: (lv_name_19_0= RULE_ID )
            // InternalSoftgallery.g:1548:5: lv_name_19_0= RULE_ID
            {
            lv_name_19_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_19_0, grammarAccess.getDomainRelationsAccess().getNameIDTerminalRuleCall_19_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDomainRelationsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_19_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_20=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_20, grammarAccess.getDomainRelationsAccess().getColonKeyword_20());
            		
            otherlv_21=(Token)match(input,13,FOLLOW_19); 

            			newLeafNode(otherlv_21, grammarAccess.getDomainRelationsAccess().getLeftCurlyBracketKeyword_21());
            		
            // InternalSoftgallery.g:1572:3: ( (lv_elements_22_0= ruleAlbumManagement ) )
            // InternalSoftgallery.g:1573:4: (lv_elements_22_0= ruleAlbumManagement )
            {
            // InternalSoftgallery.g:1573:4: (lv_elements_22_0= ruleAlbumManagement )
            // InternalSoftgallery.g:1574:5: lv_elements_22_0= ruleAlbumManagement
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
            						"co.unal.photos.Softgallery.AlbumManagement");
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
    // InternalSoftgallery.g:1599:1: entryRuleArchitecture returns [EObject current=null] : iv_ruleArchitecture= ruleArchitecture EOF ;
    public final EObject entryRuleArchitecture() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArchitecture = null;


        try {
            // InternalSoftgallery.g:1599:53: (iv_ruleArchitecture= ruleArchitecture EOF )
            // InternalSoftgallery.g:1600:2: iv_ruleArchitecture= ruleArchitecture EOF
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
    // InternalSoftgallery.g:1606:1: ruleArchitecture returns [EObject current=null] : (otherlv_0= 'Architecture:' otherlv_1= '{' ( (lv_elements_2_0= ruleNTiers ) )+ ( (lv_elements_3_0= ruleNTiersConnections ) )+ otherlv_4= '}' ) ;
    public final EObject ruleArchitecture() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalSoftgallery.g:1612:2: ( (otherlv_0= 'Architecture:' otherlv_1= '{' ( (lv_elements_2_0= ruleNTiers ) )+ ( (lv_elements_3_0= ruleNTiersConnections ) )+ otherlv_4= '}' ) )
            // InternalSoftgallery.g:1613:2: (otherlv_0= 'Architecture:' otherlv_1= '{' ( (lv_elements_2_0= ruleNTiers ) )+ ( (lv_elements_3_0= ruleNTiersConnections ) )+ otherlv_4= '}' )
            {
            // InternalSoftgallery.g:1613:2: (otherlv_0= 'Architecture:' otherlv_1= '{' ( (lv_elements_2_0= ruleNTiers ) )+ ( (lv_elements_3_0= ruleNTiersConnections ) )+ otherlv_4= '}' )
            // InternalSoftgallery.g:1614:3: otherlv_0= 'Architecture:' otherlv_1= '{' ( (lv_elements_2_0= ruleNTiers ) )+ ( (lv_elements_3_0= ruleNTiersConnections ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getArchitectureAccess().getArchitectureKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getArchitectureAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSoftgallery.g:1622:3: ( (lv_elements_2_0= ruleNTiers ) )+
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
            	    // InternalSoftgallery.g:1623:4: (lv_elements_2_0= ruleNTiers )
            	    {
            	    // InternalSoftgallery.g:1623:4: (lv_elements_2_0= ruleNTiers )
            	    // InternalSoftgallery.g:1624:5: lv_elements_2_0= ruleNTiers
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
            	    						"co.unal.photos.Softgallery.NTiers");
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

            // InternalSoftgallery.g:1641:3: ( (lv_elements_3_0= ruleNTiersConnections ) )+
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
            	    // InternalSoftgallery.g:1642:4: (lv_elements_3_0= ruleNTiersConnections )
            	    {
            	    // InternalSoftgallery.g:1642:4: (lv_elements_3_0= ruleNTiersConnections )
            	    // InternalSoftgallery.g:1643:5: lv_elements_3_0= ruleNTiersConnections
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
            	    						"co.unal.photos.Softgallery.NTiersConnections");
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
    // InternalSoftgallery.g:1668:1: entryRuleNTiers returns [EObject current=null] : iv_ruleNTiers= ruleNTiers EOF ;
    public final EObject entryRuleNTiers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNTiers = null;


        try {
            // InternalSoftgallery.g:1668:47: (iv_ruleNTiers= ruleNTiers EOF )
            // InternalSoftgallery.g:1669:2: iv_ruleNTiers= ruleNTiers EOF
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
    // InternalSoftgallery.g:1675:1: ruleNTiers returns [EObject current=null] : (otherlv_0= 'Layers' ( (lv_elements_1_0= ruleLayer ) )+ otherlv_2= 'LayersRelations' ( (lv_elements_3_0= ruleLayerRelations ) )+ otherlv_4= 'ArchitectureComponents' ( (lv_elements_5_0= ruleArchitectureComponents ) )+ ) ;
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
            // InternalSoftgallery.g:1681:2: ( (otherlv_0= 'Layers' ( (lv_elements_1_0= ruleLayer ) )+ otherlv_2= 'LayersRelations' ( (lv_elements_3_0= ruleLayerRelations ) )+ otherlv_4= 'ArchitectureComponents' ( (lv_elements_5_0= ruleArchitectureComponents ) )+ ) )
            // InternalSoftgallery.g:1682:2: (otherlv_0= 'Layers' ( (lv_elements_1_0= ruleLayer ) )+ otherlv_2= 'LayersRelations' ( (lv_elements_3_0= ruleLayerRelations ) )+ otherlv_4= 'ArchitectureComponents' ( (lv_elements_5_0= ruleArchitectureComponents ) )+ )
            {
            // InternalSoftgallery.g:1682:2: (otherlv_0= 'Layers' ( (lv_elements_1_0= ruleLayer ) )+ otherlv_2= 'LayersRelations' ( (lv_elements_3_0= ruleLayerRelations ) )+ otherlv_4= 'ArchitectureComponents' ( (lv_elements_5_0= ruleArchitectureComponents ) )+ )
            // InternalSoftgallery.g:1683:3: otherlv_0= 'Layers' ( (lv_elements_1_0= ruleLayer ) )+ otherlv_2= 'LayersRelations' ( (lv_elements_3_0= ruleLayerRelations ) )+ otherlv_4= 'ArchitectureComponents' ( (lv_elements_5_0= ruleArchitectureComponents ) )+
            {
            otherlv_0=(Token)match(input,39,FOLLOW_38); 

            			newLeafNode(otherlv_0, grammarAccess.getNTiersAccess().getLayersKeyword_0());
            		
            // InternalSoftgallery.g:1687:3: ( (lv_elements_1_0= ruleLayer ) )+
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
            	    // InternalSoftgallery.g:1688:4: (lv_elements_1_0= ruleLayer )
            	    {
            	    // InternalSoftgallery.g:1688:4: (lv_elements_1_0= ruleLayer )
            	    // InternalSoftgallery.g:1689:5: lv_elements_1_0= ruleLayer
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
            	    						"co.unal.photos.Softgallery.Layer");
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
            		
            // InternalSoftgallery.g:1710:3: ( (lv_elements_3_0= ruleLayerRelations ) )+
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
            	    // InternalSoftgallery.g:1711:4: (lv_elements_3_0= ruleLayerRelations )
            	    {
            	    // InternalSoftgallery.g:1711:4: (lv_elements_3_0= ruleLayerRelations )
            	    // InternalSoftgallery.g:1712:5: lv_elements_3_0= ruleLayerRelations
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
            	    						"co.unal.photos.Softgallery.LayerRelations");
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
            		
            // InternalSoftgallery.g:1733:3: ( (lv_elements_5_0= ruleArchitectureComponents ) )+
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
            	    // InternalSoftgallery.g:1734:4: (lv_elements_5_0= ruleArchitectureComponents )
            	    {
            	    // InternalSoftgallery.g:1734:4: (lv_elements_5_0= ruleArchitectureComponents )
            	    // InternalSoftgallery.g:1735:5: lv_elements_5_0= ruleArchitectureComponents
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
            	    						"co.unal.photos.Softgallery.ArchitectureComponents");
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
    // InternalSoftgallery.g:1756:1: entryRuleLayer returns [EObject current=null] : iv_ruleLayer= ruleLayer EOF ;
    public final EObject entryRuleLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayer = null;


        try {
            // InternalSoftgallery.g:1756:46: (iv_ruleLayer= ruleLayer EOF )
            // InternalSoftgallery.g:1757:2: iv_ruleLayer= ruleLayer EOF
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
    // InternalSoftgallery.g:1763:1: ruleLayer returns [EObject current=null] : ( ( (lv_elements_0_0= rulePresentationLayer ) ) ( (lv_elements_1_0= ruleBusinessLogicLayer ) ) ( (lv_elements_2_0= ruleDataPersistenceLayer ) ) ) ;
    public final EObject ruleLayer() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;

        EObject lv_elements_1_0 = null;

        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalSoftgallery.g:1769:2: ( ( ( (lv_elements_0_0= rulePresentationLayer ) ) ( (lv_elements_1_0= ruleBusinessLogicLayer ) ) ( (lv_elements_2_0= ruleDataPersistenceLayer ) ) ) )
            // InternalSoftgallery.g:1770:2: ( ( (lv_elements_0_0= rulePresentationLayer ) ) ( (lv_elements_1_0= ruleBusinessLogicLayer ) ) ( (lv_elements_2_0= ruleDataPersistenceLayer ) ) )
            {
            // InternalSoftgallery.g:1770:2: ( ( (lv_elements_0_0= rulePresentationLayer ) ) ( (lv_elements_1_0= ruleBusinessLogicLayer ) ) ( (lv_elements_2_0= ruleDataPersistenceLayer ) ) )
            // InternalSoftgallery.g:1771:3: ( (lv_elements_0_0= rulePresentationLayer ) ) ( (lv_elements_1_0= ruleBusinessLogicLayer ) ) ( (lv_elements_2_0= ruleDataPersistenceLayer ) )
            {
            // InternalSoftgallery.g:1771:3: ( (lv_elements_0_0= rulePresentationLayer ) )
            // InternalSoftgallery.g:1772:4: (lv_elements_0_0= rulePresentationLayer )
            {
            // InternalSoftgallery.g:1772:4: (lv_elements_0_0= rulePresentationLayer )
            // InternalSoftgallery.g:1773:5: lv_elements_0_0= rulePresentationLayer
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
            						"co.unal.photos.Softgallery.PresentationLayer");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftgallery.g:1790:3: ( (lv_elements_1_0= ruleBusinessLogicLayer ) )
            // InternalSoftgallery.g:1791:4: (lv_elements_1_0= ruleBusinessLogicLayer )
            {
            // InternalSoftgallery.g:1791:4: (lv_elements_1_0= ruleBusinessLogicLayer )
            // InternalSoftgallery.g:1792:5: lv_elements_1_0= ruleBusinessLogicLayer
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
            						"co.unal.photos.Softgallery.BusinessLogicLayer");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftgallery.g:1809:3: ( (lv_elements_2_0= ruleDataPersistenceLayer ) )
            // InternalSoftgallery.g:1810:4: (lv_elements_2_0= ruleDataPersistenceLayer )
            {
            // InternalSoftgallery.g:1810:4: (lv_elements_2_0= ruleDataPersistenceLayer )
            // InternalSoftgallery.g:1811:5: lv_elements_2_0= ruleDataPersistenceLayer
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
            						"co.unal.photos.Softgallery.DataPersistenceLayer");
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
    // InternalSoftgallery.g:1832:1: entryRulePresentationLayer returns [EObject current=null] : iv_rulePresentationLayer= rulePresentationLayer EOF ;
    public final EObject entryRulePresentationLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePresentationLayer = null;


        try {
            // InternalSoftgallery.g:1832:58: (iv_rulePresentationLayer= rulePresentationLayer EOF )
            // InternalSoftgallery.g:1833:2: iv_rulePresentationLayer= rulePresentationLayer EOF
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
    // InternalSoftgallery.g:1839:1: rulePresentationLayer returns [EObject current=null] : (otherlv_0= 'PresentationLayer' ( (lv_elements_1_0= rulePresentationContent ) ) ( (lv_elements_2_0= ruleSegmentStructure ) ) ) ;
    public final EObject rulePresentationLayer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_elements_1_0 = null;

        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalSoftgallery.g:1845:2: ( (otherlv_0= 'PresentationLayer' ( (lv_elements_1_0= rulePresentationContent ) ) ( (lv_elements_2_0= ruleSegmentStructure ) ) ) )
            // InternalSoftgallery.g:1846:2: (otherlv_0= 'PresentationLayer' ( (lv_elements_1_0= rulePresentationContent ) ) ( (lv_elements_2_0= ruleSegmentStructure ) ) )
            {
            // InternalSoftgallery.g:1846:2: (otherlv_0= 'PresentationLayer' ( (lv_elements_1_0= rulePresentationContent ) ) ( (lv_elements_2_0= ruleSegmentStructure ) ) )
            // InternalSoftgallery.g:1847:3: otherlv_0= 'PresentationLayer' ( (lv_elements_1_0= rulePresentationContent ) ) ( (lv_elements_2_0= ruleSegmentStructure ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_46); 

            			newLeafNode(otherlv_0, grammarAccess.getPresentationLayerAccess().getPresentationLayerKeyword_0());
            		
            // InternalSoftgallery.g:1851:3: ( (lv_elements_1_0= rulePresentationContent ) )
            // InternalSoftgallery.g:1852:4: (lv_elements_1_0= rulePresentationContent )
            {
            // InternalSoftgallery.g:1852:4: (lv_elements_1_0= rulePresentationContent )
            // InternalSoftgallery.g:1853:5: lv_elements_1_0= rulePresentationContent
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
            						"co.unal.photos.Softgallery.PresentationContent");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftgallery.g:1870:3: ( (lv_elements_2_0= ruleSegmentStructure ) )
            // InternalSoftgallery.g:1871:4: (lv_elements_2_0= ruleSegmentStructure )
            {
            // InternalSoftgallery.g:1871:4: (lv_elements_2_0= ruleSegmentStructure )
            // InternalSoftgallery.g:1872:5: lv_elements_2_0= ruleSegmentStructure
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
            						"co.unal.photos.Softgallery.SegmentStructure");
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
    // InternalSoftgallery.g:1893:1: entryRulePresentationContent returns [EObject current=null] : iv_rulePresentationContent= rulePresentationContent EOF ;
    public final EObject entryRulePresentationContent() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePresentationContent = null;


        try {
            // InternalSoftgallery.g:1893:60: (iv_rulePresentationContent= rulePresentationContent EOF )
            // InternalSoftgallery.g:1894:2: iv_rulePresentationContent= rulePresentationContent EOF
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
    // InternalSoftgallery.g:1900:1: rulePresentationContent returns [EObject current=null] : (otherlv_0= 'PresentationSegments' ( (lv_elements_1_0= rulePresentationSegments ) ) ) ;
    public final EObject rulePresentationContent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_elements_1_0 = null;



        	enterRule();

        try {
            // InternalSoftgallery.g:1906:2: ( (otherlv_0= 'PresentationSegments' ( (lv_elements_1_0= rulePresentationSegments ) ) ) )
            // InternalSoftgallery.g:1907:2: (otherlv_0= 'PresentationSegments' ( (lv_elements_1_0= rulePresentationSegments ) ) )
            {
            // InternalSoftgallery.g:1907:2: (otherlv_0= 'PresentationSegments' ( (lv_elements_1_0= rulePresentationSegments ) ) )
            // InternalSoftgallery.g:1908:3: otherlv_0= 'PresentationSegments' ( (lv_elements_1_0= rulePresentationSegments ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_48); 

            			newLeafNode(otherlv_0, grammarAccess.getPresentationContentAccess().getPresentationSegmentsKeyword_0());
            		
            // InternalSoftgallery.g:1912:3: ( (lv_elements_1_0= rulePresentationSegments ) )
            // InternalSoftgallery.g:1913:4: (lv_elements_1_0= rulePresentationSegments )
            {
            // InternalSoftgallery.g:1913:4: (lv_elements_1_0= rulePresentationSegments )
            // InternalSoftgallery.g:1914:5: lv_elements_1_0= rulePresentationSegments
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
            						"co.unal.photos.Softgallery.PresentationSegments");
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
    // InternalSoftgallery.g:1935:1: entryRulePresentationSegments returns [EObject current=null] : iv_rulePresentationSegments= rulePresentationSegments EOF ;
    public final EObject entryRulePresentationSegments() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePresentationSegments = null;


        try {
            // InternalSoftgallery.g:1935:61: (iv_rulePresentationSegments= rulePresentationSegments EOF )
            // InternalSoftgallery.g:1936:2: iv_rulePresentationSegments= rulePresentationSegments EOF
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
    // InternalSoftgallery.g:1942:1: rulePresentationSegments returns [EObject current=null] : (otherlv_0= 'PresentationView' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'PresentationComponent' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'PresentationAction' ( (lv_name_5_0= RULE_ID ) ) ) ;
    public final EObject rulePresentationSegments() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;


        	enterRule();

        try {
            // InternalSoftgallery.g:1948:2: ( (otherlv_0= 'PresentationView' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'PresentationComponent' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'PresentationAction' ( (lv_name_5_0= RULE_ID ) ) ) )
            // InternalSoftgallery.g:1949:2: (otherlv_0= 'PresentationView' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'PresentationComponent' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'PresentationAction' ( (lv_name_5_0= RULE_ID ) ) )
            {
            // InternalSoftgallery.g:1949:2: (otherlv_0= 'PresentationView' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'PresentationComponent' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'PresentationAction' ( (lv_name_5_0= RULE_ID ) ) )
            // InternalSoftgallery.g:1950:3: otherlv_0= 'PresentationView' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'PresentationComponent' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'PresentationAction' ( (lv_name_5_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getPresentationSegmentsAccess().getPresentationViewKeyword_0());
            		
            // InternalSoftgallery.g:1954:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:1955:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:1955:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:1956:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_49); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPresentationSegmentsAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPresentationSegmentsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,45,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getPresentationSegmentsAccess().getPresentationComponentKeyword_2());
            		
            // InternalSoftgallery.g:1976:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalSoftgallery.g:1977:4: (lv_name_3_0= RULE_ID )
            {
            // InternalSoftgallery.g:1977:4: (lv_name_3_0= RULE_ID )
            // InternalSoftgallery.g:1978:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_50); 

            					newLeafNode(lv_name_3_0, grammarAccess.getPresentationSegmentsAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPresentationSegmentsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,46,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getPresentationSegmentsAccess().getPresentationActionKeyword_4());
            		
            // InternalSoftgallery.g:1998:3: ( (lv_name_5_0= RULE_ID ) )
            // InternalSoftgallery.g:1999:4: (lv_name_5_0= RULE_ID )
            {
            // InternalSoftgallery.g:1999:4: (lv_name_5_0= RULE_ID )
            // InternalSoftgallery.g:2000:5: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_5_0, grammarAccess.getPresentationSegmentsAccess().getNameIDTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPresentationSegmentsRule());
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
    // InternalSoftgallery.g:2020:1: entryRuleBusinessLogicLayer returns [EObject current=null] : iv_ruleBusinessLogicLayer= ruleBusinessLogicLayer EOF ;
    public final EObject entryRuleBusinessLogicLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBusinessLogicLayer = null;


        try {
            // InternalSoftgallery.g:2020:59: (iv_ruleBusinessLogicLayer= ruleBusinessLogicLayer EOF )
            // InternalSoftgallery.g:2021:2: iv_ruleBusinessLogicLayer= ruleBusinessLogicLayer EOF
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
    // InternalSoftgallery.g:2027:1: ruleBusinessLogicLayer returns [EObject current=null] : (otherlv_0= 'BusinessLogicLayer' ( (lv_elements_1_0= ruleBusinessLogicContent ) ) ( (lv_elements_2_0= ruleSegmentStructure ) ) ) ;
    public final EObject ruleBusinessLogicLayer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_elements_1_0 = null;

        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalSoftgallery.g:2033:2: ( (otherlv_0= 'BusinessLogicLayer' ( (lv_elements_1_0= ruleBusinessLogicContent ) ) ( (lv_elements_2_0= ruleSegmentStructure ) ) ) )
            // InternalSoftgallery.g:2034:2: (otherlv_0= 'BusinessLogicLayer' ( (lv_elements_1_0= ruleBusinessLogicContent ) ) ( (lv_elements_2_0= ruleSegmentStructure ) ) )
            {
            // InternalSoftgallery.g:2034:2: (otherlv_0= 'BusinessLogicLayer' ( (lv_elements_1_0= ruleBusinessLogicContent ) ) ( (lv_elements_2_0= ruleSegmentStructure ) ) )
            // InternalSoftgallery.g:2035:3: otherlv_0= 'BusinessLogicLayer' ( (lv_elements_1_0= ruleBusinessLogicContent ) ) ( (lv_elements_2_0= ruleSegmentStructure ) )
            {
            otherlv_0=(Token)match(input,47,FOLLOW_51); 

            			newLeafNode(otherlv_0, grammarAccess.getBusinessLogicLayerAccess().getBusinessLogicLayerKeyword_0());
            		
            // InternalSoftgallery.g:2039:3: ( (lv_elements_1_0= ruleBusinessLogicContent ) )
            // InternalSoftgallery.g:2040:4: (lv_elements_1_0= ruleBusinessLogicContent )
            {
            // InternalSoftgallery.g:2040:4: (lv_elements_1_0= ruleBusinessLogicContent )
            // InternalSoftgallery.g:2041:5: lv_elements_1_0= ruleBusinessLogicContent
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
            						"co.unal.photos.Softgallery.BusinessLogicContent");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftgallery.g:2058:3: ( (lv_elements_2_0= ruleSegmentStructure ) )
            // InternalSoftgallery.g:2059:4: (lv_elements_2_0= ruleSegmentStructure )
            {
            // InternalSoftgallery.g:2059:4: (lv_elements_2_0= ruleSegmentStructure )
            // InternalSoftgallery.g:2060:5: lv_elements_2_0= ruleSegmentStructure
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
            						"co.unal.photos.Softgallery.SegmentStructure");
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
    // InternalSoftgallery.g:2081:1: entryRuleBusinessLogicContent returns [EObject current=null] : iv_ruleBusinessLogicContent= ruleBusinessLogicContent EOF ;
    public final EObject entryRuleBusinessLogicContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBusinessLogicContent = null;


        try {
            // InternalSoftgallery.g:2081:61: (iv_ruleBusinessLogicContent= ruleBusinessLogicContent EOF )
            // InternalSoftgallery.g:2082:2: iv_ruleBusinessLogicContent= ruleBusinessLogicContent EOF
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
    // InternalSoftgallery.g:2088:1: ruleBusinessLogicContent returns [EObject current=null] : (otherlv_0= 'BusinessLogicSegments' ( (lv_elements_1_0= ruleBusinessLogicSegments ) ) ) ;
    public final EObject ruleBusinessLogicContent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_elements_1_0 = null;



        	enterRule();

        try {
            // InternalSoftgallery.g:2094:2: ( (otherlv_0= 'BusinessLogicSegments' ( (lv_elements_1_0= ruleBusinessLogicSegments ) ) ) )
            // InternalSoftgallery.g:2095:2: (otherlv_0= 'BusinessLogicSegments' ( (lv_elements_1_0= ruleBusinessLogicSegments ) ) )
            {
            // InternalSoftgallery.g:2095:2: (otherlv_0= 'BusinessLogicSegments' ( (lv_elements_1_0= ruleBusinessLogicSegments ) ) )
            // InternalSoftgallery.g:2096:3: otherlv_0= 'BusinessLogicSegments' ( (lv_elements_1_0= ruleBusinessLogicSegments ) )
            {
            otherlv_0=(Token)match(input,48,FOLLOW_52); 

            			newLeafNode(otherlv_0, grammarAccess.getBusinessLogicContentAccess().getBusinessLogicSegmentsKeyword_0());
            		
            // InternalSoftgallery.g:2100:3: ( (lv_elements_1_0= ruleBusinessLogicSegments ) )
            // InternalSoftgallery.g:2101:4: (lv_elements_1_0= ruleBusinessLogicSegments )
            {
            // InternalSoftgallery.g:2101:4: (lv_elements_1_0= ruleBusinessLogicSegments )
            // InternalSoftgallery.g:2102:5: lv_elements_1_0= ruleBusinessLogicSegments
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
            						"co.unal.photos.Softgallery.BusinessLogicSegments");
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
    // InternalSoftgallery.g:2123:1: entryRuleBusinessLogicSegments returns [EObject current=null] : iv_ruleBusinessLogicSegments= ruleBusinessLogicSegments EOF ;
    public final EObject entryRuleBusinessLogicSegments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBusinessLogicSegments = null;


        try {
            // InternalSoftgallery.g:2123:62: (iv_ruleBusinessLogicSegments= ruleBusinessLogicSegments EOF )
            // InternalSoftgallery.g:2124:2: iv_ruleBusinessLogicSegments= ruleBusinessLogicSegments EOF
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
    // InternalSoftgallery.g:2130:1: ruleBusinessLogicSegments returns [EObject current=null] : (otherlv_0= 'ControllerSegment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ModelSegment' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'RepositorySegment' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= 'SecuritySegment' ( (lv_name_7_0= RULE_ID ) ) ) ;
    public final EObject ruleBusinessLogicSegments() throws RecognitionException {
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
            // InternalSoftgallery.g:2136:2: ( (otherlv_0= 'ControllerSegment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ModelSegment' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'RepositorySegment' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= 'SecuritySegment' ( (lv_name_7_0= RULE_ID ) ) ) )
            // InternalSoftgallery.g:2137:2: (otherlv_0= 'ControllerSegment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ModelSegment' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'RepositorySegment' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= 'SecuritySegment' ( (lv_name_7_0= RULE_ID ) ) )
            {
            // InternalSoftgallery.g:2137:2: (otherlv_0= 'ControllerSegment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ModelSegment' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'RepositorySegment' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= 'SecuritySegment' ( (lv_name_7_0= RULE_ID ) ) )
            // InternalSoftgallery.g:2138:3: otherlv_0= 'ControllerSegment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ModelSegment' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'RepositorySegment' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= 'SecuritySegment' ( (lv_name_7_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,49,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getBusinessLogicSegmentsAccess().getControllerSegmentKeyword_0());
            		
            // InternalSoftgallery.g:2142:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:2143:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:2143:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:2144:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_53); 

            					newLeafNode(lv_name_1_0, grammarAccess.getBusinessLogicSegmentsAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBusinessLogicSegmentsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,50,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getBusinessLogicSegmentsAccess().getModelSegmentKeyword_2());
            		
            // InternalSoftgallery.g:2164:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalSoftgallery.g:2165:4: (lv_name_3_0= RULE_ID )
            {
            // InternalSoftgallery.g:2165:4: (lv_name_3_0= RULE_ID )
            // InternalSoftgallery.g:2166:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_54); 

            					newLeafNode(lv_name_3_0, grammarAccess.getBusinessLogicSegmentsAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBusinessLogicSegmentsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,51,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getBusinessLogicSegmentsAccess().getRepositorySegmentKeyword_4());
            		
            // InternalSoftgallery.g:2186:3: ( (lv_name_5_0= RULE_ID ) )
            // InternalSoftgallery.g:2187:4: (lv_name_5_0= RULE_ID )
            {
            // InternalSoftgallery.g:2187:4: (lv_name_5_0= RULE_ID )
            // InternalSoftgallery.g:2188:5: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_55); 

            					newLeafNode(lv_name_5_0, grammarAccess.getBusinessLogicSegmentsAccess().getNameIDTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBusinessLogicSegmentsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_5_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_6=(Token)match(input,52,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getBusinessLogicSegmentsAccess().getSecuritySegmentKeyword_6());
            		
            // InternalSoftgallery.g:2208:3: ( (lv_name_7_0= RULE_ID ) )
            // InternalSoftgallery.g:2209:4: (lv_name_7_0= RULE_ID )
            {
            // InternalSoftgallery.g:2209:4: (lv_name_7_0= RULE_ID )
            // InternalSoftgallery.g:2210:5: lv_name_7_0= RULE_ID
            {
            lv_name_7_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_7_0, grammarAccess.getBusinessLogicSegmentsAccess().getNameIDTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBusinessLogicSegmentsRule());
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
    // InternalSoftgallery.g:2230:1: entryRuleDataPersistenceLayer returns [EObject current=null] : iv_ruleDataPersistenceLayer= ruleDataPersistenceLayer EOF ;
    public final EObject entryRuleDataPersistenceLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataPersistenceLayer = null;


        try {
            // InternalSoftgallery.g:2230:61: (iv_ruleDataPersistenceLayer= ruleDataPersistenceLayer EOF )
            // InternalSoftgallery.g:2231:2: iv_ruleDataPersistenceLayer= ruleDataPersistenceLayer EOF
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
    // InternalSoftgallery.g:2237:1: ruleDataPersistenceLayer returns [EObject current=null] : (otherlv_0= 'DataPersistenceLayer' ( (lv_elements_1_0= ruleDataPersistenceContent ) ) ) ;
    public final EObject ruleDataPersistenceLayer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_elements_1_0 = null;



        	enterRule();

        try {
            // InternalSoftgallery.g:2243:2: ( (otherlv_0= 'DataPersistenceLayer' ( (lv_elements_1_0= ruleDataPersistenceContent ) ) ) )
            // InternalSoftgallery.g:2244:2: (otherlv_0= 'DataPersistenceLayer' ( (lv_elements_1_0= ruleDataPersistenceContent ) ) )
            {
            // InternalSoftgallery.g:2244:2: (otherlv_0= 'DataPersistenceLayer' ( (lv_elements_1_0= ruleDataPersistenceContent ) ) )
            // InternalSoftgallery.g:2245:3: otherlv_0= 'DataPersistenceLayer' ( (lv_elements_1_0= ruleDataPersistenceContent ) )
            {
            otherlv_0=(Token)match(input,53,FOLLOW_56); 

            			newLeafNode(otherlv_0, grammarAccess.getDataPersistenceLayerAccess().getDataPersistenceLayerKeyword_0());
            		
            // InternalSoftgallery.g:2249:3: ( (lv_elements_1_0= ruleDataPersistenceContent ) )
            // InternalSoftgallery.g:2250:4: (lv_elements_1_0= ruleDataPersistenceContent )
            {
            // InternalSoftgallery.g:2250:4: (lv_elements_1_0= ruleDataPersistenceContent )
            // InternalSoftgallery.g:2251:5: lv_elements_1_0= ruleDataPersistenceContent
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
            						"co.unal.photos.Softgallery.DataPersistenceContent");
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
    // InternalSoftgallery.g:2272:1: entryRuleDataPersistenceContent returns [EObject current=null] : iv_ruleDataPersistenceContent= ruleDataPersistenceContent EOF ;
    public final EObject entryRuleDataPersistenceContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataPersistenceContent = null;


        try {
            // InternalSoftgallery.g:2272:63: (iv_ruleDataPersistenceContent= ruleDataPersistenceContent EOF )
            // InternalSoftgallery.g:2273:2: iv_ruleDataPersistenceContent= ruleDataPersistenceContent EOF
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
    // InternalSoftgallery.g:2279:1: ruleDataPersistenceContent returns [EObject current=null] : (otherlv_0= 'DataPersistenceSegments' ( (lv_elements_1_0= ruleDataPersistenceSegments ) ) ) ;
    public final EObject ruleDataPersistenceContent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_elements_1_0 = null;



        	enterRule();

        try {
            // InternalSoftgallery.g:2285:2: ( (otherlv_0= 'DataPersistenceSegments' ( (lv_elements_1_0= ruleDataPersistenceSegments ) ) ) )
            // InternalSoftgallery.g:2286:2: (otherlv_0= 'DataPersistenceSegments' ( (lv_elements_1_0= ruleDataPersistenceSegments ) ) )
            {
            // InternalSoftgallery.g:2286:2: (otherlv_0= 'DataPersistenceSegments' ( (lv_elements_1_0= ruleDataPersistenceSegments ) ) )
            // InternalSoftgallery.g:2287:3: otherlv_0= 'DataPersistenceSegments' ( (lv_elements_1_0= ruleDataPersistenceSegments ) )
            {
            otherlv_0=(Token)match(input,54,FOLLOW_57); 

            			newLeafNode(otherlv_0, grammarAccess.getDataPersistenceContentAccess().getDataPersistenceSegmentsKeyword_0());
            		
            // InternalSoftgallery.g:2291:3: ( (lv_elements_1_0= ruleDataPersistenceSegments ) )
            // InternalSoftgallery.g:2292:4: (lv_elements_1_0= ruleDataPersistenceSegments )
            {
            // InternalSoftgallery.g:2292:4: (lv_elements_1_0= ruleDataPersistenceSegments )
            // InternalSoftgallery.g:2293:5: lv_elements_1_0= ruleDataPersistenceSegments
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
            						"co.unal.photos.Softgallery.DataPersistenceSegments");
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
    // InternalSoftgallery.g:2314:1: entryRuleDataPersistenceSegments returns [EObject current=null] : iv_ruleDataPersistenceSegments= ruleDataPersistenceSegments EOF ;
    public final EObject entryRuleDataPersistenceSegments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataPersistenceSegments = null;


        try {
            // InternalSoftgallery.g:2314:64: (iv_ruleDataPersistenceSegments= ruleDataPersistenceSegments EOF )
            // InternalSoftgallery.g:2315:2: iv_ruleDataPersistenceSegments= ruleDataPersistenceSegments EOF
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
    // InternalSoftgallery.g:2321:1: ruleDataPersistenceSegments returns [EObject current=null] : (otherlv_0= 'PostgreSLQSegment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'AmazonS3Storage' ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleDataPersistenceSegments() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;


        	enterRule();

        try {
            // InternalSoftgallery.g:2327:2: ( (otherlv_0= 'PostgreSLQSegment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'AmazonS3Storage' ( (lv_name_3_0= RULE_ID ) ) ) )
            // InternalSoftgallery.g:2328:2: (otherlv_0= 'PostgreSLQSegment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'AmazonS3Storage' ( (lv_name_3_0= RULE_ID ) ) )
            {
            // InternalSoftgallery.g:2328:2: (otherlv_0= 'PostgreSLQSegment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'AmazonS3Storage' ( (lv_name_3_0= RULE_ID ) ) )
            // InternalSoftgallery.g:2329:3: otherlv_0= 'PostgreSLQSegment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'AmazonS3Storage' ( (lv_name_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,55,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getDataPersistenceSegmentsAccess().getPostgreSLQSegmentKeyword_0());
            		
            // InternalSoftgallery.g:2333:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:2334:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:2334:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:2335:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_58); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDataPersistenceSegmentsAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataPersistenceSegmentsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,56,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getDataPersistenceSegmentsAccess().getAmazonS3StorageKeyword_2());
            		
            // InternalSoftgallery.g:2355:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalSoftgallery.g:2356:4: (lv_name_3_0= RULE_ID )
            {
            // InternalSoftgallery.g:2356:4: (lv_name_3_0= RULE_ID )
            // InternalSoftgallery.g:2357:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_3_0, grammarAccess.getDataPersistenceSegmentsAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataPersistenceSegmentsRule());
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
    // InternalSoftgallery.g:2377:1: entryRuleSegmentStructure returns [EObject current=null] : iv_ruleSegmentStructure= ruleSegmentStructure EOF ;
    public final EObject entryRuleSegmentStructure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSegmentStructure = null;


        try {
            // InternalSoftgallery.g:2377:57: (iv_ruleSegmentStructure= ruleSegmentStructure EOF )
            // InternalSoftgallery.g:2378:2: iv_ruleSegmentStructure= ruleSegmentStructure EOF
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
    // InternalSoftgallery.g:2384:1: ruleSegmentStructure returns [EObject current=null] : (otherlv_0= 'SegmentStructure' ( (lv_elements_1_0= ruleSegmentStructureContent ) ) ) ;
    public final EObject ruleSegmentStructure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_elements_1_0 = null;



        	enterRule();

        try {
            // InternalSoftgallery.g:2390:2: ( (otherlv_0= 'SegmentStructure' ( (lv_elements_1_0= ruleSegmentStructureContent ) ) ) )
            // InternalSoftgallery.g:2391:2: (otherlv_0= 'SegmentStructure' ( (lv_elements_1_0= ruleSegmentStructureContent ) ) )
            {
            // InternalSoftgallery.g:2391:2: (otherlv_0= 'SegmentStructure' ( (lv_elements_1_0= ruleSegmentStructureContent ) ) )
            // InternalSoftgallery.g:2392:3: otherlv_0= 'SegmentStructure' ( (lv_elements_1_0= ruleSegmentStructureContent ) )
            {
            otherlv_0=(Token)match(input,57,FOLLOW_59); 

            			newLeafNode(otherlv_0, grammarAccess.getSegmentStructureAccess().getSegmentStructureKeyword_0());
            		
            // InternalSoftgallery.g:2396:3: ( (lv_elements_1_0= ruleSegmentStructureContent ) )
            // InternalSoftgallery.g:2397:4: (lv_elements_1_0= ruleSegmentStructureContent )
            {
            // InternalSoftgallery.g:2397:4: (lv_elements_1_0= ruleSegmentStructureContent )
            // InternalSoftgallery.g:2398:5: lv_elements_1_0= ruleSegmentStructureContent
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
            						"co.unal.photos.Softgallery.SegmentStructureContent");
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
    // InternalSoftgallery.g:2419:1: entryRuleSegmentStructureContent returns [EObject current=null] : iv_ruleSegmentStructureContent= ruleSegmentStructureContent EOF ;
    public final EObject entryRuleSegmentStructureContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSegmentStructureContent = null;


        try {
            // InternalSoftgallery.g:2419:64: (iv_ruleSegmentStructureContent= ruleSegmentStructureContent EOF )
            // InternalSoftgallery.g:2420:2: iv_ruleSegmentStructureContent= ruleSegmentStructureContent EOF
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
    // InternalSoftgallery.g:2426:1: ruleSegmentStructureContent returns [EObject current=null] : (otherlv_0= 'Directories' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleDirectoryContent ) )+ ) ;
    public final EObject ruleSegmentStructureContent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalSoftgallery.g:2432:2: ( (otherlv_0= 'Directories' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleDirectoryContent ) )+ ) )
            // InternalSoftgallery.g:2433:2: (otherlv_0= 'Directories' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleDirectoryContent ) )+ )
            {
            // InternalSoftgallery.g:2433:2: (otherlv_0= 'Directories' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleDirectoryContent ) )+ )
            // InternalSoftgallery.g:2434:3: otherlv_0= 'Directories' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleDirectoryContent ) )+
            {
            otherlv_0=(Token)match(input,58,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getSegmentStructureContentAccess().getDirectoriesKeyword_0());
            		
            // InternalSoftgallery.g:2438:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:2439:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:2439:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:2440:5: lv_name_1_0= RULE_ID
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

            // InternalSoftgallery.g:2456:3: ( (lv_elements_2_0= ruleDirectoryContent ) )+
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
            	    // InternalSoftgallery.g:2457:4: (lv_elements_2_0= ruleDirectoryContent )
            	    {
            	    // InternalSoftgallery.g:2457:4: (lv_elements_2_0= ruleDirectoryContent )
            	    // InternalSoftgallery.g:2458:5: lv_elements_2_0= ruleDirectoryContent
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
            	    						"co.unal.photos.Softgallery.DirectoryContent");
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
    // InternalSoftgallery.g:2479:1: entryRuleDirectoryContent returns [EObject current=null] : iv_ruleDirectoryContent= ruleDirectoryContent EOF ;
    public final EObject entryRuleDirectoryContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectoryContent = null;


        try {
            // InternalSoftgallery.g:2479:57: (iv_ruleDirectoryContent= ruleDirectoryContent EOF )
            // InternalSoftgallery.g:2480:2: iv_ruleDirectoryContent= ruleDirectoryContent EOF
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
    // InternalSoftgallery.g:2486:1: ruleDirectoryContent returns [EObject current=null] : ( (otherlv_0= 'Directory' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleDirectories ) ) )+ | ( (lv_elements_3_0= ruleSingleFile ) )+ ) ;
    public final EObject ruleDirectoryContent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalSoftgallery.g:2492:2: ( ( (otherlv_0= 'Directory' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleDirectories ) ) )+ | ( (lv_elements_3_0= ruleSingleFile ) )+ ) )
            // InternalSoftgallery.g:2493:2: ( (otherlv_0= 'Directory' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleDirectories ) ) )+ | ( (lv_elements_3_0= ruleSingleFile ) )+ )
            {
            // InternalSoftgallery.g:2493:2: ( (otherlv_0= 'Directory' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleDirectories ) ) )+ | ( (lv_elements_3_0= ruleSingleFile ) )+ )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==59) ) {
                alt12=1;
            }
            else if ( (LA12_0==60) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalSoftgallery.g:2494:3: (otherlv_0= 'Directory' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleDirectories ) ) )+
                    {
                    // InternalSoftgallery.g:2494:3: (otherlv_0= 'Directory' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleDirectories ) ) )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==59) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalSoftgallery.g:2495:4: otherlv_0= 'Directory' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleDirectories ) )
                    	    {
                    	    otherlv_0=(Token)match(input,59,FOLLOW_9); 

                    	    				newLeafNode(otherlv_0, grammarAccess.getDirectoryContentAccess().getDirectoryKeyword_0_0());
                    	    			
                    	    // InternalSoftgallery.g:2499:4: ( (lv_name_1_0= RULE_ID ) )
                    	    // InternalSoftgallery.g:2500:5: (lv_name_1_0= RULE_ID )
                    	    {
                    	    // InternalSoftgallery.g:2500:5: (lv_name_1_0= RULE_ID )
                    	    // InternalSoftgallery.g:2501:6: lv_name_1_0= RULE_ID
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

                    	    // InternalSoftgallery.g:2517:4: ( (lv_elements_2_0= ruleDirectories ) )
                    	    // InternalSoftgallery.g:2518:5: (lv_elements_2_0= ruleDirectories )
                    	    {
                    	    // InternalSoftgallery.g:2518:5: (lv_elements_2_0= ruleDirectories )
                    	    // InternalSoftgallery.g:2519:6: lv_elements_2_0= ruleDirectories
                    	    {

                    	    						newCompositeNode(grammarAccess.getDirectoryContentAccess().getElementsDirectoriesParserRuleCall_0_2_0());
                    	    					
                    	    pushFollow(FOLLOW_63);
                    	    lv_elements_2_0=ruleDirectories();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getDirectoryContentRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"elements",
                    	    							lv_elements_2_0,
                    	    							"co.unal.photos.Softgallery.Directories");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt10 >= 1 ) break loop10;
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalSoftgallery.g:2538:3: ( (lv_elements_3_0= ruleSingleFile ) )+
                    {
                    // InternalSoftgallery.g:2538:3: ( (lv_elements_3_0= ruleSingleFile ) )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==60) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalSoftgallery.g:2539:4: (lv_elements_3_0= ruleSingleFile )
                    	    {
                    	    // InternalSoftgallery.g:2539:4: (lv_elements_3_0= ruleSingleFile )
                    	    // InternalSoftgallery.g:2540:5: lv_elements_3_0= ruleSingleFile
                    	    {

                    	    					newCompositeNode(grammarAccess.getDirectoryContentAccess().getElementsSingleFileParserRuleCall_1_0());
                    	    				
                    	    pushFollow(FOLLOW_61);
                    	    lv_elements_3_0=ruleSingleFile();

                    	    state._fsp--;


                    	    					if (current==null) {
                    	    						current = createModelElementForParent(grammarAccess.getDirectoryContentRule());
                    	    					}
                    	    					add(
                    	    						current,
                    	    						"elements",
                    	    						lv_elements_3_0,
                    	    						"co.unal.photos.Softgallery.SingleFile");
                    	    					afterParserOrEnumRuleCall();
                    	    				

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt11 >= 1 ) break loop11;
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                throw eee;
                        }
                        cnt11++;
                    } while (true);


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
    // InternalSoftgallery.g:2561:1: entryRuleDirectories returns [EObject current=null] : iv_ruleDirectories= ruleDirectories EOF ;
    public final EObject entryRuleDirectories() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectories = null;


        try {
            // InternalSoftgallery.g:2561:52: (iv_ruleDirectories= ruleDirectories EOF )
            // InternalSoftgallery.g:2562:2: iv_ruleDirectories= ruleDirectories EOF
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
    // InternalSoftgallery.g:2568:1: ruleDirectories returns [EObject current=null] : ( (lv_elements_0_0= ruleMultipleFile ) )+ ;
    public final EObject ruleDirectories() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalSoftgallery.g:2574:2: ( ( (lv_elements_0_0= ruleMultipleFile ) )+ )
            // InternalSoftgallery.g:2575:2: ( (lv_elements_0_0= ruleMultipleFile ) )+
            {
            // InternalSoftgallery.g:2575:2: ( (lv_elements_0_0= ruleMultipleFile ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==61) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSoftgallery.g:2576:3: (lv_elements_0_0= ruleMultipleFile )
            	    {
            	    // InternalSoftgallery.g:2576:3: (lv_elements_0_0= ruleMultipleFile )
            	    // InternalSoftgallery.g:2577:4: lv_elements_0_0= ruleMultipleFile
            	    {

            	    				newCompositeNode(grammarAccess.getDirectoriesAccess().getElementsMultipleFileParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_64);
            	    lv_elements_0_0=ruleMultipleFile();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getDirectoriesRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"co.unal.photos.Softgallery.MultipleFile");
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
    // InternalSoftgallery.g:2597:1: entryRuleSingleFile returns [EObject current=null] : iv_ruleSingleFile= ruleSingleFile EOF ;
    public final EObject entryRuleSingleFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleFile = null;


        try {
            // InternalSoftgallery.g:2597:51: (iv_ruleSingleFile= ruleSingleFile EOF )
            // InternalSoftgallery.g:2598:2: iv_ruleSingleFile= ruleSingleFile EOF
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
    // InternalSoftgallery.g:2604:1: ruleSingleFile returns [EObject current=null] : (otherlv_0= 'SingleFile' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleSingleFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftgallery.g:2610:2: ( (otherlv_0= 'SingleFile' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftgallery.g:2611:2: (otherlv_0= 'SingleFile' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftgallery.g:2611:2: (otherlv_0= 'SingleFile' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftgallery.g:2612:3: otherlv_0= 'SingleFile' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,60,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getSingleFileAccess().getSingleFileKeyword_0());
            		
            // InternalSoftgallery.g:2616:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:2617:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:2617:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:2618:5: lv_name_1_0= RULE_ID
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
    // InternalSoftgallery.g:2638:1: entryRuleMultipleFile returns [EObject current=null] : iv_ruleMultipleFile= ruleMultipleFile EOF ;
    public final EObject entryRuleMultipleFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultipleFile = null;


        try {
            // InternalSoftgallery.g:2638:53: (iv_ruleMultipleFile= ruleMultipleFile EOF )
            // InternalSoftgallery.g:2639:2: iv_ruleMultipleFile= ruleMultipleFile EOF
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
    // InternalSoftgallery.g:2645:1: ruleMultipleFile returns [EObject current=null] : (otherlv_0= 'CommonFile' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleMultipleFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftgallery.g:2651:2: ( (otherlv_0= 'CommonFile' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftgallery.g:2652:2: (otherlv_0= 'CommonFile' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftgallery.g:2652:2: (otherlv_0= 'CommonFile' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftgallery.g:2653:3: otherlv_0= 'CommonFile' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,61,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getMultipleFileAccess().getCommonFileKeyword_0());
            		
            // InternalSoftgallery.g:2657:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:2658:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:2658:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:2659:5: lv_name_1_0= RULE_ID
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
    // InternalSoftgallery.g:2679:1: entryRuleLayerRelations returns [EObject current=null] : iv_ruleLayerRelations= ruleLayerRelations EOF ;
    public final EObject entryRuleLayerRelations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayerRelations = null;


        try {
            // InternalSoftgallery.g:2679:55: (iv_ruleLayerRelations= ruleLayerRelations EOF )
            // InternalSoftgallery.g:2680:2: iv_ruleLayerRelations= ruleLayerRelations EOF
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
    // InternalSoftgallery.g:2686:1: ruleLayerRelations returns [EObject current=null] : ( ( (lv_layerelations_0_0= ruleRelationType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_layerorigin_2_0= ruleLayerSource ) ) ( (lv_layertarget_3_0= ruleLayerTarget ) ) )+ ;
    public final EObject ruleLayerRelations() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_layerelations_0_0 = null;

        EObject lv_layerorigin_2_0 = null;

        EObject lv_layertarget_3_0 = null;



        	enterRule();

        try {
            // InternalSoftgallery.g:2692:2: ( ( ( (lv_layerelations_0_0= ruleRelationType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_layerorigin_2_0= ruleLayerSource ) ) ( (lv_layertarget_3_0= ruleLayerTarget ) ) )+ )
            // InternalSoftgallery.g:2693:2: ( ( (lv_layerelations_0_0= ruleRelationType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_layerorigin_2_0= ruleLayerSource ) ) ( (lv_layertarget_3_0= ruleLayerTarget ) ) )+
            {
            // InternalSoftgallery.g:2693:2: ( ( (lv_layerelations_0_0= ruleRelationType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_layerorigin_2_0= ruleLayerSource ) ) ( (lv_layertarget_3_0= ruleLayerTarget ) ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==62) ) {
                    alt14=1;
                }
                else if ( (LA14_0==63) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSoftgallery.g:2694:3: ( (lv_layerelations_0_0= ruleRelationType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_layerorigin_2_0= ruleLayerSource ) ) ( (lv_layertarget_3_0= ruleLayerTarget ) )
            	    {
            	    // InternalSoftgallery.g:2694:3: ( (lv_layerelations_0_0= ruleRelationType ) )
            	    // InternalSoftgallery.g:2695:4: (lv_layerelations_0_0= ruleRelationType )
            	    {
            	    // InternalSoftgallery.g:2695:4: (lv_layerelations_0_0= ruleRelationType )
            	    // InternalSoftgallery.g:2696:5: lv_layerelations_0_0= ruleRelationType
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
            	    						"co.unal.photos.Softgallery.RelationType");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }

            	    // InternalSoftgallery.g:2713:3: ( (lv_name_1_0= RULE_ID ) )
            	    // InternalSoftgallery.g:2714:4: (lv_name_1_0= RULE_ID )
            	    {
            	    // InternalSoftgallery.g:2714:4: (lv_name_1_0= RULE_ID )
            	    // InternalSoftgallery.g:2715:5: lv_name_1_0= RULE_ID
            	    {
            	    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_65); 

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

            	    // InternalSoftgallery.g:2731:3: ( (lv_layerorigin_2_0= ruleLayerSource ) )
            	    // InternalSoftgallery.g:2732:4: (lv_layerorigin_2_0= ruleLayerSource )
            	    {
            	    // InternalSoftgallery.g:2732:4: (lv_layerorigin_2_0= ruleLayerSource )
            	    // InternalSoftgallery.g:2733:5: lv_layerorigin_2_0= ruleLayerSource
            	    {

            	    					newCompositeNode(grammarAccess.getLayerRelationsAccess().getLayeroriginLayerSourceParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_66);
            	    lv_layerorigin_2_0=ruleLayerSource();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLayerRelationsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"layerorigin",
            	    						lv_layerorigin_2_0,
            	    						"co.unal.photos.Softgallery.LayerSource");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }

            	    // InternalSoftgallery.g:2750:3: ( (lv_layertarget_3_0= ruleLayerTarget ) )
            	    // InternalSoftgallery.g:2751:4: (lv_layertarget_3_0= ruleLayerTarget )
            	    {
            	    // InternalSoftgallery.g:2751:4: (lv_layertarget_3_0= ruleLayerTarget )
            	    // InternalSoftgallery.g:2752:5: lv_layertarget_3_0= ruleLayerTarget
            	    {

            	    					newCompositeNode(grammarAccess.getLayerRelationsAccess().getLayertargetLayerTargetParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_67);
            	    lv_layertarget_3_0=ruleLayerTarget();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLayerRelationsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"layertarget",
            	    						lv_layertarget_3_0,
            	    						"co.unal.photos.Softgallery.LayerTarget");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
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
    // $ANTLR end "ruleLayerRelations"


    // $ANTLR start "entryRuleRelationType"
    // InternalSoftgallery.g:2773:1: entryRuleRelationType returns [String current=null] : iv_ruleRelationType= ruleRelationType EOF ;
    public final String entryRuleRelationType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRelationType = null;


        try {
            // InternalSoftgallery.g:2773:52: (iv_ruleRelationType= ruleRelationType EOF )
            // InternalSoftgallery.g:2774:2: iv_ruleRelationType= ruleRelationType EOF
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
    // InternalSoftgallery.g:2780:1: ruleRelationType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'AllowedToUse' | kw= 'AllowToUseBelow' ) ;
    public final AntlrDatatypeRuleToken ruleRelationType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSoftgallery.g:2786:2: ( (kw= 'AllowedToUse' | kw= 'AllowToUseBelow' ) )
            // InternalSoftgallery.g:2787:2: (kw= 'AllowedToUse' | kw= 'AllowToUseBelow' )
            {
            // InternalSoftgallery.g:2787:2: (kw= 'AllowedToUse' | kw= 'AllowToUseBelow' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==62) ) {
                alt15=1;
            }
            else if ( (LA15_0==63) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalSoftgallery.g:2788:3: kw= 'AllowedToUse'
                    {
                    kw=(Token)match(input,62,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRelationTypeAccess().getAllowedToUseKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSoftgallery.g:2794:3: kw= 'AllowToUseBelow'
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
    // InternalSoftgallery.g:2803:1: entryRuleLayerSource returns [EObject current=null] : iv_ruleLayerSource= ruleLayerSource EOF ;
    public final EObject entryRuleLayerSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayerSource = null;


        try {
            // InternalSoftgallery.g:2803:52: (iv_ruleLayerSource= ruleLayerSource EOF )
            // InternalSoftgallery.g:2804:2: iv_ruleLayerSource= ruleLayerSource EOF
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
    // InternalSoftgallery.g:2810:1: ruleLayerSource returns [EObject current=null] : (otherlv_0= 'source' ( (lv_layerelations_1_0= ruleLayerRelationName ) ) ) ;
    public final EObject ruleLayerSource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_layerelations_1_0 = null;



        	enterRule();

        try {
            // InternalSoftgallery.g:2816:2: ( (otherlv_0= 'source' ( (lv_layerelations_1_0= ruleLayerRelationName ) ) ) )
            // InternalSoftgallery.g:2817:2: (otherlv_0= 'source' ( (lv_layerelations_1_0= ruleLayerRelationName ) ) )
            {
            // InternalSoftgallery.g:2817:2: (otherlv_0= 'source' ( (lv_layerelations_1_0= ruleLayerRelationName ) ) )
            // InternalSoftgallery.g:2818:3: otherlv_0= 'source' ( (lv_layerelations_1_0= ruleLayerRelationName ) )
            {
            otherlv_0=(Token)match(input,64,FOLLOW_68); 

            			newLeafNode(otherlv_0, grammarAccess.getLayerSourceAccess().getSourceKeyword_0());
            		
            // InternalSoftgallery.g:2822:3: ( (lv_layerelations_1_0= ruleLayerRelationName ) )
            // InternalSoftgallery.g:2823:4: (lv_layerelations_1_0= ruleLayerRelationName )
            {
            // InternalSoftgallery.g:2823:4: (lv_layerelations_1_0= ruleLayerRelationName )
            // InternalSoftgallery.g:2824:5: lv_layerelations_1_0= ruleLayerRelationName
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
            						"co.unal.photos.Softgallery.LayerRelationName");
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
    // InternalSoftgallery.g:2845:1: entryRuleLayerTarget returns [EObject current=null] : iv_ruleLayerTarget= ruleLayerTarget EOF ;
    public final EObject entryRuleLayerTarget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayerTarget = null;


        try {
            // InternalSoftgallery.g:2845:52: (iv_ruleLayerTarget= ruleLayerTarget EOF )
            // InternalSoftgallery.g:2846:2: iv_ruleLayerTarget= ruleLayerTarget EOF
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
    // InternalSoftgallery.g:2852:1: ruleLayerTarget returns [EObject current=null] : (otherlv_0= 'target' ( (lv_layerelations_1_0= ruleLayerRelationName ) ) ) ;
    public final EObject ruleLayerTarget() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_layerelations_1_0 = null;



        	enterRule();

        try {
            // InternalSoftgallery.g:2858:2: ( (otherlv_0= 'target' ( (lv_layerelations_1_0= ruleLayerRelationName ) ) ) )
            // InternalSoftgallery.g:2859:2: (otherlv_0= 'target' ( (lv_layerelations_1_0= ruleLayerRelationName ) ) )
            {
            // InternalSoftgallery.g:2859:2: (otherlv_0= 'target' ( (lv_layerelations_1_0= ruleLayerRelationName ) ) )
            // InternalSoftgallery.g:2860:3: otherlv_0= 'target' ( (lv_layerelations_1_0= ruleLayerRelationName ) )
            {
            otherlv_0=(Token)match(input,65,FOLLOW_68); 

            			newLeafNode(otherlv_0, grammarAccess.getLayerTargetAccess().getTargetKeyword_0());
            		
            // InternalSoftgallery.g:2864:3: ( (lv_layerelations_1_0= ruleLayerRelationName ) )
            // InternalSoftgallery.g:2865:4: (lv_layerelations_1_0= ruleLayerRelationName )
            {
            // InternalSoftgallery.g:2865:4: (lv_layerelations_1_0= ruleLayerRelationName )
            // InternalSoftgallery.g:2866:5: lv_layerelations_1_0= ruleLayerRelationName
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
            						"co.unal.photos.Softgallery.LayerRelationName");
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
    // InternalSoftgallery.g:2887:1: entryRuleLayerRelationName returns [String current=null] : iv_ruleLayerRelationName= ruleLayerRelationName EOF ;
    public final String entryRuleLayerRelationName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLayerRelationName = null;


        try {
            // InternalSoftgallery.g:2887:57: (iv_ruleLayerRelationName= ruleLayerRelationName EOF )
            // InternalSoftgallery.g:2888:2: iv_ruleLayerRelationName= ruleLayerRelationName EOF
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
    // InternalSoftgallery.g:2894:1: ruleLayerRelationName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'PresentationLayer' | kw= 'BusinessLogicLayer' | kw= 'PersistenceDataLayer' ) ;
    public final AntlrDatatypeRuleToken ruleLayerRelationName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSoftgallery.g:2900:2: ( (kw= 'PresentationLayer' | kw= 'BusinessLogicLayer' | kw= 'PersistenceDataLayer' ) )
            // InternalSoftgallery.g:2901:2: (kw= 'PresentationLayer' | kw= 'BusinessLogicLayer' | kw= 'PersistenceDataLayer' )
            {
            // InternalSoftgallery.g:2901:2: (kw= 'PresentationLayer' | kw= 'BusinessLogicLayer' | kw= 'PersistenceDataLayer' )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt16=1;
                }
                break;
            case 47:
                {
                alt16=2;
                }
                break;
            case 66:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalSoftgallery.g:2902:3: kw= 'PresentationLayer'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLayerRelationNameAccess().getPresentationLayerKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSoftgallery.g:2908:3: kw= 'BusinessLogicLayer'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLayerRelationNameAccess().getBusinessLogicLayerKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSoftgallery.g:2914:3: kw= 'PersistenceDataLayer'
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
    // InternalSoftgallery.g:2923:1: entryRuleArchitectureComponents returns [EObject current=null] : iv_ruleArchitectureComponents= ruleArchitectureComponents EOF ;
    public final EObject entryRuleArchitectureComponents() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArchitectureComponents = null;


        try {
            // InternalSoftgallery.g:2923:63: (iv_ruleArchitectureComponents= ruleArchitectureComponents EOF )
            // InternalSoftgallery.g:2924:2: iv_ruleArchitectureComponents= ruleArchitectureComponents EOF
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
    // InternalSoftgallery.g:2930:1: ruleArchitectureComponents returns [EObject current=null] : (otherlv_0= 'SystemComponents' ( (lv_archcomponent_1_0= ruleFrontEnd ) ) ( (lv_archcomponent_2_0= ruleBackEnd ) ) ( (lv_archcomponent_3_0= rulePersistenceDataComponent ) ) ) ;
    public final EObject ruleArchitectureComponents() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_archcomponent_1_0 = null;

        EObject lv_archcomponent_2_0 = null;

        EObject lv_archcomponent_3_0 = null;



        	enterRule();

        try {
            // InternalSoftgallery.g:2936:2: ( (otherlv_0= 'SystemComponents' ( (lv_archcomponent_1_0= ruleFrontEnd ) ) ( (lv_archcomponent_2_0= ruleBackEnd ) ) ( (lv_archcomponent_3_0= rulePersistenceDataComponent ) ) ) )
            // InternalSoftgallery.g:2937:2: (otherlv_0= 'SystemComponents' ( (lv_archcomponent_1_0= ruleFrontEnd ) ) ( (lv_archcomponent_2_0= ruleBackEnd ) ) ( (lv_archcomponent_3_0= rulePersistenceDataComponent ) ) )
            {
            // InternalSoftgallery.g:2937:2: (otherlv_0= 'SystemComponents' ( (lv_archcomponent_1_0= ruleFrontEnd ) ) ( (lv_archcomponent_2_0= ruleBackEnd ) ) ( (lv_archcomponent_3_0= rulePersistenceDataComponent ) ) )
            // InternalSoftgallery.g:2938:3: otherlv_0= 'SystemComponents' ( (lv_archcomponent_1_0= ruleFrontEnd ) ) ( (lv_archcomponent_2_0= ruleBackEnd ) ) ( (lv_archcomponent_3_0= rulePersistenceDataComponent ) )
            {
            otherlv_0=(Token)match(input,67,FOLLOW_69); 

            			newLeafNode(otherlv_0, grammarAccess.getArchitectureComponentsAccess().getSystemComponentsKeyword_0());
            		
            // InternalSoftgallery.g:2942:3: ( (lv_archcomponent_1_0= ruleFrontEnd ) )
            // InternalSoftgallery.g:2943:4: (lv_archcomponent_1_0= ruleFrontEnd )
            {
            // InternalSoftgallery.g:2943:4: (lv_archcomponent_1_0= ruleFrontEnd )
            // InternalSoftgallery.g:2944:5: lv_archcomponent_1_0= ruleFrontEnd
            {

            					newCompositeNode(grammarAccess.getArchitectureComponentsAccess().getArchcomponentFrontEndParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_70);
            lv_archcomponent_1_0=ruleFrontEnd();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArchitectureComponentsRule());
            					}
            					add(
            						current,
            						"archcomponent",
            						lv_archcomponent_1_0,
            						"co.unal.photos.Softgallery.FrontEnd");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftgallery.g:2961:3: ( (lv_archcomponent_2_0= ruleBackEnd ) )
            // InternalSoftgallery.g:2962:4: (lv_archcomponent_2_0= ruleBackEnd )
            {
            // InternalSoftgallery.g:2962:4: (lv_archcomponent_2_0= ruleBackEnd )
            // InternalSoftgallery.g:2963:5: lv_archcomponent_2_0= ruleBackEnd
            {

            					newCompositeNode(grammarAccess.getArchitectureComponentsAccess().getArchcomponentBackEndParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_71);
            lv_archcomponent_2_0=ruleBackEnd();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArchitectureComponentsRule());
            					}
            					add(
            						current,
            						"archcomponent",
            						lv_archcomponent_2_0,
            						"co.unal.photos.Softgallery.BackEnd");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftgallery.g:2980:3: ( (lv_archcomponent_3_0= rulePersistenceDataComponent ) )
            // InternalSoftgallery.g:2981:4: (lv_archcomponent_3_0= rulePersistenceDataComponent )
            {
            // InternalSoftgallery.g:2981:4: (lv_archcomponent_3_0= rulePersistenceDataComponent )
            // InternalSoftgallery.g:2982:5: lv_archcomponent_3_0= rulePersistenceDataComponent
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
            						"co.unal.photos.Softgallery.PersistenceDataComponent");
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
    // InternalSoftgallery.g:3003:1: entryRuleFrontEnd returns [EObject current=null] : iv_ruleFrontEnd= ruleFrontEnd EOF ;
    public final EObject entryRuleFrontEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFrontEnd = null;


        try {
            // InternalSoftgallery.g:3003:49: (iv_ruleFrontEnd= ruleFrontEnd EOF )
            // InternalSoftgallery.g:3004:2: iv_ruleFrontEnd= ruleFrontEnd EOF
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
    // InternalSoftgallery.g:3010:1: ruleFrontEnd returns [EObject current=null] : (otherlv_0= 'FrontEndComponent' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleFrontEnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftgallery.g:3016:2: ( (otherlv_0= 'FrontEndComponent' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftgallery.g:3017:2: (otherlv_0= 'FrontEndComponent' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftgallery.g:3017:2: (otherlv_0= 'FrontEndComponent' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftgallery.g:3018:3: otherlv_0= 'FrontEndComponent' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,68,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getFrontEndAccess().getFrontEndComponentKeyword_0());
            		
            // InternalSoftgallery.g:3022:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:3023:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:3023:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:3024:5: lv_name_1_0= RULE_ID
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
    // InternalSoftgallery.g:3044:1: entryRuleBackEnd returns [EObject current=null] : iv_ruleBackEnd= ruleBackEnd EOF ;
    public final EObject entryRuleBackEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBackEnd = null;


        try {
            // InternalSoftgallery.g:3044:48: (iv_ruleBackEnd= ruleBackEnd EOF )
            // InternalSoftgallery.g:3045:2: iv_ruleBackEnd= ruleBackEnd EOF
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
    // InternalSoftgallery.g:3051:1: ruleBackEnd returns [EObject current=null] : (otherlv_0= 'BackEndComponent' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleBackEnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftgallery.g:3057:2: ( (otherlv_0= 'BackEndComponent' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftgallery.g:3058:2: (otherlv_0= 'BackEndComponent' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftgallery.g:3058:2: (otherlv_0= 'BackEndComponent' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftgallery.g:3059:3: otherlv_0= 'BackEndComponent' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,69,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getBackEndAccess().getBackEndComponentKeyword_0());
            		
            // InternalSoftgallery.g:3063:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:3064:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:3064:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:3065:5: lv_name_1_0= RULE_ID
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
    // InternalSoftgallery.g:3085:1: entryRulePersistenceDataComponent returns [EObject current=null] : iv_rulePersistenceDataComponent= rulePersistenceDataComponent EOF ;
    public final EObject entryRulePersistenceDataComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePersistenceDataComponent = null;


        try {
            // InternalSoftgallery.g:3085:65: (iv_rulePersistenceDataComponent= rulePersistenceDataComponent EOF )
            // InternalSoftgallery.g:3086:2: iv_rulePersistenceDataComponent= rulePersistenceDataComponent EOF
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
    // InternalSoftgallery.g:3092:1: rulePersistenceDataComponent returns [EObject current=null] : (otherlv_0= 'PersistenceDataComponent' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePersistenceDataComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftgallery.g:3098:2: ( (otherlv_0= 'PersistenceDataComponent' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftgallery.g:3099:2: (otherlv_0= 'PersistenceDataComponent' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftgallery.g:3099:2: (otherlv_0= 'PersistenceDataComponent' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftgallery.g:3100:3: otherlv_0= 'PersistenceDataComponent' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,70,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getPersistenceDataComponentAccess().getPersistenceDataComponentKeyword_0());
            		
            // InternalSoftgallery.g:3104:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:3105:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:3105:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:3106:5: lv_name_1_0= RULE_ID
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
    // InternalSoftgallery.g:3126:1: entryRuleNTiersConnections returns [EObject current=null] : iv_ruleNTiersConnections= ruleNTiersConnections EOF ;
    public final EObject entryRuleNTiersConnections() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNTiersConnections = null;


        try {
            // InternalSoftgallery.g:3126:58: (iv_ruleNTiersConnections= ruleNTiersConnections EOF )
            // InternalSoftgallery.g:3127:2: iv_ruleNTiersConnections= ruleNTiersConnections EOF
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
    // InternalSoftgallery.g:3133:1: ruleNTiersConnections returns [EObject current=null] : (otherlv_0= 'Connectors' ( ( (lv_ntierconnection_1_0= ruleConnectionType ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_ntierorigin_3_0= ruleNTierSource ) ) ( (lv_ntiertarget_4_0= ruleNTierTarget ) ) )+ ) ;
    public final EObject ruleNTiersConnections() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        AntlrDatatypeRuleToken lv_ntierconnection_1_0 = null;

        EObject lv_ntierorigin_3_0 = null;

        EObject lv_ntiertarget_4_0 = null;



        	enterRule();

        try {
            // InternalSoftgallery.g:3139:2: ( (otherlv_0= 'Connectors' ( ( (lv_ntierconnection_1_0= ruleConnectionType ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_ntierorigin_3_0= ruleNTierSource ) ) ( (lv_ntiertarget_4_0= ruleNTierTarget ) ) )+ ) )
            // InternalSoftgallery.g:3140:2: (otherlv_0= 'Connectors' ( ( (lv_ntierconnection_1_0= ruleConnectionType ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_ntierorigin_3_0= ruleNTierSource ) ) ( (lv_ntiertarget_4_0= ruleNTierTarget ) ) )+ )
            {
            // InternalSoftgallery.g:3140:2: (otherlv_0= 'Connectors' ( ( (lv_ntierconnection_1_0= ruleConnectionType ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_ntierorigin_3_0= ruleNTierSource ) ) ( (lv_ntiertarget_4_0= ruleNTierTarget ) ) )+ )
            // InternalSoftgallery.g:3141:3: otherlv_0= 'Connectors' ( ( (lv_ntierconnection_1_0= ruleConnectionType ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_ntierorigin_3_0= ruleNTierSource ) ) ( (lv_ntiertarget_4_0= ruleNTierTarget ) ) )+
            {
            otherlv_0=(Token)match(input,71,FOLLOW_72); 

            			newLeafNode(otherlv_0, grammarAccess.getNTiersConnectionsAccess().getConnectorsKeyword_0());
            		
            // InternalSoftgallery.g:3145:3: ( ( (lv_ntierconnection_1_0= ruleConnectionType ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_ntierorigin_3_0= ruleNTierSource ) ) ( (lv_ntiertarget_4_0= ruleNTierTarget ) ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=72 && LA17_0<=74)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalSoftgallery.g:3146:4: ( (lv_ntierconnection_1_0= ruleConnectionType ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_ntierorigin_3_0= ruleNTierSource ) ) ( (lv_ntiertarget_4_0= ruleNTierTarget ) )
            	    {
            	    // InternalSoftgallery.g:3146:4: ( (lv_ntierconnection_1_0= ruleConnectionType ) )
            	    // InternalSoftgallery.g:3147:5: (lv_ntierconnection_1_0= ruleConnectionType )
            	    {
            	    // InternalSoftgallery.g:3147:5: (lv_ntierconnection_1_0= ruleConnectionType )
            	    // InternalSoftgallery.g:3148:6: lv_ntierconnection_1_0= ruleConnectionType
            	    {

            	    						newCompositeNode(grammarAccess.getNTiersConnectionsAccess().getNtierconnectionConnectionTypeParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_ntierconnection_1_0=ruleConnectionType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNTiersConnectionsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ntierconnection",
            	    							lv_ntierconnection_1_0,
            	    							"co.unal.photos.Softgallery.ConnectionType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalSoftgallery.g:3165:4: ( (lv_name_2_0= RULE_ID ) )
            	    // InternalSoftgallery.g:3166:5: (lv_name_2_0= RULE_ID )
            	    {
            	    // InternalSoftgallery.g:3166:5: (lv_name_2_0= RULE_ID )
            	    // InternalSoftgallery.g:3167:6: lv_name_2_0= RULE_ID
            	    {
            	    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_65); 

            	    						newLeafNode(lv_name_2_0, grammarAccess.getNTiersConnectionsAccess().getNameIDTerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getNTiersConnectionsRule());
            	    						}
            	    						setWithLastConsumed(
            	    							current,
            	    							"name",
            	    							lv_name_2_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }

            	    // InternalSoftgallery.g:3183:4: ( (lv_ntierorigin_3_0= ruleNTierSource ) )
            	    // InternalSoftgallery.g:3184:5: (lv_ntierorigin_3_0= ruleNTierSource )
            	    {
            	    // InternalSoftgallery.g:3184:5: (lv_ntierorigin_3_0= ruleNTierSource )
            	    // InternalSoftgallery.g:3185:6: lv_ntierorigin_3_0= ruleNTierSource
            	    {

            	    						newCompositeNode(grammarAccess.getNTiersConnectionsAccess().getNtieroriginNTierSourceParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_66);
            	    lv_ntierorigin_3_0=ruleNTierSource();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNTiersConnectionsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ntierorigin",
            	    							lv_ntierorigin_3_0,
            	    							"co.unal.photos.Softgallery.NTierSource");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalSoftgallery.g:3202:4: ( (lv_ntiertarget_4_0= ruleNTierTarget ) )
            	    // InternalSoftgallery.g:3203:5: (lv_ntiertarget_4_0= ruleNTierTarget )
            	    {
            	    // InternalSoftgallery.g:3203:5: (lv_ntiertarget_4_0= ruleNTierTarget )
            	    // InternalSoftgallery.g:3204:6: lv_ntiertarget_4_0= ruleNTierTarget
            	    {

            	    						newCompositeNode(grammarAccess.getNTiersConnectionsAccess().getNtiertargetNTierTargetParserRuleCall_1_3_0());
            	    					
            	    pushFollow(FOLLOW_73);
            	    lv_ntiertarget_4_0=ruleNTierTarget();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNTiersConnectionsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ntiertarget",
            	    							lv_ntiertarget_4_0,
            	    							"co.unal.photos.Softgallery.NTierTarget");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


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


    // $ANTLR start "entryRuleConnectionType"
    // InternalSoftgallery.g:3226:1: entryRuleConnectionType returns [String current=null] : iv_ruleConnectionType= ruleConnectionType EOF ;
    public final String entryRuleConnectionType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConnectionType = null;


        try {
            // InternalSoftgallery.g:3226:54: (iv_ruleConnectionType= ruleConnectionType EOF )
            // InternalSoftgallery.g:3227:2: iv_ruleConnectionType= ruleConnectionType EOF
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
    // InternalSoftgallery.g:3233:1: ruleConnectionType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'REST' | kw= 'PostgreSQLConnection' | kw= 'AmazonS3API' ) ;
    public final AntlrDatatypeRuleToken ruleConnectionType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSoftgallery.g:3239:2: ( (kw= 'REST' | kw= 'PostgreSQLConnection' | kw= 'AmazonS3API' ) )
            // InternalSoftgallery.g:3240:2: (kw= 'REST' | kw= 'PostgreSQLConnection' | kw= 'AmazonS3API' )
            {
            // InternalSoftgallery.g:3240:2: (kw= 'REST' | kw= 'PostgreSQLConnection' | kw= 'AmazonS3API' )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt18=1;
                }
                break;
            case 73:
                {
                alt18=2;
                }
                break;
            case 74:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalSoftgallery.g:3241:3: kw= 'REST'
                    {
                    kw=(Token)match(input,72,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getConnectionTypeAccess().getRESTKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSoftgallery.g:3247:3: kw= 'PostgreSQLConnection'
                    {
                    kw=(Token)match(input,73,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getConnectionTypeAccess().getPostgreSQLConnectionKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSoftgallery.g:3253:3: kw= 'AmazonS3API'
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
    // InternalSoftgallery.g:3262:1: entryRuleNTierSource returns [EObject current=null] : iv_ruleNTierSource= ruleNTierSource EOF ;
    public final EObject entryRuleNTierSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNTierSource = null;


        try {
            // InternalSoftgallery.g:3262:52: (iv_ruleNTierSource= ruleNTierSource EOF )
            // InternalSoftgallery.g:3263:2: iv_ruleNTierSource= ruleNTierSource EOF
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
    // InternalSoftgallery.g:3269:1: ruleNTierSource returns [EObject current=null] : (otherlv_0= 'source' ( (lv_ntierconnection_1_0= ruleNTiersRelations ) ) ) ;
    public final EObject ruleNTierSource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_ntierconnection_1_0 = null;



        	enterRule();

        try {
            // InternalSoftgallery.g:3275:2: ( (otherlv_0= 'source' ( (lv_ntierconnection_1_0= ruleNTiersRelations ) ) ) )
            // InternalSoftgallery.g:3276:2: (otherlv_0= 'source' ( (lv_ntierconnection_1_0= ruleNTiersRelations ) ) )
            {
            // InternalSoftgallery.g:3276:2: (otherlv_0= 'source' ( (lv_ntierconnection_1_0= ruleNTiersRelations ) ) )
            // InternalSoftgallery.g:3277:3: otherlv_0= 'source' ( (lv_ntierconnection_1_0= ruleNTiersRelations ) )
            {
            otherlv_0=(Token)match(input,64,FOLLOW_74); 

            			newLeafNode(otherlv_0, grammarAccess.getNTierSourceAccess().getSourceKeyword_0());
            		
            // InternalSoftgallery.g:3281:3: ( (lv_ntierconnection_1_0= ruleNTiersRelations ) )
            // InternalSoftgallery.g:3282:4: (lv_ntierconnection_1_0= ruleNTiersRelations )
            {
            // InternalSoftgallery.g:3282:4: (lv_ntierconnection_1_0= ruleNTiersRelations )
            // InternalSoftgallery.g:3283:5: lv_ntierconnection_1_0= ruleNTiersRelations
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
            						"co.unal.photos.Softgallery.NTiersRelations");
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
    // InternalSoftgallery.g:3304:1: entryRuleNTierTarget returns [EObject current=null] : iv_ruleNTierTarget= ruleNTierTarget EOF ;
    public final EObject entryRuleNTierTarget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNTierTarget = null;


        try {
            // InternalSoftgallery.g:3304:52: (iv_ruleNTierTarget= ruleNTierTarget EOF )
            // InternalSoftgallery.g:3305:2: iv_ruleNTierTarget= ruleNTierTarget EOF
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
    // InternalSoftgallery.g:3311:1: ruleNTierTarget returns [EObject current=null] : (otherlv_0= 'target' ( (lv_ntierconnection_1_0= ruleNTiersRelations ) ) ) ;
    public final EObject ruleNTierTarget() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_ntierconnection_1_0 = null;



        	enterRule();

        try {
            // InternalSoftgallery.g:3317:2: ( (otherlv_0= 'target' ( (lv_ntierconnection_1_0= ruleNTiersRelations ) ) ) )
            // InternalSoftgallery.g:3318:2: (otherlv_0= 'target' ( (lv_ntierconnection_1_0= ruleNTiersRelations ) ) )
            {
            // InternalSoftgallery.g:3318:2: (otherlv_0= 'target' ( (lv_ntierconnection_1_0= ruleNTiersRelations ) ) )
            // InternalSoftgallery.g:3319:3: otherlv_0= 'target' ( (lv_ntierconnection_1_0= ruleNTiersRelations ) )
            {
            otherlv_0=(Token)match(input,65,FOLLOW_74); 

            			newLeafNode(otherlv_0, grammarAccess.getNTierTargetAccess().getTargetKeyword_0());
            		
            // InternalSoftgallery.g:3323:3: ( (lv_ntierconnection_1_0= ruleNTiersRelations ) )
            // InternalSoftgallery.g:3324:4: (lv_ntierconnection_1_0= ruleNTiersRelations )
            {
            // InternalSoftgallery.g:3324:4: (lv_ntierconnection_1_0= ruleNTiersRelations )
            // InternalSoftgallery.g:3325:5: lv_ntierconnection_1_0= ruleNTiersRelations
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
            						"co.unal.photos.Softgallery.NTiersRelations");
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
    // InternalSoftgallery.g:3346:1: entryRuleNTiersRelations returns [EObject current=null] : iv_ruleNTiersRelations= ruleNTiersRelations EOF ;
    public final EObject entryRuleNTiersRelations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNTiersRelations = null;


        try {
            // InternalSoftgallery.g:3346:56: (iv_ruleNTiersRelations= ruleNTiersRelations EOF )
            // InternalSoftgallery.g:3347:2: iv_ruleNTiersRelations= ruleNTiersRelations EOF
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
    // InternalSoftgallery.g:3353:1: ruleNTiersRelations returns [EObject current=null] : ( (otherlv_0= 'FrontEndComponent' ( (lv_name_1_0= RULE_ID ) ) ) | (otherlv_2= 'BackEndComponent' ( (lv_name_3_0= RULE_ID ) ) ) | (otherlv_4= 'PersistenceDataComponent' ( (lv_name_5_0= RULE_ID ) ) ) | (otherlv_6= 'AmazonService' ( (lv_name_7_0= RULE_ID ) ) ) ) ;
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
            // InternalSoftgallery.g:3359:2: ( ( (otherlv_0= 'FrontEndComponent' ( (lv_name_1_0= RULE_ID ) ) ) | (otherlv_2= 'BackEndComponent' ( (lv_name_3_0= RULE_ID ) ) ) | (otherlv_4= 'PersistenceDataComponent' ( (lv_name_5_0= RULE_ID ) ) ) | (otherlv_6= 'AmazonService' ( (lv_name_7_0= RULE_ID ) ) ) ) )
            // InternalSoftgallery.g:3360:2: ( (otherlv_0= 'FrontEndComponent' ( (lv_name_1_0= RULE_ID ) ) ) | (otherlv_2= 'BackEndComponent' ( (lv_name_3_0= RULE_ID ) ) ) | (otherlv_4= 'PersistenceDataComponent' ( (lv_name_5_0= RULE_ID ) ) ) | (otherlv_6= 'AmazonService' ( (lv_name_7_0= RULE_ID ) ) ) )
            {
            // InternalSoftgallery.g:3360:2: ( (otherlv_0= 'FrontEndComponent' ( (lv_name_1_0= RULE_ID ) ) ) | (otherlv_2= 'BackEndComponent' ( (lv_name_3_0= RULE_ID ) ) ) | (otherlv_4= 'PersistenceDataComponent' ( (lv_name_5_0= RULE_ID ) ) ) | (otherlv_6= 'AmazonService' ( (lv_name_7_0= RULE_ID ) ) ) )
            int alt19=4;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt19=1;
                }
                break;
            case 69:
                {
                alt19=2;
                }
                break;
            case 70:
                {
                alt19=3;
                }
                break;
            case 75:
                {
                alt19=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalSoftgallery.g:3361:3: (otherlv_0= 'FrontEndComponent' ( (lv_name_1_0= RULE_ID ) ) )
                    {
                    // InternalSoftgallery.g:3361:3: (otherlv_0= 'FrontEndComponent' ( (lv_name_1_0= RULE_ID ) ) )
                    // InternalSoftgallery.g:3362:4: otherlv_0= 'FrontEndComponent' ( (lv_name_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,68,FOLLOW_9); 

                    				newLeafNode(otherlv_0, grammarAccess.getNTiersRelationsAccess().getFrontEndComponentKeyword_0_0());
                    			
                    // InternalSoftgallery.g:3366:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalSoftgallery.g:3367:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalSoftgallery.g:3367:5: (lv_name_1_0= RULE_ID )
                    // InternalSoftgallery.g:3368:6: lv_name_1_0= RULE_ID
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
                    // InternalSoftgallery.g:3386:3: (otherlv_2= 'BackEndComponent' ( (lv_name_3_0= RULE_ID ) ) )
                    {
                    // InternalSoftgallery.g:3386:3: (otherlv_2= 'BackEndComponent' ( (lv_name_3_0= RULE_ID ) ) )
                    // InternalSoftgallery.g:3387:4: otherlv_2= 'BackEndComponent' ( (lv_name_3_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,69,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getNTiersRelationsAccess().getBackEndComponentKeyword_1_0());
                    			
                    // InternalSoftgallery.g:3391:4: ( (lv_name_3_0= RULE_ID ) )
                    // InternalSoftgallery.g:3392:5: (lv_name_3_0= RULE_ID )
                    {
                    // InternalSoftgallery.g:3392:5: (lv_name_3_0= RULE_ID )
                    // InternalSoftgallery.g:3393:6: lv_name_3_0= RULE_ID
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
                    // InternalSoftgallery.g:3411:3: (otherlv_4= 'PersistenceDataComponent' ( (lv_name_5_0= RULE_ID ) ) )
                    {
                    // InternalSoftgallery.g:3411:3: (otherlv_4= 'PersistenceDataComponent' ( (lv_name_5_0= RULE_ID ) ) )
                    // InternalSoftgallery.g:3412:4: otherlv_4= 'PersistenceDataComponent' ( (lv_name_5_0= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,70,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getNTiersRelationsAccess().getPersistenceDataComponentKeyword_2_0());
                    			
                    // InternalSoftgallery.g:3416:4: ( (lv_name_5_0= RULE_ID ) )
                    // InternalSoftgallery.g:3417:5: (lv_name_5_0= RULE_ID )
                    {
                    // InternalSoftgallery.g:3417:5: (lv_name_5_0= RULE_ID )
                    // InternalSoftgallery.g:3418:6: lv_name_5_0= RULE_ID
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
                    // InternalSoftgallery.g:3436:3: (otherlv_6= 'AmazonService' ( (lv_name_7_0= RULE_ID ) ) )
                    {
                    // InternalSoftgallery.g:3436:3: (otherlv_6= 'AmazonService' ( (lv_name_7_0= RULE_ID ) ) )
                    // InternalSoftgallery.g:3437:4: otherlv_6= 'AmazonService' ( (lv_name_7_0= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,75,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getNTiersRelationsAccess().getAmazonServiceKeyword_3_0());
                    			
                    // InternalSoftgallery.g:3441:4: ( (lv_name_7_0= RULE_ID ) )
                    // InternalSoftgallery.g:3442:5: (lv_name_7_0= RULE_ID )
                    {
                    // InternalSoftgallery.g:3442:5: (lv_name_7_0= RULE_ID )
                    // InternalSoftgallery.g:3443:6: lv_name_7_0= RULE_ID
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
    // InternalSoftgallery.g:3464:1: entryRuleTechnology returns [EObject current=null] : iv_ruleTechnology= ruleTechnology EOF ;
    public final EObject entryRuleTechnology() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTechnology = null;


        try {
            // InternalSoftgallery.g:3464:51: (iv_ruleTechnology= ruleTechnology EOF )
            // InternalSoftgallery.g:3465:2: iv_ruleTechnology= ruleTechnology EOF
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
    // InternalSoftgallery.g:3471:1: ruleTechnology returns [EObject current=null] : (otherlv_0= 'Technology' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleTechnologies ) ) otherlv_5= '}' ) ;
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
            // InternalSoftgallery.g:3477:2: ( (otherlv_0= 'Technology' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleTechnologies ) ) otherlv_5= '}' ) )
            // InternalSoftgallery.g:3478:2: (otherlv_0= 'Technology' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleTechnologies ) ) otherlv_5= '}' )
            {
            // InternalSoftgallery.g:3478:2: (otherlv_0= 'Technology' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleTechnologies ) ) otherlv_5= '}' )
            // InternalSoftgallery.g:3479:3: otherlv_0= 'Technology' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleTechnologies ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,76,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getTechnologyAccess().getTechnologyKeyword_0());
            		
            // InternalSoftgallery.g:3483:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:3484:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:3484:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:3485:5: lv_name_1_0= RULE_ID
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
            		
            otherlv_3=(Token)match(input,13,FOLLOW_75); 

            			newLeafNode(otherlv_3, grammarAccess.getTechnologyAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSoftgallery.g:3509:3: ( (lv_elements_4_0= ruleTechnologies ) )
            // InternalSoftgallery.g:3510:4: (lv_elements_4_0= ruleTechnologies )
            {
            // InternalSoftgallery.g:3510:4: (lv_elements_4_0= ruleTechnologies )
            // InternalSoftgallery.g:3511:5: lv_elements_4_0= ruleTechnologies
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
            						"co.unal.photos.Softgallery.Technologies");
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
    // InternalSoftgallery.g:3536:1: entryRuleTechnologies returns [EObject current=null] : iv_ruleTechnologies= ruleTechnologies EOF ;
    public final EObject entryRuleTechnologies() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTechnologies = null;


        try {
            // InternalSoftgallery.g:3536:53: (iv_ruleTechnologies= ruleTechnologies EOF )
            // InternalSoftgallery.g:3537:2: iv_ruleTechnologies= ruleTechnologies EOF
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
    // InternalSoftgallery.g:3543:1: ruleTechnologies returns [EObject current=null] : ( ( (lv_factors_0_0= ruleSpring ) ) ( (lv_factors_1_0= ruleReact ) ) ( (lv_factors_2_0= rulePostgreSQL ) ) ( (lv_factors_3_0= ruleAmazonWebServices ) ) ) ;
    public final EObject ruleTechnologies() throws RecognitionException {
        EObject current = null;

        EObject lv_factors_0_0 = null;

        EObject lv_factors_1_0 = null;

        EObject lv_factors_2_0 = null;

        EObject lv_factors_3_0 = null;



        	enterRule();

        try {
            // InternalSoftgallery.g:3549:2: ( ( ( (lv_factors_0_0= ruleSpring ) ) ( (lv_factors_1_0= ruleReact ) ) ( (lv_factors_2_0= rulePostgreSQL ) ) ( (lv_factors_3_0= ruleAmazonWebServices ) ) ) )
            // InternalSoftgallery.g:3550:2: ( ( (lv_factors_0_0= ruleSpring ) ) ( (lv_factors_1_0= ruleReact ) ) ( (lv_factors_2_0= rulePostgreSQL ) ) ( (lv_factors_3_0= ruleAmazonWebServices ) ) )
            {
            // InternalSoftgallery.g:3550:2: ( ( (lv_factors_0_0= ruleSpring ) ) ( (lv_factors_1_0= ruleReact ) ) ( (lv_factors_2_0= rulePostgreSQL ) ) ( (lv_factors_3_0= ruleAmazonWebServices ) ) )
            // InternalSoftgallery.g:3551:3: ( (lv_factors_0_0= ruleSpring ) ) ( (lv_factors_1_0= ruleReact ) ) ( (lv_factors_2_0= rulePostgreSQL ) ) ( (lv_factors_3_0= ruleAmazonWebServices ) )
            {
            // InternalSoftgallery.g:3551:3: ( (lv_factors_0_0= ruleSpring ) )
            // InternalSoftgallery.g:3552:4: (lv_factors_0_0= ruleSpring )
            {
            // InternalSoftgallery.g:3552:4: (lv_factors_0_0= ruleSpring )
            // InternalSoftgallery.g:3553:5: lv_factors_0_0= ruleSpring
            {

            					newCompositeNode(grammarAccess.getTechnologiesAccess().getFactorsSpringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_76);
            lv_factors_0_0=ruleSpring();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTechnologiesRule());
            					}
            					add(
            						current,
            						"factors",
            						lv_factors_0_0,
            						"co.unal.photos.Softgallery.Spring");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftgallery.g:3570:3: ( (lv_factors_1_0= ruleReact ) )
            // InternalSoftgallery.g:3571:4: (lv_factors_1_0= ruleReact )
            {
            // InternalSoftgallery.g:3571:4: (lv_factors_1_0= ruleReact )
            // InternalSoftgallery.g:3572:5: lv_factors_1_0= ruleReact
            {

            					newCompositeNode(grammarAccess.getTechnologiesAccess().getFactorsReactParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_77);
            lv_factors_1_0=ruleReact();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTechnologiesRule());
            					}
            					add(
            						current,
            						"factors",
            						lv_factors_1_0,
            						"co.unal.photos.Softgallery.React");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftgallery.g:3589:3: ( (lv_factors_2_0= rulePostgreSQL ) )
            // InternalSoftgallery.g:3590:4: (lv_factors_2_0= rulePostgreSQL )
            {
            // InternalSoftgallery.g:3590:4: (lv_factors_2_0= rulePostgreSQL )
            // InternalSoftgallery.g:3591:5: lv_factors_2_0= rulePostgreSQL
            {

            					newCompositeNode(grammarAccess.getTechnologiesAccess().getFactorsPostgreSQLParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_78);
            lv_factors_2_0=rulePostgreSQL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTechnologiesRule());
            					}
            					add(
            						current,
            						"factors",
            						lv_factors_2_0,
            						"co.unal.photos.Softgallery.PostgreSQL");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftgallery.g:3608:3: ( (lv_factors_3_0= ruleAmazonWebServices ) )
            // InternalSoftgallery.g:3609:4: (lv_factors_3_0= ruleAmazonWebServices )
            {
            // InternalSoftgallery.g:3609:4: (lv_factors_3_0= ruleAmazonWebServices )
            // InternalSoftgallery.g:3610:5: lv_factors_3_0= ruleAmazonWebServices
            {

            					newCompositeNode(grammarAccess.getTechnologiesAccess().getFactorsAmazonWebServicesParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_factors_3_0=ruleAmazonWebServices();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTechnologiesRule());
            					}
            					add(
            						current,
            						"factors",
            						lv_factors_3_0,
            						"co.unal.photos.Softgallery.AmazonWebServices");
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
    // InternalSoftgallery.g:3631:1: entryRuleSpring returns [EObject current=null] : iv_ruleSpring= ruleSpring EOF ;
    public final EObject entryRuleSpring() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpring = null;


        try {
            // InternalSoftgallery.g:3631:47: (iv_ruleSpring= ruleSpring EOF )
            // InternalSoftgallery.g:3632:2: iv_ruleSpring= ruleSpring EOF
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
    // InternalSoftgallery.g:3638:1: ruleSpring returns [EObject current=null] : (otherlv_0= 'Spring' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleSpringBootApplication ) ) otherlv_5= '}' ) ;
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
            // InternalSoftgallery.g:3644:2: ( (otherlv_0= 'Spring' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleSpringBootApplication ) ) otherlv_5= '}' ) )
            // InternalSoftgallery.g:3645:2: (otherlv_0= 'Spring' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleSpringBootApplication ) ) otherlv_5= '}' )
            {
            // InternalSoftgallery.g:3645:2: (otherlv_0= 'Spring' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleSpringBootApplication ) ) otherlv_5= '}' )
            // InternalSoftgallery.g:3646:3: otherlv_0= 'Spring' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleSpringBootApplication ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,77,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getSpringAccess().getSpringKeyword_0());
            		
            // InternalSoftgallery.g:3650:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:3651:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:3651:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:3652:5: lv_name_1_0= RULE_ID
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
            		
            otherlv_3=(Token)match(input,13,FOLLOW_79); 

            			newLeafNode(otherlv_3, grammarAccess.getSpringAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSoftgallery.g:3676:3: ( (lv_elements_4_0= ruleSpringBootApplication ) )
            // InternalSoftgallery.g:3677:4: (lv_elements_4_0= ruleSpringBootApplication )
            {
            // InternalSoftgallery.g:3677:4: (lv_elements_4_0= ruleSpringBootApplication )
            // InternalSoftgallery.g:3678:5: lv_elements_4_0= ruleSpringBootApplication
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
            						"co.unal.photos.Softgallery.SpringBootApplication");
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
    // InternalSoftgallery.g:3703:1: entryRuleSpringBootApplication returns [EObject current=null] : iv_ruleSpringBootApplication= ruleSpringBootApplication EOF ;
    public final EObject entryRuleSpringBootApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpringBootApplication = null;


        try {
            // InternalSoftgallery.g:3703:62: (iv_ruleSpringBootApplication= ruleSpringBootApplication EOF )
            // InternalSoftgallery.g:3704:2: iv_ruleSpringBootApplication= ruleSpringBootApplication EOF
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
    // InternalSoftgallery.g:3710:1: ruleSpringBootApplication returns [EObject current=null] : (otherlv_0= 'SpringBootApplication' ( (lv_elements_1_0= ruleConfiguration ) ) ( (lv_elements_2_0= ruleSpringComponent ) )+ ( (lv_elements_3_0= ruleSpringRepository ) )+ ( (lv_elements_4_0= ruleRestController ) )+ ( (lv_elements_5_0= ruleSpringEntity ) )+ ) ;
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
            // InternalSoftgallery.g:3716:2: ( (otherlv_0= 'SpringBootApplication' ( (lv_elements_1_0= ruleConfiguration ) ) ( (lv_elements_2_0= ruleSpringComponent ) )+ ( (lv_elements_3_0= ruleSpringRepository ) )+ ( (lv_elements_4_0= ruleRestController ) )+ ( (lv_elements_5_0= ruleSpringEntity ) )+ ) )
            // InternalSoftgallery.g:3717:2: (otherlv_0= 'SpringBootApplication' ( (lv_elements_1_0= ruleConfiguration ) ) ( (lv_elements_2_0= ruleSpringComponent ) )+ ( (lv_elements_3_0= ruleSpringRepository ) )+ ( (lv_elements_4_0= ruleRestController ) )+ ( (lv_elements_5_0= ruleSpringEntity ) )+ )
            {
            // InternalSoftgallery.g:3717:2: (otherlv_0= 'SpringBootApplication' ( (lv_elements_1_0= ruleConfiguration ) ) ( (lv_elements_2_0= ruleSpringComponent ) )+ ( (lv_elements_3_0= ruleSpringRepository ) )+ ( (lv_elements_4_0= ruleRestController ) )+ ( (lv_elements_5_0= ruleSpringEntity ) )+ )
            // InternalSoftgallery.g:3718:3: otherlv_0= 'SpringBootApplication' ( (lv_elements_1_0= ruleConfiguration ) ) ( (lv_elements_2_0= ruleSpringComponent ) )+ ( (lv_elements_3_0= ruleSpringRepository ) )+ ( (lv_elements_4_0= ruleRestController ) )+ ( (lv_elements_5_0= ruleSpringEntity ) )+
            {
            otherlv_0=(Token)match(input,78,FOLLOW_80); 

            			newLeafNode(otherlv_0, grammarAccess.getSpringBootApplicationAccess().getSpringBootApplicationKeyword_0());
            		
            // InternalSoftgallery.g:3722:3: ( (lv_elements_1_0= ruleConfiguration ) )
            // InternalSoftgallery.g:3723:4: (lv_elements_1_0= ruleConfiguration )
            {
            // InternalSoftgallery.g:3723:4: (lv_elements_1_0= ruleConfiguration )
            // InternalSoftgallery.g:3724:5: lv_elements_1_0= ruleConfiguration
            {

            					newCompositeNode(grammarAccess.getSpringBootApplicationAccess().getElementsConfigurationParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_81);
            lv_elements_1_0=ruleConfiguration();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSpringBootApplicationRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_1_0,
            						"co.unal.photos.Softgallery.Configuration");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftgallery.g:3741:3: ( (lv_elements_2_0= ruleSpringComponent ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==84) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalSoftgallery.g:3742:4: (lv_elements_2_0= ruleSpringComponent )
            	    {
            	    // InternalSoftgallery.g:3742:4: (lv_elements_2_0= ruleSpringComponent )
            	    // InternalSoftgallery.g:3743:5: lv_elements_2_0= ruleSpringComponent
            	    {

            	    					newCompositeNode(grammarAccess.getSpringBootApplicationAccess().getElementsSpringComponentParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_82);
            	    lv_elements_2_0=ruleSpringComponent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSpringBootApplicationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_2_0,
            	    						"co.unal.photos.Softgallery.SpringComponent");
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

            // InternalSoftgallery.g:3760:3: ( (lv_elements_3_0= ruleSpringRepository ) )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==86) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalSoftgallery.g:3761:4: (lv_elements_3_0= ruleSpringRepository )
            	    {
            	    // InternalSoftgallery.g:3761:4: (lv_elements_3_0= ruleSpringRepository )
            	    // InternalSoftgallery.g:3762:5: lv_elements_3_0= ruleSpringRepository
            	    {

            	    					newCompositeNode(grammarAccess.getSpringBootApplicationAccess().getElementsSpringRepositoryParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_83);
            	    lv_elements_3_0=ruleSpringRepository();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSpringBootApplicationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_3_0,
            	    						"co.unal.photos.Softgallery.SpringRepository");
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

            // InternalSoftgallery.g:3779:3: ( (lv_elements_4_0= ruleRestController ) )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==88) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalSoftgallery.g:3780:4: (lv_elements_4_0= ruleRestController )
            	    {
            	    // InternalSoftgallery.g:3780:4: (lv_elements_4_0= ruleRestController )
            	    // InternalSoftgallery.g:3781:5: lv_elements_4_0= ruleRestController
            	    {

            	    					newCompositeNode(grammarAccess.getSpringBootApplicationAccess().getElementsRestControllerParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_84);
            	    lv_elements_4_0=ruleRestController();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSpringBootApplicationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_4_0,
            	    						"co.unal.photos.Softgallery.RestController");
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

            // InternalSoftgallery.g:3798:3: ( (lv_elements_5_0= ruleSpringEntity ) )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==103) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalSoftgallery.g:3799:4: (lv_elements_5_0= ruleSpringEntity )
            	    {
            	    // InternalSoftgallery.g:3799:4: (lv_elements_5_0= ruleSpringEntity )
            	    // InternalSoftgallery.g:3800:5: lv_elements_5_0= ruleSpringEntity
            	    {

            	    					newCompositeNode(grammarAccess.getSpringBootApplicationAccess().getElementsSpringEntityParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_85);
            	    lv_elements_5_0=ruleSpringEntity();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSpringBootApplicationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_5_0,
            	    						"co.unal.photos.Softgallery.SpringEntity");
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
    // InternalSoftgallery.g:3821:1: entryRuleConfiguration returns [EObject current=null] : iv_ruleConfiguration= ruleConfiguration EOF ;
    public final EObject entryRuleConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfiguration = null;


        try {
            // InternalSoftgallery.g:3821:54: (iv_ruleConfiguration= ruleConfiguration EOF )
            // InternalSoftgallery.g:3822:2: iv_ruleConfiguration= ruleConfiguration EOF
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
    // InternalSoftgallery.g:3828:1: ruleConfiguration returns [EObject current=null] : (otherlv_0= 'Configuration' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleEnableGlobalMethodSecurity ) ) ( (lv_elements_4_0= ruleEnableAuthorizationServer ) ) ( (lv_elements_5_0= ruleEnableResourceServer ) ) ( (lv_elements_6_0= ruleEnableWebSecurity ) ) otherlv_7= '}' ) ;
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
            // InternalSoftgallery.g:3834:2: ( (otherlv_0= 'Configuration' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleEnableGlobalMethodSecurity ) ) ( (lv_elements_4_0= ruleEnableAuthorizationServer ) ) ( (lv_elements_5_0= ruleEnableResourceServer ) ) ( (lv_elements_6_0= ruleEnableWebSecurity ) ) otherlv_7= '}' ) )
            // InternalSoftgallery.g:3835:2: (otherlv_0= 'Configuration' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleEnableGlobalMethodSecurity ) ) ( (lv_elements_4_0= ruleEnableAuthorizationServer ) ) ( (lv_elements_5_0= ruleEnableResourceServer ) ) ( (lv_elements_6_0= ruleEnableWebSecurity ) ) otherlv_7= '}' )
            {
            // InternalSoftgallery.g:3835:2: (otherlv_0= 'Configuration' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleEnableGlobalMethodSecurity ) ) ( (lv_elements_4_0= ruleEnableAuthorizationServer ) ) ( (lv_elements_5_0= ruleEnableResourceServer ) ) ( (lv_elements_6_0= ruleEnableWebSecurity ) ) otherlv_7= '}' )
            // InternalSoftgallery.g:3836:3: otherlv_0= 'Configuration' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleEnableGlobalMethodSecurity ) ) ( (lv_elements_4_0= ruleEnableAuthorizationServer ) ) ( (lv_elements_5_0= ruleEnableResourceServer ) ) ( (lv_elements_6_0= ruleEnableWebSecurity ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,79,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getConfigurationAccess().getConfigurationKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getConfigurationAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_86); 

            			newLeafNode(otherlv_2, grammarAccess.getConfigurationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSoftgallery.g:3848:3: ( (lv_elements_3_0= ruleEnableGlobalMethodSecurity ) )
            // InternalSoftgallery.g:3849:4: (lv_elements_3_0= ruleEnableGlobalMethodSecurity )
            {
            // InternalSoftgallery.g:3849:4: (lv_elements_3_0= ruleEnableGlobalMethodSecurity )
            // InternalSoftgallery.g:3850:5: lv_elements_3_0= ruleEnableGlobalMethodSecurity
            {

            					newCompositeNode(grammarAccess.getConfigurationAccess().getElementsEnableGlobalMethodSecurityParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_87);
            lv_elements_3_0=ruleEnableGlobalMethodSecurity();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConfigurationRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_3_0,
            						"co.unal.photos.Softgallery.EnableGlobalMethodSecurity");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftgallery.g:3867:3: ( (lv_elements_4_0= ruleEnableAuthorizationServer ) )
            // InternalSoftgallery.g:3868:4: (lv_elements_4_0= ruleEnableAuthorizationServer )
            {
            // InternalSoftgallery.g:3868:4: (lv_elements_4_0= ruleEnableAuthorizationServer )
            // InternalSoftgallery.g:3869:5: lv_elements_4_0= ruleEnableAuthorizationServer
            {

            					newCompositeNode(grammarAccess.getConfigurationAccess().getElementsEnableAuthorizationServerParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_88);
            lv_elements_4_0=ruleEnableAuthorizationServer();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConfigurationRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_4_0,
            						"co.unal.photos.Softgallery.EnableAuthorizationServer");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftgallery.g:3886:3: ( (lv_elements_5_0= ruleEnableResourceServer ) )
            // InternalSoftgallery.g:3887:4: (lv_elements_5_0= ruleEnableResourceServer )
            {
            // InternalSoftgallery.g:3887:4: (lv_elements_5_0= ruleEnableResourceServer )
            // InternalSoftgallery.g:3888:5: lv_elements_5_0= ruleEnableResourceServer
            {

            					newCompositeNode(grammarAccess.getConfigurationAccess().getElementsEnableResourceServerParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_89);
            lv_elements_5_0=ruleEnableResourceServer();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConfigurationRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_5_0,
            						"co.unal.photos.Softgallery.EnableResourceServer");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftgallery.g:3905:3: ( (lv_elements_6_0= ruleEnableWebSecurity ) )
            // InternalSoftgallery.g:3906:4: (lv_elements_6_0= ruleEnableWebSecurity )
            {
            // InternalSoftgallery.g:3906:4: (lv_elements_6_0= ruleEnableWebSecurity )
            // InternalSoftgallery.g:3907:5: lv_elements_6_0= ruleEnableWebSecurity
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
            						"co.unal.photos.Softgallery.EnableWebSecurity");
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
    // InternalSoftgallery.g:3932:1: entryRuleEnableGlobalMethodSecurity returns [EObject current=null] : iv_ruleEnableGlobalMethodSecurity= ruleEnableGlobalMethodSecurity EOF ;
    public final EObject entryRuleEnableGlobalMethodSecurity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnableGlobalMethodSecurity = null;


        try {
            // InternalSoftgallery.g:3932:67: (iv_ruleEnableGlobalMethodSecurity= ruleEnableGlobalMethodSecurity EOF )
            // InternalSoftgallery.g:3933:2: iv_ruleEnableGlobalMethodSecurity= ruleEnableGlobalMethodSecurity EOF
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
    // InternalSoftgallery.g:3939:1: ruleEnableGlobalMethodSecurity returns [EObject current=null] : (otherlv_0= 'EnableGlobalMethodSecurity' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEnableGlobalMethodSecurity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftgallery.g:3945:2: ( (otherlv_0= 'EnableGlobalMethodSecurity' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftgallery.g:3946:2: (otherlv_0= 'EnableGlobalMethodSecurity' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftgallery.g:3946:2: (otherlv_0= 'EnableGlobalMethodSecurity' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftgallery.g:3947:3: otherlv_0= 'EnableGlobalMethodSecurity' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,80,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getEnableGlobalMethodSecurityAccess().getEnableGlobalMethodSecurityKeyword_0());
            		
            // InternalSoftgallery.g:3951:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:3952:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:3952:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:3953:5: lv_name_1_0= RULE_ID
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
    // InternalSoftgallery.g:3973:1: entryRuleEnableAuthorizationServer returns [EObject current=null] : iv_ruleEnableAuthorizationServer= ruleEnableAuthorizationServer EOF ;
    public final EObject entryRuleEnableAuthorizationServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnableAuthorizationServer = null;


        try {
            // InternalSoftgallery.g:3973:66: (iv_ruleEnableAuthorizationServer= ruleEnableAuthorizationServer EOF )
            // InternalSoftgallery.g:3974:2: iv_ruleEnableAuthorizationServer= ruleEnableAuthorizationServer EOF
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
    // InternalSoftgallery.g:3980:1: ruleEnableAuthorizationServer returns [EObject current=null] : (otherlv_0= 'EnableAuthorizationServer' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEnableAuthorizationServer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftgallery.g:3986:2: ( (otherlv_0= 'EnableAuthorizationServer' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftgallery.g:3987:2: (otherlv_0= 'EnableAuthorizationServer' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftgallery.g:3987:2: (otherlv_0= 'EnableAuthorizationServer' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftgallery.g:3988:3: otherlv_0= 'EnableAuthorizationServer' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,81,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getEnableAuthorizationServerAccess().getEnableAuthorizationServerKeyword_0());
            		
            // InternalSoftgallery.g:3992:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:3993:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:3993:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:3994:5: lv_name_1_0= RULE_ID
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
    // InternalSoftgallery.g:4014:1: entryRuleEnableResourceServer returns [EObject current=null] : iv_ruleEnableResourceServer= ruleEnableResourceServer EOF ;
    public final EObject entryRuleEnableResourceServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnableResourceServer = null;


        try {
            // InternalSoftgallery.g:4014:61: (iv_ruleEnableResourceServer= ruleEnableResourceServer EOF )
            // InternalSoftgallery.g:4015:2: iv_ruleEnableResourceServer= ruleEnableResourceServer EOF
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
    // InternalSoftgallery.g:4021:1: ruleEnableResourceServer returns [EObject current=null] : (otherlv_0= 'EnableResourceServer' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEnableResourceServer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftgallery.g:4027:2: ( (otherlv_0= 'EnableResourceServer' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftgallery.g:4028:2: (otherlv_0= 'EnableResourceServer' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftgallery.g:4028:2: (otherlv_0= 'EnableResourceServer' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftgallery.g:4029:3: otherlv_0= 'EnableResourceServer' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,82,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getEnableResourceServerAccess().getEnableResourceServerKeyword_0());
            		
            // InternalSoftgallery.g:4033:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:4034:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:4034:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:4035:5: lv_name_1_0= RULE_ID
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
    // InternalSoftgallery.g:4055:1: entryRuleEnableWebSecurity returns [EObject current=null] : iv_ruleEnableWebSecurity= ruleEnableWebSecurity EOF ;
    public final EObject entryRuleEnableWebSecurity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnableWebSecurity = null;


        try {
            // InternalSoftgallery.g:4055:58: (iv_ruleEnableWebSecurity= ruleEnableWebSecurity EOF )
            // InternalSoftgallery.g:4056:2: iv_ruleEnableWebSecurity= ruleEnableWebSecurity EOF
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
    // InternalSoftgallery.g:4062:1: ruleEnableWebSecurity returns [EObject current=null] : (otherlv_0= 'EnableWebSecurity' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEnableWebSecurity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftgallery.g:4068:2: ( (otherlv_0= 'EnableWebSecurity' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftgallery.g:4069:2: (otherlv_0= 'EnableWebSecurity' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftgallery.g:4069:2: (otherlv_0= 'EnableWebSecurity' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftgallery.g:4070:3: otherlv_0= 'EnableWebSecurity' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,83,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getEnableWebSecurityAccess().getEnableWebSecurityKeyword_0());
            		
            // InternalSoftgallery.g:4074:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:4075:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:4075:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:4076:5: lv_name_1_0= RULE_ID
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
    // InternalSoftgallery.g:4096:1: entryRuleSpringComponent returns [EObject current=null] : iv_ruleSpringComponent= ruleSpringComponent EOF ;
    public final EObject entryRuleSpringComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpringComponent = null;


        try {
            // InternalSoftgallery.g:4096:56: (iv_ruleSpringComponent= ruleSpringComponent EOF )
            // InternalSoftgallery.g:4097:2: iv_ruleSpringComponent= ruleSpringComponent EOF
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
    // InternalSoftgallery.g:4103:1: ruleSpringComponent returns [EObject current=null] : (otherlv_0= 'SpringComponent' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleOrderSpring ) ) otherlv_4= '}' ) ;
    public final EObject ruleSpringComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalSoftgallery.g:4109:2: ( (otherlv_0= 'SpringComponent' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleOrderSpring ) ) otherlv_4= '}' ) )
            // InternalSoftgallery.g:4110:2: (otherlv_0= 'SpringComponent' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleOrderSpring ) ) otherlv_4= '}' )
            {
            // InternalSoftgallery.g:4110:2: (otherlv_0= 'SpringComponent' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleOrderSpring ) ) otherlv_4= '}' )
            // InternalSoftgallery.g:4111:3: otherlv_0= 'SpringComponent' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleOrderSpring ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,84,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSpringComponentAccess().getSpringComponentKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSpringComponentAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_90); 

            			newLeafNode(otherlv_2, grammarAccess.getSpringComponentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSoftgallery.g:4123:3: ( (lv_elements_3_0= ruleOrderSpring ) )
            // InternalSoftgallery.g:4124:4: (lv_elements_3_0= ruleOrderSpring )
            {
            // InternalSoftgallery.g:4124:4: (lv_elements_3_0= ruleOrderSpring )
            // InternalSoftgallery.g:4125:5: lv_elements_3_0= ruleOrderSpring
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
            						"co.unal.photos.Softgallery.OrderSpring");
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
    // InternalSoftgallery.g:4150:1: entryRuleOrderSpring returns [EObject current=null] : iv_ruleOrderSpring= ruleOrderSpring EOF ;
    public final EObject entryRuleOrderSpring() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderSpring = null;


        try {
            // InternalSoftgallery.g:4150:52: (iv_ruleOrderSpring= ruleOrderSpring EOF )
            // InternalSoftgallery.g:4151:2: iv_ruleOrderSpring= ruleOrderSpring EOF
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
    // InternalSoftgallery.g:4157:1: ruleOrderSpring returns [EObject current=null] : (otherlv_0= 'OrderSpring' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleOrderSpring() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftgallery.g:4163:2: ( (otherlv_0= 'OrderSpring' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftgallery.g:4164:2: (otherlv_0= 'OrderSpring' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftgallery.g:4164:2: (otherlv_0= 'OrderSpring' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftgallery.g:4165:3: otherlv_0= 'OrderSpring' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,85,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getOrderSpringAccess().getOrderSpringKeyword_0());
            		
            // InternalSoftgallery.g:4169:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:4170:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:4170:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:4171:5: lv_name_1_0= RULE_ID
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
    // InternalSoftgallery.g:4191:1: entryRuleSpringRepository returns [EObject current=null] : iv_ruleSpringRepository= ruleSpringRepository EOF ;
    public final EObject entryRuleSpringRepository() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpringRepository = null;


        try {
            // InternalSoftgallery.g:4191:57: (iv_ruleSpringRepository= ruleSpringRepository EOF )
            // InternalSoftgallery.g:4192:2: iv_ruleSpringRepository= ruleSpringRepository EOF
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
    // InternalSoftgallery.g:4198:1: ruleSpringRepository returns [EObject current=null] : (otherlv_0= 'SpringRepositories' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleSpringRepositories ) )+ otherlv_4= '}' ) ;
    public final EObject ruleSpringRepository() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalSoftgallery.g:4204:2: ( (otherlv_0= 'SpringRepositories' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleSpringRepositories ) )+ otherlv_4= '}' ) )
            // InternalSoftgallery.g:4205:2: (otherlv_0= 'SpringRepositories' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleSpringRepositories ) )+ otherlv_4= '}' )
            {
            // InternalSoftgallery.g:4205:2: (otherlv_0= 'SpringRepositories' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleSpringRepositories ) )+ otherlv_4= '}' )
            // InternalSoftgallery.g:4206:3: otherlv_0= 'SpringRepositories' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleSpringRepositories ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,86,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSpringRepositoryAccess().getSpringRepositoriesKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSpringRepositoryAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_91); 

            			newLeafNode(otherlv_2, grammarAccess.getSpringRepositoryAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSoftgallery.g:4218:3: ( (lv_elements_3_0= ruleSpringRepositories ) )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==87) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalSoftgallery.g:4219:4: (lv_elements_3_0= ruleSpringRepositories )
            	    {
            	    // InternalSoftgallery.g:4219:4: (lv_elements_3_0= ruleSpringRepositories )
            	    // InternalSoftgallery.g:4220:5: lv_elements_3_0= ruleSpringRepositories
            	    {

            	    					newCompositeNode(grammarAccess.getSpringRepositoryAccess().getElementsSpringRepositoriesParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_92);
            	    lv_elements_3_0=ruleSpringRepositories();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSpringRepositoryRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_3_0,
            	    						"co.unal.photos.Softgallery.SpringRepositories");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
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
    // InternalSoftgallery.g:4245:1: entryRuleSpringRepositories returns [EObject current=null] : iv_ruleSpringRepositories= ruleSpringRepositories EOF ;
    public final EObject entryRuleSpringRepositories() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpringRepositories = null;


        try {
            // InternalSoftgallery.g:4245:59: (iv_ruleSpringRepositories= ruleSpringRepositories EOF )
            // InternalSoftgallery.g:4246:2: iv_ruleSpringRepositories= ruleSpringRepositories EOF
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
    // InternalSoftgallery.g:4252:1: ruleSpringRepositories returns [EObject current=null] : (otherlv_0= 'SpringRepository' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleSpringRepositories() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftgallery.g:4258:2: ( (otherlv_0= 'SpringRepository' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftgallery.g:4259:2: (otherlv_0= 'SpringRepository' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftgallery.g:4259:2: (otherlv_0= 'SpringRepository' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftgallery.g:4260:3: otherlv_0= 'SpringRepository' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,87,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getSpringRepositoriesAccess().getSpringRepositoryKeyword_0());
            		
            // InternalSoftgallery.g:4264:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:4265:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:4265:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:4266:5: lv_name_1_0= RULE_ID
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
    // InternalSoftgallery.g:4286:1: entryRuleRestController returns [EObject current=null] : iv_ruleRestController= ruleRestController EOF ;
    public final EObject entryRuleRestController() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestController = null;


        try {
            // InternalSoftgallery.g:4286:55: (iv_ruleRestController= ruleRestController EOF )
            // InternalSoftgallery.g:4287:2: iv_ruleRestController= ruleRestController EOF
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
    // InternalSoftgallery.g:4293:1: ruleRestController returns [EObject current=null] : (otherlv_0= 'RestController' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleSpecification ) ) ( (lv_elements_5_0= ruleAutowired ) )+ ( (lv_elements_6_0= ruleRequestMapping ) )+ ( (lv_elements_7_0= ruleExceptionHandler ) ) otherlv_8= '}' ) ;
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
            // InternalSoftgallery.g:4299:2: ( (otherlv_0= 'RestController' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleSpecification ) ) ( (lv_elements_5_0= ruleAutowired ) )+ ( (lv_elements_6_0= ruleRequestMapping ) )+ ( (lv_elements_7_0= ruleExceptionHandler ) ) otherlv_8= '}' ) )
            // InternalSoftgallery.g:4300:2: (otherlv_0= 'RestController' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleSpecification ) ) ( (lv_elements_5_0= ruleAutowired ) )+ ( (lv_elements_6_0= ruleRequestMapping ) )+ ( (lv_elements_7_0= ruleExceptionHandler ) ) otherlv_8= '}' )
            {
            // InternalSoftgallery.g:4300:2: (otherlv_0= 'RestController' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleSpecification ) ) ( (lv_elements_5_0= ruleAutowired ) )+ ( (lv_elements_6_0= ruleRequestMapping ) )+ ( (lv_elements_7_0= ruleExceptionHandler ) ) otherlv_8= '}' )
            // InternalSoftgallery.g:4301:3: otherlv_0= 'RestController' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleSpecification ) ) ( (lv_elements_5_0= ruleAutowired ) )+ ( (lv_elements_6_0= ruleRequestMapping ) )+ ( (lv_elements_7_0= ruleExceptionHandler ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,88,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getRestControllerAccess().getRestControllerKeyword_0());
            		
            // InternalSoftgallery.g:4305:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:4306:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:4306:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:4307:5: lv_name_1_0= RULE_ID
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
            		
            otherlv_3=(Token)match(input,13,FOLLOW_93); 

            			newLeafNode(otherlv_3, grammarAccess.getRestControllerAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSoftgallery.g:4331:3: ( (lv_elements_4_0= ruleSpecification ) )
            // InternalSoftgallery.g:4332:4: (lv_elements_4_0= ruleSpecification )
            {
            // InternalSoftgallery.g:4332:4: (lv_elements_4_0= ruleSpecification )
            // InternalSoftgallery.g:4333:5: lv_elements_4_0= ruleSpecification
            {

            					newCompositeNode(grammarAccess.getRestControllerAccess().getElementsSpecificationParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_94);
            lv_elements_4_0=ruleSpecification();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRestControllerRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_4_0,
            						"co.unal.photos.Softgallery.Specification");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftgallery.g:4350:3: ( (lv_elements_5_0= ruleAutowired ) )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==92) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalSoftgallery.g:4351:4: (lv_elements_5_0= ruleAutowired )
            	    {
            	    // InternalSoftgallery.g:4351:4: (lv_elements_5_0= ruleAutowired )
            	    // InternalSoftgallery.g:4352:5: lv_elements_5_0= ruleAutowired
            	    {

            	    					newCompositeNode(grammarAccess.getRestControllerAccess().getElementsAutowiredParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_95);
            	    lv_elements_5_0=ruleAutowired();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRestControllerRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_5_0,
            	    						"co.unal.photos.Softgallery.Autowired");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);

            // InternalSoftgallery.g:4369:3: ( (lv_elements_6_0= ruleRequestMapping ) )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==94) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalSoftgallery.g:4370:4: (lv_elements_6_0= ruleRequestMapping )
            	    {
            	    // InternalSoftgallery.g:4370:4: (lv_elements_6_0= ruleRequestMapping )
            	    // InternalSoftgallery.g:4371:5: lv_elements_6_0= ruleRequestMapping
            	    {

            	    					newCompositeNode(grammarAccess.getRestControllerAccess().getElementsRequestMappingParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_96);
            	    lv_elements_6_0=ruleRequestMapping();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRestControllerRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_6_0,
            	    						"co.unal.photos.Softgallery.RequestMapping");
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

            // InternalSoftgallery.g:4388:3: ( (lv_elements_7_0= ruleExceptionHandler ) )
            // InternalSoftgallery.g:4389:4: (lv_elements_7_0= ruleExceptionHandler )
            {
            // InternalSoftgallery.g:4389:4: (lv_elements_7_0= ruleExceptionHandler )
            // InternalSoftgallery.g:4390:5: lv_elements_7_0= ruleExceptionHandler
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
            						"co.unal.photos.Softgallery.ExceptionHandler");
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
    // InternalSoftgallery.g:4415:1: entryRuleSpecification returns [EObject current=null] : iv_ruleSpecification= ruleSpecification EOF ;
    public final EObject entryRuleSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecification = null;


        try {
            // InternalSoftgallery.g:4415:54: (iv_ruleSpecification= ruleSpecification EOF )
            // InternalSoftgallery.g:4416:2: iv_ruleSpecification= ruleSpecification EOF
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
    // InternalSoftgallery.g:4422:1: ruleSpecification returns [EObject current=null] : (otherlv_0= 'Specification' ( (lv_elements_1_0= rulePredicate ) )+ ( (lv_elements_2_0= ruleSearchCriteria ) ) ) ;
    public final EObject ruleSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_elements_1_0 = null;

        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalSoftgallery.g:4428:2: ( (otherlv_0= 'Specification' ( (lv_elements_1_0= rulePredicate ) )+ ( (lv_elements_2_0= ruleSearchCriteria ) ) ) )
            // InternalSoftgallery.g:4429:2: (otherlv_0= 'Specification' ( (lv_elements_1_0= rulePredicate ) )+ ( (lv_elements_2_0= ruleSearchCriteria ) ) )
            {
            // InternalSoftgallery.g:4429:2: (otherlv_0= 'Specification' ( (lv_elements_1_0= rulePredicate ) )+ ( (lv_elements_2_0= ruleSearchCriteria ) ) )
            // InternalSoftgallery.g:4430:3: otherlv_0= 'Specification' ( (lv_elements_1_0= rulePredicate ) )+ ( (lv_elements_2_0= ruleSearchCriteria ) )
            {
            otherlv_0=(Token)match(input,89,FOLLOW_97); 

            			newLeafNode(otherlv_0, grammarAccess.getSpecificationAccess().getSpecificationKeyword_0());
            		
            // InternalSoftgallery.g:4434:3: ( (lv_elements_1_0= rulePredicate ) )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==90) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalSoftgallery.g:4435:4: (lv_elements_1_0= rulePredicate )
            	    {
            	    // InternalSoftgallery.g:4435:4: (lv_elements_1_0= rulePredicate )
            	    // InternalSoftgallery.g:4436:5: lv_elements_1_0= rulePredicate
            	    {

            	    					newCompositeNode(grammarAccess.getSpecificationAccess().getElementsPredicateParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_98);
            	    lv_elements_1_0=rulePredicate();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSpecificationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_1_0,
            	    						"co.unal.photos.Softgallery.Predicate");
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

            // InternalSoftgallery.g:4453:3: ( (lv_elements_2_0= ruleSearchCriteria ) )
            // InternalSoftgallery.g:4454:4: (lv_elements_2_0= ruleSearchCriteria )
            {
            // InternalSoftgallery.g:4454:4: (lv_elements_2_0= ruleSearchCriteria )
            // InternalSoftgallery.g:4455:5: lv_elements_2_0= ruleSearchCriteria
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
            						"co.unal.photos.Softgallery.SearchCriteria");
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
    // InternalSoftgallery.g:4476:1: entryRulePredicate returns [EObject current=null] : iv_rulePredicate= rulePredicate EOF ;
    public final EObject entryRulePredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicate = null;


        try {
            // InternalSoftgallery.g:4476:50: (iv_rulePredicate= rulePredicate EOF )
            // InternalSoftgallery.g:4477:2: iv_rulePredicate= rulePredicate EOF
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
    // InternalSoftgallery.g:4483:1: rulePredicate returns [EObject current=null] : (otherlv_0= 'Predicate' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePredicate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftgallery.g:4489:2: ( (otherlv_0= 'Predicate' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftgallery.g:4490:2: (otherlv_0= 'Predicate' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftgallery.g:4490:2: (otherlv_0= 'Predicate' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftgallery.g:4491:3: otherlv_0= 'Predicate' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,90,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getPredicateAccess().getPredicateKeyword_0());
            		
            // InternalSoftgallery.g:4495:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:4496:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:4496:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:4497:5: lv_name_1_0= RULE_ID
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
    // InternalSoftgallery.g:4517:1: entryRuleSearchCriteria returns [EObject current=null] : iv_ruleSearchCriteria= ruleSearchCriteria EOF ;
    public final EObject entryRuleSearchCriteria() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSearchCriteria = null;


        try {
            // InternalSoftgallery.g:4517:55: (iv_ruleSearchCriteria= ruleSearchCriteria EOF )
            // InternalSoftgallery.g:4518:2: iv_ruleSearchCriteria= ruleSearchCriteria EOF
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
    // InternalSoftgallery.g:4524:1: ruleSearchCriteria returns [EObject current=null] : (otherlv_0= 'SearchCriteria' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleSearchCriteria() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftgallery.g:4530:2: ( (otherlv_0= 'SearchCriteria' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftgallery.g:4531:2: (otherlv_0= 'SearchCriteria' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftgallery.g:4531:2: (otherlv_0= 'SearchCriteria' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftgallery.g:4532:3: otherlv_0= 'SearchCriteria' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,91,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getSearchCriteriaAccess().getSearchCriteriaKeyword_0());
            		
            // InternalSoftgallery.g:4536:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:4537:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:4537:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:4538:5: lv_name_1_0= RULE_ID
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
    // InternalSoftgallery.g:4558:1: entryRuleAutowired returns [EObject current=null] : iv_ruleAutowired= ruleAutowired EOF ;
    public final EObject entryRuleAutowired() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAutowired = null;


        try {
            // InternalSoftgallery.g:4558:50: (iv_ruleAutowired= ruleAutowired EOF )
            // InternalSoftgallery.g:4559:2: iv_ruleAutowired= ruleAutowired EOF
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
    // InternalSoftgallery.g:4565:1: ruleAutowired returns [EObject current=null] : (otherlv_0= 'Autowired' ( (lv_elements_1_0= ruleAutowiredType ) ) ) ;
    public final EObject ruleAutowired() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_elements_1_0 = null;



        	enterRule();

        try {
            // InternalSoftgallery.g:4571:2: ( (otherlv_0= 'Autowired' ( (lv_elements_1_0= ruleAutowiredType ) ) ) )
            // InternalSoftgallery.g:4572:2: (otherlv_0= 'Autowired' ( (lv_elements_1_0= ruleAutowiredType ) ) )
            {
            // InternalSoftgallery.g:4572:2: (otherlv_0= 'Autowired' ( (lv_elements_1_0= ruleAutowiredType ) ) )
            // InternalSoftgallery.g:4573:3: otherlv_0= 'Autowired' ( (lv_elements_1_0= ruleAutowiredType ) )
            {
            otherlv_0=(Token)match(input,92,FOLLOW_99); 

            			newLeafNode(otherlv_0, grammarAccess.getAutowiredAccess().getAutowiredKeyword_0());
            		
            // InternalSoftgallery.g:4577:3: ( (lv_elements_1_0= ruleAutowiredType ) )
            // InternalSoftgallery.g:4578:4: (lv_elements_1_0= ruleAutowiredType )
            {
            // InternalSoftgallery.g:4578:4: (lv_elements_1_0= ruleAutowiredType )
            // InternalSoftgallery.g:4579:5: lv_elements_1_0= ruleAutowiredType
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
            						"co.unal.photos.Softgallery.AutowiredType");
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
    // InternalSoftgallery.g:4600:1: entryRuleAutowiredType returns [EObject current=null] : iv_ruleAutowiredType= ruleAutowiredType EOF ;
    public final EObject entryRuleAutowiredType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAutowiredType = null;


        try {
            // InternalSoftgallery.g:4600:54: (iv_ruleAutowiredType= ruleAutowiredType EOF )
            // InternalSoftgallery.g:4601:2: iv_ruleAutowiredType= ruleAutowiredType EOF
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
    // InternalSoftgallery.g:4607:1: ruleAutowiredType returns [EObject current=null] : (otherlv_0= 'AutowiredType' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAutowiredType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftgallery.g:4613:2: ( (otherlv_0= 'AutowiredType' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftgallery.g:4614:2: (otherlv_0= 'AutowiredType' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftgallery.g:4614:2: (otherlv_0= 'AutowiredType' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftgallery.g:4615:3: otherlv_0= 'AutowiredType' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,93,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getAutowiredTypeAccess().getAutowiredTypeKeyword_0());
            		
            // InternalSoftgallery.g:4619:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:4620:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:4620:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:4621:5: lv_name_1_0= RULE_ID
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
    // InternalSoftgallery.g:4641:1: entryRuleRequestMapping returns [EObject current=null] : iv_ruleRequestMapping= ruleRequestMapping EOF ;
    public final EObject entryRuleRequestMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequestMapping = null;


        try {
            // InternalSoftgallery.g:4641:55: (iv_ruleRequestMapping= ruleRequestMapping EOF )
            // InternalSoftgallery.g:4642:2: iv_ruleRequestMapping= ruleRequestMapping EOF
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
    // InternalSoftgallery.g:4648:1: ruleRequestMapping returns [EObject current=null] : (otherlv_0= 'RequestMapping' ( (lv_elements_1_0= ruleRequestPart ) )* ( (lv_elements_2_0= ruleRequestMappingType ) ) ) ;
    public final EObject ruleRequestMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_elements_1_0 = null;

        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalSoftgallery.g:4654:2: ( (otherlv_0= 'RequestMapping' ( (lv_elements_1_0= ruleRequestPart ) )* ( (lv_elements_2_0= ruleRequestMappingType ) ) ) )
            // InternalSoftgallery.g:4655:2: (otherlv_0= 'RequestMapping' ( (lv_elements_1_0= ruleRequestPart ) )* ( (lv_elements_2_0= ruleRequestMappingType ) ) )
            {
            // InternalSoftgallery.g:4655:2: (otherlv_0= 'RequestMapping' ( (lv_elements_1_0= ruleRequestPart ) )* ( (lv_elements_2_0= ruleRequestMappingType ) ) )
            // InternalSoftgallery.g:4656:3: otherlv_0= 'RequestMapping' ( (lv_elements_1_0= ruleRequestPart ) )* ( (lv_elements_2_0= ruleRequestMappingType ) )
            {
            otherlv_0=(Token)match(input,94,FOLLOW_100); 

            			newLeafNode(otherlv_0, grammarAccess.getRequestMappingAccess().getRequestMappingKeyword_0());
            		
            // InternalSoftgallery.g:4660:3: ( (lv_elements_1_0= ruleRequestPart ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==95) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalSoftgallery.g:4661:4: (lv_elements_1_0= ruleRequestPart )
            	    {
            	    // InternalSoftgallery.g:4661:4: (lv_elements_1_0= ruleRequestPart )
            	    // InternalSoftgallery.g:4662:5: lv_elements_1_0= ruleRequestPart
            	    {

            	    					newCompositeNode(grammarAccess.getRequestMappingAccess().getElementsRequestPartParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_100);
            	    lv_elements_1_0=ruleRequestPart();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRequestMappingRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_1_0,
            	    						"co.unal.photos.Softgallery.RequestPart");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            // InternalSoftgallery.g:4679:3: ( (lv_elements_2_0= ruleRequestMappingType ) )
            // InternalSoftgallery.g:4680:4: (lv_elements_2_0= ruleRequestMappingType )
            {
            // InternalSoftgallery.g:4680:4: (lv_elements_2_0= ruleRequestMappingType )
            // InternalSoftgallery.g:4681:5: lv_elements_2_0= ruleRequestMappingType
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
            						"co.unal.photos.Softgallery.RequestMappingType");
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
    // InternalSoftgallery.g:4702:1: entryRuleRequestPart returns [EObject current=null] : iv_ruleRequestPart= ruleRequestPart EOF ;
    public final EObject entryRuleRequestPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequestPart = null;


        try {
            // InternalSoftgallery.g:4702:52: (iv_ruleRequestPart= ruleRequestPart EOF )
            // InternalSoftgallery.g:4703:2: iv_ruleRequestPart= ruleRequestPart EOF
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
    // InternalSoftgallery.g:4709:1: ruleRequestPart returns [EObject current=null] : (otherlv_0= 'RequestPart' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleRequestPart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftgallery.g:4715:2: ( (otherlv_0= 'RequestPart' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftgallery.g:4716:2: (otherlv_0= 'RequestPart' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftgallery.g:4716:2: (otherlv_0= 'RequestPart' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftgallery.g:4717:3: otherlv_0= 'RequestPart' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,95,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getRequestPartAccess().getRequestPartKeyword_0());
            		
            // InternalSoftgallery.g:4721:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:4722:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:4722:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:4723:5: lv_name_1_0= RULE_ID
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
    // InternalSoftgallery.g:4743:1: entryRuleRequestMappingType returns [EObject current=null] : iv_ruleRequestMappingType= ruleRequestMappingType EOF ;
    public final EObject entryRuleRequestMappingType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequestMappingType = null;


        try {
            // InternalSoftgallery.g:4743:59: (iv_ruleRequestMappingType= ruleRequestMappingType EOF )
            // InternalSoftgallery.g:4744:2: iv_ruleRequestMappingType= ruleRequestMappingType EOF
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
    // InternalSoftgallery.g:4750:1: ruleRequestMappingType returns [EObject current=null] : (otherlv_0= 'RequestMappingType' ( (lv_name_1_0= RULE_ID ) ) ruleRequestMappingTypeConf ) ;
    public final EObject ruleRequestMappingType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftgallery.g:4756:2: ( (otherlv_0= 'RequestMappingType' ( (lv_name_1_0= RULE_ID ) ) ruleRequestMappingTypeConf ) )
            // InternalSoftgallery.g:4757:2: (otherlv_0= 'RequestMappingType' ( (lv_name_1_0= RULE_ID ) ) ruleRequestMappingTypeConf )
            {
            // InternalSoftgallery.g:4757:2: (otherlv_0= 'RequestMappingType' ( (lv_name_1_0= RULE_ID ) ) ruleRequestMappingTypeConf )
            // InternalSoftgallery.g:4758:3: otherlv_0= 'RequestMappingType' ( (lv_name_1_0= RULE_ID ) ) ruleRequestMappingTypeConf
            {
            otherlv_0=(Token)match(input,96,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getRequestMappingTypeAccess().getRequestMappingTypeKeyword_0());
            		
            // InternalSoftgallery.g:4762:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:4763:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:4763:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:4764:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_101); 

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
    // InternalSoftgallery.g:4791:1: entryRuleRequestMappingTypeConf returns [String current=null] : iv_ruleRequestMappingTypeConf= ruleRequestMappingTypeConf EOF ;
    public final String entryRuleRequestMappingTypeConf() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRequestMappingTypeConf = null;


        try {
            // InternalSoftgallery.g:4791:62: (iv_ruleRequestMappingTypeConf= ruleRequestMappingTypeConf EOF )
            // InternalSoftgallery.g:4792:2: iv_ruleRequestMappingTypeConf= ruleRequestMappingTypeConf EOF
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
    // InternalSoftgallery.g:4798:1: ruleRequestMappingTypeConf returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'PostMapping' | kw= 'GetMapping' | kw= 'PutMapping' | kw= 'DeleteMapping' ) ;
    public final AntlrDatatypeRuleToken ruleRequestMappingTypeConf() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSoftgallery.g:4804:2: ( (kw= 'PostMapping' | kw= 'GetMapping' | kw= 'PutMapping' | kw= 'DeleteMapping' ) )
            // InternalSoftgallery.g:4805:2: (kw= 'PostMapping' | kw= 'GetMapping' | kw= 'PutMapping' | kw= 'DeleteMapping' )
            {
            // InternalSoftgallery.g:4805:2: (kw= 'PostMapping' | kw= 'GetMapping' | kw= 'PutMapping' | kw= 'DeleteMapping' )
            int alt29=4;
            switch ( input.LA(1) ) {
            case 97:
                {
                alt29=1;
                }
                break;
            case 98:
                {
                alt29=2;
                }
                break;
            case 99:
                {
                alt29=3;
                }
                break;
            case 100:
                {
                alt29=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalSoftgallery.g:4806:3: kw= 'PostMapping'
                    {
                    kw=(Token)match(input,97,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRequestMappingTypeConfAccess().getPostMappingKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSoftgallery.g:4812:3: kw= 'GetMapping'
                    {
                    kw=(Token)match(input,98,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRequestMappingTypeConfAccess().getGetMappingKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSoftgallery.g:4818:3: kw= 'PutMapping'
                    {
                    kw=(Token)match(input,99,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRequestMappingTypeConfAccess().getPutMappingKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalSoftgallery.g:4824:3: kw= 'DeleteMapping'
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
    // InternalSoftgallery.g:4833:1: entryRuleExceptionHandler returns [EObject current=null] : iv_ruleExceptionHandler= ruleExceptionHandler EOF ;
    public final EObject entryRuleExceptionHandler() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExceptionHandler = null;


        try {
            // InternalSoftgallery.g:4833:57: (iv_ruleExceptionHandler= ruleExceptionHandler EOF )
            // InternalSoftgallery.g:4834:2: iv_ruleExceptionHandler= ruleExceptionHandler EOF
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
    // InternalSoftgallery.g:4840:1: ruleExceptionHandler returns [EObject current=null] : (otherlv_0= 'ExceptionHandler' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleExceptionProcess ) )+ ) ;
    public final EObject ruleExceptionHandler() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalSoftgallery.g:4846:2: ( (otherlv_0= 'ExceptionHandler' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleExceptionProcess ) )+ ) )
            // InternalSoftgallery.g:4847:2: (otherlv_0= 'ExceptionHandler' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleExceptionProcess ) )+ )
            {
            // InternalSoftgallery.g:4847:2: (otherlv_0= 'ExceptionHandler' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleExceptionProcess ) )+ )
            // InternalSoftgallery.g:4848:3: otherlv_0= 'ExceptionHandler' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleExceptionProcess ) )+
            {
            otherlv_0=(Token)match(input,101,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getExceptionHandlerAccess().getExceptionHandlerKeyword_0());
            		
            // InternalSoftgallery.g:4852:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:4853:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:4853:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:4854:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_102); 

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

            // InternalSoftgallery.g:4870:3: ( (lv_elements_2_0= ruleExceptionProcess ) )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==102) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalSoftgallery.g:4871:4: (lv_elements_2_0= ruleExceptionProcess )
            	    {
            	    // InternalSoftgallery.g:4871:4: (lv_elements_2_0= ruleExceptionProcess )
            	    // InternalSoftgallery.g:4872:5: lv_elements_2_0= ruleExceptionProcess
            	    {

            	    					newCompositeNode(grammarAccess.getExceptionHandlerAccess().getElementsExceptionProcessParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_103);
            	    lv_elements_2_0=ruleExceptionProcess();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getExceptionHandlerRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_2_0,
            	    						"co.unal.photos.Softgallery.ExceptionProcess");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt30 >= 1 ) break loop30;
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
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
    // InternalSoftgallery.g:4893:1: entryRuleExceptionProcess returns [EObject current=null] : iv_ruleExceptionProcess= ruleExceptionProcess EOF ;
    public final EObject entryRuleExceptionProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExceptionProcess = null;


        try {
            // InternalSoftgallery.g:4893:57: (iv_ruleExceptionProcess= ruleExceptionProcess EOF )
            // InternalSoftgallery.g:4894:2: iv_ruleExceptionProcess= ruleExceptionProcess EOF
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
    // InternalSoftgallery.g:4900:1: ruleExceptionProcess returns [EObject current=null] : (otherlv_0= 'ExceptionProcess' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleExceptionProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftgallery.g:4906:2: ( (otherlv_0= 'ExceptionProcess' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftgallery.g:4907:2: (otherlv_0= 'ExceptionProcess' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftgallery.g:4907:2: (otherlv_0= 'ExceptionProcess' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftgallery.g:4908:3: otherlv_0= 'ExceptionProcess' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,102,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getExceptionProcessAccess().getExceptionProcessKeyword_0());
            		
            // InternalSoftgallery.g:4912:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:4913:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:4913:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:4914:5: lv_name_1_0= RULE_ID
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
    // InternalSoftgallery.g:4934:1: entryRuleSpringEntity returns [EObject current=null] : iv_ruleSpringEntity= ruleSpringEntity EOF ;
    public final EObject entryRuleSpringEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpringEntity = null;


        try {
            // InternalSoftgallery.g:4934:53: (iv_ruleSpringEntity= ruleSpringEntity EOF )
            // InternalSoftgallery.g:4935:2: iv_ruleSpringEntity= ruleSpringEntity EOF
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
    // InternalSoftgallery.g:4941:1: ruleSpringEntity returns [EObject current=null] : (otherlv_0= 'SpringEntity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleSpringTable ) )+ ( (lv_elements_5_0= ruleNameNativeQuery ) )* otherlv_6= '}' ) ;
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
            // InternalSoftgallery.g:4947:2: ( (otherlv_0= 'SpringEntity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleSpringTable ) )+ ( (lv_elements_5_0= ruleNameNativeQuery ) )* otherlv_6= '}' ) )
            // InternalSoftgallery.g:4948:2: (otherlv_0= 'SpringEntity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleSpringTable ) )+ ( (lv_elements_5_0= ruleNameNativeQuery ) )* otherlv_6= '}' )
            {
            // InternalSoftgallery.g:4948:2: (otherlv_0= 'SpringEntity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleSpringTable ) )+ ( (lv_elements_5_0= ruleNameNativeQuery ) )* otherlv_6= '}' )
            // InternalSoftgallery.g:4949:3: otherlv_0= 'SpringEntity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleSpringTable ) )+ ( (lv_elements_5_0= ruleNameNativeQuery ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,103,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getSpringEntityAccess().getSpringEntityKeyword_0());
            		
            // InternalSoftgallery.g:4953:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:4954:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:4954:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:4955:5: lv_name_1_0= RULE_ID
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
            		
            otherlv_3=(Token)match(input,13,FOLLOW_104); 

            			newLeafNode(otherlv_3, grammarAccess.getSpringEntityAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSoftgallery.g:4979:3: ( (lv_elements_4_0= ruleSpringTable ) )+
            int cnt31=0;
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==104) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalSoftgallery.g:4980:4: (lv_elements_4_0= ruleSpringTable )
            	    {
            	    // InternalSoftgallery.g:4980:4: (lv_elements_4_0= ruleSpringTable )
            	    // InternalSoftgallery.g:4981:5: lv_elements_4_0= ruleSpringTable
            	    {

            	    					newCompositeNode(grammarAccess.getSpringEntityAccess().getElementsSpringTableParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_105);
            	    lv_elements_4_0=ruleSpringTable();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSpringEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_4_0,
            	    						"co.unal.photos.Softgallery.SpringTable");
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

            // InternalSoftgallery.g:4998:3: ( (lv_elements_5_0= ruleNameNativeQuery ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==108) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalSoftgallery.g:4999:4: (lv_elements_5_0= ruleNameNativeQuery )
            	    {
            	    // InternalSoftgallery.g:4999:4: (lv_elements_5_0= ruleNameNativeQuery )
            	    // InternalSoftgallery.g:5000:5: lv_elements_5_0= ruleNameNativeQuery
            	    {

            	    					newCompositeNode(grammarAccess.getSpringEntityAccess().getElementsNameNativeQueryParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_106);
            	    lv_elements_5_0=ruleNameNativeQuery();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSpringEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_5_0,
            	    						"co.unal.photos.Softgallery.NameNativeQuery");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalSoftgallery.g:5025:1: entryRuleSpringTable returns [EObject current=null] : iv_ruleSpringTable= ruleSpringTable EOF ;
    public final EObject entryRuleSpringTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpringTable = null;


        try {
            // InternalSoftgallery.g:5025:52: (iv_ruleSpringTable= ruleSpringTable EOF )
            // InternalSoftgallery.g:5026:2: iv_ruleSpringTable= ruleSpringTable EOF
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
    // InternalSoftgallery.g:5032:1: ruleSpringTable returns [EObject current=null] : (otherlv_0= 'SpringTable' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleSpringTableId ) ) ( (lv_elements_3_0= ruleColumns ) )+ ) ;
    public final EObject ruleSpringTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalSoftgallery.g:5038:2: ( (otherlv_0= 'SpringTable' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleSpringTableId ) ) ( (lv_elements_3_0= ruleColumns ) )+ ) )
            // InternalSoftgallery.g:5039:2: (otherlv_0= 'SpringTable' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleSpringTableId ) ) ( (lv_elements_3_0= ruleColumns ) )+ )
            {
            // InternalSoftgallery.g:5039:2: (otherlv_0= 'SpringTable' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleSpringTableId ) ) ( (lv_elements_3_0= ruleColumns ) )+ )
            // InternalSoftgallery.g:5040:3: otherlv_0= 'SpringTable' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleSpringTableId ) ) ( (lv_elements_3_0= ruleColumns ) )+
            {
            otherlv_0=(Token)match(input,104,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getSpringTableAccess().getSpringTableKeyword_0());
            		
            // InternalSoftgallery.g:5044:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:5045:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:5045:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:5046:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_107); 

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

            // InternalSoftgallery.g:5062:3: ( (lv_elements_2_0= ruleSpringTableId ) )
            // InternalSoftgallery.g:5063:4: (lv_elements_2_0= ruleSpringTableId )
            {
            // InternalSoftgallery.g:5063:4: (lv_elements_2_0= ruleSpringTableId )
            // InternalSoftgallery.g:5064:5: lv_elements_2_0= ruleSpringTableId
            {

            					newCompositeNode(grammarAccess.getSpringTableAccess().getElementsSpringTableIdParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_108);
            lv_elements_2_0=ruleSpringTableId();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSpringTableRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_2_0,
            						"co.unal.photos.Softgallery.SpringTableId");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftgallery.g:5081:3: ( (lv_elements_3_0= ruleColumns ) )+
            int cnt33=0;
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==107) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalSoftgallery.g:5082:4: (lv_elements_3_0= ruleColumns )
            	    {
            	    // InternalSoftgallery.g:5082:4: (lv_elements_3_0= ruleColumns )
            	    // InternalSoftgallery.g:5083:5: lv_elements_3_0= ruleColumns
            	    {

            	    					newCompositeNode(grammarAccess.getSpringTableAccess().getElementsColumnsParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_109);
            	    lv_elements_3_0=ruleColumns();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSpringTableRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_3_0,
            	    						"co.unal.photos.Softgallery.Columns");
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
    // $ANTLR end "ruleSpringTable"


    // $ANTLR start "entryRuleSpringTableId"
    // InternalSoftgallery.g:5104:1: entryRuleSpringTableId returns [EObject current=null] : iv_ruleSpringTableId= ruleSpringTableId EOF ;
    public final EObject entryRuleSpringTableId() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpringTableId = null;


        try {
            // InternalSoftgallery.g:5104:54: (iv_ruleSpringTableId= ruleSpringTableId EOF )
            // InternalSoftgallery.g:5105:2: iv_ruleSpringTableId= ruleSpringTableId EOF
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
    // InternalSoftgallery.g:5111:1: ruleSpringTableId returns [EObject current=null] : (otherlv_0= 'SpringTableId' ( (lv_elements_1_0= ruleGeneratedValue ) )* ) ;
    public final EObject ruleSpringTableId() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_elements_1_0 = null;



        	enterRule();

        try {
            // InternalSoftgallery.g:5117:2: ( (otherlv_0= 'SpringTableId' ( (lv_elements_1_0= ruleGeneratedValue ) )* ) )
            // InternalSoftgallery.g:5118:2: (otherlv_0= 'SpringTableId' ( (lv_elements_1_0= ruleGeneratedValue ) )* )
            {
            // InternalSoftgallery.g:5118:2: (otherlv_0= 'SpringTableId' ( (lv_elements_1_0= ruleGeneratedValue ) )* )
            // InternalSoftgallery.g:5119:3: otherlv_0= 'SpringTableId' ( (lv_elements_1_0= ruleGeneratedValue ) )*
            {
            otherlv_0=(Token)match(input,105,FOLLOW_110); 

            			newLeafNode(otherlv_0, grammarAccess.getSpringTableIdAccess().getSpringTableIdKeyword_0());
            		
            // InternalSoftgallery.g:5123:3: ( (lv_elements_1_0= ruleGeneratedValue ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==106) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalSoftgallery.g:5124:4: (lv_elements_1_0= ruleGeneratedValue )
            	    {
            	    // InternalSoftgallery.g:5124:4: (lv_elements_1_0= ruleGeneratedValue )
            	    // InternalSoftgallery.g:5125:5: lv_elements_1_0= ruleGeneratedValue
            	    {

            	    					newCompositeNode(grammarAccess.getSpringTableIdAccess().getElementsGeneratedValueParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_110);
            	    lv_elements_1_0=ruleGeneratedValue();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSpringTableIdRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_1_0,
            	    						"co.unal.photos.Softgallery.GeneratedValue");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // InternalSoftgallery.g:5146:1: entryRuleGeneratedValue returns [EObject current=null] : iv_ruleGeneratedValue= ruleGeneratedValue EOF ;
    public final EObject entryRuleGeneratedValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneratedValue = null;


        try {
            // InternalSoftgallery.g:5146:55: (iv_ruleGeneratedValue= ruleGeneratedValue EOF )
            // InternalSoftgallery.g:5147:2: iv_ruleGeneratedValue= ruleGeneratedValue EOF
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
    // InternalSoftgallery.g:5153:1: ruleGeneratedValue returns [EObject current=null] : (otherlv_0= 'GeneratedValue' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleGeneratedValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftgallery.g:5159:2: ( (otherlv_0= 'GeneratedValue' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftgallery.g:5160:2: (otherlv_0= 'GeneratedValue' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftgallery.g:5160:2: (otherlv_0= 'GeneratedValue' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftgallery.g:5161:3: otherlv_0= 'GeneratedValue' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,106,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getGeneratedValueAccess().getGeneratedValueKeyword_0());
            		
            // InternalSoftgallery.g:5165:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:5166:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:5166:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:5167:5: lv_name_1_0= RULE_ID
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
    // InternalSoftgallery.g:5187:1: entryRuleColumns returns [EObject current=null] : iv_ruleColumns= ruleColumns EOF ;
    public final EObject entryRuleColumns() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumns = null;


        try {
            // InternalSoftgallery.g:5187:48: (iv_ruleColumns= ruleColumns EOF )
            // InternalSoftgallery.g:5188:2: iv_ruleColumns= ruleColumns EOF
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
    // InternalSoftgallery.g:5194:1: ruleColumns returns [EObject current=null] : (otherlv_0= 'Column' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleColumns() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftgallery.g:5200:2: ( (otherlv_0= 'Column' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftgallery.g:5201:2: (otherlv_0= 'Column' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftgallery.g:5201:2: (otherlv_0= 'Column' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftgallery.g:5202:3: otherlv_0= 'Column' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,107,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getColumnsAccess().getColumnKeyword_0());
            		
            // InternalSoftgallery.g:5206:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:5207:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:5207:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:5208:5: lv_name_1_0= RULE_ID
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
    // InternalSoftgallery.g:5228:1: entryRuleNameNativeQuery returns [EObject current=null] : iv_ruleNameNativeQuery= ruleNameNativeQuery EOF ;
    public final EObject entryRuleNameNativeQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameNativeQuery = null;


        try {
            // InternalSoftgallery.g:5228:56: (iv_ruleNameNativeQuery= ruleNameNativeQuery EOF )
            // InternalSoftgallery.g:5229:2: iv_ruleNameNativeQuery= ruleNameNativeQuery EOF
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
    // InternalSoftgallery.g:5235:1: ruleNameNativeQuery returns [EObject current=null] : (otherlv_0= 'NameNativeQuery' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleNameNativeQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftgallery.g:5241:2: ( (otherlv_0= 'NameNativeQuery' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftgallery.g:5242:2: (otherlv_0= 'NameNativeQuery' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftgallery.g:5242:2: (otherlv_0= 'NameNativeQuery' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftgallery.g:5243:3: otherlv_0= 'NameNativeQuery' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,108,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getNameNativeQueryAccess().getNameNativeQueryKeyword_0());
            		
            // InternalSoftgallery.g:5247:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:5248:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:5248:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:5249:5: lv_name_1_0= RULE_ID
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
    // InternalSoftgallery.g:5269:1: entryRuleReact returns [EObject current=null] : iv_ruleReact= ruleReact EOF ;
    public final EObject entryRuleReact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReact = null;


        try {
            // InternalSoftgallery.g:5269:46: (iv_ruleReact= ruleReact EOF )
            // InternalSoftgallery.g:5270:2: iv_ruleReact= ruleReact EOF
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
    // InternalSoftgallery.g:5276:1: ruleReact returns [EObject current=null] : (otherlv_0= 'React' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_reacts_4_0= ruleReactModules ) ) otherlv_5= '}' ) ;
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
            // InternalSoftgallery.g:5282:2: ( (otherlv_0= 'React' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_reacts_4_0= ruleReactModules ) ) otherlv_5= '}' ) )
            // InternalSoftgallery.g:5283:2: (otherlv_0= 'React' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_reacts_4_0= ruleReactModules ) ) otherlv_5= '}' )
            {
            // InternalSoftgallery.g:5283:2: (otherlv_0= 'React' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_reacts_4_0= ruleReactModules ) ) otherlv_5= '}' )
            // InternalSoftgallery.g:5284:3: otherlv_0= 'React' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_reacts_4_0= ruleReactModules ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,109,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getReactAccess().getReactKeyword_0());
            		
            // InternalSoftgallery.g:5288:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:5289:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:5289:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:5290:5: lv_name_1_0= RULE_ID
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
            		
            otherlv_3=(Token)match(input,13,FOLLOW_111); 

            			newLeafNode(otherlv_3, grammarAccess.getReactAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSoftgallery.g:5314:3: ( (lv_reacts_4_0= ruleReactModules ) )
            // InternalSoftgallery.g:5315:4: (lv_reacts_4_0= ruleReactModules )
            {
            // InternalSoftgallery.g:5315:4: (lv_reacts_4_0= ruleReactModules )
            // InternalSoftgallery.g:5316:5: lv_reacts_4_0= ruleReactModules
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
            						"co.unal.photos.Softgallery.ReactModules");
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
    // InternalSoftgallery.g:5341:1: entryRuleReactModules returns [EObject current=null] : iv_ruleReactModules= ruleReactModules EOF ;
    public final EObject entryRuleReactModules() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactModules = null;


        try {
            // InternalSoftgallery.g:5341:53: (iv_ruleReactModules= ruleReactModules EOF )
            // InternalSoftgallery.g:5342:2: iv_ruleReactModules= ruleReactModules EOF
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
    // InternalSoftgallery.g:5348:1: ruleReactModules returns [EObject current=null] : (otherlv_0= 'ReactModules' otherlv_1= ':' otherlv_2= '{' ( (lv_reactmodules_3_0= ruleReactSubModules ) ) otherlv_4= '}' ) ;
    public final EObject ruleReactModules() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_reactmodules_3_0 = null;



        	enterRule();

        try {
            // InternalSoftgallery.g:5354:2: ( (otherlv_0= 'ReactModules' otherlv_1= ':' otherlv_2= '{' ( (lv_reactmodules_3_0= ruleReactSubModules ) ) otherlv_4= '}' ) )
            // InternalSoftgallery.g:5355:2: (otherlv_0= 'ReactModules' otherlv_1= ':' otherlv_2= '{' ( (lv_reactmodules_3_0= ruleReactSubModules ) ) otherlv_4= '}' )
            {
            // InternalSoftgallery.g:5355:2: (otherlv_0= 'ReactModules' otherlv_1= ':' otherlv_2= '{' ( (lv_reactmodules_3_0= ruleReactSubModules ) ) otherlv_4= '}' )
            // InternalSoftgallery.g:5356:3: otherlv_0= 'ReactModules' otherlv_1= ':' otherlv_2= '{' ( (lv_reactmodules_3_0= ruleReactSubModules ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,110,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getReactModulesAccess().getReactModulesKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getReactModulesAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_112); 

            			newLeafNode(otherlv_2, grammarAccess.getReactModulesAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSoftgallery.g:5368:3: ( (lv_reactmodules_3_0= ruleReactSubModules ) )
            // InternalSoftgallery.g:5369:4: (lv_reactmodules_3_0= ruleReactSubModules )
            {
            // InternalSoftgallery.g:5369:4: (lv_reactmodules_3_0= ruleReactSubModules )
            // InternalSoftgallery.g:5370:5: lv_reactmodules_3_0= ruleReactSubModules
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
            						"co.unal.photos.Softgallery.ReactSubModules");
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
    // InternalSoftgallery.g:5395:1: entryRuleReactSubModules returns [EObject current=null] : iv_ruleReactSubModules= ruleReactSubModules EOF ;
    public final EObject entryRuleReactSubModules() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactSubModules = null;


        try {
            // InternalSoftgallery.g:5395:56: (iv_ruleReactSubModules= ruleReactSubModules EOF )
            // InternalSoftgallery.g:5396:2: iv_ruleReactSubModules= ruleReactSubModules EOF
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
    // InternalSoftgallery.g:5402:1: ruleReactSubModules returns [EObject current=null] : ( ( (lv_reactmodules_0_0= ruleReactConfiguration ) ) ( (lv_reactmodules_1_0= ruleReactComponents ) ) ( (lv_reactmodules_2_0= ruleReactActions ) ) ( (lv_reactmodules_3_0= ruleReactLibraries ) ) ( (lv_reactmodules_4_0= ruleReactInfo ) ) ) ;
    public final EObject ruleReactSubModules() throws RecognitionException {
        EObject current = null;

        EObject lv_reactmodules_0_0 = null;

        EObject lv_reactmodules_1_0 = null;

        EObject lv_reactmodules_2_0 = null;

        EObject lv_reactmodules_3_0 = null;

        EObject lv_reactmodules_4_0 = null;



        	enterRule();

        try {
            // InternalSoftgallery.g:5408:2: ( ( ( (lv_reactmodules_0_0= ruleReactConfiguration ) ) ( (lv_reactmodules_1_0= ruleReactComponents ) ) ( (lv_reactmodules_2_0= ruleReactActions ) ) ( (lv_reactmodules_3_0= ruleReactLibraries ) ) ( (lv_reactmodules_4_0= ruleReactInfo ) ) ) )
            // InternalSoftgallery.g:5409:2: ( ( (lv_reactmodules_0_0= ruleReactConfiguration ) ) ( (lv_reactmodules_1_0= ruleReactComponents ) ) ( (lv_reactmodules_2_0= ruleReactActions ) ) ( (lv_reactmodules_3_0= ruleReactLibraries ) ) ( (lv_reactmodules_4_0= ruleReactInfo ) ) )
            {
            // InternalSoftgallery.g:5409:2: ( ( (lv_reactmodules_0_0= ruleReactConfiguration ) ) ( (lv_reactmodules_1_0= ruleReactComponents ) ) ( (lv_reactmodules_2_0= ruleReactActions ) ) ( (lv_reactmodules_3_0= ruleReactLibraries ) ) ( (lv_reactmodules_4_0= ruleReactInfo ) ) )
            // InternalSoftgallery.g:5410:3: ( (lv_reactmodules_0_0= ruleReactConfiguration ) ) ( (lv_reactmodules_1_0= ruleReactComponents ) ) ( (lv_reactmodules_2_0= ruleReactActions ) ) ( (lv_reactmodules_3_0= ruleReactLibraries ) ) ( (lv_reactmodules_4_0= ruleReactInfo ) )
            {
            // InternalSoftgallery.g:5410:3: ( (lv_reactmodules_0_0= ruleReactConfiguration ) )
            // InternalSoftgallery.g:5411:4: (lv_reactmodules_0_0= ruleReactConfiguration )
            {
            // InternalSoftgallery.g:5411:4: (lv_reactmodules_0_0= ruleReactConfiguration )
            // InternalSoftgallery.g:5412:5: lv_reactmodules_0_0= ruleReactConfiguration
            {

            					newCompositeNode(grammarAccess.getReactSubModulesAccess().getReactmodulesReactConfigurationParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_113);
            lv_reactmodules_0_0=ruleReactConfiguration();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReactSubModulesRule());
            					}
            					add(
            						current,
            						"reactmodules",
            						lv_reactmodules_0_0,
            						"co.unal.photos.Softgallery.ReactConfiguration");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftgallery.g:5429:3: ( (lv_reactmodules_1_0= ruleReactComponents ) )
            // InternalSoftgallery.g:5430:4: (lv_reactmodules_1_0= ruleReactComponents )
            {
            // InternalSoftgallery.g:5430:4: (lv_reactmodules_1_0= ruleReactComponents )
            // InternalSoftgallery.g:5431:5: lv_reactmodules_1_0= ruleReactComponents
            {

            					newCompositeNode(grammarAccess.getReactSubModulesAccess().getReactmodulesReactComponentsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_114);
            lv_reactmodules_1_0=ruleReactComponents();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReactSubModulesRule());
            					}
            					add(
            						current,
            						"reactmodules",
            						lv_reactmodules_1_0,
            						"co.unal.photos.Softgallery.ReactComponents");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftgallery.g:5448:3: ( (lv_reactmodules_2_0= ruleReactActions ) )
            // InternalSoftgallery.g:5449:4: (lv_reactmodules_2_0= ruleReactActions )
            {
            // InternalSoftgallery.g:5449:4: (lv_reactmodules_2_0= ruleReactActions )
            // InternalSoftgallery.g:5450:5: lv_reactmodules_2_0= ruleReactActions
            {

            					newCompositeNode(grammarAccess.getReactSubModulesAccess().getReactmodulesReactActionsParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_115);
            lv_reactmodules_2_0=ruleReactActions();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReactSubModulesRule());
            					}
            					add(
            						current,
            						"reactmodules",
            						lv_reactmodules_2_0,
            						"co.unal.photos.Softgallery.ReactActions");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftgallery.g:5467:3: ( (lv_reactmodules_3_0= ruleReactLibraries ) )
            // InternalSoftgallery.g:5468:4: (lv_reactmodules_3_0= ruleReactLibraries )
            {
            // InternalSoftgallery.g:5468:4: (lv_reactmodules_3_0= ruleReactLibraries )
            // InternalSoftgallery.g:5469:5: lv_reactmodules_3_0= ruleReactLibraries
            {

            					newCompositeNode(grammarAccess.getReactSubModulesAccess().getReactmodulesReactLibrariesParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_116);
            lv_reactmodules_3_0=ruleReactLibraries();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReactSubModulesRule());
            					}
            					add(
            						current,
            						"reactmodules",
            						lv_reactmodules_3_0,
            						"co.unal.photos.Softgallery.ReactLibraries");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftgallery.g:5486:3: ( (lv_reactmodules_4_0= ruleReactInfo ) )
            // InternalSoftgallery.g:5487:4: (lv_reactmodules_4_0= ruleReactInfo )
            {
            // InternalSoftgallery.g:5487:4: (lv_reactmodules_4_0= ruleReactInfo )
            // InternalSoftgallery.g:5488:5: lv_reactmodules_4_0= ruleReactInfo
            {

            					newCompositeNode(grammarAccess.getReactSubModulesAccess().getReactmodulesReactInfoParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_reactmodules_4_0=ruleReactInfo();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReactSubModulesRule());
            					}
            					add(
            						current,
            						"reactmodules",
            						lv_reactmodules_4_0,
            						"co.unal.photos.Softgallery.ReactInfo");
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
    // InternalSoftgallery.g:5509:1: entryRuleReactConfiguration returns [EObject current=null] : iv_ruleReactConfiguration= ruleReactConfiguration EOF ;
    public final EObject entryRuleReactConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactConfiguration = null;


        try {
            // InternalSoftgallery.g:5509:59: (iv_ruleReactConfiguration= ruleReactConfiguration EOF )
            // InternalSoftgallery.g:5510:2: iv_ruleReactConfiguration= ruleReactConfiguration EOF
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
    // InternalSoftgallery.g:5516:1: ruleReactConfiguration returns [EObject current=null] : (otherlv_0= 'ReactConfiguration' otherlv_1= ':' otherlv_2= '{' ( (lv_dependencies_3_0= ruleReactDependencies ) ) ( (lv_configurations_4_0= ruleReactConfigurations ) ) otherlv_5= '}' ) ;
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
            // InternalSoftgallery.g:5522:2: ( (otherlv_0= 'ReactConfiguration' otherlv_1= ':' otherlv_2= '{' ( (lv_dependencies_3_0= ruleReactDependencies ) ) ( (lv_configurations_4_0= ruleReactConfigurations ) ) otherlv_5= '}' ) )
            // InternalSoftgallery.g:5523:2: (otherlv_0= 'ReactConfiguration' otherlv_1= ':' otherlv_2= '{' ( (lv_dependencies_3_0= ruleReactDependencies ) ) ( (lv_configurations_4_0= ruleReactConfigurations ) ) otherlv_5= '}' )
            {
            // InternalSoftgallery.g:5523:2: (otherlv_0= 'ReactConfiguration' otherlv_1= ':' otherlv_2= '{' ( (lv_dependencies_3_0= ruleReactDependencies ) ) ( (lv_configurations_4_0= ruleReactConfigurations ) ) otherlv_5= '}' )
            // InternalSoftgallery.g:5524:3: otherlv_0= 'ReactConfiguration' otherlv_1= ':' otherlv_2= '{' ( (lv_dependencies_3_0= ruleReactDependencies ) ) ( (lv_configurations_4_0= ruleReactConfigurations ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,111,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getReactConfigurationAccess().getReactConfigurationKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getReactConfigurationAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_117); 

            			newLeafNode(otherlv_2, grammarAccess.getReactConfigurationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSoftgallery.g:5536:3: ( (lv_dependencies_3_0= ruleReactDependencies ) )
            // InternalSoftgallery.g:5537:4: (lv_dependencies_3_0= ruleReactDependencies )
            {
            // InternalSoftgallery.g:5537:4: (lv_dependencies_3_0= ruleReactDependencies )
            // InternalSoftgallery.g:5538:5: lv_dependencies_3_0= ruleReactDependencies
            {

            					newCompositeNode(grammarAccess.getReactConfigurationAccess().getDependenciesReactDependenciesParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_118);
            lv_dependencies_3_0=ruleReactDependencies();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReactConfigurationRule());
            					}
            					add(
            						current,
            						"dependencies",
            						lv_dependencies_3_0,
            						"co.unal.photos.Softgallery.ReactDependencies");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftgallery.g:5555:3: ( (lv_configurations_4_0= ruleReactConfigurations ) )
            // InternalSoftgallery.g:5556:4: (lv_configurations_4_0= ruleReactConfigurations )
            {
            // InternalSoftgallery.g:5556:4: (lv_configurations_4_0= ruleReactConfigurations )
            // InternalSoftgallery.g:5557:5: lv_configurations_4_0= ruleReactConfigurations
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
            						"co.unal.photos.Softgallery.ReactConfigurations");
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
    // InternalSoftgallery.g:5582:1: entryRuleReactDependencies returns [EObject current=null] : iv_ruleReactDependencies= ruleReactDependencies EOF ;
    public final EObject entryRuleReactDependencies() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactDependencies = null;


        try {
            // InternalSoftgallery.g:5582:58: (iv_ruleReactDependencies= ruleReactDependencies EOF )
            // InternalSoftgallery.g:5583:2: iv_ruleReactDependencies= ruleReactDependencies EOF
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
    // InternalSoftgallery.g:5589:1: ruleReactDependencies returns [EObject current=null] : (otherlv_0= 'DependenciesStruct' ( (lv_dependencies_1_0= ruleReactDependenciesRules ) )+ ) ;
    public final EObject ruleReactDependencies() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_dependencies_1_0 = null;



        	enterRule();

        try {
            // InternalSoftgallery.g:5595:2: ( (otherlv_0= 'DependenciesStruct' ( (lv_dependencies_1_0= ruleReactDependenciesRules ) )+ ) )
            // InternalSoftgallery.g:5596:2: (otherlv_0= 'DependenciesStruct' ( (lv_dependencies_1_0= ruleReactDependenciesRules ) )+ )
            {
            // InternalSoftgallery.g:5596:2: (otherlv_0= 'DependenciesStruct' ( (lv_dependencies_1_0= ruleReactDependenciesRules ) )+ )
            // InternalSoftgallery.g:5597:3: otherlv_0= 'DependenciesStruct' ( (lv_dependencies_1_0= ruleReactDependenciesRules ) )+
            {
            otherlv_0=(Token)match(input,112,FOLLOW_119); 

            			newLeafNode(otherlv_0, grammarAccess.getReactDependenciesAccess().getDependenciesStructKeyword_0());
            		
            // InternalSoftgallery.g:5601:3: ( (lv_dependencies_1_0= ruleReactDependenciesRules ) )+
            int cnt35=0;
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==113) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalSoftgallery.g:5602:4: (lv_dependencies_1_0= ruleReactDependenciesRules )
            	    {
            	    // InternalSoftgallery.g:5602:4: (lv_dependencies_1_0= ruleReactDependenciesRules )
            	    // InternalSoftgallery.g:5603:5: lv_dependencies_1_0= ruleReactDependenciesRules
            	    {

            	    					newCompositeNode(grammarAccess.getReactDependenciesAccess().getDependenciesReactDependenciesRulesParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_120);
            	    lv_dependencies_1_0=ruleReactDependenciesRules();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getReactDependenciesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"dependencies",
            	    						lv_dependencies_1_0,
            	    						"co.unal.photos.Softgallery.ReactDependenciesRules");
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
    // InternalSoftgallery.g:5624:1: entryRuleReactDependenciesRules returns [EObject current=null] : iv_ruleReactDependenciesRules= ruleReactDependenciesRules EOF ;
    public final EObject entryRuleReactDependenciesRules() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactDependenciesRules = null;


        try {
            // InternalSoftgallery.g:5624:63: (iv_ruleReactDependenciesRules= ruleReactDependenciesRules EOF )
            // InternalSoftgallery.g:5625:2: iv_ruleReactDependenciesRules= ruleReactDependenciesRules EOF
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
    // InternalSoftgallery.g:5631:1: ruleReactDependenciesRules returns [EObject current=null] : (otherlv_0= 'DependencyType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_dependencies_2_0= ruleReactDependenciesSubRules ) )+ ) ;
    public final EObject ruleReactDependenciesRules() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_dependencies_2_0 = null;



        	enterRule();

        try {
            // InternalSoftgallery.g:5637:2: ( (otherlv_0= 'DependencyType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_dependencies_2_0= ruleReactDependenciesSubRules ) )+ ) )
            // InternalSoftgallery.g:5638:2: (otherlv_0= 'DependencyType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_dependencies_2_0= ruleReactDependenciesSubRules ) )+ )
            {
            // InternalSoftgallery.g:5638:2: (otherlv_0= 'DependencyType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_dependencies_2_0= ruleReactDependenciesSubRules ) )+ )
            // InternalSoftgallery.g:5639:3: otherlv_0= 'DependencyType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_dependencies_2_0= ruleReactDependenciesSubRules ) )+
            {
            otherlv_0=(Token)match(input,113,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getReactDependenciesRulesAccess().getDependencyTypeKeyword_0());
            		
            // InternalSoftgallery.g:5643:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:5644:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:5644:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:5645:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_121); 

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

            // InternalSoftgallery.g:5661:3: ( (lv_dependencies_2_0= ruleReactDependenciesSubRules ) )+
            int cnt36=0;
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==114) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalSoftgallery.g:5662:4: (lv_dependencies_2_0= ruleReactDependenciesSubRules )
            	    {
            	    // InternalSoftgallery.g:5662:4: (lv_dependencies_2_0= ruleReactDependenciesSubRules )
            	    // InternalSoftgallery.g:5663:5: lv_dependencies_2_0= ruleReactDependenciesSubRules
            	    {

            	    					newCompositeNode(grammarAccess.getReactDependenciesRulesAccess().getDependenciesReactDependenciesSubRulesParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_122);
            	    lv_dependencies_2_0=ruleReactDependenciesSubRules();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getReactDependenciesRulesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"dependencies",
            	    						lv_dependencies_2_0,
            	    						"co.unal.photos.Softgallery.ReactDependenciesSubRules");
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
    // $ANTLR end "ruleReactDependenciesRules"


    // $ANTLR start "entryRuleReactDependenciesSubRules"
    // InternalSoftgallery.g:5684:1: entryRuleReactDependenciesSubRules returns [EObject current=null] : iv_ruleReactDependenciesSubRules= ruleReactDependenciesSubRules EOF ;
    public final EObject entryRuleReactDependenciesSubRules() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactDependenciesSubRules = null;


        try {
            // InternalSoftgallery.g:5684:66: (iv_ruleReactDependenciesSubRules= ruleReactDependenciesSubRules EOF )
            // InternalSoftgallery.g:5685:2: iv_ruleReactDependenciesSubRules= ruleReactDependenciesSubRules EOF
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
    // InternalSoftgallery.g:5691:1: ruleReactDependenciesSubRules returns [EObject current=null] : ( (lv_dependencies_0_0= ruleSingleDependencies ) ) ;
    public final EObject ruleReactDependenciesSubRules() throws RecognitionException {
        EObject current = null;

        EObject lv_dependencies_0_0 = null;



        	enterRule();

        try {
            // InternalSoftgallery.g:5697:2: ( ( (lv_dependencies_0_0= ruleSingleDependencies ) ) )
            // InternalSoftgallery.g:5698:2: ( (lv_dependencies_0_0= ruleSingleDependencies ) )
            {
            // InternalSoftgallery.g:5698:2: ( (lv_dependencies_0_0= ruleSingleDependencies ) )
            // InternalSoftgallery.g:5699:3: (lv_dependencies_0_0= ruleSingleDependencies )
            {
            // InternalSoftgallery.g:5699:3: (lv_dependencies_0_0= ruleSingleDependencies )
            // InternalSoftgallery.g:5700:4: lv_dependencies_0_0= ruleSingleDependencies
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
            					"co.unal.photos.Softgallery.SingleDependencies");
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
    // InternalSoftgallery.g:5720:1: entryRuleSingleDependencies returns [EObject current=null] : iv_ruleSingleDependencies= ruleSingleDependencies EOF ;
    public final EObject entryRuleSingleDependencies() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleDependencies = null;


        try {
            // InternalSoftgallery.g:5720:59: (iv_ruleSingleDependencies= ruleSingleDependencies EOF )
            // InternalSoftgallery.g:5721:2: iv_ruleSingleDependencies= ruleSingleDependencies EOF
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
    // InternalSoftgallery.g:5727:1: ruleSingleDependencies returns [EObject current=null] : ( ( (lv_dependencies_0_0= rulePackageName ) ) ( (lv_dependencies_1_0= rulePackageVersion ) ) ) ;
    public final EObject ruleSingleDependencies() throws RecognitionException {
        EObject current = null;

        EObject lv_dependencies_0_0 = null;

        EObject lv_dependencies_1_0 = null;



        	enterRule();

        try {
            // InternalSoftgallery.g:5733:2: ( ( ( (lv_dependencies_0_0= rulePackageName ) ) ( (lv_dependencies_1_0= rulePackageVersion ) ) ) )
            // InternalSoftgallery.g:5734:2: ( ( (lv_dependencies_0_0= rulePackageName ) ) ( (lv_dependencies_1_0= rulePackageVersion ) ) )
            {
            // InternalSoftgallery.g:5734:2: ( ( (lv_dependencies_0_0= rulePackageName ) ) ( (lv_dependencies_1_0= rulePackageVersion ) ) )
            // InternalSoftgallery.g:5735:3: ( (lv_dependencies_0_0= rulePackageName ) ) ( (lv_dependencies_1_0= rulePackageVersion ) )
            {
            // InternalSoftgallery.g:5735:3: ( (lv_dependencies_0_0= rulePackageName ) )
            // InternalSoftgallery.g:5736:4: (lv_dependencies_0_0= rulePackageName )
            {
            // InternalSoftgallery.g:5736:4: (lv_dependencies_0_0= rulePackageName )
            // InternalSoftgallery.g:5737:5: lv_dependencies_0_0= rulePackageName
            {

            					newCompositeNode(grammarAccess.getSingleDependenciesAccess().getDependenciesPackageNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_123);
            lv_dependencies_0_0=rulePackageName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSingleDependenciesRule());
            					}
            					add(
            						current,
            						"dependencies",
            						lv_dependencies_0_0,
            						"co.unal.photos.Softgallery.PackageName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftgallery.g:5754:3: ( (lv_dependencies_1_0= rulePackageVersion ) )
            // InternalSoftgallery.g:5755:4: (lv_dependencies_1_0= rulePackageVersion )
            {
            // InternalSoftgallery.g:5755:4: (lv_dependencies_1_0= rulePackageVersion )
            // InternalSoftgallery.g:5756:5: lv_dependencies_1_0= rulePackageVersion
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
            						"co.unal.photos.Softgallery.PackageVersion");
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
    // InternalSoftgallery.g:5777:1: entryRulePackageName returns [EObject current=null] : iv_rulePackageName= rulePackageName EOF ;
    public final EObject entryRulePackageName() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageName = null;


        try {
            // InternalSoftgallery.g:5777:52: (iv_rulePackageName= rulePackageName EOF )
            // InternalSoftgallery.g:5778:2: iv_rulePackageName= rulePackageName EOF
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
    // InternalSoftgallery.g:5784:1: rulePackageName returns [EObject current=null] : (otherlv_0= 'PackageName' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePackageName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftgallery.g:5790:2: ( (otherlv_0= 'PackageName' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftgallery.g:5791:2: (otherlv_0= 'PackageName' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftgallery.g:5791:2: (otherlv_0= 'PackageName' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftgallery.g:5792:3: otherlv_0= 'PackageName' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,114,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getPackageNameAccess().getPackageNameKeyword_0());
            		
            // InternalSoftgallery.g:5796:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:5797:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:5797:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:5798:5: lv_name_1_0= RULE_ID
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
    // InternalSoftgallery.g:5818:1: entryRulePackageVersion returns [EObject current=null] : iv_rulePackageVersion= rulePackageVersion EOF ;
    public final EObject entryRulePackageVersion() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageVersion = null;


        try {
            // InternalSoftgallery.g:5818:55: (iv_rulePackageVersion= rulePackageVersion EOF )
            // InternalSoftgallery.g:5819:2: iv_rulePackageVersion= rulePackageVersion EOF
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
    // InternalSoftgallery.g:5825:1: rulePackageVersion returns [EObject current=null] : (otherlv_0= 'PackageVersion' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePackageVersion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftgallery.g:5831:2: ( (otherlv_0= 'PackageVersion' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftgallery.g:5832:2: (otherlv_0= 'PackageVersion' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftgallery.g:5832:2: (otherlv_0= 'PackageVersion' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftgallery.g:5833:3: otherlv_0= 'PackageVersion' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,115,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getPackageVersionAccess().getPackageVersionKeyword_0());
            		
            // InternalSoftgallery.g:5837:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:5838:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:5838:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:5839:5: lv_name_1_0= RULE_ID
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
    // InternalSoftgallery.g:5859:1: entryRuleReactConfigurations returns [EObject current=null] : iv_ruleReactConfigurations= ruleReactConfigurations EOF ;
    public final EObject entryRuleReactConfigurations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactConfigurations = null;


        try {
            // InternalSoftgallery.g:5859:60: (iv_ruleReactConfigurations= ruleReactConfigurations EOF )
            // InternalSoftgallery.g:5860:2: iv_ruleReactConfigurations= ruleReactConfigurations EOF
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
    // InternalSoftgallery.g:5866:1: ruleReactConfigurations returns [EObject current=null] : (otherlv_0= 'ReactDOMConfigurations' ( (lv_name_1_0= RULE_ID ) ) ( (lv_configurations_2_0= ruleDOMConfigurations ) )+ ) ;
    public final EObject ruleReactConfigurations() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_configurations_2_0 = null;



        	enterRule();

        try {
            // InternalSoftgallery.g:5872:2: ( (otherlv_0= 'ReactDOMConfigurations' ( (lv_name_1_0= RULE_ID ) ) ( (lv_configurations_2_0= ruleDOMConfigurations ) )+ ) )
            // InternalSoftgallery.g:5873:2: (otherlv_0= 'ReactDOMConfigurations' ( (lv_name_1_0= RULE_ID ) ) ( (lv_configurations_2_0= ruleDOMConfigurations ) )+ )
            {
            // InternalSoftgallery.g:5873:2: (otherlv_0= 'ReactDOMConfigurations' ( (lv_name_1_0= RULE_ID ) ) ( (lv_configurations_2_0= ruleDOMConfigurations ) )+ )
            // InternalSoftgallery.g:5874:3: otherlv_0= 'ReactDOMConfigurations' ( (lv_name_1_0= RULE_ID ) ) ( (lv_configurations_2_0= ruleDOMConfigurations ) )+
            {
            otherlv_0=(Token)match(input,116,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getReactConfigurationsAccess().getReactDOMConfigurationsKeyword_0());
            		
            // InternalSoftgallery.g:5878:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:5879:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:5879:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:5880:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_124); 

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

            // InternalSoftgallery.g:5896:3: ( (lv_configurations_2_0= ruleDOMConfigurations ) )+
            int cnt37=0;
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>=117 && LA37_0<=121)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalSoftgallery.g:5897:4: (lv_configurations_2_0= ruleDOMConfigurations )
            	    {
            	    // InternalSoftgallery.g:5897:4: (lv_configurations_2_0= ruleDOMConfigurations )
            	    // InternalSoftgallery.g:5898:5: lv_configurations_2_0= ruleDOMConfigurations
            	    {

            	    					newCompositeNode(grammarAccess.getReactConfigurationsAccess().getConfigurationsDOMConfigurationsParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_125);
            	    lv_configurations_2_0=ruleDOMConfigurations();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getReactConfigurationsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"configurations",
            	    						lv_configurations_2_0,
            	    						"co.unal.photos.Softgallery.DOMConfigurations");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt37 >= 1 ) break loop37;
                        EarlyExitException eee =
                            new EarlyExitException(37, input);
                        throw eee;
                }
                cnt37++;
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
    // InternalSoftgallery.g:5919:1: entryRuleDOMConfigurations returns [EObject current=null] : iv_ruleDOMConfigurations= ruleDOMConfigurations EOF ;
    public final EObject entryRuleDOMConfigurations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDOMConfigurations = null;


        try {
            // InternalSoftgallery.g:5919:58: (iv_ruleDOMConfigurations= ruleDOMConfigurations EOF )
            // InternalSoftgallery.g:5920:2: iv_ruleDOMConfigurations= ruleDOMConfigurations EOF
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
    // InternalSoftgallery.g:5926:1: ruleDOMConfigurations returns [EObject current=null] : ( ( (lv_elements_0_0= ruleDOMTypeConf ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDOMConfigurations() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalSoftgallery.g:5932:2: ( ( ( (lv_elements_0_0= ruleDOMTypeConf ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftgallery.g:5933:2: ( ( (lv_elements_0_0= ruleDOMTypeConf ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftgallery.g:5933:2: ( ( (lv_elements_0_0= ruleDOMTypeConf ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftgallery.g:5934:3: ( (lv_elements_0_0= ruleDOMTypeConf ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalSoftgallery.g:5934:3: ( (lv_elements_0_0= ruleDOMTypeConf ) )
            // InternalSoftgallery.g:5935:4: (lv_elements_0_0= ruleDOMTypeConf )
            {
            // InternalSoftgallery.g:5935:4: (lv_elements_0_0= ruleDOMTypeConf )
            // InternalSoftgallery.g:5936:5: lv_elements_0_0= ruleDOMTypeConf
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
            						"co.unal.photos.Softgallery.DOMTypeConf");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftgallery.g:5953:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:5954:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:5954:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:5955:5: lv_name_1_0= RULE_ID
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
    // InternalSoftgallery.g:5975:1: entryRuleDOMTypeConf returns [String current=null] : iv_ruleDOMTypeConf= ruleDOMTypeConf EOF ;
    public final String entryRuleDOMTypeConf() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOMTypeConf = null;


        try {
            // InternalSoftgallery.g:5975:51: (iv_ruleDOMTypeConf= ruleDOMTypeConf EOF )
            // InternalSoftgallery.g:5976:2: iv_ruleDOMTypeConf= ruleDOMTypeConf EOF
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
    // InternalSoftgallery.g:5982:1: ruleDOMTypeConf returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'RoutingConf' | kw= 'ServiceWorker' | kw= 'HTMLStructure' | kw= 'Manifest' | kw= 'RepositoriesConf' ) ;
    public final AntlrDatatypeRuleToken ruleDOMTypeConf() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSoftgallery.g:5988:2: ( (kw= 'RoutingConf' | kw= 'ServiceWorker' | kw= 'HTMLStructure' | kw= 'Manifest' | kw= 'RepositoriesConf' ) )
            // InternalSoftgallery.g:5989:2: (kw= 'RoutingConf' | kw= 'ServiceWorker' | kw= 'HTMLStructure' | kw= 'Manifest' | kw= 'RepositoriesConf' )
            {
            // InternalSoftgallery.g:5989:2: (kw= 'RoutingConf' | kw= 'ServiceWorker' | kw= 'HTMLStructure' | kw= 'Manifest' | kw= 'RepositoriesConf' )
            int alt38=5;
            switch ( input.LA(1) ) {
            case 117:
                {
                alt38=1;
                }
                break;
            case 118:
                {
                alt38=2;
                }
                break;
            case 119:
                {
                alt38=3;
                }
                break;
            case 120:
                {
                alt38=4;
                }
                break;
            case 121:
                {
                alt38=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalSoftgallery.g:5990:3: kw= 'RoutingConf'
                    {
                    kw=(Token)match(input,117,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDOMTypeConfAccess().getRoutingConfKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSoftgallery.g:5996:3: kw= 'ServiceWorker'
                    {
                    kw=(Token)match(input,118,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDOMTypeConfAccess().getServiceWorkerKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSoftgallery.g:6002:3: kw= 'HTMLStructure'
                    {
                    kw=(Token)match(input,119,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDOMTypeConfAccess().getHTMLStructureKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalSoftgallery.g:6008:3: kw= 'Manifest'
                    {
                    kw=(Token)match(input,120,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDOMTypeConfAccess().getManifestKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalSoftgallery.g:6014:3: kw= 'RepositoriesConf'
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
    // InternalSoftgallery.g:6023:1: entryRuleReactComponents returns [EObject current=null] : iv_ruleReactComponents= ruleReactComponents EOF ;
    public final EObject entryRuleReactComponents() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactComponents = null;


        try {
            // InternalSoftgallery.g:6023:56: (iv_ruleReactComponents= ruleReactComponents EOF )
            // InternalSoftgallery.g:6024:2: iv_ruleReactComponents= ruleReactComponents EOF
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
    // InternalSoftgallery.g:6030:1: ruleReactComponents returns [EObject current=null] : (otherlv_0= 'ReactComponents' otherlv_1= ':' otherlv_2= '{' ( (lv_componentslogic_3_0= ruleComponentsLogic ) ) ( (lv_componentsui_4_0= ruleComponentsUI ) ) otherlv_5= '}' ) ;
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
            // InternalSoftgallery.g:6036:2: ( (otherlv_0= 'ReactComponents' otherlv_1= ':' otherlv_2= '{' ( (lv_componentslogic_3_0= ruleComponentsLogic ) ) ( (lv_componentsui_4_0= ruleComponentsUI ) ) otherlv_5= '}' ) )
            // InternalSoftgallery.g:6037:2: (otherlv_0= 'ReactComponents' otherlv_1= ':' otherlv_2= '{' ( (lv_componentslogic_3_0= ruleComponentsLogic ) ) ( (lv_componentsui_4_0= ruleComponentsUI ) ) otherlv_5= '}' )
            {
            // InternalSoftgallery.g:6037:2: (otherlv_0= 'ReactComponents' otherlv_1= ':' otherlv_2= '{' ( (lv_componentslogic_3_0= ruleComponentsLogic ) ) ( (lv_componentsui_4_0= ruleComponentsUI ) ) otherlv_5= '}' )
            // InternalSoftgallery.g:6038:3: otherlv_0= 'ReactComponents' otherlv_1= ':' otherlv_2= '{' ( (lv_componentslogic_3_0= ruleComponentsLogic ) ) ( (lv_componentsui_4_0= ruleComponentsUI ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,122,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getReactComponentsAccess().getReactComponentsKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getReactComponentsAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_126); 

            			newLeafNode(otherlv_2, grammarAccess.getReactComponentsAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSoftgallery.g:6050:3: ( (lv_componentslogic_3_0= ruleComponentsLogic ) )
            // InternalSoftgallery.g:6051:4: (lv_componentslogic_3_0= ruleComponentsLogic )
            {
            // InternalSoftgallery.g:6051:4: (lv_componentslogic_3_0= ruleComponentsLogic )
            // InternalSoftgallery.g:6052:5: lv_componentslogic_3_0= ruleComponentsLogic
            {

            					newCompositeNode(grammarAccess.getReactComponentsAccess().getComponentslogicComponentsLogicParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_127);
            lv_componentslogic_3_0=ruleComponentsLogic();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReactComponentsRule());
            					}
            					add(
            						current,
            						"componentslogic",
            						lv_componentslogic_3_0,
            						"co.unal.photos.Softgallery.ComponentsLogic");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftgallery.g:6069:3: ( (lv_componentsui_4_0= ruleComponentsUI ) )
            // InternalSoftgallery.g:6070:4: (lv_componentsui_4_0= ruleComponentsUI )
            {
            // InternalSoftgallery.g:6070:4: (lv_componentsui_4_0= ruleComponentsUI )
            // InternalSoftgallery.g:6071:5: lv_componentsui_4_0= ruleComponentsUI
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
            						"co.unal.photos.Softgallery.ComponentsUI");
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
    // InternalSoftgallery.g:6096:1: entryRuleComponentsLogic returns [EObject current=null] : iv_ruleComponentsLogic= ruleComponentsLogic EOF ;
    public final EObject entryRuleComponentsLogic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentsLogic = null;


        try {
            // InternalSoftgallery.g:6096:56: (iv_ruleComponentsLogic= ruleComponentsLogic EOF )
            // InternalSoftgallery.g:6097:2: iv_ruleComponentsLogic= ruleComponentsLogic EOF
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
    // InternalSoftgallery.g:6103:1: ruleComponentsLogic returns [EObject current=null] : (otherlv_0= 'LogicComponents' ( (lv_name_1_0= RULE_ID ) ) ( (lv_logiccomponents_2_0= ruleLogicContent ) ) ) ;
    public final EObject ruleComponentsLogic() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_logiccomponents_2_0 = null;



        	enterRule();

        try {
            // InternalSoftgallery.g:6109:2: ( (otherlv_0= 'LogicComponents' ( (lv_name_1_0= RULE_ID ) ) ( (lv_logiccomponents_2_0= ruleLogicContent ) ) ) )
            // InternalSoftgallery.g:6110:2: (otherlv_0= 'LogicComponents' ( (lv_name_1_0= RULE_ID ) ) ( (lv_logiccomponents_2_0= ruleLogicContent ) ) )
            {
            // InternalSoftgallery.g:6110:2: (otherlv_0= 'LogicComponents' ( (lv_name_1_0= RULE_ID ) ) ( (lv_logiccomponents_2_0= ruleLogicContent ) ) )
            // InternalSoftgallery.g:6111:3: otherlv_0= 'LogicComponents' ( (lv_name_1_0= RULE_ID ) ) ( (lv_logiccomponents_2_0= ruleLogicContent ) )
            {
            otherlv_0=(Token)match(input,123,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentsLogicAccess().getLogicComponentsKeyword_0());
            		
            // InternalSoftgallery.g:6115:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:6116:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:6116:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:6117:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_128); 

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

            // InternalSoftgallery.g:6133:3: ( (lv_logiccomponents_2_0= ruleLogicContent ) )
            // InternalSoftgallery.g:6134:4: (lv_logiccomponents_2_0= ruleLogicContent )
            {
            // InternalSoftgallery.g:6134:4: (lv_logiccomponents_2_0= ruleLogicContent )
            // InternalSoftgallery.g:6135:5: lv_logiccomponents_2_0= ruleLogicContent
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
            						"co.unal.photos.Softgallery.LogicContent");
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
    // InternalSoftgallery.g:6156:1: entryRuleLogicContent returns [EObject current=null] : iv_ruleLogicContent= ruleLogicContent EOF ;
    public final EObject entryRuleLogicContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicContent = null;


        try {
            // InternalSoftgallery.g:6156:53: (iv_ruleLogicContent= ruleLogicContent EOF )
            // InternalSoftgallery.g:6157:2: iv_ruleLogicContent= ruleLogicContent EOF
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
    // InternalSoftgallery.g:6163:1: ruleLogicContent returns [EObject current=null] : (otherlv_0= 'RoutingComponents' ( (lv_name_1_0= RULE_ID ) ) ( (lv_logiccomponents_2_0= ruleLogicStructure ) ) ) ;
    public final EObject ruleLogicContent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_logiccomponents_2_0 = null;



        	enterRule();

        try {
            // InternalSoftgallery.g:6169:2: ( (otherlv_0= 'RoutingComponents' ( (lv_name_1_0= RULE_ID ) ) ( (lv_logiccomponents_2_0= ruleLogicStructure ) ) ) )
            // InternalSoftgallery.g:6170:2: (otherlv_0= 'RoutingComponents' ( (lv_name_1_0= RULE_ID ) ) ( (lv_logiccomponents_2_0= ruleLogicStructure ) ) )
            {
            // InternalSoftgallery.g:6170:2: (otherlv_0= 'RoutingComponents' ( (lv_name_1_0= RULE_ID ) ) ( (lv_logiccomponents_2_0= ruleLogicStructure ) ) )
            // InternalSoftgallery.g:6171:3: otherlv_0= 'RoutingComponents' ( (lv_name_1_0= RULE_ID ) ) ( (lv_logiccomponents_2_0= ruleLogicStructure ) )
            {
            otherlv_0=(Token)match(input,124,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicContentAccess().getRoutingComponentsKeyword_0());
            		
            // InternalSoftgallery.g:6175:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:6176:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:6176:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:6177:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_129); 

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

            // InternalSoftgallery.g:6193:3: ( (lv_logiccomponents_2_0= ruleLogicStructure ) )
            // InternalSoftgallery.g:6194:4: (lv_logiccomponents_2_0= ruleLogicStructure )
            {
            // InternalSoftgallery.g:6194:4: (lv_logiccomponents_2_0= ruleLogicStructure )
            // InternalSoftgallery.g:6195:5: lv_logiccomponents_2_0= ruleLogicStructure
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
            						"co.unal.photos.Softgallery.LogicStructure");
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
    // InternalSoftgallery.g:6216:1: entryRuleLogicStructure returns [EObject current=null] : iv_ruleLogicStructure= ruleLogicStructure EOF ;
    public final EObject entryRuleLogicStructure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicStructure = null;


        try {
            // InternalSoftgallery.g:6216:55: (iv_ruleLogicStructure= ruleLogicStructure EOF )
            // InternalSoftgallery.g:6217:2: iv_ruleLogicStructure= ruleLogicStructure EOF
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
    // InternalSoftgallery.g:6223:1: ruleLogicStructure returns [EObject current=null] : (otherlv_0= 'AppComponent' ( (lv_name_1_0= RULE_ID ) ) ( (lv_logiccomponents_2_0= ruleComponentClass ) ) otherlv_3= 'IndexComponent' ( (lv_name_4_0= RULE_ID ) ) ) ;
    public final EObject ruleLogicStructure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        EObject lv_logiccomponents_2_0 = null;



        	enterRule();

        try {
            // InternalSoftgallery.g:6229:2: ( (otherlv_0= 'AppComponent' ( (lv_name_1_0= RULE_ID ) ) ( (lv_logiccomponents_2_0= ruleComponentClass ) ) otherlv_3= 'IndexComponent' ( (lv_name_4_0= RULE_ID ) ) ) )
            // InternalSoftgallery.g:6230:2: (otherlv_0= 'AppComponent' ( (lv_name_1_0= RULE_ID ) ) ( (lv_logiccomponents_2_0= ruleComponentClass ) ) otherlv_3= 'IndexComponent' ( (lv_name_4_0= RULE_ID ) ) )
            {
            // InternalSoftgallery.g:6230:2: (otherlv_0= 'AppComponent' ( (lv_name_1_0= RULE_ID ) ) ( (lv_logiccomponents_2_0= ruleComponentClass ) ) otherlv_3= 'IndexComponent' ( (lv_name_4_0= RULE_ID ) ) )
            // InternalSoftgallery.g:6231:3: otherlv_0= 'AppComponent' ( (lv_name_1_0= RULE_ID ) ) ( (lv_logiccomponents_2_0= ruleComponentClass ) ) otherlv_3= 'IndexComponent' ( (lv_name_4_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,125,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicStructureAccess().getAppComponentKeyword_0());
            		
            // InternalSoftgallery.g:6235:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:6236:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:6236:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:6237:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_130); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLogicStructureAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicStructureRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSoftgallery.g:6253:3: ( (lv_logiccomponents_2_0= ruleComponentClass ) )
            // InternalSoftgallery.g:6254:4: (lv_logiccomponents_2_0= ruleComponentClass )
            {
            // InternalSoftgallery.g:6254:4: (lv_logiccomponents_2_0= ruleComponentClass )
            // InternalSoftgallery.g:6255:5: lv_logiccomponents_2_0= ruleComponentClass
            {

            					newCompositeNode(grammarAccess.getLogicStructureAccess().getLogiccomponentsComponentClassParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_131);
            lv_logiccomponents_2_0=ruleComponentClass();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLogicStructureRule());
            					}
            					add(
            						current,
            						"logiccomponents",
            						lv_logiccomponents_2_0,
            						"co.unal.photos.Softgallery.ComponentClass");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,126,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getLogicStructureAccess().getIndexComponentKeyword_3());
            		
            // InternalSoftgallery.g:6276:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalSoftgallery.g:6277:4: (lv_name_4_0= RULE_ID )
            {
            // InternalSoftgallery.g:6277:4: (lv_name_4_0= RULE_ID )
            // InternalSoftgallery.g:6278:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_4_0, grammarAccess.getLogicStructureAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicStructureRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
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
    // InternalSoftgallery.g:6298:1: entryRuleComponentsUI returns [EObject current=null] : iv_ruleComponentsUI= ruleComponentsUI EOF ;
    public final EObject entryRuleComponentsUI() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentsUI = null;


        try {
            // InternalSoftgallery.g:6298:53: (iv_ruleComponentsUI= ruleComponentsUI EOF )
            // InternalSoftgallery.g:6299:2: iv_ruleComponentsUI= ruleComponentsUI EOF
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
    // InternalSoftgallery.g:6305:1: ruleComponentsUI returns [EObject current=null] : (otherlv_0= 'UIComponents' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uicomponents_2_0= ruleUIContent ) ) ) ;
    public final EObject ruleComponentsUI() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_uicomponents_2_0 = null;



        	enterRule();

        try {
            // InternalSoftgallery.g:6311:2: ( (otherlv_0= 'UIComponents' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uicomponents_2_0= ruleUIContent ) ) ) )
            // InternalSoftgallery.g:6312:2: (otherlv_0= 'UIComponents' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uicomponents_2_0= ruleUIContent ) ) )
            {
            // InternalSoftgallery.g:6312:2: (otherlv_0= 'UIComponents' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uicomponents_2_0= ruleUIContent ) ) )
            // InternalSoftgallery.g:6313:3: otherlv_0= 'UIComponents' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uicomponents_2_0= ruleUIContent ) )
            {
            otherlv_0=(Token)match(input,127,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentsUIAccess().getUIComponentsKeyword_0());
            		
            // InternalSoftgallery.g:6317:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:6318:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:6318:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:6319:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_132); 

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

            // InternalSoftgallery.g:6335:3: ( (lv_uicomponents_2_0= ruleUIContent ) )
            // InternalSoftgallery.g:6336:4: (lv_uicomponents_2_0= ruleUIContent )
            {
            // InternalSoftgallery.g:6336:4: (lv_uicomponents_2_0= ruleUIContent )
            // InternalSoftgallery.g:6337:5: lv_uicomponents_2_0= ruleUIContent
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
            						"co.unal.photos.Softgallery.UIContent");
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
    // InternalSoftgallery.g:6358:1: entryRuleUIContent returns [EObject current=null] : iv_ruleUIContent= ruleUIContent EOF ;
    public final EObject entryRuleUIContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIContent = null;


        try {
            // InternalSoftgallery.g:6358:50: (iv_ruleUIContent= ruleUIContent EOF )
            // InternalSoftgallery.g:6359:2: iv_ruleUIContent= ruleUIContent EOF
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
    // InternalSoftgallery.g:6365:1: ruleUIContent returns [EObject current=null] : ( (otherlv_0= 'ViewComponent' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uicontent_2_0= ruleComponentClass ) ) )+ (otherlv_3= 'Subcomponents' ( (lv_name_4_0= RULE_ID ) ) ( (lv_uicontent_5_0= ruleComponentClass ) ) )+ ) ;
    public final EObject ruleUIContent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        EObject lv_uicontent_2_0 = null;

        EObject lv_uicontent_5_0 = null;



        	enterRule();

        try {
            // InternalSoftgallery.g:6371:2: ( ( (otherlv_0= 'ViewComponent' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uicontent_2_0= ruleComponentClass ) ) )+ (otherlv_3= 'Subcomponents' ( (lv_name_4_0= RULE_ID ) ) ( (lv_uicontent_5_0= ruleComponentClass ) ) )+ ) )
            // InternalSoftgallery.g:6372:2: ( (otherlv_0= 'ViewComponent' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uicontent_2_0= ruleComponentClass ) ) )+ (otherlv_3= 'Subcomponents' ( (lv_name_4_0= RULE_ID ) ) ( (lv_uicontent_5_0= ruleComponentClass ) ) )+ )
            {
            // InternalSoftgallery.g:6372:2: ( (otherlv_0= 'ViewComponent' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uicontent_2_0= ruleComponentClass ) ) )+ (otherlv_3= 'Subcomponents' ( (lv_name_4_0= RULE_ID ) ) ( (lv_uicontent_5_0= ruleComponentClass ) ) )+ )
            // InternalSoftgallery.g:6373:3: (otherlv_0= 'ViewComponent' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uicontent_2_0= ruleComponentClass ) ) )+ (otherlv_3= 'Subcomponents' ( (lv_name_4_0= RULE_ID ) ) ( (lv_uicontent_5_0= ruleComponentClass ) ) )+
            {
            // InternalSoftgallery.g:6373:3: (otherlv_0= 'ViewComponent' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uicontent_2_0= ruleComponentClass ) ) )+
            int cnt39=0;
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==128) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalSoftgallery.g:6374:4: otherlv_0= 'ViewComponent' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uicontent_2_0= ruleComponentClass ) )
            	    {
            	    otherlv_0=(Token)match(input,128,FOLLOW_9); 

            	    				newLeafNode(otherlv_0, grammarAccess.getUIContentAccess().getViewComponentKeyword_0_0());
            	    			
            	    // InternalSoftgallery.g:6378:4: ( (lv_name_1_0= RULE_ID ) )
            	    // InternalSoftgallery.g:6379:5: (lv_name_1_0= RULE_ID )
            	    {
            	    // InternalSoftgallery.g:6379:5: (lv_name_1_0= RULE_ID )
            	    // InternalSoftgallery.g:6380:6: lv_name_1_0= RULE_ID
            	    {
            	    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_130); 

            	    						newLeafNode(lv_name_1_0, grammarAccess.getUIContentAccess().getNameIDTerminalRuleCall_0_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getUIContentRule());
            	    						}
            	    						setWithLastConsumed(
            	    							current,
            	    							"name",
            	    							lv_name_1_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }

            	    // InternalSoftgallery.g:6396:4: ( (lv_uicontent_2_0= ruleComponentClass ) )
            	    // InternalSoftgallery.g:6397:5: (lv_uicontent_2_0= ruleComponentClass )
            	    {
            	    // InternalSoftgallery.g:6397:5: (lv_uicontent_2_0= ruleComponentClass )
            	    // InternalSoftgallery.g:6398:6: lv_uicontent_2_0= ruleComponentClass
            	    {

            	    						newCompositeNode(grammarAccess.getUIContentAccess().getUicontentComponentClassParserRuleCall_0_2_0());
            	    					
            	    pushFollow(FOLLOW_133);
            	    lv_uicontent_2_0=ruleComponentClass();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getUIContentRule());
            	    						}
            	    						add(
            	    							current,
            	    							"uicontent",
            	    							lv_uicontent_2_0,
            	    							"co.unal.photos.Softgallery.ComponentClass");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt39 >= 1 ) break loop39;
                        EarlyExitException eee =
                            new EarlyExitException(39, input);
                        throw eee;
                }
                cnt39++;
            } while (true);

            // InternalSoftgallery.g:6416:3: (otherlv_3= 'Subcomponents' ( (lv_name_4_0= RULE_ID ) ) ( (lv_uicontent_5_0= ruleComponentClass ) ) )+
            int cnt40=0;
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==129) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalSoftgallery.g:6417:4: otherlv_3= 'Subcomponents' ( (lv_name_4_0= RULE_ID ) ) ( (lv_uicontent_5_0= ruleComponentClass ) )
            	    {
            	    otherlv_3=(Token)match(input,129,FOLLOW_9); 

            	    				newLeafNode(otherlv_3, grammarAccess.getUIContentAccess().getSubcomponentsKeyword_1_0());
            	    			
            	    // InternalSoftgallery.g:6421:4: ( (lv_name_4_0= RULE_ID ) )
            	    // InternalSoftgallery.g:6422:5: (lv_name_4_0= RULE_ID )
            	    {
            	    // InternalSoftgallery.g:6422:5: (lv_name_4_0= RULE_ID )
            	    // InternalSoftgallery.g:6423:6: lv_name_4_0= RULE_ID
            	    {
            	    lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_130); 

            	    						newLeafNode(lv_name_4_0, grammarAccess.getUIContentAccess().getNameIDTerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getUIContentRule());
            	    						}
            	    						setWithLastConsumed(
            	    							current,
            	    							"name",
            	    							lv_name_4_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }

            	    // InternalSoftgallery.g:6439:4: ( (lv_uicontent_5_0= ruleComponentClass ) )
            	    // InternalSoftgallery.g:6440:5: (lv_uicontent_5_0= ruleComponentClass )
            	    {
            	    // InternalSoftgallery.g:6440:5: (lv_uicontent_5_0= ruleComponentClass )
            	    // InternalSoftgallery.g:6441:6: lv_uicontent_5_0= ruleComponentClass
            	    {

            	    						newCompositeNode(grammarAccess.getUIContentAccess().getUicontentComponentClassParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_134);
            	    lv_uicontent_5_0=ruleComponentClass();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getUIContentRule());
            	    						}
            	    						add(
            	    							current,
            	    							"uicontent",
            	    							lv_uicontent_5_0,
            	    							"co.unal.photos.Softgallery.ComponentClass");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt40 >= 1 ) break loop40;
                        EarlyExitException eee =
                            new EarlyExitException(40, input);
                        throw eee;
                }
                cnt40++;
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


    // $ANTLR start "entryRuleComponentClass"
    // InternalSoftgallery.g:6463:1: entryRuleComponentClass returns [EObject current=null] : iv_ruleComponentClass= ruleComponentClass EOF ;
    public final EObject entryRuleComponentClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentClass = null;


        try {
            // InternalSoftgallery.g:6463:55: (iv_ruleComponentClass= ruleComponentClass EOF )
            // InternalSoftgallery.g:6464:2: iv_ruleComponentClass= ruleComponentClass EOF
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
    // InternalSoftgallery.g:6470:1: ruleComponentClass returns [EObject current=null] : ( ( (lv_componentclass_0_0= ruleReactFunctions ) ) ( (lv_componentclass_1_0= ruleProps ) ) ) ;
    public final EObject ruleComponentClass() throws RecognitionException {
        EObject current = null;

        EObject lv_componentclass_0_0 = null;

        EObject lv_componentclass_1_0 = null;



        	enterRule();

        try {
            // InternalSoftgallery.g:6476:2: ( ( ( (lv_componentclass_0_0= ruleReactFunctions ) ) ( (lv_componentclass_1_0= ruleProps ) ) ) )
            // InternalSoftgallery.g:6477:2: ( ( (lv_componentclass_0_0= ruleReactFunctions ) ) ( (lv_componentclass_1_0= ruleProps ) ) )
            {
            // InternalSoftgallery.g:6477:2: ( ( (lv_componentclass_0_0= ruleReactFunctions ) ) ( (lv_componentclass_1_0= ruleProps ) ) )
            // InternalSoftgallery.g:6478:3: ( (lv_componentclass_0_0= ruleReactFunctions ) ) ( (lv_componentclass_1_0= ruleProps ) )
            {
            // InternalSoftgallery.g:6478:3: ( (lv_componentclass_0_0= ruleReactFunctions ) )
            // InternalSoftgallery.g:6479:4: (lv_componentclass_0_0= ruleReactFunctions )
            {
            // InternalSoftgallery.g:6479:4: (lv_componentclass_0_0= ruleReactFunctions )
            // InternalSoftgallery.g:6480:5: lv_componentclass_0_0= ruleReactFunctions
            {

            					newCompositeNode(grammarAccess.getComponentClassAccess().getComponentclassReactFunctionsParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_135);
            lv_componentclass_0_0=ruleReactFunctions();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentClassRule());
            					}
            					add(
            						current,
            						"componentclass",
            						lv_componentclass_0_0,
            						"co.unal.photos.Softgallery.ReactFunctions");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftgallery.g:6497:3: ( (lv_componentclass_1_0= ruleProps ) )
            // InternalSoftgallery.g:6498:4: (lv_componentclass_1_0= ruleProps )
            {
            // InternalSoftgallery.g:6498:4: (lv_componentclass_1_0= ruleProps )
            // InternalSoftgallery.g:6499:5: lv_componentclass_1_0= ruleProps
            {

            					newCompositeNode(grammarAccess.getComponentClassAccess().getComponentclassPropsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_componentclass_1_0=ruleProps();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentClassRule());
            					}
            					add(
            						current,
            						"componentclass",
            						lv_componentclass_1_0,
            						"co.unal.photos.Softgallery.Props");
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


    // $ANTLR start "entryRuleReactFunctions"
    // InternalSoftgallery.g:6520:1: entryRuleReactFunctions returns [EObject current=null] : iv_ruleReactFunctions= ruleReactFunctions EOF ;
    public final EObject entryRuleReactFunctions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactFunctions = null;


        try {
            // InternalSoftgallery.g:6520:55: (iv_ruleReactFunctions= ruleReactFunctions EOF )
            // InternalSoftgallery.g:6521:2: iv_ruleReactFunctions= ruleReactFunctions EOF
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
    // InternalSoftgallery.g:6527:1: ruleReactFunctions returns [EObject current=null] : ( ( (lv_componentclass_0_0= ruleReactConstructor ) ) ( (lv_lifecycleclass_1_0= ruleReactLifeCycle ) )* ( (lv_componentclass_2_0= ruleReactCoreFunctions ) )* ( (lv_renderclass_3_0= ruleReactRender ) ) ) ;
    public final EObject ruleReactFunctions() throws RecognitionException {
        EObject current = null;

        EObject lv_componentclass_0_0 = null;

        AntlrDatatypeRuleToken lv_lifecycleclass_1_0 = null;

        EObject lv_componentclass_2_0 = null;

        AntlrDatatypeRuleToken lv_renderclass_3_0 = null;



        	enterRule();

        try {
            // InternalSoftgallery.g:6533:2: ( ( ( (lv_componentclass_0_0= ruleReactConstructor ) ) ( (lv_lifecycleclass_1_0= ruleReactLifeCycle ) )* ( (lv_componentclass_2_0= ruleReactCoreFunctions ) )* ( (lv_renderclass_3_0= ruleReactRender ) ) ) )
            // InternalSoftgallery.g:6534:2: ( ( (lv_componentclass_0_0= ruleReactConstructor ) ) ( (lv_lifecycleclass_1_0= ruleReactLifeCycle ) )* ( (lv_componentclass_2_0= ruleReactCoreFunctions ) )* ( (lv_renderclass_3_0= ruleReactRender ) ) )
            {
            // InternalSoftgallery.g:6534:2: ( ( (lv_componentclass_0_0= ruleReactConstructor ) ) ( (lv_lifecycleclass_1_0= ruleReactLifeCycle ) )* ( (lv_componentclass_2_0= ruleReactCoreFunctions ) )* ( (lv_renderclass_3_0= ruleReactRender ) ) )
            // InternalSoftgallery.g:6535:3: ( (lv_componentclass_0_0= ruleReactConstructor ) ) ( (lv_lifecycleclass_1_0= ruleReactLifeCycle ) )* ( (lv_componentclass_2_0= ruleReactCoreFunctions ) )* ( (lv_renderclass_3_0= ruleReactRender ) )
            {
            // InternalSoftgallery.g:6535:3: ( (lv_componentclass_0_0= ruleReactConstructor ) )
            // InternalSoftgallery.g:6536:4: (lv_componentclass_0_0= ruleReactConstructor )
            {
            // InternalSoftgallery.g:6536:4: (lv_componentclass_0_0= ruleReactConstructor )
            // InternalSoftgallery.g:6537:5: lv_componentclass_0_0= ruleReactConstructor
            {

            					newCompositeNode(grammarAccess.getReactFunctionsAccess().getComponentclassReactConstructorParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_136);
            lv_componentclass_0_0=ruleReactConstructor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReactFunctionsRule());
            					}
            					add(
            						current,
            						"componentclass",
            						lv_componentclass_0_0,
            						"co.unal.photos.Softgallery.ReactConstructor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftgallery.g:6554:3: ( (lv_lifecycleclass_1_0= ruleReactLifeCycle ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==139||(LA41_0>=141 && LA41_0<=142)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalSoftgallery.g:6555:4: (lv_lifecycleclass_1_0= ruleReactLifeCycle )
            	    {
            	    // InternalSoftgallery.g:6555:4: (lv_lifecycleclass_1_0= ruleReactLifeCycle )
            	    // InternalSoftgallery.g:6556:5: lv_lifecycleclass_1_0= ruleReactLifeCycle
            	    {

            	    					newCompositeNode(grammarAccess.getReactFunctionsAccess().getLifecycleclassReactLifeCycleParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_136);
            	    lv_lifecycleclass_1_0=ruleReactLifeCycle();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getReactFunctionsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"lifecycleclass",
            	    						lv_lifecycleclass_1_0,
            	    						"co.unal.photos.Softgallery.ReactLifeCycle");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            // InternalSoftgallery.g:6573:3: ( (lv_componentclass_2_0= ruleReactCoreFunctions ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_ID) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalSoftgallery.g:6574:4: (lv_componentclass_2_0= ruleReactCoreFunctions )
            	    {
            	    // InternalSoftgallery.g:6574:4: (lv_componentclass_2_0= ruleReactCoreFunctions )
            	    // InternalSoftgallery.g:6575:5: lv_componentclass_2_0= ruleReactCoreFunctions
            	    {

            	    					newCompositeNode(grammarAccess.getReactFunctionsAccess().getComponentclassReactCoreFunctionsParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_136);
            	    lv_componentclass_2_0=ruleReactCoreFunctions();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getReactFunctionsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"componentclass",
            	    						lv_componentclass_2_0,
            	    						"co.unal.photos.Softgallery.ReactCoreFunctions");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            // InternalSoftgallery.g:6592:3: ( (lv_renderclass_3_0= ruleReactRender ) )
            // InternalSoftgallery.g:6593:4: (lv_renderclass_3_0= ruleReactRender )
            {
            // InternalSoftgallery.g:6593:4: (lv_renderclass_3_0= ruleReactRender )
            // InternalSoftgallery.g:6594:5: lv_renderclass_3_0= ruleReactRender
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
            						"co.unal.photos.Softgallery.ReactRender");
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
    // InternalSoftgallery.g:6615:1: entryRuleReactConstructor returns [EObject current=null] : iv_ruleReactConstructor= ruleReactConstructor EOF ;
    public final EObject entryRuleReactConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactConstructor = null;


        try {
            // InternalSoftgallery.g:6615:57: (iv_ruleReactConstructor= ruleReactConstructor EOF )
            // InternalSoftgallery.g:6616:2: iv_ruleReactConstructor= ruleReactConstructor EOF
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
    // InternalSoftgallery.g:6622:1: ruleReactConstructor returns [EObject current=null] : (otherlv_0= 'Constructor' ( (lv_componentclass_1_0= ruleState ) ) ( (lv_componentclass_2_0= ruleCoreFunctionsDeclaration ) )* ) ;
    public final EObject ruleReactConstructor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_componentclass_1_0 = null;

        EObject lv_componentclass_2_0 = null;



        	enterRule();

        try {
            // InternalSoftgallery.g:6628:2: ( (otherlv_0= 'Constructor' ( (lv_componentclass_1_0= ruleState ) ) ( (lv_componentclass_2_0= ruleCoreFunctionsDeclaration ) )* ) )
            // InternalSoftgallery.g:6629:2: (otherlv_0= 'Constructor' ( (lv_componentclass_1_0= ruleState ) ) ( (lv_componentclass_2_0= ruleCoreFunctionsDeclaration ) )* )
            {
            // InternalSoftgallery.g:6629:2: (otherlv_0= 'Constructor' ( (lv_componentclass_1_0= ruleState ) ) ( (lv_componentclass_2_0= ruleCoreFunctionsDeclaration ) )* )
            // InternalSoftgallery.g:6630:3: otherlv_0= 'Constructor' ( (lv_componentclass_1_0= ruleState ) ) ( (lv_componentclass_2_0= ruleCoreFunctionsDeclaration ) )*
            {
            otherlv_0=(Token)match(input,130,FOLLOW_137); 

            			newLeafNode(otherlv_0, grammarAccess.getReactConstructorAccess().getConstructorKeyword_0());
            		
            // InternalSoftgallery.g:6634:3: ( (lv_componentclass_1_0= ruleState ) )
            // InternalSoftgallery.g:6635:4: (lv_componentclass_1_0= ruleState )
            {
            // InternalSoftgallery.g:6635:4: (lv_componentclass_1_0= ruleState )
            // InternalSoftgallery.g:6636:5: lv_componentclass_1_0= ruleState
            {

            					newCompositeNode(grammarAccess.getReactConstructorAccess().getComponentclassStateParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_138);
            lv_componentclass_1_0=ruleState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReactConstructorRule());
            					}
            					add(
            						current,
            						"componentclass",
            						lv_componentclass_1_0,
            						"co.unal.photos.Softgallery.State");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftgallery.g:6653:3: ( (lv_componentclass_2_0= ruleCoreFunctionsDeclaration ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_ID) ) {
                    int LA43_2 = input.LA(2);

                    if ( (LA43_2==138) ) {
                        alt43=1;
                    }


                }


                switch (alt43) {
            	case 1 :
            	    // InternalSoftgallery.g:6654:4: (lv_componentclass_2_0= ruleCoreFunctionsDeclaration )
            	    {
            	    // InternalSoftgallery.g:6654:4: (lv_componentclass_2_0= ruleCoreFunctionsDeclaration )
            	    // InternalSoftgallery.g:6655:5: lv_componentclass_2_0= ruleCoreFunctionsDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getReactConstructorAccess().getComponentclassCoreFunctionsDeclarationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_138);
            	    lv_componentclass_2_0=ruleCoreFunctionsDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getReactConstructorRule());
            	    					}
            	    					add(
            	    						current,
            	    						"componentclass",
            	    						lv_componentclass_2_0,
            	    						"co.unal.photos.Softgallery.CoreFunctionsDeclaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
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
    // InternalSoftgallery.g:6676:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalSoftgallery.g:6676:46: (iv_ruleState= ruleState EOF )
            // InternalSoftgallery.g:6677:2: iv_ruleState= ruleState EOF
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
    // InternalSoftgallery.g:6683:1: ruleState returns [EObject current=null] : (otherlv_0= 'State' ( ( (lv_name_1_0= RULE_ID ) ) ( (lv_componentclass_2_0= ruleDataType ) ) )* ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_componentclass_2_0 = null;



        	enterRule();

        try {
            // InternalSoftgallery.g:6689:2: ( (otherlv_0= 'State' ( ( (lv_name_1_0= RULE_ID ) ) ( (lv_componentclass_2_0= ruleDataType ) ) )* ) )
            // InternalSoftgallery.g:6690:2: (otherlv_0= 'State' ( ( (lv_name_1_0= RULE_ID ) ) ( (lv_componentclass_2_0= ruleDataType ) ) )* )
            {
            // InternalSoftgallery.g:6690:2: (otherlv_0= 'State' ( ( (lv_name_1_0= RULE_ID ) ) ( (lv_componentclass_2_0= ruleDataType ) ) )* )
            // InternalSoftgallery.g:6691:3: otherlv_0= 'State' ( ( (lv_name_1_0= RULE_ID ) ) ( (lv_componentclass_2_0= ruleDataType ) ) )*
            {
            otherlv_0=(Token)match(input,131,FOLLOW_138); 

            			newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
            		
            // InternalSoftgallery.g:6695:3: ( ( (lv_name_1_0= RULE_ID ) ) ( (lv_componentclass_2_0= ruleDataType ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==RULE_ID) ) {
                    int LA44_1 = input.LA(2);

                    if ( ((LA44_1>=132 && LA44_1<=137)) ) {
                        alt44=1;
                    }


                }


                switch (alt44) {
            	case 1 :
            	    // InternalSoftgallery.g:6696:4: ( (lv_name_1_0= RULE_ID ) ) ( (lv_componentclass_2_0= ruleDataType ) )
            	    {
            	    // InternalSoftgallery.g:6696:4: ( (lv_name_1_0= RULE_ID ) )
            	    // InternalSoftgallery.g:6697:5: (lv_name_1_0= RULE_ID )
            	    {
            	    // InternalSoftgallery.g:6697:5: (lv_name_1_0= RULE_ID )
            	    // InternalSoftgallery.g:6698:6: lv_name_1_0= RULE_ID
            	    {
            	    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_139); 

            	    						newLeafNode(lv_name_1_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getStateRule());
            	    						}
            	    						setWithLastConsumed(
            	    							current,
            	    							"name",
            	    							lv_name_1_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }

            	    // InternalSoftgallery.g:6714:4: ( (lv_componentclass_2_0= ruleDataType ) )
            	    // InternalSoftgallery.g:6715:5: (lv_componentclass_2_0= ruleDataType )
            	    {
            	    // InternalSoftgallery.g:6715:5: (lv_componentclass_2_0= ruleDataType )
            	    // InternalSoftgallery.g:6716:6: lv_componentclass_2_0= ruleDataType
            	    {

            	    						newCompositeNode(grammarAccess.getStateAccess().getComponentclassDataTypeParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_138);
            	    lv_componentclass_2_0=ruleDataType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getStateRule());
            	    						}
            	    						add(
            	    							current,
            	    							"componentclass",
            	    							lv_componentclass_2_0,
            	    							"co.unal.photos.Softgallery.DataType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


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
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleDataType"
    // InternalSoftgallery.g:6738:1: entryRuleDataType returns [String current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final String entryRuleDataType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDataType = null;


        try {
            // InternalSoftgallery.g:6738:48: (iv_ruleDataType= ruleDataType EOF )
            // InternalSoftgallery.g:6739:2: iv_ruleDataType= ruleDataType EOF
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
    // InternalSoftgallery.g:6745:1: ruleDataType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'String' | kw= 'Array' | kw= 'Object' | kw= 'Number' | kw= 'null' | kw= 'Boolean' ) ;
    public final AntlrDatatypeRuleToken ruleDataType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSoftgallery.g:6751:2: ( (kw= 'String' | kw= 'Array' | kw= 'Object' | kw= 'Number' | kw= 'null' | kw= 'Boolean' ) )
            // InternalSoftgallery.g:6752:2: (kw= 'String' | kw= 'Array' | kw= 'Object' | kw= 'Number' | kw= 'null' | kw= 'Boolean' )
            {
            // InternalSoftgallery.g:6752:2: (kw= 'String' | kw= 'Array' | kw= 'Object' | kw= 'Number' | kw= 'null' | kw= 'Boolean' )
            int alt45=6;
            switch ( input.LA(1) ) {
            case 132:
                {
                alt45=1;
                }
                break;
            case 133:
                {
                alt45=2;
                }
                break;
            case 134:
                {
                alt45=3;
                }
                break;
            case 135:
                {
                alt45=4;
                }
                break;
            case 136:
                {
                alt45=5;
                }
                break;
            case 137:
                {
                alt45=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // InternalSoftgallery.g:6753:3: kw= 'String'
                    {
                    kw=(Token)match(input,132,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDataTypeAccess().getStringKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSoftgallery.g:6759:3: kw= 'Array'
                    {
                    kw=(Token)match(input,133,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDataTypeAccess().getArrayKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSoftgallery.g:6765:3: kw= 'Object'
                    {
                    kw=(Token)match(input,134,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDataTypeAccess().getObjectKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalSoftgallery.g:6771:3: kw= 'Number'
                    {
                    kw=(Token)match(input,135,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDataTypeAccess().getNumberKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalSoftgallery.g:6777:3: kw= 'null'
                    {
                    kw=(Token)match(input,136,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDataTypeAccess().getNullKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalSoftgallery.g:6783:3: kw= 'Boolean'
                    {
                    kw=(Token)match(input,137,FOLLOW_2); 

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
    // InternalSoftgallery.g:6792:1: entryRuleCoreFunctionsDeclaration returns [EObject current=null] : iv_ruleCoreFunctionsDeclaration= ruleCoreFunctionsDeclaration EOF ;
    public final EObject entryRuleCoreFunctionsDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoreFunctionsDeclaration = null;


        try {
            // InternalSoftgallery.g:6792:65: (iv_ruleCoreFunctionsDeclaration= ruleCoreFunctionsDeclaration EOF )
            // InternalSoftgallery.g:6793:2: iv_ruleCoreFunctionsDeclaration= ruleCoreFunctionsDeclaration EOF
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
    // InternalSoftgallery.g:6799:1: ruleCoreFunctionsDeclaration returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'FunctionBindingDeclaration' ) ;
    public final EObject ruleCoreFunctionsDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSoftgallery.g:6805:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'FunctionBindingDeclaration' ) )
            // InternalSoftgallery.g:6806:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'FunctionBindingDeclaration' )
            {
            // InternalSoftgallery.g:6806:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'FunctionBindingDeclaration' )
            // InternalSoftgallery.g:6807:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'FunctionBindingDeclaration'
            {
            // InternalSoftgallery.g:6807:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSoftgallery.g:6808:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSoftgallery.g:6808:4: (lv_name_0_0= RULE_ID )
            // InternalSoftgallery.g:6809:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_140); 

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

            otherlv_1=(Token)match(input,138,FOLLOW_2); 

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
    // InternalSoftgallery.g:6833:1: entryRuleReactLifeCycle returns [String current=null] : iv_ruleReactLifeCycle= ruleReactLifeCycle EOF ;
    public final String entryRuleReactLifeCycle() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReactLifeCycle = null;


        try {
            // InternalSoftgallery.g:6833:54: (iv_ruleReactLifeCycle= ruleReactLifeCycle EOF )
            // InternalSoftgallery.g:6834:2: iv_ruleReactLifeCycle= ruleReactLifeCycle EOF
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
    // InternalSoftgallery.g:6840:1: ruleReactLifeCycle returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'ComponentDidMount' kw= 'FunctionStructure' ) | (kw= 'ComponentDidUpdate' kw= 'FunctionStructure' ) | (kw= 'ComponentWillUnmount' kw= 'FunctionStructure' ) ) ;
    public final AntlrDatatypeRuleToken ruleReactLifeCycle() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSoftgallery.g:6846:2: ( ( (kw= 'ComponentDidMount' kw= 'FunctionStructure' ) | (kw= 'ComponentDidUpdate' kw= 'FunctionStructure' ) | (kw= 'ComponentWillUnmount' kw= 'FunctionStructure' ) ) )
            // InternalSoftgallery.g:6847:2: ( (kw= 'ComponentDidMount' kw= 'FunctionStructure' ) | (kw= 'ComponentDidUpdate' kw= 'FunctionStructure' ) | (kw= 'ComponentWillUnmount' kw= 'FunctionStructure' ) )
            {
            // InternalSoftgallery.g:6847:2: ( (kw= 'ComponentDidMount' kw= 'FunctionStructure' ) | (kw= 'ComponentDidUpdate' kw= 'FunctionStructure' ) | (kw= 'ComponentWillUnmount' kw= 'FunctionStructure' ) )
            int alt46=3;
            switch ( input.LA(1) ) {
            case 139:
                {
                alt46=1;
                }
                break;
            case 141:
                {
                alt46=2;
                }
                break;
            case 142:
                {
                alt46=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // InternalSoftgallery.g:6848:3: (kw= 'ComponentDidMount' kw= 'FunctionStructure' )
                    {
                    // InternalSoftgallery.g:6848:3: (kw= 'ComponentDidMount' kw= 'FunctionStructure' )
                    // InternalSoftgallery.g:6849:4: kw= 'ComponentDidMount' kw= 'FunctionStructure'
                    {
                    kw=(Token)match(input,139,FOLLOW_141); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getReactLifeCycleAccess().getComponentDidMountKeyword_0_0());
                    			
                    kw=(Token)match(input,140,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getReactLifeCycleAccess().getFunctionStructureKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSoftgallery.g:6861:3: (kw= 'ComponentDidUpdate' kw= 'FunctionStructure' )
                    {
                    // InternalSoftgallery.g:6861:3: (kw= 'ComponentDidUpdate' kw= 'FunctionStructure' )
                    // InternalSoftgallery.g:6862:4: kw= 'ComponentDidUpdate' kw= 'FunctionStructure'
                    {
                    kw=(Token)match(input,141,FOLLOW_141); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getReactLifeCycleAccess().getComponentDidUpdateKeyword_1_0());
                    			
                    kw=(Token)match(input,140,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getReactLifeCycleAccess().getFunctionStructureKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSoftgallery.g:6874:3: (kw= 'ComponentWillUnmount' kw= 'FunctionStructure' )
                    {
                    // InternalSoftgallery.g:6874:3: (kw= 'ComponentWillUnmount' kw= 'FunctionStructure' )
                    // InternalSoftgallery.g:6875:4: kw= 'ComponentWillUnmount' kw= 'FunctionStructure'
                    {
                    kw=(Token)match(input,142,FOLLOW_141); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getReactLifeCycleAccess().getComponentWillUnmountKeyword_2_0());
                    			
                    kw=(Token)match(input,140,FOLLOW_2); 

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
    // InternalSoftgallery.g:6890:1: entryRuleReactRender returns [String current=null] : iv_ruleReactRender= ruleReactRender EOF ;
    public final String entryRuleReactRender() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReactRender = null;


        try {
            // InternalSoftgallery.g:6890:51: (iv_ruleReactRender= ruleReactRender EOF )
            // InternalSoftgallery.g:6891:2: iv_ruleReactRender= ruleReactRender EOF
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
    // InternalSoftgallery.g:6897:1: ruleReactRender returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Render' kw= 'RenderContent' ) ;
    public final AntlrDatatypeRuleToken ruleReactRender() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSoftgallery.g:6903:2: ( (kw= 'Render' kw= 'RenderContent' ) )
            // InternalSoftgallery.g:6904:2: (kw= 'Render' kw= 'RenderContent' )
            {
            // InternalSoftgallery.g:6904:2: (kw= 'Render' kw= 'RenderContent' )
            // InternalSoftgallery.g:6905:3: kw= 'Render' kw= 'RenderContent'
            {
            kw=(Token)match(input,143,FOLLOW_142); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getReactRenderAccess().getRenderKeyword_0());
            		
            kw=(Token)match(input,144,FOLLOW_2); 

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
    // InternalSoftgallery.g:6919:1: entryRuleProps returns [EObject current=null] : iv_ruleProps= ruleProps EOF ;
    public final EObject entryRuleProps() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProps = null;


        try {
            // InternalSoftgallery.g:6919:46: (iv_ruleProps= ruleProps EOF )
            // InternalSoftgallery.g:6920:2: iv_ruleProps= ruleProps EOF
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
    // InternalSoftgallery.g:6926:1: ruleProps returns [EObject current=null] : (otherlv_0= 'Props' ( ( (lv_name_1_0= RULE_ID ) ) ( (lv_componentclass_2_0= ruleDataType ) ) )* ) ;
    public final EObject ruleProps() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_componentclass_2_0 = null;



        	enterRule();

        try {
            // InternalSoftgallery.g:6932:2: ( (otherlv_0= 'Props' ( ( (lv_name_1_0= RULE_ID ) ) ( (lv_componentclass_2_0= ruleDataType ) ) )* ) )
            // InternalSoftgallery.g:6933:2: (otherlv_0= 'Props' ( ( (lv_name_1_0= RULE_ID ) ) ( (lv_componentclass_2_0= ruleDataType ) ) )* )
            {
            // InternalSoftgallery.g:6933:2: (otherlv_0= 'Props' ( ( (lv_name_1_0= RULE_ID ) ) ( (lv_componentclass_2_0= ruleDataType ) ) )* )
            // InternalSoftgallery.g:6934:3: otherlv_0= 'Props' ( ( (lv_name_1_0= RULE_ID ) ) ( (lv_componentclass_2_0= ruleDataType ) ) )*
            {
            otherlv_0=(Token)match(input,145,FOLLOW_138); 

            			newLeafNode(otherlv_0, grammarAccess.getPropsAccess().getPropsKeyword_0());
            		
            // InternalSoftgallery.g:6938:3: ( ( (lv_name_1_0= RULE_ID ) ) ( (lv_componentclass_2_0= ruleDataType ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==RULE_ID) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalSoftgallery.g:6939:4: ( (lv_name_1_0= RULE_ID ) ) ( (lv_componentclass_2_0= ruleDataType ) )
            	    {
            	    // InternalSoftgallery.g:6939:4: ( (lv_name_1_0= RULE_ID ) )
            	    // InternalSoftgallery.g:6940:5: (lv_name_1_0= RULE_ID )
            	    {
            	    // InternalSoftgallery.g:6940:5: (lv_name_1_0= RULE_ID )
            	    // InternalSoftgallery.g:6941:6: lv_name_1_0= RULE_ID
            	    {
            	    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_139); 

            	    						newLeafNode(lv_name_1_0, grammarAccess.getPropsAccess().getNameIDTerminalRuleCall_1_0_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getPropsRule());
            	    						}
            	    						setWithLastConsumed(
            	    							current,
            	    							"name",
            	    							lv_name_1_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }

            	    // InternalSoftgallery.g:6957:4: ( (lv_componentclass_2_0= ruleDataType ) )
            	    // InternalSoftgallery.g:6958:5: (lv_componentclass_2_0= ruleDataType )
            	    {
            	    // InternalSoftgallery.g:6958:5: (lv_componentclass_2_0= ruleDataType )
            	    // InternalSoftgallery.g:6959:6: lv_componentclass_2_0= ruleDataType
            	    {

            	    						newCompositeNode(grammarAccess.getPropsAccess().getComponentclassDataTypeParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_138);
            	    lv_componentclass_2_0=ruleDataType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPropsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"componentclass",
            	    							lv_componentclass_2_0,
            	    							"co.unal.photos.Softgallery.DataType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
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


    // $ANTLR start "entryRuleReactCoreFunctions"
    // InternalSoftgallery.g:6981:1: entryRuleReactCoreFunctions returns [EObject current=null] : iv_ruleReactCoreFunctions= ruleReactCoreFunctions EOF ;
    public final EObject entryRuleReactCoreFunctions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactCoreFunctions = null;


        try {
            // InternalSoftgallery.g:6981:59: (iv_ruleReactCoreFunctions= ruleReactCoreFunctions EOF )
            // InternalSoftgallery.g:6982:2: iv_ruleReactCoreFunctions= ruleReactCoreFunctions EOF
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
    // InternalSoftgallery.g:6988:1: ruleReactCoreFunctions returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'FunctionStructure' ) ;
    public final EObject ruleReactCoreFunctions() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSoftgallery.g:6994:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'FunctionStructure' ) )
            // InternalSoftgallery.g:6995:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'FunctionStructure' )
            {
            // InternalSoftgallery.g:6995:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'FunctionStructure' )
            // InternalSoftgallery.g:6996:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'FunctionStructure'
            {
            // InternalSoftgallery.g:6996:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSoftgallery.g:6997:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSoftgallery.g:6997:4: (lv_name_0_0= RULE_ID )
            // InternalSoftgallery.g:6998:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_141); 

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

            otherlv_1=(Token)match(input,140,FOLLOW_2); 

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
    // InternalSoftgallery.g:7022:1: entryRuleReactActions returns [EObject current=null] : iv_ruleReactActions= ruleReactActions EOF ;
    public final EObject entryRuleReactActions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactActions = null;


        try {
            // InternalSoftgallery.g:7022:53: (iv_ruleReactActions= ruleReactActions EOF )
            // InternalSoftgallery.g:7023:2: iv_ruleReactActions= ruleReactActions EOF
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
    // InternalSoftgallery.g:7029:1: ruleReactActions returns [EObject current=null] : (otherlv_0= 'ReactActions' otherlv_1= ':' otherlv_2= '{' ( (lv_reactactcontent_3_0= ruleReactActionsContent ) ) otherlv_4= '}' ) ;
    public final EObject ruleReactActions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_reactactcontent_3_0 = null;



        	enterRule();

        try {
            // InternalSoftgallery.g:7035:2: ( (otherlv_0= 'ReactActions' otherlv_1= ':' otherlv_2= '{' ( (lv_reactactcontent_3_0= ruleReactActionsContent ) ) otherlv_4= '}' ) )
            // InternalSoftgallery.g:7036:2: (otherlv_0= 'ReactActions' otherlv_1= ':' otherlv_2= '{' ( (lv_reactactcontent_3_0= ruleReactActionsContent ) ) otherlv_4= '}' )
            {
            // InternalSoftgallery.g:7036:2: (otherlv_0= 'ReactActions' otherlv_1= ':' otherlv_2= '{' ( (lv_reactactcontent_3_0= ruleReactActionsContent ) ) otherlv_4= '}' )
            // InternalSoftgallery.g:7037:3: otherlv_0= 'ReactActions' otherlv_1= ':' otherlv_2= '{' ( (lv_reactactcontent_3_0= ruleReactActionsContent ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,146,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getReactActionsAccess().getReactActionsKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getReactActionsAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_143); 

            			newLeafNode(otherlv_2, grammarAccess.getReactActionsAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSoftgallery.g:7049:3: ( (lv_reactactcontent_3_0= ruleReactActionsContent ) )
            // InternalSoftgallery.g:7050:4: (lv_reactactcontent_3_0= ruleReactActionsContent )
            {
            // InternalSoftgallery.g:7050:4: (lv_reactactcontent_3_0= ruleReactActionsContent )
            // InternalSoftgallery.g:7051:5: lv_reactactcontent_3_0= ruleReactActionsContent
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
            						"co.unal.photos.Softgallery.ReactActionsContent");
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
    // InternalSoftgallery.g:7076:1: entryRuleReactActionsContent returns [EObject current=null] : iv_ruleReactActionsContent= ruleReactActionsContent EOF ;
    public final EObject entryRuleReactActionsContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactActionsContent = null;


        try {
            // InternalSoftgallery.g:7076:60: (iv_ruleReactActionsContent= ruleReactActionsContent EOF )
            // InternalSoftgallery.g:7077:2: iv_ruleReactActionsContent= ruleReactActionsContent EOF
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
    // InternalSoftgallery.g:7083:1: ruleReactActionsContent returns [EObject current=null] : ( (lv_reactrelcontent_0_0= ruleReactServicesRelation ) )+ ;
    public final EObject ruleReactActionsContent() throws RecognitionException {
        EObject current = null;

        EObject lv_reactrelcontent_0_0 = null;



        	enterRule();

        try {
            // InternalSoftgallery.g:7089:2: ( ( (lv_reactrelcontent_0_0= ruleReactServicesRelation ) )+ )
            // InternalSoftgallery.g:7090:2: ( (lv_reactrelcontent_0_0= ruleReactServicesRelation ) )+
            {
            // InternalSoftgallery.g:7090:2: ( (lv_reactrelcontent_0_0= ruleReactServicesRelation ) )+
            int cnt48=0;
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==149) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalSoftgallery.g:7091:3: (lv_reactrelcontent_0_0= ruleReactServicesRelation )
            	    {
            	    // InternalSoftgallery.g:7091:3: (lv_reactrelcontent_0_0= ruleReactServicesRelation )
            	    // InternalSoftgallery.g:7092:4: lv_reactrelcontent_0_0= ruleReactServicesRelation
            	    {

            	    				newCompositeNode(grammarAccess.getReactActionsContentAccess().getReactrelcontentReactServicesRelationParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_144);
            	    lv_reactrelcontent_0_0=ruleReactServicesRelation();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getReactActionsContentRule());
            	    				}
            	    				add(
            	    					current,
            	    					"reactrelcontent",
            	    					lv_reactrelcontent_0_0,
            	    					"co.unal.photos.Softgallery.ReactServicesRelation");
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
    // InternalSoftgallery.g:7112:1: entryRuleReactServicesType returns [EObject current=null] : iv_ruleReactServicesType= ruleReactServicesType EOF ;
    public final EObject entryRuleReactServicesType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactServicesType = null;


        try {
            // InternalSoftgallery.g:7112:58: (iv_ruleReactServicesType= ruleReactServicesType EOF )
            // InternalSoftgallery.g:7113:2: iv_ruleReactServicesType= ruleReactServicesType EOF
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
    // InternalSoftgallery.g:7119:1: ruleReactServicesType returns [EObject current=null] : (otherlv_0= 'ServiceType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ServiceContent' ) ;
    public final EObject ruleReactServicesType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalSoftgallery.g:7125:2: ( (otherlv_0= 'ServiceType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ServiceContent' ) )
            // InternalSoftgallery.g:7126:2: (otherlv_0= 'ServiceType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ServiceContent' )
            {
            // InternalSoftgallery.g:7126:2: (otherlv_0= 'ServiceType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ServiceContent' )
            // InternalSoftgallery.g:7127:3: otherlv_0= 'ServiceType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ServiceContent'
            {
            otherlv_0=(Token)match(input,147,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getReactServicesTypeAccess().getServiceTypeKeyword_0());
            		
            // InternalSoftgallery.g:7131:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:7132:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:7132:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:7133:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_145); 

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

            otherlv_2=(Token)match(input,148,FOLLOW_2); 

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
    // InternalSoftgallery.g:7157:1: entryRuleReactServicesRelation returns [EObject current=null] : iv_ruleReactServicesRelation= ruleReactServicesRelation EOF ;
    public final EObject entryRuleReactServicesRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactServicesRelation = null;


        try {
            // InternalSoftgallery.g:7157:62: (iv_ruleReactServicesRelation= ruleReactServicesRelation EOF )
            // InternalSoftgallery.g:7158:2: iv_ruleReactServicesRelation= ruleReactServicesRelation EOF
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
    // InternalSoftgallery.g:7164:1: ruleReactServicesRelation returns [EObject current=null] : (otherlv_0= 'ServicesRelations' ( ( (lv_reactrelationcontent_1_0= ruleReactServicesType ) ) ( (lv_name_2_0= RULE_ID ) ) ruleReactRequest )+ ) ;
    public final EObject ruleReactServicesRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        EObject lv_reactrelationcontent_1_0 = null;



        	enterRule();

        try {
            // InternalSoftgallery.g:7170:2: ( (otherlv_0= 'ServicesRelations' ( ( (lv_reactrelationcontent_1_0= ruleReactServicesType ) ) ( (lv_name_2_0= RULE_ID ) ) ruleReactRequest )+ ) )
            // InternalSoftgallery.g:7171:2: (otherlv_0= 'ServicesRelations' ( ( (lv_reactrelationcontent_1_0= ruleReactServicesType ) ) ( (lv_name_2_0= RULE_ID ) ) ruleReactRequest )+ )
            {
            // InternalSoftgallery.g:7171:2: (otherlv_0= 'ServicesRelations' ( ( (lv_reactrelationcontent_1_0= ruleReactServicesType ) ) ( (lv_name_2_0= RULE_ID ) ) ruleReactRequest )+ )
            // InternalSoftgallery.g:7172:3: otherlv_0= 'ServicesRelations' ( ( (lv_reactrelationcontent_1_0= ruleReactServicesType ) ) ( (lv_name_2_0= RULE_ID ) ) ruleReactRequest )+
            {
            otherlv_0=(Token)match(input,149,FOLLOW_146); 

            			newLeafNode(otherlv_0, grammarAccess.getReactServicesRelationAccess().getServicesRelationsKeyword_0());
            		
            // InternalSoftgallery.g:7176:3: ( ( (lv_reactrelationcontent_1_0= ruleReactServicesType ) ) ( (lv_name_2_0= RULE_ID ) ) ruleReactRequest )+
            int cnt49=0;
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==147) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalSoftgallery.g:7177:4: ( (lv_reactrelationcontent_1_0= ruleReactServicesType ) ) ( (lv_name_2_0= RULE_ID ) ) ruleReactRequest
            	    {
            	    // InternalSoftgallery.g:7177:4: ( (lv_reactrelationcontent_1_0= ruleReactServicesType ) )
            	    // InternalSoftgallery.g:7178:5: (lv_reactrelationcontent_1_0= ruleReactServicesType )
            	    {
            	    // InternalSoftgallery.g:7178:5: (lv_reactrelationcontent_1_0= ruleReactServicesType )
            	    // InternalSoftgallery.g:7179:6: lv_reactrelationcontent_1_0= ruleReactServicesType
            	    {

            	    						newCompositeNode(grammarAccess.getReactServicesRelationAccess().getReactrelationcontentReactServicesTypeParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_reactrelationcontent_1_0=ruleReactServicesType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getReactServicesRelationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"reactrelationcontent",
            	    							lv_reactrelationcontent_1_0,
            	    							"co.unal.photos.Softgallery.ReactServicesType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalSoftgallery.g:7196:4: ( (lv_name_2_0= RULE_ID ) )
            	    // InternalSoftgallery.g:7197:5: (lv_name_2_0= RULE_ID )
            	    {
            	    // InternalSoftgallery.g:7197:5: (lv_name_2_0= RULE_ID )
            	    // InternalSoftgallery.g:7198:6: lv_name_2_0= RULE_ID
            	    {
            	    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_147); 

            	    						newLeafNode(lv_name_2_0, grammarAccess.getReactServicesRelationAccess().getNameIDTerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getReactServicesRelationRule());
            	    						}
            	    						setWithLastConsumed(
            	    							current,
            	    							"name",
            	    							lv_name_2_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }


            	    				newCompositeNode(grammarAccess.getReactServicesRelationAccess().getReactRequestParserRuleCall_1_2());
            	    			
            	    pushFollow(FOLLOW_148);
            	    ruleReactRequest();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt49 >= 1 ) break loop49;
                        EarlyExitException eee =
                            new EarlyExitException(49, input);
                        throw eee;
                }
                cnt49++;
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


    // $ANTLR start "entryRuleReactRequest"
    // InternalSoftgallery.g:7226:1: entryRuleReactRequest returns [String current=null] : iv_ruleReactRequest= ruleReactRequest EOF ;
    public final String entryRuleReactRequest() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReactRequest = null;


        try {
            // InternalSoftgallery.g:7226:52: (iv_ruleReactRequest= ruleReactRequest EOF )
            // InternalSoftgallery.g:7227:2: iv_ruleReactRequest= ruleReactRequest EOF
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
    // InternalSoftgallery.g:7233:1: ruleReactRequest returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Wrapper' | kw= 'AuxWrapper' ) ;
    public final AntlrDatatypeRuleToken ruleReactRequest() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSoftgallery.g:7239:2: ( (kw= 'Wrapper' | kw= 'AuxWrapper' ) )
            // InternalSoftgallery.g:7240:2: (kw= 'Wrapper' | kw= 'AuxWrapper' )
            {
            // InternalSoftgallery.g:7240:2: (kw= 'Wrapper' | kw= 'AuxWrapper' )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==150) ) {
                alt50=1;
            }
            else if ( (LA50_0==151) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // InternalSoftgallery.g:7241:3: kw= 'Wrapper'
                    {
                    kw=(Token)match(input,150,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReactRequestAccess().getWrapperKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSoftgallery.g:7247:3: kw= 'AuxWrapper'
                    {
                    kw=(Token)match(input,151,FOLLOW_2); 

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
    // InternalSoftgallery.g:7256:1: entryRuleReactLibraries returns [EObject current=null] : iv_ruleReactLibraries= ruleReactLibraries EOF ;
    public final EObject entryRuleReactLibraries() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactLibraries = null;


        try {
            // InternalSoftgallery.g:7256:55: (iv_ruleReactLibraries= ruleReactLibraries EOF )
            // InternalSoftgallery.g:7257:2: iv_ruleReactLibraries= ruleReactLibraries EOF
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
    // InternalSoftgallery.g:7263:1: ruleReactLibraries returns [EObject current=null] : (otherlv_0= 'ReactLibraries' otherlv_1= ':' otherlv_2= '{' ( (lv_reactlibraries_3_0= ruleReactLibrary ) )+ otherlv_4= '}' ) ;
    public final EObject ruleReactLibraries() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_reactlibraries_3_0 = null;



        	enterRule();

        try {
            // InternalSoftgallery.g:7269:2: ( (otherlv_0= 'ReactLibraries' otherlv_1= ':' otherlv_2= '{' ( (lv_reactlibraries_3_0= ruleReactLibrary ) )+ otherlv_4= '}' ) )
            // InternalSoftgallery.g:7270:2: (otherlv_0= 'ReactLibraries' otherlv_1= ':' otherlv_2= '{' ( (lv_reactlibraries_3_0= ruleReactLibrary ) )+ otherlv_4= '}' )
            {
            // InternalSoftgallery.g:7270:2: (otherlv_0= 'ReactLibraries' otherlv_1= ':' otherlv_2= '{' ( (lv_reactlibraries_3_0= ruleReactLibrary ) )+ otherlv_4= '}' )
            // InternalSoftgallery.g:7271:3: otherlv_0= 'ReactLibraries' otherlv_1= ':' otherlv_2= '{' ( (lv_reactlibraries_3_0= ruleReactLibrary ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,152,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getReactLibrariesAccess().getReactLibrariesKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getReactLibrariesAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_149); 

            			newLeafNode(otherlv_2, grammarAccess.getReactLibrariesAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSoftgallery.g:7283:3: ( (lv_reactlibraries_3_0= ruleReactLibrary ) )+
            int cnt51=0;
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( ((LA51_0>=154 && LA51_0<=159)) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalSoftgallery.g:7284:4: (lv_reactlibraries_3_0= ruleReactLibrary )
            	    {
            	    // InternalSoftgallery.g:7284:4: (lv_reactlibraries_3_0= ruleReactLibrary )
            	    // InternalSoftgallery.g:7285:5: lv_reactlibraries_3_0= ruleReactLibrary
            	    {

            	    					newCompositeNode(grammarAccess.getReactLibrariesAccess().getReactlibrariesReactLibraryParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_150);
            	    lv_reactlibraries_3_0=ruleReactLibrary();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getReactLibrariesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"reactlibraries",
            	    						lv_reactlibraries_3_0,
            	    						"co.unal.photos.Softgallery.ReactLibrary");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt51 >= 1 ) break loop51;
                        EarlyExitException eee =
                            new EarlyExitException(51, input);
                        throw eee;
                }
                cnt51++;
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
    // InternalSoftgallery.g:7310:1: entryRuleReactLibrary returns [EObject current=null] : iv_ruleReactLibrary= ruleReactLibrary EOF ;
    public final EObject entryRuleReactLibrary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactLibrary = null;


        try {
            // InternalSoftgallery.g:7310:53: (iv_ruleReactLibrary= ruleReactLibrary EOF )
            // InternalSoftgallery.g:7311:2: iv_ruleReactLibrary= ruleReactLibrary EOF
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
    // InternalSoftgallery.g:7317:1: ruleReactLibrary returns [EObject current=null] : ( ruleReactLibraryType ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'LibraryContent' ) ;
    public final EObject ruleReactLibrary() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalSoftgallery.g:7323:2: ( ( ruleReactLibraryType ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'LibraryContent' ) )
            // InternalSoftgallery.g:7324:2: ( ruleReactLibraryType ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'LibraryContent' )
            {
            // InternalSoftgallery.g:7324:2: ( ruleReactLibraryType ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'LibraryContent' )
            // InternalSoftgallery.g:7325:3: ruleReactLibraryType ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'LibraryContent'
            {

            			newCompositeNode(grammarAccess.getReactLibraryAccess().getReactLibraryTypeParserRuleCall_0());
            		
            pushFollow(FOLLOW_9);
            ruleReactLibraryType();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalSoftgallery.g:7332:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:7333:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:7333:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:7334:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_151); 

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

            otherlv_2=(Token)match(input,153,FOLLOW_2); 

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
    // InternalSoftgallery.g:7358:1: entryRuleReactLibraryType returns [String current=null] : iv_ruleReactLibraryType= ruleReactLibraryType EOF ;
    public final String entryRuleReactLibraryType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReactLibraryType = null;


        try {
            // InternalSoftgallery.g:7358:56: (iv_ruleReactLibraryType= ruleReactLibraryType EOF )
            // InternalSoftgallery.g:7359:2: iv_ruleReactLibraryType= ruleReactLibraryType EOF
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
    // InternalSoftgallery.g:7365:1: ruleReactLibraryType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'ReactDesign' | kw= 'ReactRouting' | kw= 'ComponentManagement' | kw= 'StoreManagement' | kw= 'ReactDeployment' | kw= 'ConfigurationLibrary' ) ;
    public final AntlrDatatypeRuleToken ruleReactLibraryType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSoftgallery.g:7371:2: ( (kw= 'ReactDesign' | kw= 'ReactRouting' | kw= 'ComponentManagement' | kw= 'StoreManagement' | kw= 'ReactDeployment' | kw= 'ConfigurationLibrary' ) )
            // InternalSoftgallery.g:7372:2: (kw= 'ReactDesign' | kw= 'ReactRouting' | kw= 'ComponentManagement' | kw= 'StoreManagement' | kw= 'ReactDeployment' | kw= 'ConfigurationLibrary' )
            {
            // InternalSoftgallery.g:7372:2: (kw= 'ReactDesign' | kw= 'ReactRouting' | kw= 'ComponentManagement' | kw= 'StoreManagement' | kw= 'ReactDeployment' | kw= 'ConfigurationLibrary' )
            int alt52=6;
            switch ( input.LA(1) ) {
            case 154:
                {
                alt52=1;
                }
                break;
            case 155:
                {
                alt52=2;
                }
                break;
            case 156:
                {
                alt52=3;
                }
                break;
            case 157:
                {
                alt52=4;
                }
                break;
            case 158:
                {
                alt52=5;
                }
                break;
            case 159:
                {
                alt52=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // InternalSoftgallery.g:7373:3: kw= 'ReactDesign'
                    {
                    kw=(Token)match(input,154,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReactLibraryTypeAccess().getReactDesignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSoftgallery.g:7379:3: kw= 'ReactRouting'
                    {
                    kw=(Token)match(input,155,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReactLibraryTypeAccess().getReactRoutingKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSoftgallery.g:7385:3: kw= 'ComponentManagement'
                    {
                    kw=(Token)match(input,156,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReactLibraryTypeAccess().getComponentManagementKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalSoftgallery.g:7391:3: kw= 'StoreManagement'
                    {
                    kw=(Token)match(input,157,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReactLibraryTypeAccess().getStoreManagementKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalSoftgallery.g:7397:3: kw= 'ReactDeployment'
                    {
                    kw=(Token)match(input,158,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReactLibraryTypeAccess().getReactDeploymentKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalSoftgallery.g:7403:3: kw= 'ConfigurationLibrary'
                    {
                    kw=(Token)match(input,159,FOLLOW_2); 

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
    // InternalSoftgallery.g:7412:1: entryRuleReactInfo returns [EObject current=null] : iv_ruleReactInfo= ruleReactInfo EOF ;
    public final EObject entryRuleReactInfo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactInfo = null;


        try {
            // InternalSoftgallery.g:7412:50: (iv_ruleReactInfo= ruleReactInfo EOF )
            // InternalSoftgallery.g:7413:2: iv_ruleReactInfo= ruleReactInfo EOF
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
    // InternalSoftgallery.g:7419:1: ruleReactInfo returns [EObject current=null] : (otherlv_0= 'ReactInformation' otherlv_1= ':' otherlv_2= '{' ( (lv_reactinformation_3_0= ruleReactInformation ) )+ otherlv_4= '}' ) ;
    public final EObject ruleReactInfo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_reactinformation_3_0 = null;



        	enterRule();

        try {
            // InternalSoftgallery.g:7425:2: ( (otherlv_0= 'ReactInformation' otherlv_1= ':' otherlv_2= '{' ( (lv_reactinformation_3_0= ruleReactInformation ) )+ otherlv_4= '}' ) )
            // InternalSoftgallery.g:7426:2: (otherlv_0= 'ReactInformation' otherlv_1= ':' otherlv_2= '{' ( (lv_reactinformation_3_0= ruleReactInformation ) )+ otherlv_4= '}' )
            {
            // InternalSoftgallery.g:7426:2: (otherlv_0= 'ReactInformation' otherlv_1= ':' otherlv_2= '{' ( (lv_reactinformation_3_0= ruleReactInformation ) )+ otherlv_4= '}' )
            // InternalSoftgallery.g:7427:3: otherlv_0= 'ReactInformation' otherlv_1= ':' otherlv_2= '{' ( (lv_reactinformation_3_0= ruleReactInformation ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,160,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getReactInfoAccess().getReactInformationKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getReactInfoAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_152); 

            			newLeafNode(otherlv_2, grammarAccess.getReactInfoAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSoftgallery.g:7439:3: ( (lv_reactinformation_3_0= ruleReactInformation ) )+
            int cnt53=0;
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( ((LA53_0>=162 && LA53_0<=163)) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalSoftgallery.g:7440:4: (lv_reactinformation_3_0= ruleReactInformation )
            	    {
            	    // InternalSoftgallery.g:7440:4: (lv_reactinformation_3_0= ruleReactInformation )
            	    // InternalSoftgallery.g:7441:5: lv_reactinformation_3_0= ruleReactInformation
            	    {

            	    					newCompositeNode(grammarAccess.getReactInfoAccess().getReactinformationReactInformationParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_153);
            	    lv_reactinformation_3_0=ruleReactInformation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getReactInfoRule());
            	    					}
            	    					add(
            	    						current,
            	    						"reactinformation",
            	    						lv_reactinformation_3_0,
            	    						"co.unal.photos.Softgallery.ReactInformation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt53 >= 1 ) break loop53;
                        EarlyExitException eee =
                            new EarlyExitException(53, input);
                        throw eee;
                }
                cnt53++;
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
    // InternalSoftgallery.g:7466:1: entryRuleReactInformation returns [EObject current=null] : iv_ruleReactInformation= ruleReactInformation EOF ;
    public final EObject entryRuleReactInformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactInformation = null;


        try {
            // InternalSoftgallery.g:7466:57: (iv_ruleReactInformation= ruleReactInformation EOF )
            // InternalSoftgallery.g:7467:2: iv_ruleReactInformation= ruleReactInformation EOF
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
    // InternalSoftgallery.g:7473:1: ruleReactInformation returns [EObject current=null] : ( ruleReactInformationType ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'InformationContent' ) ;
    public final EObject ruleReactInformation() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalSoftgallery.g:7479:2: ( ( ruleReactInformationType ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'InformationContent' ) )
            // InternalSoftgallery.g:7480:2: ( ruleReactInformationType ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'InformationContent' )
            {
            // InternalSoftgallery.g:7480:2: ( ruleReactInformationType ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'InformationContent' )
            // InternalSoftgallery.g:7481:3: ruleReactInformationType ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'InformationContent'
            {

            			newCompositeNode(grammarAccess.getReactInformationAccess().getReactInformationTypeParserRuleCall_0());
            		
            pushFollow(FOLLOW_9);
            ruleReactInformationType();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalSoftgallery.g:7488:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:7489:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:7489:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:7490:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_154); 

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

            otherlv_2=(Token)match(input,161,FOLLOW_2); 

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
    // InternalSoftgallery.g:7514:1: entryRuleReactInformationType returns [String current=null] : iv_ruleReactInformationType= ruleReactInformationType EOF ;
    public final String entryRuleReactInformationType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReactInformationType = null;


        try {
            // InternalSoftgallery.g:7514:60: (iv_ruleReactInformationType= ruleReactInformationType EOF )
            // InternalSoftgallery.g:7515:2: iv_ruleReactInformationType= ruleReactInformationType EOF
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
    // InternalSoftgallery.g:7521:1: ruleReactInformationType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'ReactReadme' | kw= 'ReactAditionalInfo' ) ;
    public final AntlrDatatypeRuleToken ruleReactInformationType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSoftgallery.g:7527:2: ( (kw= 'ReactReadme' | kw= 'ReactAditionalInfo' ) )
            // InternalSoftgallery.g:7528:2: (kw= 'ReactReadme' | kw= 'ReactAditionalInfo' )
            {
            // InternalSoftgallery.g:7528:2: (kw= 'ReactReadme' | kw= 'ReactAditionalInfo' )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==162) ) {
                alt54=1;
            }
            else if ( (LA54_0==163) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // InternalSoftgallery.g:7529:3: kw= 'ReactReadme'
                    {
                    kw=(Token)match(input,162,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReactInformationTypeAccess().getReactReadmeKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSoftgallery.g:7535:3: kw= 'ReactAditionalInfo'
                    {
                    kw=(Token)match(input,163,FOLLOW_2); 

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
    // InternalSoftgallery.g:7544:1: entryRulePostgreSQL returns [EObject current=null] : iv_rulePostgreSQL= rulePostgreSQL EOF ;
    public final EObject entryRulePostgreSQL() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostgreSQL = null;


        try {
            // InternalSoftgallery.g:7544:51: (iv_rulePostgreSQL= rulePostgreSQL EOF )
            // InternalSoftgallery.g:7545:2: iv_rulePostgreSQL= rulePostgreSQL EOF
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
    // InternalSoftgallery.g:7551:1: rulePostgreSQL returns [EObject current=null] : (otherlv_0= 'PostgreSQL' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleCluster ) ) otherlv_5= '}' ) ;
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
            // InternalSoftgallery.g:7557:2: ( (otherlv_0= 'PostgreSQL' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleCluster ) ) otherlv_5= '}' ) )
            // InternalSoftgallery.g:7558:2: (otherlv_0= 'PostgreSQL' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleCluster ) ) otherlv_5= '}' )
            {
            // InternalSoftgallery.g:7558:2: (otherlv_0= 'PostgreSQL' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleCluster ) ) otherlv_5= '}' )
            // InternalSoftgallery.g:7559:3: otherlv_0= 'PostgreSQL' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleCluster ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,164,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getPostgreSQLAccess().getPostgreSQLKeyword_0());
            		
            // InternalSoftgallery.g:7563:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:7564:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:7564:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:7565:5: lv_name_1_0= RULE_ID
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
            		
            otherlv_3=(Token)match(input,13,FOLLOW_155); 

            			newLeafNode(otherlv_3, grammarAccess.getPostgreSQLAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSoftgallery.g:7589:3: ( (lv_elements_4_0= ruleCluster ) )
            // InternalSoftgallery.g:7590:4: (lv_elements_4_0= ruleCluster )
            {
            // InternalSoftgallery.g:7590:4: (lv_elements_4_0= ruleCluster )
            // InternalSoftgallery.g:7591:5: lv_elements_4_0= ruleCluster
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
            						"co.unal.photos.Softgallery.Cluster");
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
    // InternalSoftgallery.g:7616:1: entryRuleCluster returns [EObject current=null] : iv_ruleCluster= ruleCluster EOF ;
    public final EObject entryRuleCluster() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCluster = null;


        try {
            // InternalSoftgallery.g:7616:48: (iv_ruleCluster= ruleCluster EOF )
            // InternalSoftgallery.g:7617:2: iv_ruleCluster= ruleCluster EOF
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
    // InternalSoftgallery.g:7623:1: ruleCluster returns [EObject current=null] : (otherlv_0= 'Database' ( (lv_elements_1_0= ruleDatabase ) ) ( (lv_elements_2_0= rulePostgresUser ) )+ ) ;
    public final EObject ruleCluster() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_elements_1_0 = null;

        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalSoftgallery.g:7629:2: ( (otherlv_0= 'Database' ( (lv_elements_1_0= ruleDatabase ) ) ( (lv_elements_2_0= rulePostgresUser ) )+ ) )
            // InternalSoftgallery.g:7630:2: (otherlv_0= 'Database' ( (lv_elements_1_0= ruleDatabase ) ) ( (lv_elements_2_0= rulePostgresUser ) )+ )
            {
            // InternalSoftgallery.g:7630:2: (otherlv_0= 'Database' ( (lv_elements_1_0= ruleDatabase ) ) ( (lv_elements_2_0= rulePostgresUser ) )+ )
            // InternalSoftgallery.g:7631:3: otherlv_0= 'Database' ( (lv_elements_1_0= ruleDatabase ) ) ( (lv_elements_2_0= rulePostgresUser ) )+
            {
            otherlv_0=(Token)match(input,165,FOLLOW_156); 

            			newLeafNode(otherlv_0, grammarAccess.getClusterAccess().getDatabaseKeyword_0());
            		
            // InternalSoftgallery.g:7635:3: ( (lv_elements_1_0= ruleDatabase ) )
            // InternalSoftgallery.g:7636:4: (lv_elements_1_0= ruleDatabase )
            {
            // InternalSoftgallery.g:7636:4: (lv_elements_1_0= ruleDatabase )
            // InternalSoftgallery.g:7637:5: lv_elements_1_0= ruleDatabase
            {

            					newCompositeNode(grammarAccess.getClusterAccess().getElementsDatabaseParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_157);
            lv_elements_1_0=ruleDatabase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClusterRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_1_0,
            						"co.unal.photos.Softgallery.Database");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftgallery.g:7654:3: ( (lv_elements_2_0= rulePostgresUser ) )+
            int cnt55=0;
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==180) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalSoftgallery.g:7655:4: (lv_elements_2_0= rulePostgresUser )
            	    {
            	    // InternalSoftgallery.g:7655:4: (lv_elements_2_0= rulePostgresUser )
            	    // InternalSoftgallery.g:7656:5: lv_elements_2_0= rulePostgresUser
            	    {

            	    					newCompositeNode(grammarAccess.getClusterAccess().getElementsPostgresUserParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_158);
            	    lv_elements_2_0=rulePostgresUser();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getClusterRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_2_0,
            	    						"co.unal.photos.Softgallery.PostgresUser");
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
    // InternalSoftgallery.g:7677:1: entryRuleDatabase returns [EObject current=null] : iv_ruleDatabase= ruleDatabase EOF ;
    public final EObject entryRuleDatabase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatabase = null;


        try {
            // InternalSoftgallery.g:7677:49: (iv_ruleDatabase= ruleDatabase EOF )
            // InternalSoftgallery.g:7678:2: iv_ruleDatabase= ruleDatabase EOF
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
    // InternalSoftgallery.g:7684:1: ruleDatabase returns [EObject current=null] : (otherlv_0= 'Schema' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleSchema ) ) ) ;
    public final EObject ruleDatabase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalSoftgallery.g:7690:2: ( (otherlv_0= 'Schema' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleSchema ) ) ) )
            // InternalSoftgallery.g:7691:2: (otherlv_0= 'Schema' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleSchema ) ) )
            {
            // InternalSoftgallery.g:7691:2: (otherlv_0= 'Schema' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleSchema ) ) )
            // InternalSoftgallery.g:7692:3: otherlv_0= 'Schema' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleSchema ) )
            {
            otherlv_0=(Token)match(input,166,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getDatabaseAccess().getSchemaKeyword_0());
            		
            // InternalSoftgallery.g:7696:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:7697:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:7697:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:7698:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_159); 

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

            // InternalSoftgallery.g:7714:3: ( (lv_elements_2_0= ruleSchema ) )
            // InternalSoftgallery.g:7715:4: (lv_elements_2_0= ruleSchema )
            {
            // InternalSoftgallery.g:7715:4: (lv_elements_2_0= ruleSchema )
            // InternalSoftgallery.g:7716:5: lv_elements_2_0= ruleSchema
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
            						"co.unal.photos.Softgallery.Schema");
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
    // InternalSoftgallery.g:7737:1: entryRuleSchema returns [EObject current=null] : iv_ruleSchema= ruleSchema EOF ;
    public final EObject entryRuleSchema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchema = null;


        try {
            // InternalSoftgallery.g:7737:47: (iv_ruleSchema= ruleSchema EOF )
            // InternalSoftgallery.g:7738:2: iv_ruleSchema= ruleSchema EOF
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
    // InternalSoftgallery.g:7744:1: ruleSchema returns [EObject current=null] : ( ( (lv_elements_0_0= ruleIndex_p ) )* ( (lv_elements_1_0= ruleViewSchema ) )* ( (lv_elements_2_0= ruleTable_p ) )+ ( (lv_elements_3_0= ruleTrigger ) )* ( (lv_elements_4_0= ruleFunction ) ) ) ;
    public final EObject ruleSchema() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;

        EObject lv_elements_1_0 = null;

        EObject lv_elements_2_0 = null;

        EObject lv_elements_3_0 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalSoftgallery.g:7750:2: ( ( ( (lv_elements_0_0= ruleIndex_p ) )* ( (lv_elements_1_0= ruleViewSchema ) )* ( (lv_elements_2_0= ruleTable_p ) )+ ( (lv_elements_3_0= ruleTrigger ) )* ( (lv_elements_4_0= ruleFunction ) ) ) )
            // InternalSoftgallery.g:7751:2: ( ( (lv_elements_0_0= ruleIndex_p ) )* ( (lv_elements_1_0= ruleViewSchema ) )* ( (lv_elements_2_0= ruleTable_p ) )+ ( (lv_elements_3_0= ruleTrigger ) )* ( (lv_elements_4_0= ruleFunction ) ) )
            {
            // InternalSoftgallery.g:7751:2: ( ( (lv_elements_0_0= ruleIndex_p ) )* ( (lv_elements_1_0= ruleViewSchema ) )* ( (lv_elements_2_0= ruleTable_p ) )+ ( (lv_elements_3_0= ruleTrigger ) )* ( (lv_elements_4_0= ruleFunction ) ) )
            // InternalSoftgallery.g:7752:3: ( (lv_elements_0_0= ruleIndex_p ) )* ( (lv_elements_1_0= ruleViewSchema ) )* ( (lv_elements_2_0= ruleTable_p ) )+ ( (lv_elements_3_0= ruleTrigger ) )* ( (lv_elements_4_0= ruleFunction ) )
            {
            // InternalSoftgallery.g:7752:3: ( (lv_elements_0_0= ruleIndex_p ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==167) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalSoftgallery.g:7753:4: (lv_elements_0_0= ruleIndex_p )
            	    {
            	    // InternalSoftgallery.g:7753:4: (lv_elements_0_0= ruleIndex_p )
            	    // InternalSoftgallery.g:7754:5: lv_elements_0_0= ruleIndex_p
            	    {

            	    					newCompositeNode(grammarAccess.getSchemaAccess().getElementsIndex_pParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_159);
            	    lv_elements_0_0=ruleIndex_p();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_0_0,
            	    						"co.unal.photos.Softgallery.Index_p");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

            // InternalSoftgallery.g:7771:3: ( (lv_elements_1_0= ruleViewSchema ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==168) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalSoftgallery.g:7772:4: (lv_elements_1_0= ruleViewSchema )
            	    {
            	    // InternalSoftgallery.g:7772:4: (lv_elements_1_0= ruleViewSchema )
            	    // InternalSoftgallery.g:7773:5: lv_elements_1_0= ruleViewSchema
            	    {

            	    					newCompositeNode(grammarAccess.getSchemaAccess().getElementsViewSchemaParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_159);
            	    lv_elements_1_0=ruleViewSchema();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_1_0,
            	    						"co.unal.photos.Softgallery.ViewSchema");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

            // InternalSoftgallery.g:7790:3: ( (lv_elements_2_0= ruleTable_p ) )+
            int cnt58=0;
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==169) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalSoftgallery.g:7791:4: (lv_elements_2_0= ruleTable_p )
            	    {
            	    // InternalSoftgallery.g:7791:4: (lv_elements_2_0= ruleTable_p )
            	    // InternalSoftgallery.g:7792:5: lv_elements_2_0= ruleTable_p
            	    {

            	    					newCompositeNode(grammarAccess.getSchemaAccess().getElementsTable_pParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_160);
            	    lv_elements_2_0=ruleTable_p();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_2_0,
            	    						"co.unal.photos.Softgallery.Table_p");
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

            // InternalSoftgallery.g:7809:3: ( (lv_elements_3_0= ruleTrigger ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==178) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalSoftgallery.g:7810:4: (lv_elements_3_0= ruleTrigger )
            	    {
            	    // InternalSoftgallery.g:7810:4: (lv_elements_3_0= ruleTrigger )
            	    // InternalSoftgallery.g:7811:5: lv_elements_3_0= ruleTrigger
            	    {

            	    					newCompositeNode(grammarAccess.getSchemaAccess().getElementsTriggerParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_161);
            	    lv_elements_3_0=ruleTrigger();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_3_0,
            	    						"co.unal.photos.Softgallery.Trigger");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);

            // InternalSoftgallery.g:7828:3: ( (lv_elements_4_0= ruleFunction ) )
            // InternalSoftgallery.g:7829:4: (lv_elements_4_0= ruleFunction )
            {
            // InternalSoftgallery.g:7829:4: (lv_elements_4_0= ruleFunction )
            // InternalSoftgallery.g:7830:5: lv_elements_4_0= ruleFunction
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
            						"co.unal.photos.Softgallery.Function");
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
    // InternalSoftgallery.g:7851:1: entryRuleIndex_p returns [EObject current=null] : iv_ruleIndex_p= ruleIndex_p EOF ;
    public final EObject entryRuleIndex_p() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndex_p = null;


        try {
            // InternalSoftgallery.g:7851:48: (iv_ruleIndex_p= ruleIndex_p EOF )
            // InternalSoftgallery.g:7852:2: iv_ruleIndex_p= ruleIndex_p EOF
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
    // InternalSoftgallery.g:7858:1: ruleIndex_p returns [EObject current=null] : (otherlv_0= 'Index_p' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleIndex_p() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftgallery.g:7864:2: ( (otherlv_0= 'Index_p' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftgallery.g:7865:2: (otherlv_0= 'Index_p' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftgallery.g:7865:2: (otherlv_0= 'Index_p' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftgallery.g:7866:3: otherlv_0= 'Index_p' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,167,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getIndex_pAccess().getIndex_pKeyword_0());
            		
            // InternalSoftgallery.g:7870:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:7871:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:7871:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:7872:5: lv_name_1_0= RULE_ID
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
    // InternalSoftgallery.g:7892:1: entryRuleViewSchema returns [EObject current=null] : iv_ruleViewSchema= ruleViewSchema EOF ;
    public final EObject entryRuleViewSchema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViewSchema = null;


        try {
            // InternalSoftgallery.g:7892:51: (iv_ruleViewSchema= ruleViewSchema EOF )
            // InternalSoftgallery.g:7893:2: iv_ruleViewSchema= ruleViewSchema EOF
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
    // InternalSoftgallery.g:7899:1: ruleViewSchema returns [EObject current=null] : (otherlv_0= 'ViewSchema' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleViewSchema() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftgallery.g:7905:2: ( (otherlv_0= 'ViewSchema' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftgallery.g:7906:2: (otherlv_0= 'ViewSchema' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftgallery.g:7906:2: (otherlv_0= 'ViewSchema' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftgallery.g:7907:3: otherlv_0= 'ViewSchema' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,168,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getViewSchemaAccess().getViewSchemaKeyword_0());
            		
            // InternalSoftgallery.g:7911:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:7912:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:7912:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:7913:5: lv_name_1_0= RULE_ID
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
    // InternalSoftgallery.g:7933:1: entryRuleTable_p returns [EObject current=null] : iv_ruleTable_p= ruleTable_p EOF ;
    public final EObject entryRuleTable_p() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable_p = null;


        try {
            // InternalSoftgallery.g:7933:48: (iv_ruleTable_p= ruleTable_p EOF )
            // InternalSoftgallery.g:7934:2: iv_ruleTable_p= ruleTable_p EOF
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
    // InternalSoftgallery.g:7940:1: ruleTable_p returns [EObject current=null] : (otherlv_0= 'Table_p' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleForeignKey ) )+ ( (lv_elements_5_0= ruleColumn ) )+ ( (lv_elements_6_0= ruleRow ) )+ otherlv_7= '}' ) ;
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
            // InternalSoftgallery.g:7946:2: ( (otherlv_0= 'Table_p' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleForeignKey ) )+ ( (lv_elements_5_0= ruleColumn ) )+ ( (lv_elements_6_0= ruleRow ) )+ otherlv_7= '}' ) )
            // InternalSoftgallery.g:7947:2: (otherlv_0= 'Table_p' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleForeignKey ) )+ ( (lv_elements_5_0= ruleColumn ) )+ ( (lv_elements_6_0= ruleRow ) )+ otherlv_7= '}' )
            {
            // InternalSoftgallery.g:7947:2: (otherlv_0= 'Table_p' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleForeignKey ) )+ ( (lv_elements_5_0= ruleColumn ) )+ ( (lv_elements_6_0= ruleRow ) )+ otherlv_7= '}' )
            // InternalSoftgallery.g:7948:3: otherlv_0= 'Table_p' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleForeignKey ) )+ ( (lv_elements_5_0= ruleColumn ) )+ ( (lv_elements_6_0= ruleRow ) )+ otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,169,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getTable_pAccess().getTable_pKeyword_0());
            		
            // InternalSoftgallery.g:7952:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:7953:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:7953:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:7954:5: lv_name_1_0= RULE_ID
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
            		
            otherlv_3=(Token)match(input,13,FOLLOW_162); 

            			newLeafNode(otherlv_3, grammarAccess.getTable_pAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSoftgallery.g:7978:3: ( (lv_elements_4_0= ruleForeignKey ) )+
            int cnt60=0;
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==170) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalSoftgallery.g:7979:4: (lv_elements_4_0= ruleForeignKey )
            	    {
            	    // InternalSoftgallery.g:7979:4: (lv_elements_4_0= ruleForeignKey )
            	    // InternalSoftgallery.g:7980:5: lv_elements_4_0= ruleForeignKey
            	    {

            	    					newCompositeNode(grammarAccess.getTable_pAccess().getElementsForeignKeyParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_163);
            	    lv_elements_4_0=ruleForeignKey();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTable_pRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_4_0,
            	    						"co.unal.photos.Softgallery.ForeignKey");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt60 >= 1 ) break loop60;
                        EarlyExitException eee =
                            new EarlyExitException(60, input);
                        throw eee;
                }
                cnt60++;
            } while (true);

            // InternalSoftgallery.g:7997:3: ( (lv_elements_5_0= ruleColumn ) )+
            int cnt61=0;
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==107) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // InternalSoftgallery.g:7998:4: (lv_elements_5_0= ruleColumn )
            	    {
            	    // InternalSoftgallery.g:7998:4: (lv_elements_5_0= ruleColumn )
            	    // InternalSoftgallery.g:7999:5: lv_elements_5_0= ruleColumn
            	    {

            	    					newCompositeNode(grammarAccess.getTable_pAccess().getElementsColumnParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_164);
            	    lv_elements_5_0=ruleColumn();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTable_pRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_5_0,
            	    						"co.unal.photos.Softgallery.Column");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt61 >= 1 ) break loop61;
                        EarlyExitException eee =
                            new EarlyExitException(61, input);
                        throw eee;
                }
                cnt61++;
            } while (true);

            // InternalSoftgallery.g:8016:3: ( (lv_elements_6_0= ruleRow ) )+
            int cnt62=0;
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==176) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalSoftgallery.g:8017:4: (lv_elements_6_0= ruleRow )
            	    {
            	    // InternalSoftgallery.g:8017:4: (lv_elements_6_0= ruleRow )
            	    // InternalSoftgallery.g:8018:5: lv_elements_6_0= ruleRow
            	    {

            	    					newCompositeNode(grammarAccess.getTable_pAccess().getElementsRowParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_165);
            	    lv_elements_6_0=ruleRow();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTable_pRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_6_0,
            	    						"co.unal.photos.Softgallery.Row");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt62 >= 1 ) break loop62;
                        EarlyExitException eee =
                            new EarlyExitException(62, input);
                        throw eee;
                }
                cnt62++;
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
    // InternalSoftgallery.g:8043:1: entryRuleForeignKey returns [EObject current=null] : iv_ruleForeignKey= ruleForeignKey EOF ;
    public final EObject entryRuleForeignKey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForeignKey = null;


        try {
            // InternalSoftgallery.g:8043:51: (iv_ruleForeignKey= ruleForeignKey EOF )
            // InternalSoftgallery.g:8044:2: iv_ruleForeignKey= ruleForeignKey EOF
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
    // InternalSoftgallery.g:8050:1: ruleForeignKey returns [EObject current=null] : (otherlv_0= 'ForeignKey' ( (lv_elements_1_0= ruleForeignKey_n ) ) ( (lv_elements_2_0= ruleForeignKeyRef ) ) ) ;
    public final EObject ruleForeignKey() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_elements_1_0 = null;

        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalSoftgallery.g:8056:2: ( (otherlv_0= 'ForeignKey' ( (lv_elements_1_0= ruleForeignKey_n ) ) ( (lv_elements_2_0= ruleForeignKeyRef ) ) ) )
            // InternalSoftgallery.g:8057:2: (otherlv_0= 'ForeignKey' ( (lv_elements_1_0= ruleForeignKey_n ) ) ( (lv_elements_2_0= ruleForeignKeyRef ) ) )
            {
            // InternalSoftgallery.g:8057:2: (otherlv_0= 'ForeignKey' ( (lv_elements_1_0= ruleForeignKey_n ) ) ( (lv_elements_2_0= ruleForeignKeyRef ) ) )
            // InternalSoftgallery.g:8058:3: otherlv_0= 'ForeignKey' ( (lv_elements_1_0= ruleForeignKey_n ) ) ( (lv_elements_2_0= ruleForeignKeyRef ) )
            {
            otherlv_0=(Token)match(input,170,FOLLOW_166); 

            			newLeafNode(otherlv_0, grammarAccess.getForeignKeyAccess().getForeignKeyKeyword_0());
            		
            // InternalSoftgallery.g:8062:3: ( (lv_elements_1_0= ruleForeignKey_n ) )
            // InternalSoftgallery.g:8063:4: (lv_elements_1_0= ruleForeignKey_n )
            {
            // InternalSoftgallery.g:8063:4: (lv_elements_1_0= ruleForeignKey_n )
            // InternalSoftgallery.g:8064:5: lv_elements_1_0= ruleForeignKey_n
            {

            					newCompositeNode(grammarAccess.getForeignKeyAccess().getElementsForeignKey_nParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_167);
            lv_elements_1_0=ruleForeignKey_n();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForeignKeyRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_1_0,
            						"co.unal.photos.Softgallery.ForeignKey_n");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftgallery.g:8081:3: ( (lv_elements_2_0= ruleForeignKeyRef ) )
            // InternalSoftgallery.g:8082:4: (lv_elements_2_0= ruleForeignKeyRef )
            {
            // InternalSoftgallery.g:8082:4: (lv_elements_2_0= ruleForeignKeyRef )
            // InternalSoftgallery.g:8083:5: lv_elements_2_0= ruleForeignKeyRef
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
            						"co.unal.photos.Softgallery.ForeignKeyRef");
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
    // InternalSoftgallery.g:8104:1: entryRuleForeignKey_n returns [EObject current=null] : iv_ruleForeignKey_n= ruleForeignKey_n EOF ;
    public final EObject entryRuleForeignKey_n() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForeignKey_n = null;


        try {
            // InternalSoftgallery.g:8104:53: (iv_ruleForeignKey_n= ruleForeignKey_n EOF )
            // InternalSoftgallery.g:8105:2: iv_ruleForeignKey_n= ruleForeignKey_n EOF
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
    // InternalSoftgallery.g:8111:1: ruleForeignKey_n returns [EObject current=null] : (otherlv_0= 'ForeingKeyName' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleForeignKey_n() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftgallery.g:8117:2: ( (otherlv_0= 'ForeingKeyName' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftgallery.g:8118:2: (otherlv_0= 'ForeingKeyName' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftgallery.g:8118:2: (otherlv_0= 'ForeingKeyName' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftgallery.g:8119:3: otherlv_0= 'ForeingKeyName' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,171,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getForeignKey_nAccess().getForeingKeyNameKeyword_0());
            		
            // InternalSoftgallery.g:8123:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:8124:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:8124:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:8125:5: lv_name_1_0= RULE_ID
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
    // InternalSoftgallery.g:8145:1: entryRuleForeignKeyRef returns [EObject current=null] : iv_ruleForeignKeyRef= ruleForeignKeyRef EOF ;
    public final EObject entryRuleForeignKeyRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForeignKeyRef = null;


        try {
            // InternalSoftgallery.g:8145:54: (iv_ruleForeignKeyRef= ruleForeignKeyRef EOF )
            // InternalSoftgallery.g:8146:2: iv_ruleForeignKeyRef= ruleForeignKeyRef EOF
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
    // InternalSoftgallery.g:8152:1: ruleForeignKeyRef returns [EObject current=null] : (otherlv_0= 'ForeignKeyRef' ( (lv_elements_1_0= ruleRefTable_p ) )* ) ;
    public final EObject ruleForeignKeyRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_elements_1_0 = null;



        	enterRule();

        try {
            // InternalSoftgallery.g:8158:2: ( (otherlv_0= 'ForeignKeyRef' ( (lv_elements_1_0= ruleRefTable_p ) )* ) )
            // InternalSoftgallery.g:8159:2: (otherlv_0= 'ForeignKeyRef' ( (lv_elements_1_0= ruleRefTable_p ) )* )
            {
            // InternalSoftgallery.g:8159:2: (otherlv_0= 'ForeignKeyRef' ( (lv_elements_1_0= ruleRefTable_p ) )* )
            // InternalSoftgallery.g:8160:3: otherlv_0= 'ForeignKeyRef' ( (lv_elements_1_0= ruleRefTable_p ) )*
            {
            otherlv_0=(Token)match(input,172,FOLLOW_168); 

            			newLeafNode(otherlv_0, grammarAccess.getForeignKeyRefAccess().getForeignKeyRefKeyword_0());
            		
            // InternalSoftgallery.g:8164:3: ( (lv_elements_1_0= ruleRefTable_p ) )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==173) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // InternalSoftgallery.g:8165:4: (lv_elements_1_0= ruleRefTable_p )
            	    {
            	    // InternalSoftgallery.g:8165:4: (lv_elements_1_0= ruleRefTable_p )
            	    // InternalSoftgallery.g:8166:5: lv_elements_1_0= ruleRefTable_p
            	    {

            	    					newCompositeNode(grammarAccess.getForeignKeyRefAccess().getElementsRefTable_pParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_168);
            	    lv_elements_1_0=ruleRefTable_p();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getForeignKeyRefRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_1_0,
            	    						"co.unal.photos.Softgallery.RefTable_p");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop63;
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
    // InternalSoftgallery.g:8187:1: entryRuleRefTable_p returns [EObject current=null] : iv_ruleRefTable_p= ruleRefTable_p EOF ;
    public final EObject entryRuleRefTable_p() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefTable_p = null;


        try {
            // InternalSoftgallery.g:8187:51: (iv_ruleRefTable_p= ruleRefTable_p EOF )
            // InternalSoftgallery.g:8188:2: iv_ruleRefTable_p= ruleRefTable_p EOF
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
    // InternalSoftgallery.g:8194:1: ruleRefTable_p returns [EObject current=null] : (otherlv_0= 'RefTable_p' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleRefTable_p() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftgallery.g:8200:2: ( (otherlv_0= 'RefTable_p' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftgallery.g:8201:2: (otherlv_0= 'RefTable_p' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftgallery.g:8201:2: (otherlv_0= 'RefTable_p' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftgallery.g:8202:3: otherlv_0= 'RefTable_p' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,173,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getRefTable_pAccess().getRefTable_pKeyword_0());
            		
            // InternalSoftgallery.g:8206:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:8207:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:8207:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:8208:5: lv_name_1_0= RULE_ID
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
    // InternalSoftgallery.g:8228:1: entryRuleColumn returns [EObject current=null] : iv_ruleColumn= ruleColumn EOF ;
    public final EObject entryRuleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumn = null;


        try {
            // InternalSoftgallery.g:8228:47: (iv_ruleColumn= ruleColumn EOF )
            // InternalSoftgallery.g:8229:2: iv_ruleColumn= ruleColumn EOF
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
    // InternalSoftgallery.g:8235:1: ruleColumn returns [EObject current=null] : (otherlv_0= 'Column' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleDatatypeDB ) ) ( (lv_elements_3_0= ruleConstraint ) )* ) ;
    public final EObject ruleColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalSoftgallery.g:8241:2: ( (otherlv_0= 'Column' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleDatatypeDB ) ) ( (lv_elements_3_0= ruleConstraint ) )* ) )
            // InternalSoftgallery.g:8242:2: (otherlv_0= 'Column' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleDatatypeDB ) ) ( (lv_elements_3_0= ruleConstraint ) )* )
            {
            // InternalSoftgallery.g:8242:2: (otherlv_0= 'Column' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleDatatypeDB ) ) ( (lv_elements_3_0= ruleConstraint ) )* )
            // InternalSoftgallery.g:8243:3: otherlv_0= 'Column' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleDatatypeDB ) ) ( (lv_elements_3_0= ruleConstraint ) )*
            {
            otherlv_0=(Token)match(input,107,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getColumnAccess().getColumnKeyword_0());
            		
            // InternalSoftgallery.g:8247:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:8248:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:8248:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:8249:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_169); 

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

            // InternalSoftgallery.g:8265:3: ( (lv_elements_2_0= ruleDatatypeDB ) )
            // InternalSoftgallery.g:8266:4: (lv_elements_2_0= ruleDatatypeDB )
            {
            // InternalSoftgallery.g:8266:4: (lv_elements_2_0= ruleDatatypeDB )
            // InternalSoftgallery.g:8267:5: lv_elements_2_0= ruleDatatypeDB
            {

            					newCompositeNode(grammarAccess.getColumnAccess().getElementsDatatypeDBParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_170);
            lv_elements_2_0=ruleDatatypeDB();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColumnRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_2_0,
            						"co.unal.photos.Softgallery.DatatypeDB");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftgallery.g:8284:3: ( (lv_elements_3_0= ruleConstraint ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==175) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // InternalSoftgallery.g:8285:4: (lv_elements_3_0= ruleConstraint )
            	    {
            	    // InternalSoftgallery.g:8285:4: (lv_elements_3_0= ruleConstraint )
            	    // InternalSoftgallery.g:8286:5: lv_elements_3_0= ruleConstraint
            	    {

            	    					newCompositeNode(grammarAccess.getColumnAccess().getElementsConstraintParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_170);
            	    lv_elements_3_0=ruleConstraint();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getColumnRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_3_0,
            	    						"co.unal.photos.Softgallery.Constraint");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop64;
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
    // InternalSoftgallery.g:8307:1: entryRuleDatatypeDB returns [EObject current=null] : iv_ruleDatatypeDB= ruleDatatypeDB EOF ;
    public final EObject entryRuleDatatypeDB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatatypeDB = null;


        try {
            // InternalSoftgallery.g:8307:51: (iv_ruleDatatypeDB= ruleDatatypeDB EOF )
            // InternalSoftgallery.g:8308:2: iv_ruleDatatypeDB= ruleDatatypeDB EOF
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
    // InternalSoftgallery.g:8314:1: ruleDatatypeDB returns [EObject current=null] : (otherlv_0= 'DatatypeDB' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDatatypeDB() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftgallery.g:8320:2: ( (otherlv_0= 'DatatypeDB' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftgallery.g:8321:2: (otherlv_0= 'DatatypeDB' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftgallery.g:8321:2: (otherlv_0= 'DatatypeDB' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftgallery.g:8322:3: otherlv_0= 'DatatypeDB' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,174,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getDatatypeDBAccess().getDatatypeDBKeyword_0());
            		
            // InternalSoftgallery.g:8326:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:8327:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:8327:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:8328:5: lv_name_1_0= RULE_ID
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
    // InternalSoftgallery.g:8348:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalSoftgallery.g:8348:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalSoftgallery.g:8349:2: iv_ruleConstraint= ruleConstraint EOF
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
    // InternalSoftgallery.g:8355:1: ruleConstraint returns [EObject current=null] : (otherlv_0= 'Constraint' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftgallery.g:8361:2: ( (otherlv_0= 'Constraint' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftgallery.g:8362:2: (otherlv_0= 'Constraint' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftgallery.g:8362:2: (otherlv_0= 'Constraint' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftgallery.g:8363:3: otherlv_0= 'Constraint' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,175,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getConstraintAccess().getConstraintKeyword_0());
            		
            // InternalSoftgallery.g:8367:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:8368:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:8368:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:8369:5: lv_name_1_0= RULE_ID
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
    // InternalSoftgallery.g:8389:1: entryRuleRow returns [EObject current=null] : iv_ruleRow= ruleRow EOF ;
    public final EObject entryRuleRow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRow = null;


        try {
            // InternalSoftgallery.g:8389:44: (iv_ruleRow= ruleRow EOF )
            // InternalSoftgallery.g:8390:2: iv_ruleRow= ruleRow EOF
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
    // InternalSoftgallery.g:8396:1: ruleRow returns [EObject current=null] : (otherlv_0= 'Row' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= rulePolicy ) )* ) ;
    public final EObject ruleRow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalSoftgallery.g:8402:2: ( (otherlv_0= 'Row' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= rulePolicy ) )* ) )
            // InternalSoftgallery.g:8403:2: (otherlv_0= 'Row' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= rulePolicy ) )* )
            {
            // InternalSoftgallery.g:8403:2: (otherlv_0= 'Row' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= rulePolicy ) )* )
            // InternalSoftgallery.g:8404:3: otherlv_0= 'Row' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= rulePolicy ) )*
            {
            otherlv_0=(Token)match(input,176,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getRowAccess().getRowKeyword_0());
            		
            // InternalSoftgallery.g:8408:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:8409:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:8409:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:8410:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_171); 

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

            // InternalSoftgallery.g:8426:3: ( (lv_elements_2_0= rulePolicy ) )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==177) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // InternalSoftgallery.g:8427:4: (lv_elements_2_0= rulePolicy )
            	    {
            	    // InternalSoftgallery.g:8427:4: (lv_elements_2_0= rulePolicy )
            	    // InternalSoftgallery.g:8428:5: lv_elements_2_0= rulePolicy
            	    {

            	    					newCompositeNode(grammarAccess.getRowAccess().getElementsPolicyParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_171);
            	    lv_elements_2_0=rulePolicy();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRowRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_2_0,
            	    						"co.unal.photos.Softgallery.Policy");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop65;
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
    // InternalSoftgallery.g:8449:1: entryRulePolicy returns [EObject current=null] : iv_rulePolicy= rulePolicy EOF ;
    public final EObject entryRulePolicy() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolicy = null;


        try {
            // InternalSoftgallery.g:8449:47: (iv_rulePolicy= rulePolicy EOF )
            // InternalSoftgallery.g:8450:2: iv_rulePolicy= rulePolicy EOF
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
    // InternalSoftgallery.g:8456:1: rulePolicy returns [EObject current=null] : (otherlv_0= 'Policy' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePolicy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftgallery.g:8462:2: ( (otherlv_0= 'Policy' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftgallery.g:8463:2: (otherlv_0= 'Policy' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftgallery.g:8463:2: (otherlv_0= 'Policy' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftgallery.g:8464:3: otherlv_0= 'Policy' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,177,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getPolicyAccess().getPolicyKeyword_0());
            		
            // InternalSoftgallery.g:8468:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:8469:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:8469:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:8470:5: lv_name_1_0= RULE_ID
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
    // InternalSoftgallery.g:8490:1: entryRuleTrigger returns [EObject current=null] : iv_ruleTrigger= ruleTrigger EOF ;
    public final EObject entryRuleTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrigger = null;


        try {
            // InternalSoftgallery.g:8490:48: (iv_ruleTrigger= ruleTrigger EOF )
            // InternalSoftgallery.g:8491:2: iv_ruleTrigger= ruleTrigger EOF
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
    // InternalSoftgallery.g:8497:1: ruleTrigger returns [EObject current=null] : (otherlv_0= 'Trigger' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftgallery.g:8503:2: ( (otherlv_0= 'Trigger' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftgallery.g:8504:2: (otherlv_0= 'Trigger' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftgallery.g:8504:2: (otherlv_0= 'Trigger' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftgallery.g:8505:3: otherlv_0= 'Trigger' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,178,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getTriggerAccess().getTriggerKeyword_0());
            		
            // InternalSoftgallery.g:8509:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:8510:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:8510:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:8511:5: lv_name_1_0= RULE_ID
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
    // InternalSoftgallery.g:8531:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalSoftgallery.g:8531:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalSoftgallery.g:8532:2: iv_ruleFunction= ruleFunction EOF
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
    // InternalSoftgallery.g:8538:1: ruleFunction returns [EObject current=null] : (otherlv_0= 'Function' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftgallery.g:8544:2: ( (otherlv_0= 'Function' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftgallery.g:8545:2: (otherlv_0= 'Function' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftgallery.g:8545:2: (otherlv_0= 'Function' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftgallery.g:8546:3: otherlv_0= 'Function' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,179,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getFunctionKeyword_0());
            		
            // InternalSoftgallery.g:8550:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:8551:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:8551:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:8552:5: lv_name_1_0= RULE_ID
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
    // InternalSoftgallery.g:8572:1: entryRulePostgresUser returns [EObject current=null] : iv_rulePostgresUser= rulePostgresUser EOF ;
    public final EObject entryRulePostgresUser() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostgresUser = null;


        try {
            // InternalSoftgallery.g:8572:53: (iv_rulePostgresUser= rulePostgresUser EOF )
            // InternalSoftgallery.g:8573:2: iv_rulePostgresUser= rulePostgresUser EOF
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
    // InternalSoftgallery.g:8579:1: rulePostgresUser returns [EObject current=null] : (otherlv_0= 'PostgresUser' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= rulePrivilege ) ) ( (lv_elements_5_0= ruleQuery ) )* otherlv_6= '}' ) ;
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
            // InternalSoftgallery.g:8585:2: ( (otherlv_0= 'PostgresUser' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= rulePrivilege ) ) ( (lv_elements_5_0= ruleQuery ) )* otherlv_6= '}' ) )
            // InternalSoftgallery.g:8586:2: (otherlv_0= 'PostgresUser' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= rulePrivilege ) ) ( (lv_elements_5_0= ruleQuery ) )* otherlv_6= '}' )
            {
            // InternalSoftgallery.g:8586:2: (otherlv_0= 'PostgresUser' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= rulePrivilege ) ) ( (lv_elements_5_0= ruleQuery ) )* otherlv_6= '}' )
            // InternalSoftgallery.g:8587:3: otherlv_0= 'PostgresUser' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= rulePrivilege ) ) ( (lv_elements_5_0= ruleQuery ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,180,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getPostgresUserAccess().getPostgresUserKeyword_0());
            		
            // InternalSoftgallery.g:8591:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:8592:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:8592:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:8593:5: lv_name_1_0= RULE_ID
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
            		
            otherlv_3=(Token)match(input,13,FOLLOW_172); 

            			newLeafNode(otherlv_3, grammarAccess.getPostgresUserAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSoftgallery.g:8617:3: ( (lv_elements_4_0= rulePrivilege ) )
            // InternalSoftgallery.g:8618:4: (lv_elements_4_0= rulePrivilege )
            {
            // InternalSoftgallery.g:8618:4: (lv_elements_4_0= rulePrivilege )
            // InternalSoftgallery.g:8619:5: lv_elements_4_0= rulePrivilege
            {

            					newCompositeNode(grammarAccess.getPostgresUserAccess().getElementsPrivilegeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_173);
            lv_elements_4_0=rulePrivilege();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPostgresUserRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_4_0,
            						"co.unal.photos.Softgallery.Privilege");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftgallery.g:8636:3: ( (lv_elements_5_0= ruleQuery ) )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==182) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // InternalSoftgallery.g:8637:4: (lv_elements_5_0= ruleQuery )
            	    {
            	    // InternalSoftgallery.g:8637:4: (lv_elements_5_0= ruleQuery )
            	    // InternalSoftgallery.g:8638:5: lv_elements_5_0= ruleQuery
            	    {

            	    					newCompositeNode(grammarAccess.getPostgresUserAccess().getElementsQueryParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_173);
            	    lv_elements_5_0=ruleQuery();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPostgresUserRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_5_0,
            	    						"co.unal.photos.Softgallery.Query");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop66;
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
    // InternalSoftgallery.g:8663:1: entryRulePrivilege returns [EObject current=null] : iv_rulePrivilege= rulePrivilege EOF ;
    public final EObject entryRulePrivilege() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrivilege = null;


        try {
            // InternalSoftgallery.g:8663:50: (iv_rulePrivilege= rulePrivilege EOF )
            // InternalSoftgallery.g:8664:2: iv_rulePrivilege= rulePrivilege EOF
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
    // InternalSoftgallery.g:8670:1: rulePrivilege returns [EObject current=null] : (otherlv_0= 'Privilege' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePrivilege() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftgallery.g:8676:2: ( (otherlv_0= 'Privilege' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftgallery.g:8677:2: (otherlv_0= 'Privilege' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftgallery.g:8677:2: (otherlv_0= 'Privilege' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftgallery.g:8678:3: otherlv_0= 'Privilege' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,181,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getPrivilegeAccess().getPrivilegeKeyword_0());
            		
            // InternalSoftgallery.g:8682:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:8683:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:8683:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:8684:5: lv_name_1_0= RULE_ID
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
    // InternalSoftgallery.g:8704:1: entryRuleQuery returns [EObject current=null] : iv_ruleQuery= ruleQuery EOF ;
    public final EObject entryRuleQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuery = null;


        try {
            // InternalSoftgallery.g:8704:46: (iv_ruleQuery= ruleQuery EOF )
            // InternalSoftgallery.g:8705:2: iv_ruleQuery= ruleQuery EOF
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
    // InternalSoftgallery.g:8711:1: ruleQuery returns [EObject current=null] : (otherlv_0= 'Query' ( (lv_elements_1_0= ruleClause ) ) ) ;
    public final EObject ruleQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_elements_1_0 = null;



        	enterRule();

        try {
            // InternalSoftgallery.g:8717:2: ( (otherlv_0= 'Query' ( (lv_elements_1_0= ruleClause ) ) ) )
            // InternalSoftgallery.g:8718:2: (otherlv_0= 'Query' ( (lv_elements_1_0= ruleClause ) ) )
            {
            // InternalSoftgallery.g:8718:2: (otherlv_0= 'Query' ( (lv_elements_1_0= ruleClause ) ) )
            // InternalSoftgallery.g:8719:3: otherlv_0= 'Query' ( (lv_elements_1_0= ruleClause ) )
            {
            otherlv_0=(Token)match(input,182,FOLLOW_174); 

            			newLeafNode(otherlv_0, grammarAccess.getQueryAccess().getQueryKeyword_0());
            		
            // InternalSoftgallery.g:8723:3: ( (lv_elements_1_0= ruleClause ) )
            // InternalSoftgallery.g:8724:4: (lv_elements_1_0= ruleClause )
            {
            // InternalSoftgallery.g:8724:4: (lv_elements_1_0= ruleClause )
            // InternalSoftgallery.g:8725:5: lv_elements_1_0= ruleClause
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
            						"co.unal.photos.Softgallery.Clause");
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
    // InternalSoftgallery.g:8746:1: entryRuleClause returns [EObject current=null] : iv_ruleClause= ruleClause EOF ;
    public final EObject entryRuleClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClause = null;


        try {
            // InternalSoftgallery.g:8746:47: (iv_ruleClause= ruleClause EOF )
            // InternalSoftgallery.g:8747:2: iv_ruleClause= ruleClause EOF
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
    // InternalSoftgallery.g:8753:1: ruleClause returns [EObject current=null] : (otherlv_0= 'Clause' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftgallery.g:8759:2: ( (otherlv_0= 'Clause' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftgallery.g:8760:2: (otherlv_0= 'Clause' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftgallery.g:8760:2: (otherlv_0= 'Clause' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftgallery.g:8761:3: otherlv_0= 'Clause' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,183,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getClauseAccess().getClauseKeyword_0());
            		
            // InternalSoftgallery.g:8765:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:8766:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:8766:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:8767:5: lv_name_1_0= RULE_ID
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
    // InternalSoftgallery.g:8787:1: entryRuleAmazonWebServices returns [EObject current=null] : iv_ruleAmazonWebServices= ruleAmazonWebServices EOF ;
    public final EObject entryRuleAmazonWebServices() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAmazonWebServices = null;


        try {
            // InternalSoftgallery.g:8787:58: (iv_ruleAmazonWebServices= ruleAmazonWebServices EOF )
            // InternalSoftgallery.g:8788:2: iv_ruleAmazonWebServices= ruleAmazonWebServices EOF
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
    // InternalSoftgallery.g:8794:1: ruleAmazonWebServices returns [EObject current=null] : (otherlv_0= 'AmazonWebServices' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleAmazonSimpleStorageService ) ) ( (lv_elements_5_0= ruleAmazonElasticComputeCloud ) ) otherlv_6= '}' ) ;
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
            // InternalSoftgallery.g:8800:2: ( (otherlv_0= 'AmazonWebServices' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleAmazonSimpleStorageService ) ) ( (lv_elements_5_0= ruleAmazonElasticComputeCloud ) ) otherlv_6= '}' ) )
            // InternalSoftgallery.g:8801:2: (otherlv_0= 'AmazonWebServices' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleAmazonSimpleStorageService ) ) ( (lv_elements_5_0= ruleAmazonElasticComputeCloud ) ) otherlv_6= '}' )
            {
            // InternalSoftgallery.g:8801:2: (otherlv_0= 'AmazonWebServices' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleAmazonSimpleStorageService ) ) ( (lv_elements_5_0= ruleAmazonElasticComputeCloud ) ) otherlv_6= '}' )
            // InternalSoftgallery.g:8802:3: otherlv_0= 'AmazonWebServices' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleAmazonSimpleStorageService ) ) ( (lv_elements_5_0= ruleAmazonElasticComputeCloud ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,184,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getAmazonWebServicesAccess().getAmazonWebServicesKeyword_0());
            		
            // InternalSoftgallery.g:8806:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:8807:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:8807:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:8808:5: lv_name_1_0= RULE_ID
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
            		
            otherlv_3=(Token)match(input,13,FOLLOW_175); 

            			newLeafNode(otherlv_3, grammarAccess.getAmazonWebServicesAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSoftgallery.g:8832:3: ( (lv_elements_4_0= ruleAmazonSimpleStorageService ) )
            // InternalSoftgallery.g:8833:4: (lv_elements_4_0= ruleAmazonSimpleStorageService )
            {
            // InternalSoftgallery.g:8833:4: (lv_elements_4_0= ruleAmazonSimpleStorageService )
            // InternalSoftgallery.g:8834:5: lv_elements_4_0= ruleAmazonSimpleStorageService
            {

            					newCompositeNode(grammarAccess.getAmazonWebServicesAccess().getElementsAmazonSimpleStorageServiceParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_176);
            lv_elements_4_0=ruleAmazonSimpleStorageService();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAmazonWebServicesRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_4_0,
            						"co.unal.photos.Softgallery.AmazonSimpleStorageService");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftgallery.g:8851:3: ( (lv_elements_5_0= ruleAmazonElasticComputeCloud ) )
            // InternalSoftgallery.g:8852:4: (lv_elements_5_0= ruleAmazonElasticComputeCloud )
            {
            // InternalSoftgallery.g:8852:4: (lv_elements_5_0= ruleAmazonElasticComputeCloud )
            // InternalSoftgallery.g:8853:5: lv_elements_5_0= ruleAmazonElasticComputeCloud
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
            						"co.unal.photos.Softgallery.AmazonElasticComputeCloud");
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
    // InternalSoftgallery.g:8878:1: entryRuleAmazonSimpleStorageService returns [EObject current=null] : iv_ruleAmazonSimpleStorageService= ruleAmazonSimpleStorageService EOF ;
    public final EObject entryRuleAmazonSimpleStorageService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAmazonSimpleStorageService = null;


        try {
            // InternalSoftgallery.g:8878:67: (iv_ruleAmazonSimpleStorageService= ruleAmazonSimpleStorageService EOF )
            // InternalSoftgallery.g:8879:2: iv_ruleAmazonSimpleStorageService= ruleAmazonSimpleStorageService EOF
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
    // InternalSoftgallery.g:8885:1: ruleAmazonSimpleStorageService returns [EObject current=null] : (otherlv_0= 'AmazonSimpleStorageService' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleBatchOperation ) )* ( (lv_elements_4_0= ruleBucket ) ) otherlv_5= '}' ) ;
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
            // InternalSoftgallery.g:8891:2: ( (otherlv_0= 'AmazonSimpleStorageService' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleBatchOperation ) )* ( (lv_elements_4_0= ruleBucket ) ) otherlv_5= '}' ) )
            // InternalSoftgallery.g:8892:2: (otherlv_0= 'AmazonSimpleStorageService' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleBatchOperation ) )* ( (lv_elements_4_0= ruleBucket ) ) otherlv_5= '}' )
            {
            // InternalSoftgallery.g:8892:2: (otherlv_0= 'AmazonSimpleStorageService' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleBatchOperation ) )* ( (lv_elements_4_0= ruleBucket ) ) otherlv_5= '}' )
            // InternalSoftgallery.g:8893:3: otherlv_0= 'AmazonSimpleStorageService' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleBatchOperation ) )* ( (lv_elements_4_0= ruleBucket ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,185,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAmazonSimpleStorageServiceAccess().getAmazonSimpleStorageServiceKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAmazonSimpleStorageServiceAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_177); 

            			newLeafNode(otherlv_2, grammarAccess.getAmazonSimpleStorageServiceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSoftgallery.g:8905:3: ( (lv_elements_3_0= ruleBatchOperation ) )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==186) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // InternalSoftgallery.g:8906:4: (lv_elements_3_0= ruleBatchOperation )
            	    {
            	    // InternalSoftgallery.g:8906:4: (lv_elements_3_0= ruleBatchOperation )
            	    // InternalSoftgallery.g:8907:5: lv_elements_3_0= ruleBatchOperation
            	    {

            	    					newCompositeNode(grammarAccess.getAmazonSimpleStorageServiceAccess().getElementsBatchOperationParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_177);
            	    lv_elements_3_0=ruleBatchOperation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAmazonSimpleStorageServiceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_3_0,
            	    						"co.unal.photos.Softgallery.BatchOperation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);

            // InternalSoftgallery.g:8924:3: ( (lv_elements_4_0= ruleBucket ) )
            // InternalSoftgallery.g:8925:4: (lv_elements_4_0= ruleBucket )
            {
            // InternalSoftgallery.g:8925:4: (lv_elements_4_0= ruleBucket )
            // InternalSoftgallery.g:8926:5: lv_elements_4_0= ruleBucket
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
            						"co.unal.photos.Softgallery.Bucket");
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
    // InternalSoftgallery.g:8951:1: entryRuleBatchOperation returns [EObject current=null] : iv_ruleBatchOperation= ruleBatchOperation EOF ;
    public final EObject entryRuleBatchOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBatchOperation = null;


        try {
            // InternalSoftgallery.g:8951:55: (iv_ruleBatchOperation= ruleBatchOperation EOF )
            // InternalSoftgallery.g:8952:2: iv_ruleBatchOperation= ruleBatchOperation EOF
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
    // InternalSoftgallery.g:8958:1: ruleBatchOperation returns [EObject current=null] : (otherlv_0= 'BatchOperation' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleBatchOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftgallery.g:8964:2: ( (otherlv_0= 'BatchOperation' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftgallery.g:8965:2: (otherlv_0= 'BatchOperation' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftgallery.g:8965:2: (otherlv_0= 'BatchOperation' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftgallery.g:8966:3: otherlv_0= 'BatchOperation' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,186,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getBatchOperationAccess().getBatchOperationKeyword_0());
            		
            // InternalSoftgallery.g:8970:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:8971:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:8971:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:8972:5: lv_name_1_0= RULE_ID
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
    // InternalSoftgallery.g:8992:1: entryRuleBucket returns [EObject current=null] : iv_ruleBucket= ruleBucket EOF ;
    public final EObject entryRuleBucket() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBucket = null;


        try {
            // InternalSoftgallery.g:8992:47: (iv_ruleBucket= ruleBucket EOF )
            // InternalSoftgallery.g:8993:2: iv_ruleBucket= ruleBucket EOF
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
    // InternalSoftgallery.g:8999:1: ruleBucket returns [EObject current=null] : (otherlv_0= 'Bucket' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleBucketAccess ) ) ( (lv_elements_3_0= ruleAmazonFolder ) )* ( (lv_elements_4_0= ruleAmazonFile ) )+ ) ;
    public final EObject ruleBucket() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_3_0 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalSoftgallery.g:9005:2: ( (otherlv_0= 'Bucket' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleBucketAccess ) ) ( (lv_elements_3_0= ruleAmazonFolder ) )* ( (lv_elements_4_0= ruleAmazonFile ) )+ ) )
            // InternalSoftgallery.g:9006:2: (otherlv_0= 'Bucket' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleBucketAccess ) ) ( (lv_elements_3_0= ruleAmazonFolder ) )* ( (lv_elements_4_0= ruleAmazonFile ) )+ )
            {
            // InternalSoftgallery.g:9006:2: (otherlv_0= 'Bucket' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleBucketAccess ) ) ( (lv_elements_3_0= ruleAmazonFolder ) )* ( (lv_elements_4_0= ruleAmazonFile ) )+ )
            // InternalSoftgallery.g:9007:3: otherlv_0= 'Bucket' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleBucketAccess ) ) ( (lv_elements_3_0= ruleAmazonFolder ) )* ( (lv_elements_4_0= ruleAmazonFile ) )+
            {
            otherlv_0=(Token)match(input,187,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getBucketAccess().getBucketKeyword_0());
            		
            // InternalSoftgallery.g:9011:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:9012:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:9012:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:9013:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_178); 

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

            // InternalSoftgallery.g:9029:3: ( (lv_elements_2_0= ruleBucketAccess ) )
            // InternalSoftgallery.g:9030:4: (lv_elements_2_0= ruleBucketAccess )
            {
            // InternalSoftgallery.g:9030:4: (lv_elements_2_0= ruleBucketAccess )
            // InternalSoftgallery.g:9031:5: lv_elements_2_0= ruleBucketAccess
            {

            					newCompositeNode(grammarAccess.getBucketAccess().getElementsBucketAccessParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_179);
            lv_elements_2_0=ruleBucketAccess();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBucketRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_2_0,
            						"co.unal.photos.Softgallery.BucketAccess");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSoftgallery.g:9048:3: ( (lv_elements_3_0= ruleAmazonFolder ) )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==193) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // InternalSoftgallery.g:9049:4: (lv_elements_3_0= ruleAmazonFolder )
            	    {
            	    // InternalSoftgallery.g:9049:4: (lv_elements_3_0= ruleAmazonFolder )
            	    // InternalSoftgallery.g:9050:5: lv_elements_3_0= ruleAmazonFolder
            	    {

            	    					newCompositeNode(grammarAccess.getBucketAccess().getElementsAmazonFolderParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_179);
            	    lv_elements_3_0=ruleAmazonFolder();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBucketRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_3_0,
            	    						"co.unal.photos.Softgallery.AmazonFolder");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);

            // InternalSoftgallery.g:9067:3: ( (lv_elements_4_0= ruleAmazonFile ) )+
            int cnt69=0;
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==194) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // InternalSoftgallery.g:9068:4: (lv_elements_4_0= ruleAmazonFile )
            	    {
            	    // InternalSoftgallery.g:9068:4: (lv_elements_4_0= ruleAmazonFile )
            	    // InternalSoftgallery.g:9069:5: lv_elements_4_0= ruleAmazonFile
            	    {

            	    					newCompositeNode(grammarAccess.getBucketAccess().getElementsAmazonFileParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_180);
            	    lv_elements_4_0=ruleAmazonFile();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBucketRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_4_0,
            	    						"co.unal.photos.Softgallery.AmazonFile");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt69 >= 1 ) break loop69;
                        EarlyExitException eee =
                            new EarlyExitException(69, input);
                        throw eee;
                }
                cnt69++;
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
    // InternalSoftgallery.g:9090:1: entryRuleBucketAccess returns [EObject current=null] : iv_ruleBucketAccess= ruleBucketAccess EOF ;
    public final EObject entryRuleBucketAccess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBucketAccess = null;


        try {
            // InternalSoftgallery.g:9090:53: (iv_ruleBucketAccess= ruleBucketAccess EOF )
            // InternalSoftgallery.g:9091:2: iv_ruleBucketAccess= ruleBucketAccess EOF
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
    // InternalSoftgallery.g:9097:1: ruleBucketAccess returns [EObject current=null] : ( (otherlv_0= 'BucketAccess' ( (lv_elements_1_0= rulePublicAccess ) ) ) | ( (lv_elements_2_0= ruleObjectsPublic ) ) | ( (lv_elements_3_0= ruleBucketObjectsNotPublic ) ) | ( (lv_elements_4_0= ruleOnlyAuthorized ) ) ) ;
    public final EObject ruleBucketAccess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_elements_1_0 = null;

        EObject lv_elements_2_0 = null;

        EObject lv_elements_3_0 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalSoftgallery.g:9103:2: ( ( (otherlv_0= 'BucketAccess' ( (lv_elements_1_0= rulePublicAccess ) ) ) | ( (lv_elements_2_0= ruleObjectsPublic ) ) | ( (lv_elements_3_0= ruleBucketObjectsNotPublic ) ) | ( (lv_elements_4_0= ruleOnlyAuthorized ) ) ) )
            // InternalSoftgallery.g:9104:2: ( (otherlv_0= 'BucketAccess' ( (lv_elements_1_0= rulePublicAccess ) ) ) | ( (lv_elements_2_0= ruleObjectsPublic ) ) | ( (lv_elements_3_0= ruleBucketObjectsNotPublic ) ) | ( (lv_elements_4_0= ruleOnlyAuthorized ) ) )
            {
            // InternalSoftgallery.g:9104:2: ( (otherlv_0= 'BucketAccess' ( (lv_elements_1_0= rulePublicAccess ) ) ) | ( (lv_elements_2_0= ruleObjectsPublic ) ) | ( (lv_elements_3_0= ruleBucketObjectsNotPublic ) ) | ( (lv_elements_4_0= ruleOnlyAuthorized ) ) )
            int alt70=4;
            switch ( input.LA(1) ) {
            case 188:
                {
                alt70=1;
                }
                break;
            case 190:
                {
                alt70=2;
                }
                break;
            case 191:
                {
                alt70=3;
                }
                break;
            case 192:
                {
                alt70=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }

            switch (alt70) {
                case 1 :
                    // InternalSoftgallery.g:9105:3: (otherlv_0= 'BucketAccess' ( (lv_elements_1_0= rulePublicAccess ) ) )
                    {
                    // InternalSoftgallery.g:9105:3: (otherlv_0= 'BucketAccess' ( (lv_elements_1_0= rulePublicAccess ) ) )
                    // InternalSoftgallery.g:9106:4: otherlv_0= 'BucketAccess' ( (lv_elements_1_0= rulePublicAccess ) )
                    {
                    otherlv_0=(Token)match(input,188,FOLLOW_181); 

                    				newLeafNode(otherlv_0, grammarAccess.getBucketAccessAccess().getBucketAccessKeyword_0_0());
                    			
                    // InternalSoftgallery.g:9110:4: ( (lv_elements_1_0= rulePublicAccess ) )
                    // InternalSoftgallery.g:9111:5: (lv_elements_1_0= rulePublicAccess )
                    {
                    // InternalSoftgallery.g:9111:5: (lv_elements_1_0= rulePublicAccess )
                    // InternalSoftgallery.g:9112:6: lv_elements_1_0= rulePublicAccess
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
                    							"co.unal.photos.Softgallery.PublicAccess");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSoftgallery.g:9131:3: ( (lv_elements_2_0= ruleObjectsPublic ) )
                    {
                    // InternalSoftgallery.g:9131:3: ( (lv_elements_2_0= ruleObjectsPublic ) )
                    // InternalSoftgallery.g:9132:4: (lv_elements_2_0= ruleObjectsPublic )
                    {
                    // InternalSoftgallery.g:9132:4: (lv_elements_2_0= ruleObjectsPublic )
                    // InternalSoftgallery.g:9133:5: lv_elements_2_0= ruleObjectsPublic
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
                    						"co.unal.photos.Softgallery.ObjectsPublic");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSoftgallery.g:9151:3: ( (lv_elements_3_0= ruleBucketObjectsNotPublic ) )
                    {
                    // InternalSoftgallery.g:9151:3: ( (lv_elements_3_0= ruleBucketObjectsNotPublic ) )
                    // InternalSoftgallery.g:9152:4: (lv_elements_3_0= ruleBucketObjectsNotPublic )
                    {
                    // InternalSoftgallery.g:9152:4: (lv_elements_3_0= ruleBucketObjectsNotPublic )
                    // InternalSoftgallery.g:9153:5: lv_elements_3_0= ruleBucketObjectsNotPublic
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
                    						"co.unal.photos.Softgallery.BucketObjectsNotPublic");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalSoftgallery.g:9171:3: ( (lv_elements_4_0= ruleOnlyAuthorized ) )
                    {
                    // InternalSoftgallery.g:9171:3: ( (lv_elements_4_0= ruleOnlyAuthorized ) )
                    // InternalSoftgallery.g:9172:4: (lv_elements_4_0= ruleOnlyAuthorized )
                    {
                    // InternalSoftgallery.g:9172:4: (lv_elements_4_0= ruleOnlyAuthorized )
                    // InternalSoftgallery.g:9173:5: lv_elements_4_0= ruleOnlyAuthorized
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
                    						"co.unal.photos.Softgallery.OnlyAuthorized");
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
    // InternalSoftgallery.g:9194:1: entryRulePublicAccess returns [EObject current=null] : iv_rulePublicAccess= rulePublicAccess EOF ;
    public final EObject entryRulePublicAccess() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePublicAccess = null;


        try {
            // InternalSoftgallery.g:9194:53: (iv_rulePublicAccess= rulePublicAccess EOF )
            // InternalSoftgallery.g:9195:2: iv_rulePublicAccess= rulePublicAccess EOF
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
    // InternalSoftgallery.g:9201:1: rulePublicAccess returns [EObject current=null] : (otherlv_0= 'PublicAccess' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePublicAccess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftgallery.g:9207:2: ( (otherlv_0= 'PublicAccess' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftgallery.g:9208:2: (otherlv_0= 'PublicAccess' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftgallery.g:9208:2: (otherlv_0= 'PublicAccess' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftgallery.g:9209:3: otherlv_0= 'PublicAccess' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,189,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getPublicAccessAccess().getPublicAccessKeyword_0());
            		
            // InternalSoftgallery.g:9213:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:9214:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:9214:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:9215:5: lv_name_1_0= RULE_ID
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
    // InternalSoftgallery.g:9235:1: entryRuleObjectsPublic returns [EObject current=null] : iv_ruleObjectsPublic= ruleObjectsPublic EOF ;
    public final EObject entryRuleObjectsPublic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectsPublic = null;


        try {
            // InternalSoftgallery.g:9235:54: (iv_ruleObjectsPublic= ruleObjectsPublic EOF )
            // InternalSoftgallery.g:9236:2: iv_ruleObjectsPublic= ruleObjectsPublic EOF
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
    // InternalSoftgallery.g:9242:1: ruleObjectsPublic returns [EObject current=null] : (otherlv_0= 'ObjectsPublic' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleObjectsPublic() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftgallery.g:9248:2: ( (otherlv_0= 'ObjectsPublic' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftgallery.g:9249:2: (otherlv_0= 'ObjectsPublic' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftgallery.g:9249:2: (otherlv_0= 'ObjectsPublic' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftgallery.g:9250:3: otherlv_0= 'ObjectsPublic' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,190,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getObjectsPublicAccess().getObjectsPublicKeyword_0());
            		
            // InternalSoftgallery.g:9254:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:9255:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:9255:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:9256:5: lv_name_1_0= RULE_ID
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
    // InternalSoftgallery.g:9276:1: entryRuleBucketObjectsNotPublic returns [EObject current=null] : iv_ruleBucketObjectsNotPublic= ruleBucketObjectsNotPublic EOF ;
    public final EObject entryRuleBucketObjectsNotPublic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBucketObjectsNotPublic = null;


        try {
            // InternalSoftgallery.g:9276:63: (iv_ruleBucketObjectsNotPublic= ruleBucketObjectsNotPublic EOF )
            // InternalSoftgallery.g:9277:2: iv_ruleBucketObjectsNotPublic= ruleBucketObjectsNotPublic EOF
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
    // InternalSoftgallery.g:9283:1: ruleBucketObjectsNotPublic returns [EObject current=null] : (otherlv_0= 'BucketObjectsNotPublic' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleBucketObjectsNotPublic() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftgallery.g:9289:2: ( (otherlv_0= 'BucketObjectsNotPublic' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftgallery.g:9290:2: (otherlv_0= 'BucketObjectsNotPublic' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftgallery.g:9290:2: (otherlv_0= 'BucketObjectsNotPublic' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftgallery.g:9291:3: otherlv_0= 'BucketObjectsNotPublic' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,191,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getBucketObjectsNotPublicAccess().getBucketObjectsNotPublicKeyword_0());
            		
            // InternalSoftgallery.g:9295:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:9296:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:9296:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:9297:5: lv_name_1_0= RULE_ID
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
    // InternalSoftgallery.g:9317:1: entryRuleOnlyAuthorized returns [EObject current=null] : iv_ruleOnlyAuthorized= ruleOnlyAuthorized EOF ;
    public final EObject entryRuleOnlyAuthorized() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnlyAuthorized = null;


        try {
            // InternalSoftgallery.g:9317:55: (iv_ruleOnlyAuthorized= ruleOnlyAuthorized EOF )
            // InternalSoftgallery.g:9318:2: iv_ruleOnlyAuthorized= ruleOnlyAuthorized EOF
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
    // InternalSoftgallery.g:9324:1: ruleOnlyAuthorized returns [EObject current=null] : (otherlv_0= 'OnlyAuthorized' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleOnlyAuthorized() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftgallery.g:9330:2: ( (otherlv_0= 'OnlyAuthorized' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftgallery.g:9331:2: (otherlv_0= 'OnlyAuthorized' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftgallery.g:9331:2: (otherlv_0= 'OnlyAuthorized' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftgallery.g:9332:3: otherlv_0= 'OnlyAuthorized' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,192,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getOnlyAuthorizedAccess().getOnlyAuthorizedKeyword_0());
            		
            // InternalSoftgallery.g:9336:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:9337:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:9337:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:9338:5: lv_name_1_0= RULE_ID
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
    // InternalSoftgallery.g:9358:1: entryRuleAmazonFolder returns [EObject current=null] : iv_ruleAmazonFolder= ruleAmazonFolder EOF ;
    public final EObject entryRuleAmazonFolder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAmazonFolder = null;


        try {
            // InternalSoftgallery.g:9358:53: (iv_ruleAmazonFolder= ruleAmazonFolder EOF )
            // InternalSoftgallery.g:9359:2: iv_ruleAmazonFolder= ruleAmazonFolder EOF
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
    // InternalSoftgallery.g:9365:1: ruleAmazonFolder returns [EObject current=null] : (otherlv_0= 'AmazonFolder' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAmazonFolder() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftgallery.g:9371:2: ( (otherlv_0= 'AmazonFolder' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftgallery.g:9372:2: (otherlv_0= 'AmazonFolder' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftgallery.g:9372:2: (otherlv_0= 'AmazonFolder' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftgallery.g:9373:3: otherlv_0= 'AmazonFolder' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,193,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getAmazonFolderAccess().getAmazonFolderKeyword_0());
            		
            // InternalSoftgallery.g:9377:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:9378:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:9378:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:9379:5: lv_name_1_0= RULE_ID
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
    // InternalSoftgallery.g:9399:1: entryRuleAmazonFile returns [EObject current=null] : iv_ruleAmazonFile= ruleAmazonFile EOF ;
    public final EObject entryRuleAmazonFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAmazonFile = null;


        try {
            // InternalSoftgallery.g:9399:51: (iv_ruleAmazonFile= ruleAmazonFile EOF )
            // InternalSoftgallery.g:9400:2: iv_ruleAmazonFile= ruleAmazonFile EOF
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
    // InternalSoftgallery.g:9406:1: ruleAmazonFile returns [EObject current=null] : (otherlv_0= 'AmazonFile' ( (lv_elements_1_0= ruleMetadata ) )+ ) ;
    public final EObject ruleAmazonFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_elements_1_0 = null;



        	enterRule();

        try {
            // InternalSoftgallery.g:9412:2: ( (otherlv_0= 'AmazonFile' ( (lv_elements_1_0= ruleMetadata ) )+ ) )
            // InternalSoftgallery.g:9413:2: (otherlv_0= 'AmazonFile' ( (lv_elements_1_0= ruleMetadata ) )+ )
            {
            // InternalSoftgallery.g:9413:2: (otherlv_0= 'AmazonFile' ( (lv_elements_1_0= ruleMetadata ) )+ )
            // InternalSoftgallery.g:9414:3: otherlv_0= 'AmazonFile' ( (lv_elements_1_0= ruleMetadata ) )+
            {
            otherlv_0=(Token)match(input,194,FOLLOW_182); 

            			newLeafNode(otherlv_0, grammarAccess.getAmazonFileAccess().getAmazonFileKeyword_0());
            		
            // InternalSoftgallery.g:9418:3: ( (lv_elements_1_0= ruleMetadata ) )+
            int cnt71=0;
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==195) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // InternalSoftgallery.g:9419:4: (lv_elements_1_0= ruleMetadata )
            	    {
            	    // InternalSoftgallery.g:9419:4: (lv_elements_1_0= ruleMetadata )
            	    // InternalSoftgallery.g:9420:5: lv_elements_1_0= ruleMetadata
            	    {

            	    					newCompositeNode(grammarAccess.getAmazonFileAccess().getElementsMetadataParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_183);
            	    lv_elements_1_0=ruleMetadata();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAmazonFileRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_1_0,
            	    						"co.unal.photos.Softgallery.Metadata");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt71 >= 1 ) break loop71;
                        EarlyExitException eee =
                            new EarlyExitException(71, input);
                        throw eee;
                }
                cnt71++;
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
    // InternalSoftgallery.g:9441:1: entryRuleMetadata returns [EObject current=null] : iv_ruleMetadata= ruleMetadata EOF ;
    public final EObject entryRuleMetadata() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetadata = null;


        try {
            // InternalSoftgallery.g:9441:49: (iv_ruleMetadata= ruleMetadata EOF )
            // InternalSoftgallery.g:9442:2: iv_ruleMetadata= ruleMetadata EOF
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
    // InternalSoftgallery.g:9448:1: ruleMetadata returns [EObject current=null] : (otherlv_0= 'Metadata' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleMetadata() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftgallery.g:9454:2: ( (otherlv_0= 'Metadata' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftgallery.g:9455:2: (otherlv_0= 'Metadata' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftgallery.g:9455:2: (otherlv_0= 'Metadata' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftgallery.g:9456:3: otherlv_0= 'Metadata' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,195,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getMetadataAccess().getMetadataKeyword_0());
            		
            // InternalSoftgallery.g:9460:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:9461:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:9461:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:9462:5: lv_name_1_0= RULE_ID
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
    // InternalSoftgallery.g:9482:1: entryRuleAmazonElasticComputeCloud returns [EObject current=null] : iv_ruleAmazonElasticComputeCloud= ruleAmazonElasticComputeCloud EOF ;
    public final EObject entryRuleAmazonElasticComputeCloud() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAmazonElasticComputeCloud = null;


        try {
            // InternalSoftgallery.g:9482:66: (iv_ruleAmazonElasticComputeCloud= ruleAmazonElasticComputeCloud EOF )
            // InternalSoftgallery.g:9483:2: iv_ruleAmazonElasticComputeCloud= ruleAmazonElasticComputeCloud EOF
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
    // InternalSoftgallery.g:9489:1: ruleAmazonElasticComputeCloud returns [EObject current=null] : (otherlv_0= 'AmazonElasticComputeCloud' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAmazonElasticComputeCloud() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSoftgallery.g:9495:2: ( (otherlv_0= 'AmazonElasticComputeCloud' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSoftgallery.g:9496:2: (otherlv_0= 'AmazonElasticComputeCloud' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSoftgallery.g:9496:2: (otherlv_0= 'AmazonElasticComputeCloud' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSoftgallery.g:9497:3: otherlv_0= 'AmazonElasticComputeCloud' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,196,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getAmazonElasticComputeCloudAccess().getAmazonElasticComputeCloudKeyword_0());
            		
            // InternalSoftgallery.g:9501:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSoftgallery.g:9502:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSoftgallery.g:9502:4: (lv_name_1_0= RULE_ID )
            // InternalSoftgallery.g:9503:5: lv_name_1_0= RULE_ID
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
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0xC000000000000002L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000840000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000700L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000700L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000870L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000000L,0x0000000000500000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000000L,0x0000000001400000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000000L,0x0000008001000000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000004000L,0x0000000000800000L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000000000000000L,0x0000000050000000L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000000000000L,0x0000002040000000L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x0000000000000000L,0x000000000C000000L});
    public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x0000000000000000L,0x0000000180000000L});
    public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x0000000000000000L,0x0000001E00000000L});
    public static final BitSet FOLLOW_102 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_103 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_104 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_105 = new BitSet(new long[]{0x0000000000004000L,0x0000110000000000L});
    public static final BitSet FOLLOW_106 = new BitSet(new long[]{0x0000000000004000L,0x0000100000000000L});
    public static final BitSet FOLLOW_107 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_108 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_109 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000000L});
    public static final BitSet FOLLOW_110 = new BitSet(new long[]{0x0000000000000002L,0x0000040000000000L});
    public static final BitSet FOLLOW_111 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_112 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_113 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_114 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_115 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_116 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_117 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_118 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_119 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_120 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L});
    public static final BitSet FOLLOW_121 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_122 = new BitSet(new long[]{0x0000000000000002L,0x0004000000000000L});
    public static final BitSet FOLLOW_123 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_124 = new BitSet(new long[]{0x0000000000000000L,0x03E0000000000000L});
    public static final BitSet FOLLOW_125 = new BitSet(new long[]{0x0000000000000002L,0x03E0000000000000L});
    public static final BitSet FOLLOW_126 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_127 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_128 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_129 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_130 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_131 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_132 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_133 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_134 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_135 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_136 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000000L,0x000000000000E800L});
    public static final BitSet FOLLOW_137 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_138 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_139 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000003F0L});
    public static final BitSet FOLLOW_140 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_141 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_142 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_143 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_144 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_145 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_146 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_147 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000C00000L});
    public static final BitSet FOLLOW_148 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_149 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000FC000000L});
    public static final BitSet FOLLOW_150 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000000L,0x00000000FC000000L});
    public static final BitSet FOLLOW_151 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_152 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000C00000000L});
    public static final BitSet FOLLOW_153 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000000L,0x0000000C00000000L});
    public static final BitSet FOLLOW_154 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_155 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_156 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_157 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_158 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_159 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000038000000000L});
    public static final BitSet FOLLOW_160 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000C038000000000L});
    public static final BitSet FOLLOW_161 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000C000000000000L});
    public static final BitSet FOLLOW_162 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_163 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_164 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_165 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_166 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_167 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_168 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_169 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_170 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_171 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_172 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_173 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_174 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_175 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_176 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_177 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0C00000000000000L});
    public static final BitSet FOLLOW_178 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xD000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_179 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_180 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_181 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_182 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_183 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});

}