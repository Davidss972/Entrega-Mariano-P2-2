
package comparadores;

import java.util.Comparator;


public class ComparadorNumeros 
{

    public int compare(int A, int B) 
    {
        if( A > B )
        {
            return 1;
        }
        else if(A<B)
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
    
    
}
