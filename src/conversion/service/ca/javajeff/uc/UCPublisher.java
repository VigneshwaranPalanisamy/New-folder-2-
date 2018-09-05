package conversion.service.ca.javajeff.uc;
import javax.xml.ws.Endpoint;

public class UCPublisher
{
   public static void main(String[] args)
   {
	  //Endpoint ed =Endpoint.create("http://localhost:9901/UC");
      Endpoint ed = Endpoint.publish("http://localhost:9901/UC", new UCImpl());
      System.out.println("End");
      //ed.stop();
   }
}