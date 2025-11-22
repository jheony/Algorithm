import java.util .*;
import java.lang .*;
import java.io .*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 수열의 길이가 3보다 작으면 삼각수열 조건 만족
        int result = 2;
        if (n < 3) {
            result = n;
        } else {
            // 작은 수 2개의 합이 큰 수보다 크면 조건 만족
            Arrays.sort(arr);
            for (int i = 0; i < n - 1; i++) {
                int x = arr[i];
                int y = arr[i + 1];
                for (int k = i + 2; k < n; k++) {
                    int z = arr[k];
                    // 정렬해놔서 큰 수를 못넘기면 뒤 배열의 수도 못넘김
                    if (x + y <= z) {
                        break;
                    }
                    result = Math.max(result, k - i + 1);
                }
            }
        }
        System.out.print(result);
    }
}