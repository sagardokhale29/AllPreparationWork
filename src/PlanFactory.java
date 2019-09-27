
public class PlanFactory {
	  public Plan getPlan(String planType){ 
		  Plan p=null;
          if(planType == null){  
           p= null;  
          } 
          
          if(planType.equalsIgnoreCase("DOMESTIC")) {
        	  p=new DomesticPlan();
          }
          
          if(planType.equalsIgnoreCase("CORPORATE")) {
        	  p=new CorporatePlan();
          }
          
          if(planType.equalsIgnoreCase("INSTITUTE")) {
        	  p=new InstitutionalPlan();
          }
          
          return p;
	  }
}
