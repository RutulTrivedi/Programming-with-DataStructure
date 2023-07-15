import java.util.Stack;
public class EvaluationOfPostfix {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        String exp = "523**";

        for(int i=0;i<exp.length();i++){
            char ch = exp.charAt(i);

            if(ch >= '0' && ch <='9'){
                stack.push(ch - '0');
            }
            else if(ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^' || ch == '&'){
                int opr1 = stack.pop();
                int opr2 = stack.pop();
                stack.push(performOperation(opr2,opr1,ch));
            }
        }

        System.out.println(stack.pop());
    }

    static int performOperation(int opr2,int opr1, char op){
        switch (op) {
            case '+':
                return opr2+opr1;
            case '-':
                return opr2-opr1;
            case '*':
                return opr2*opr1;
            case '/':
                return opr2/opr1;
            case '^':
            case '$':
                return (int)(Math.pow(opr2, opr1));
            default:
                return 0;
        }
    }
}