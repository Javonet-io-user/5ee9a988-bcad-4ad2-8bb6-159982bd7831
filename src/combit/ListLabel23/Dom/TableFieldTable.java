package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class TableFieldTable extends TableFieldBase {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public CollectionSubItemBasesBase getSubItems (){ try { return new CollectionSubItemBasesBase((NObject)javonetHandle.<NObject>get("SubItems"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setReservedMinHeight (java.lang.String value){ try { javonetHandle.set("ReservedMinHeight",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getReservedMinHeight (){ try { return  (java.lang.String) javonetHandle.get("ReservedMinHeight");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public TableFieldTable (CollectionTableFieldBases itemCollection){  super((NObject) null); try {  javonetHandle = Javonet.New("TableFieldTable",itemCollection); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public TableFieldTable (CollectionTableFieldBases itemCollection,java.lang.Integer index){  super((NObject) null); try {  javonetHandle = Javonet.New("TableFieldTable",itemCollection,index); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public TableFieldTable(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}