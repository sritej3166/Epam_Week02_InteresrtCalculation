public class InterestCalculate 
	{
		double simple_i;
		double compound_i;
		public double SimpleIntCalc(double principle,double time,double rate)
		{
			    simple_i=(principle*time*rate)/100;
			    return simple_i;
		}
		
		public double CompoundIntCalc(double principle,double time,double rate)
		{
			   compound_i=principle* Math.pow(1.0+rate/100.0,time)-principle;
			   return compound_i;
		}
		
	}
