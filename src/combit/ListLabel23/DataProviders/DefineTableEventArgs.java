package combit.ListLabel23.DataProviders;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.*;
import combit.ListLabel23.DataProviders.*;public class DefineTableEventArgs extends EventArgs {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setSuppress (java.lang.Boolean value){ try { javonetHandle.set("Suppress",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getSuppress (){ try { return javonetHandle.get("Suppress");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * GetProperty
	 */
            public java.lang.String getTableName (){ try { return  (java.lang.String) javonetHandle.get("TableName");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public java.lang.String getTableSchema (){ try { return  (java.lang.String) javonetHandle.get("TableSchema");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public DefineTableEventArgs (java.lang.String tableName,java.lang.String tableSchema){  super((NObject) null); try {  javonetHandle = Javonet.New("DefineTableEventArgs",tableName,tableSchema); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DefineTableEventArgs(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}