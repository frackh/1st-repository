import java.util.Scanner;

public class XO {
    public static void main(String Arg[]) {
        int fill = 0;    // какие клетки заполнены
        int value = 0;   // 0 или х

        Scanner in = new Scanner(System.in);

        // Выигрышные линии 
        int win1 = 1 << 2 | 1 << 1 | 1 << 0;   // верхняя строка
        int win2 = 1 << 5 | 1 << 4 | 1 << 3;   // средняя строка
        int win3 = 1 << 8 | 1 << 7 | 1 << 6;   // нижняя строка
        int win4 = 1 << 2 | 1 << 5 | 1 << 8;   // левый столбец
        int win5 = 1 << 1 | 1 << 4 | 1 << 7;   // средний столбец
        int win6 = 1 << 0 | 1 << 3 | 1 << 6;   // правый столбец
        int win7 = 1 << 2 | 1 << 4 | 1 << 6;   // диагональ
        int win8 = 1 << 0 | 1 << 4 | 1 << 8;   // диагональ

        int turn = 1; // 1 ход человека , 0 ход компьютера 
        boolean gameOver = false;

        while (!gameOver) {
            drawField(fill, value);

            if (turn == 1) {
                System.out.println("Введите номер строки от 1 до 3");
                int row = in.nextInt();
                System.out.println("Введите номер столбца от 1 до 3");
                int col = in.nextInt();
                System.out.println("Ваш ход");

                int shift = row * 3 - col;
                int mask = 1 << shift;

                if ((fill & mask) > 0) {
                    System.out.println("Эта клетка уже занята, попробуйте снова");
                    continue;
                }

                fill  = fill  | mask;
                value = value | mask;
            } else {
                int shift = -1;
                for (int i = 0; i <= 8; i++) {
                    int mask = 1 << i;
                    if ((fill & mask) == 0) {
                        shift = i;
                        break;
                    }
                }

                int mask = 1 << shift;
                fill = fill | mask;

                System.out.println("Ход компьютера");
            }

            int oValue = fill & ~value;
            int winner = -1;

            if ((value & win1) == win1) winner = 1;
            else if ((value & win2) == win2) winner = 1;
            else if ((value & win3) == win3) winner = 1;
            else if ((value & win4) == win4) winner = 1;
            else if ((value & win5) == win5) winner = 1;
            else if ((value & win6) == win6) winner = 1;
            else if ((value & win7) == win7) winner = 1;
            else if ((value & win8) == win8) winner = 1;
            else if ((oValue & win1) == win1) winner = 0;
            else if ((oValue & win2) == win2) winner = 0;
            else if ((oValue & win3) == win3) winner = 0;
            else if ((oValue & win4) == win4) winner = 0;
            else if ((oValue & win5) == win5) winner = 0;
            else if ((oValue & win6) == win6) winner = 0;
            else if ((oValue & win7) == win7) winner = 0;
            else if ((oValue & win8) == win8) winner = 0;

            if (winner == 1) {
                drawField(fill, value);
                System.out.println("Победили X! Вы выиграли!");
                gameOver = true;
            } else if (winner == 0) {
                drawField(fill, value);
                System.out.println("Победили O! Компьютер выиграл!");
                gameOver = true;
            } else if (fill == (1 << 9) - 1) {
                drawField(fill, value);
                System.out.println("Ничья!");
                gameOver = true;
            } else {
                turn = 1 - turn;
            }
        }
    }

    public static void drawField(int fill, int value) {
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 3; col++) {
                int shift = row * 3 - col;
                int mask = 1 << shift;
                char c = ' ';
                if ((fill & mask) > 0) {
                    if ((value & mask) > 0) {
                        c = 'X';
                    } else {
                        c = 'O';
                    }
                } else {
                    c = '_';
                }
                System.out.print(c);
            }
            System.out.println();
        }
    }
}