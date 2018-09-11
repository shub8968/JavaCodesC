import java.util.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class SquareFree {
    public static double calculate(double b) {
        double c = b;
        SortedSet <Double> factors = new TreeSet<Double>();
        for (double i = 2; i <= c; i++) {
            while (c % i == 0) {
                factors.add(i);
                c = c/i;
            }
        }
         
             double d = check(factors.size());
             return d;
    }
	
	public static double check(int e){
	double f=e;
	List <Double> cdd = new ArrayList<Double>();
	for(int r = 0; r<=f;r++){
	 double ncr = fact(f) / (fact(r) * fact(f - r));
    cdd.add(ncr);
	}
    return cdd.size(); 
    }
	
public static double fact(double z)
{
    double k = 1, s;
    if (z == 0)
    {
        return(k);
    }
    else
    {
        for ( s = 1; s <= z; s++)
	{
            k = k * s;
	}
    }
    return(k);
}

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new
        InputStreamReader(System.in));
       long a = Integer.parseInt(br.readLine());
      System.out.println((int)calculate(a));
    }
}