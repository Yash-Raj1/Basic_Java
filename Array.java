class Array{
    public static void main(String[] args){
        int multi[][] = new int [3][4];
        
        for( int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                multi[i][j] = (int) (Math.random() * 10);
            }
        }

        for( int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                System.out.print(  multi[i][j] + " ");
            }
            System.out.println();
        }
    }
}