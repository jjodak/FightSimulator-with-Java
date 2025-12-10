classDiagram

    %% Abstract Class Definition

    class FighterBase {

        <<abstract>>

        String name

        double maxHp

        double hp

        double maxMp

        double mp

        double atk

        double def

        +FighterBase(String name, double maxHp, double maxMp, double atk, double def)

    }



    %% Interface Definition

    class Skillset {

        <<interface>>

        +skill1(FighterBase target)

        +skill2(FighterBase target)

        +heal()

    }



    %% Concrete Classes Definition

    class Fighter1 {

        +Fighter1(String name, double maxHp, double maxMp, double atk, double def)

        +skill1(FighterBase target)

        +skill2(FighterBase target)

        +heal()

    }



    class Fighter2 {

        +Fighter2(String name, double maxHp, double maxMp, double atk, double def)

        +skill1(FighterBase target)

        +skill2(FighterBase target)

        +heal()

    }



    %% Driver Class Definition

    class Game {

        +static main(String[] args)

    }

    note for Game "실행(Driver) 클래스.\n사용자 입력을 받아 Fighter1과\nFighter2 객체를 생성하고 게임 루프를 실행함."



    %% Relationships

    %% Inheritance (Extends)

    FighterBase <|-- Fighter1 : 상속 (Extends)

    FighterBase <|-- Fighter2 : 상속 (Extends)



    %% Implementation (Implements)

    Skillset <|.. Fighter1 : 구현 (Implements)

    Skillset <|.. Fighter2 : 구현 (Implements)



    %% Dependency (Uses)

    Game ..> Fighter1 : 사용/생성 (Uses)

    Game ..> Fighter2 : 사용/생성 (Uses)

    

    %% Interface method parameter dependency

    Skillset ..> FighterBase : 매개변수로 사용 (Uses as parameter)
