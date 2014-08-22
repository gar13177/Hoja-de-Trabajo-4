/*
Vidal Villegas 131023
Kevin Garcia 13177
*/
package HojaDeTrabajo;


public abstract class AbstractStack<T> implements IStack<T> {

    public int eval(String exp, AbstractStack stack)
    {
        int i = 0;        
        
        for (i = 0; i < exp.length(); i++ )
        {
            if ("1234567890".contains(""+exp.charAt(i))){
                stack.push(Integer.parseInt(""+exp.charAt(i)));
            }else{
            switch (exp.charAt(i))
            {
                
                case '+': 
                {
                    int o1 = (int) stack.pop();
                    int o2 = (int) stack.pop();
                    int n_res = o1 + o2;                                        
                    stack.push(n_res);
                    break;
                }
                case '-':
               
                {
                    int o1 = (int) stack.pop();
                    int o2 = (int) stack.pop();                    
                    int n_res = -o1 + o2;                                        
                    stack.push(n_res);
                    break;                   
                }
                case '*':
                
                {
                    int o1 = (int) stack.pop();
                    int o2 = (int) stack.pop();                    
                    int n_res = o1 * o2;                                        
                    stack.push(n_res);
                    break;                    
                }
                case '/':
                 
                {
                    int o1 = (int) stack.pop();
                    int o2 = (int) stack.pop(); 
                    int n_res = 0;
                    if (o1 != 0)
                        n_res = o2 / o1;
                    else
                        System.out.println("Error");                    
                    stack.push(n_res);
                    break;                    
                }
            }
            }
        }
        return (int) stack.pop();
    }
    
    /**
     *
     * @return
     */
    @Override
    public abstract T pop();
  

    /**
     *
     * @param t
     */
    @Override
    public abstract void push(T dato);
   

    /**
     *
     * @return
     */
    @Override
    public abstract boolean isEmpty();

}
