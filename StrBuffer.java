class StrBuffer{
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("Yash Raj");
        System.out.println(sb.capacity());
         
        sb.append("is a good boy");
        System.out.println(sb);

        sb.insert(5 , "He he");
        System.out.println(sb);

        System.out.println(sb.capacity());

    }
}