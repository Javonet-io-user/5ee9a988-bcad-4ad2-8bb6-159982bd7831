package combit.ListLabel23;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.*;public class ListLabelIdentifierLocalizationHelper extends ListLabelLocalizationHelperBase implements ITranslationList,IQueryableIdentifierTranslationList {protected NObject javonetHandle; public ListLabelIdentifierLocalizationHelper(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void Clear (){ try { javonetHandle.invoke("Clear");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Add (java.lang.String itemName,java.lang.String itemDisplayName){ try { javonetHandle.invoke("Add",itemName,itemDisplayName);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Add (java.lang.String itemName,java.lang.String itemDisplayName,java.lang.Integer LCID){ try { javonetHandle.invoke("Add",itemName,itemDisplayName,LCID);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void SetupComplexIdentifier (java.lang.String itemName){ try { javonetHandle.invoke("SetupComplexIdentifier",itemName);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}