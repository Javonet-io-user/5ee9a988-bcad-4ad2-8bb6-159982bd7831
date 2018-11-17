package jio.System.Resources;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.Resources.*;
import jio.System.Reflection.*;
import jio.System.*;public class ResourceManager {public NObject javonetHandle; public ResourceManager (java.lang.String baseName,Assembly assembly){ try {  javonetHandle = Javonet.New("ResourceManager",baseName,assembly);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ResourceManager (java.lang.String baseName,Assembly assembly,Class usingResourceSet){ try {  javonetHandle = Javonet.New("ResourceManager",baseName,assembly,Javonet.getType(getReturnObjectName(usingResourceSet).getTypeName()));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ResourceManager (Class resourceSource){ try {  javonetHandle = Javonet.New("ResourceManager",Javonet.getType(getReturnObjectName(resourceSource).getTypeName()));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ResourceManager(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}