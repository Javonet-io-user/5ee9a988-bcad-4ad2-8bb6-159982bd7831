package combit.ListLabel23.DesignerExtensions;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.DesignerExtensions.*;
import jio.System.*;public class NumericDesignerProperty extends DesignerProperty {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setSigned (java.lang.Boolean value){ try { javonetHandle.set("Signed",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getSigned (){ try { return javonetHandle.get("Signed");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }public NumericDesignerProperty (java.lang.String name,NObject defaultValue){  super((NObject) null); try {  javonetHandle = Javonet.New("NumericDesignerProperty",name,defaultValue); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public NumericDesignerProperty(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}