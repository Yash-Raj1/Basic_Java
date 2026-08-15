class Array{
    public static void main(String[] args){
        int multi[][] = new int [3][4];


        for( int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                System.out.print("Enter the value for multi["+i+"]["+j+"] : " + multi[i][j]);
            }
            System.out.println();
        }
    }
}