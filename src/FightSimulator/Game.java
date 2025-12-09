package FightSimulator;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Fighter1 player1 = null;
        Fighter2 player2 = null;
        int turn = 0;

        final int MAX_TOTAL_STAT = 1000;
        System.out.println("일대일 스킬 게임");
        System.out.println("게임 설명 : q / 아무키를 눌러 시작");
        String beforgame = scanner.nextLine();

        if (beforgame.equals("q")) {
            System.out.println("게임 설명");
            System.out.println("1. 플레이어 설정");
            System.out.println("- 플레이어의 능력치를 설정합니다.");
            System.out.println("- 플레이어의 능력치는 체력, 마나, 공격력, 방어력을 의미합니다.");
            System.out.println("- 플레이어의 능력치는 최대 1000을 넘을 수 없습니다.");
            System.out.println("2. 전투");
            System.out.println("- 플레이어가 서로 번갈아가며 스킬을 사용합니다.");
            System.out.println("- 스킬은 skill1, skill2, defenseskill, heal로 구분됩니다.");
            System.out.println("- 스킬 사용 시 마나가 소모됩니다.");
            System.out.println("- 스킬 사용은 player1은 q,w,e, player2는 u,i,o로 구분됩니다.");
            System.out.println("3. 게임 종료");
            System.out.println("- 체력이 0이 되면 게임이 종료됩니다.");
        } else {
            System.out.println("Player 설정을 시작합니다.");
        }

        while (true) {

            for (int i = 0; i < 2; i++) {
                System.out.println("\n====== Player " + (i + 1) + " 설정 ======");

                System.out.print("Player " + (i + 1) + " name: ");
                String name = scanner.nextLine();
                System.out.println("능력치 총 합은 " + MAX_TOTAL_STAT + "을 넘을 수 없습니다.");

                int maxHp, maxMp, atk, def;

                int remainingStat = MAX_TOTAL_STAT;
                maxHp = 0;
                maxMp = 0;
                atk = 0;
                def = 0;
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

                if (i == 0) {
                    player1 = new Fighter1(name, maxHp, maxMp, atk, def);
                } else {
                    player2 = new Fighter2(name, maxHp, maxMp, atk, def);
                }
            }
            System.out.println("\n============ 능력치 설정 완료 ============");
            System.out.println(player1.name + " | 체력: " + player1.maxHp + " | 마나: " + player1.maxMp + " | 공격력: "
                    + player1.atk + " | 방어력: " + player1.def);
            System.out.println(player2.name + " | 체력: " + player2.maxHp + " | 마나: " + player2.maxMp + " | 공격력: "
                    + player2.atk + " | 방어력: " + player2.def);

            System.out.println("\n============ 전투 시작 ============");

            while (true) {
                while (true) {
                    System.out.println();
                    System.out.println(player1.name + "의 차례");
                    System.out.println("q : skill1, w : skill2, e : heal");
                    String player1Input = scanner.nextLine();

                    if (player1Input.equals("q")) {
                        player1.skill1(player2);
                        break;
                    } else if (player1Input.equals("w")) {
                        player1.skill2(player2);
                        break;
                    } else if (player1Input.equals("e")) {
                        player1.heal();
                        break;
                    } else {
                        System.out.println("[오류] 올바른 입력이 아닙니다.");
                        continue;
                    }
                }

                while (true) {

                    System.out.println();
                    System.out.println(player2.name + "의 차례");
                    System.out.println("u : skill1, i : skill2, o : heal");
                    String player2Input = scanner.nextLine();

                    if (player2Input.equals("u")) {
                        player2.skill1(player1);
                        break;
                    } else if (player2Input.equals("i")) {
                        player2.skill2(player1);
                        break;
                    } else if (player2Input.equals("o")) {
                        player2.heal();
                        break;
                    } else {
                        System.out.println("[오류] 올바른 입력이 아닙니다.");
                        continue;
                    }
                }

                if (player1.hp <= 0 || player2.hp <= 0) {
                    break;
                }
                turn++;

                System.out.println();
                System.out.println("===== 턴 : " + turn + " 상태 =====");
                System.out.println(player1.name + " | 체력: " + player1.hp + " | 마나: ");
                System.out.println(player2.name + " | 체력: " + player2.hp + " | 마나: ");
            }
            if (player1.hp <= 0) {
                System.out.println("============ 게임 종료 ============");
                System.out.println(player2.name + "가 승리했습니다!");
                System.out.println("다시하기 : r, 종료하기 : q");
                String input = scanner.nextLine();
                if (input.equals("r")) {
                    continue;
                } else if (input.equals("q")) {
                    break;
                }
            } else if (player2.hp <= 0) {
                System.out.println("============ 게임 종료 ============");
                System.out.println(player1.name + "가 승리했습니다!");
                System.out.println("다시하기 : r, 종료하기 : q");
                String input = scanner.nextLine();
                if (input.equals("r")) {
                    continue;
                } else if (input.equals("q")) {
                    break;
                }
            }
        }

    }
}
