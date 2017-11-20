package differential;

public class Differential_lib implements Differential_if{
	
	private double a, h;
    private double x,y;
	
	public Differential_lib(double a, double h) {
		this.a = a;
		this.h = h;
	}


	@Override //ã‘‚«
	public double getRx() {
		// TODO Auto-generated method stub
		return 2 * this.a;
	}

	@Override
	public double getDx() {
		// TODO Auto-generated method stub
		return (Math.pow(this.a+this.h, 2)-Math.pow(this.a, 2))/h;
	}


	@Override
	public double getRe() {
		// TODO Auto-generated method stub
		double answer;
			
			
		  if(getRx() > getDx()) {
			  answer = (getRx() - getDx())/getRx() * 100;
		  }
	      else{
	    	  answer = (getDx() - getRx())/getRx() * 100;
		  }
		
		  return answer;
		  
		  
		
        
	}
	

}
