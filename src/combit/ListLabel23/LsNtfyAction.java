package combit.ListLabel23;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.*;
import combit.ListLabel23.*;public class LsNtfyAction extends ValueType {protected NObject javonetHandle; /**
	 * GetFiled
	 */
            public java.lang.Integer getSize (){ try { return javonetHandle.get("Size");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public void setSize (java.lang.Integer param){ try { javonetHandle.set("Size",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Integer getAction (){ try { return javonetHandle.get("Action");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public void setAction (java.lang.Integer param){ try { javonetHandle.set("Action",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Integer getParameterList (){ try { return javonetHandle.<NObject>get("ParameterList");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setParameterList (java.lang.Integer param){ try { javonetHandle.set("ParameterList",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public LsNtfyAction(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}