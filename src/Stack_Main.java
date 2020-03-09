public class Stack_Main {
    public static void main(String[] args) {
        Stack_implement st = new Stack_implement();
        st.push(10);
        st.push(20);
        st.push(30);
        st.pop();
        System.out.println(st.peek());
    }
}
