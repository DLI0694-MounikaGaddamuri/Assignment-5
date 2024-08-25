package Stack;

import java.util.Stack;

public class PostfixExpression {

    public int postfixEvaluation(String s){
        Stack<Integer> st = new Stack<>();
        int x=0,y=0;
        char ch[]=s.toCharArray();
        for(char c: ch){
            if(c>='0' && c<='9')
                st.push((int)(c));
            else{
                y=st.pop();
                x=st.pop();
                switch(c){
                    case '+':
                        st.push(x+y);
                        break;

                    case '-':
                        st.push(x-y);
                        break;

                    case '*':
                        st.push(x*y);
                        break;

                    case '/':
                        st.push(x/y);
                        break;
                }
            }
        }
        return st.pop();
    }

    public static void main(String[] args) {

        PostfixExpression obj = new PostfixExpression();
        System.out.println(obj.postfixEvaluation("23+1-"));
    }
}
