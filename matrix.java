import java.util.Scanner;
public class matrix{
    static Scanner sc = new Scanner(System.in);


    public static int[][] inparr(int N,int M){
        int[][] temparr = new int[N][M];
        for(int i = 0; i< N;i++) {
            for (int j = 0; j < M; j++) {
                    temparr[i][j] = sc.nextInt();
            }
        }
        return temparr;
    }
    public static void main(String args[]){
        System.out.println(" condition where given matrix is an NxN matrix, enter N ");
        int N = sc.nextInt();
        int[][] arr1 =  inparr(N,N);
        int[][] arr2 = inparr(N,N);
        int[][] ans = new int[N][N];
        int[][] ansmul = new int[N][N];
        int tempans = 0;
        for(int i =0; i<N;i++){
            for(int j=0;j<N; j++){
                ans[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        for(int k = 0; k<N;k++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    tempans = (arr1[k][j] * arr2[j][i]) + tempans;
                }ansmul[k][i]=tempans;
                tempans = 0;
            }
        }
        System.out.println("addition, A plus B : ");
        for(int i = 0; i < N;i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(ans[i][j]+" ");
            }System.out.println(" ");
        }

        System.out.println("multiplication, A cross B :");
        for(int i = 0; i < N;i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(ansmul[i][j]+" ");
            }System.out.println(" ");
        }

    }
    }
