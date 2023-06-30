import java.util.Scanner;

public class average {
	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in);
		int sum = 0;
		int i = 0;
        while (true) {
        	System.out.print("숫자를 입력하세요: ");
        	int num = scanner.nextInt();
        	if (num < 0) {
        		System.out.println("음수가 입력되었습니다. 다시 입력하세요.");
        		continue;
        		}
        	sum = sum + num;
            if (num == 0) {
            	System.out.println("양수의 합은 " + sum + "입니다.");
                System.out.println("입력된 숫자들 중에서 0보다 큰 숫자의 개수는 " + i + "입니다.");
                System.out.println("입력된 숫자들의 평균은 " + (double)sum/i + "입니다.");
                break;
                }
            else {
            	i++;
            }
        }
        scanner.close();
     }
}

