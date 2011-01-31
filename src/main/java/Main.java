import gov.nih.nci.iso21090.*;
import gov.nih.nci.iso21090.grid.dto.transform.iso.*;
import gov.nih.nci.iso21090.grid.ser.JaxbSerializer;
import java.io.*;
import org.apache.axis.encoding.SerializationContext;
//import org.iso._21090.BlNonNull;

public class Main {
    public static void main(String[] args) throws Exception {
        BlNonNull bl = new BlNonNull();
        System.out.println("Bl: " + bl);
        System.out.println("Bl.getValue(): " + bl.getValue());
        
    //    bl.setNullFlavor(gov.nih.nci.iso21090.NullFlavor.NINF);
        System.out.println("Bl.getValue(): " + bl.getValue());

        bl.setValue(true);
        System.out.println("Bl.getValue(): " + bl.getValue());
        
        org.iso._21090.BlNonNull t = BLNONNULLTransformer.INSTANCE.toXml(bl);
        System.out.println("BLNONNULLTransformer.INSTANCE.toXml(bl)" + BLNONNULLTransformer.INSTANCE.toXml(bl));

        StringWriter w = new StringWriter();
        SerializationContext sc = new SerializationContext(w);
        JaxbSerializer s = new JaxbSerializer();
        s.serialize(null, null, t, sc);
        System.out.println("StringWriter: " + w.getBuffer());
    }
}
