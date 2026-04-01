## ⚔️ FightSimulator-with-Java
동양미래대학교 인공지능소프트웨어학과 > 20252365 조준혁 (JunHyuk Cho)

Java를 활용하여 제작한 1대1 턴제 스킬 배틀 게임입니다. 플레이어는 한정된 능력치를 전략적으로 배분하고, 각자의 차례에 스킬을 사용하여 승리해야 합니다.

## 🛠 Tech Stack
Language: Java

Tool: Visual Studio Code / Eclipse

🏗 클래스 구조 (Class Structure)
본 프로젝트는 객체지향 프로그래밍의 핵심 원칙인 상속, 인터페이스, 추상화가 적용되었습니다.

FighterBase (Abstract Class): 플레이어의 이름, 체력(HP), 마나(MP), 공격력(ATK), 방어력(DEF) 등 기본 스탯 값을 정의하는 추상 클래스입니다.

Skillset (Interface): 공격 스킬(skill1, skill2)과 회복(heal) 기능의 규격을 정의한 인터페이스입니다.

Fighter1 & Fighter2 (Child Class): FighterBase를 상속받고 Skillset을 구현하여 실제 스킬 로직(데미지 계산, 마나 소모 등)을 담당합니다.

Game (Main Class): 플레이어 설정, 능력치 배분 로직, 배틀 루프 및 승리 조건 체크 등 전반적인 게임 실행을 관리합니다.

## 🎮 게임 규칙 및 방법 (How to Play)
1. 플레이어 설정
두 플레이어의 이름을 입력하고 능력치를 설정합니다.

능력치 총합 제한: 체력, 마나, 공격력, 방어력의 합계는 최대 1000을 넘을 수 없습니다.

2. 전투 방식
플레이어는 서로 번갈아가며 명령을 입력합니다. 스킬 사용 시 마나가 소모됩니다.

Player 1 조작: q (스킬 1), w (스킬 2), e (회복)

Player 2 조작: u (스킬 1), i (스킬 2), o (회복)

3. 승리 조건
상대방의 체력(HP)을 0으로 먼저 만드는 플레이어가 승리합니다.

## 📂 폴더 구조
/src/FightSimulator: 자바 소스 파일 (.java)

/bin/FightSimulator: 컴파일된 클래스 파일 (.class)

20252365 조준혁.pptx: 프로젝트 요약 발표 자료
