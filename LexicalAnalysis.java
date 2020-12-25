class LexicalAnalysis{
    static boolean accept(String pattern){
        final int INITIAL_STATE=-1;

        int state=INITIAL_STATE;
        int error=100000;
        for(int i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
            System.out.println("Cha "+ch+" state "+state);
            switch(state){
                case INITIAL_STATE:
                if(ch=='0'){
                    state=0;
                }
                else{
                    state=error;
                }
                break;
                case 0:
                if(ch=='1'){
                    state=1;
                }
                else{
                    state=error;
                }
                break;
                case 1:
                if(ch=='0'){
                    state=0;
                }
                else{
                    state=error;
                }
                break;
                default:
                state=error;
            }
        }
        return state==1;
    }
    public static void main(String[]args){

        System.out.println("Accept "+ accept("01"));// Accept true
        System.out.println("Accept "+ accept("10"));// Accept false
    }
}
