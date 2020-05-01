public class   StringBufferExample {

    public static void main(String[] args) {

        // String Builder is more efficient
        long startTime = System.currentTimeMillis();
        StringBuilder builder= new StringBuilder();

        for (int i=0;i<99999;i++){
            builder.append("Builder");
        }
        System.out.println(System.currentTimeMillis()-startTime);


        //String Buffer
       long startTime1 = System.currentTimeMillis();
        StringBuffer buffer= new StringBuffer();

        for (int i=0;i<99999;i++){
            buffer.append("Buffer");
        }
        System.out.println(System.currentTimeMillis()-startTime1);
    }
}
