package FightSimulator;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Fighter1 player1 = null;
        Fighter2 player2 = null;

        final int MAX_TOTAL_STAT = 1000;

        System.out.print("Player 설정을 시작합니다.");
        for (int i = 0; i < 2; i++) {
            System.out.println("\n====== Player " + (i + 1) + " 설정 ======");

            System.out.print("Player " + (i + 1) + " name: ");
            String name = scanner.nextLine();
            System.out.println("능력치 총 합은 " + MAX_TOTAL_STAT + "을 넘을 수 없습니다.");

            int maxHp, maxMp, atk, def, spd;

            int remainingStat = MAX_TOTAL_STAT;
            maxHp = 0;
            maxMp = 0;
            atk = 0;
            def = 0;
            spd = 0;

            while (true) {
                try {
                    System.out.print("Max HP (잔여 능력치:" + remainingStat + "): ");
                    maxHp = Integer.parseInt(scanner.nextLine());

                    if (maxHp < 0) {
                        System.out.println("[경고] 최대체력은 0 이상이어야 합니다. 다시 입력해주세요.");
                    } else if (maxHp > remainingStat) {
                        System.out.println("[경고] 잔여 능력치(" + remainingStat + ")를 초과할 수 없습니다. 다시 입력해주세요.");
                    } else {
                        remainingStat -= maxHp;
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("[오류] 숫자로만 입력해야 합니다.");
                }
            }

            while (true) {
                try {
                    System.out.print("Max MP (잔여 능력치:" + remainingStat + "): ");
                    maxMp = Integer.parseInt(scanner.nextLine());

                    if (maxMp < 0) {
                        System.out.println("[경고] 최대마나는 0 이상이어야 합니다. 다시 입력해주세요.");
                    } else if (maxMp > remainingStat) {
                        System.out.println("[경고] 잔여 능력치(" + remainingStat + ")를 초과할 수 없습니다. 다시 입력해주세요.");
                    } else {
                        remainingStat -= maxMp;
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("[오류] 숫자로만 입력해야 합니다.");
                }
            }

            while (true) {
                try {
                    System.out.print("ATK (잔여 능력치:" + remainingStat + "): ");
                    atk = Integer.parseInt(scanner.nextLine());

                    if (atk < 0) {
                        System.out.println("[경고] 공격력은 0 이상이어야 합니다. 다시 입력해주세요.");
                    } else if (atk > remainingStat) {
                        System.out.println("[경고] 잔여 능력치(" + remainingStat + ")를 초과할 수 없습니다. 다시 입력해주세요.");
                    } else {
                        remainingStat -= atk;
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("[오류] 숫자로만 입력해야 합니다.");
                }
            }

            while (true) {
                try {
                    System.out.print("DEF (잔여 능력치:" + remainingStat + "): ");
                    def = Integer.parseInt(scanner.nextLine());

                    if (def < 0) {
                        System.out.println("[경고] 방어력은 0 이상이어야 합니다. 다시 입력해주세요.");
                    } else if (def > remainingStat) {
                        System.out.println("[경고] 잔여 능력치(" + remainingStat + ")를 초과할 수 없습니다. 다시 입력해주세요.");
                    } else {
                        remainingStat -= def;
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("[오류] 숫자로만 입력해야 합니다.");
                }
            }
            while (true) {
                try {
                    System.out.print("SPD (잔여 능력치:" + remainingStat + "): ");
                    spd = Integer.parseInt(scanner.nextLine());

                    if (spd < 0) {
                        System.out.println("[경고] 이동속도는 0 이상이어야 합니다. 다시 입력해주세요.");
                    } else if (spd > remainingStat) {
                        System.out.println("[경고] 잔여 능력치(" + remainingStat + ")를 초과할 수 없습니다. 다시 입력해주세요.");
                    } else {
                        remainingStat -= def;
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("[오류] 숫자로만 입력해야 합니다.");
                }
            }

            if (i == 0) {
                player1 = new Fighter1(name, maxHp, maxMp, atk, def, spd);
            } else {
                player2 = new Fighter2(name, maxHp, maxMp, atk, def, spd);
            }
        }

        System.out.println("\n============ 능력치 설정 완료 ============");
        System.out.println(player1.name + " | 체력: " + player1.maxHp + " | 마나: " + player1.maxMp + " | 공격력: "
                + player1.atk + " | 방어력: " + player1.def + " | 이동속도: " + player1.spd);
        System.out.println(player2.name + " | 체력: " + player2.maxHp + " | 마나: " + player2.maxMp + " | 공격력: "
                + player2.atk + " | 방어력: " + player2.def + " | 이동속도: " + player2.spd);

        scanner.close();
    }
}