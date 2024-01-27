import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

public class Surface {
    public static final int SQUARE_SIZE = 20;
    public static Piece[][] board;
    private int x, y;
    private int player;
    private List<Coordinate> selectedPieceMoves = new ArrayList<>();
    private Piece selectedPiece;
    Player player0 = new Player(0);
    Player player1 = new Player(1);

    public Surface(){
        initializeBoard();
    }

    public void initializeBoard(){
        board = new Piece[36][36];
        
        setInitialPiece(new King(0, false, 17, 17));
        setInitialPiece(new King(1, false, 18, 17));
        setInitialPiece(new SilverGeneral(0, false, 17, 20));
        setInitialPiece(new SilverGeneral(1, false, 18, 18));
        setInitialPiece(new Lance(0, false, 17, 3));
        setInitialPiece(new Lance(1, false, 22, 18));
        setInitialPiece(new Knight(0, false, 17, 25));
        setInitialPiece(new Knight(1, false, 18, 29));
        setInitialPiece(new GoldenGeneral(0, false, 17, 4));
        setInitialPiece(new GoldenGeneral(1, false, 18, 23));
        setInitialPiece(new Rook(0, false, 16, 15));
        setInitialPiece(new Rook(1, false, 19, 14));
        setInitialPiece(new Bishop(0, false, 18, 6));
        setInitialPiece(new Bishop(1, false, 20, 22));

        setInitialPiece(new Lance(0, false, 0, 0));
        setInitialPiece(new WhiteTiger(0, false, 0, 1));
        setInitialPiece(new RunningRabbit(0, false, 0, 2));
        setInitialPiece(new WhaleMackerel(0, false, 0, 3));
        setInitialPiece(new FireDemon(0, false, 0, 4));
        setInitialPiece(new MountainEagle(0, false, 0, 5));
        setInitialPiece(new Tengu(0, false, 0, 6));
        setInitialPiece(new BeastSergent(0, false, 0, 7));
        setInitialPiece(new RunningHorse(0, false, 0, 8));
        setInitialPiece(new WildDemon(0, false, 0, 9));
        setInitialPiece(new EarthenDragon(0, false, 0, 10));
        setInitialPiece(new Kumbhanda(0, false, 0, 11));
        setInitialPiece(new WildTapir(0, false, 0, 12));
        setInitialPiece(new WildKing(0, false, 0, 13));
        setInitialPiece(new RearFlag(0, false, 0, 14));
        setInitialPiece(new RightGeneral(0, false, 0, 15));
        setInitialPiece(new GoldenGeneral(0, false, 0, 16));
        //setInitialPiece(new Prince(0, false, 0, 17));
        //setInitialPiece(new King(0, false, 0, 18));
        setInitialPiece(new GoldenGeneral(0, false, 0, 19));
        setInitialPiece(new LeftGeneral(0, false, 0, 20));
        setInitialPiece(new RearFlag(0, false, 0, 21));
        setInitialPiece(new WildKing(0, false, 0, 22));
        setInitialPiece(new WildTapir(0, false, 0, 23));
        setInitialPiece(new PigeonBoard(0, false, 0, 24));
        setInitialPiece(new EarthenDragon(0, false, 0, 25));
        setInitialPiece(new WildDemon(0, false, 0, 26));
        setInitialPiece(new RunningHorse(0, false, 0, 27));
        setInitialPiece(new BeastSergent(0, false, 0, 28));
        setInitialPiece(new Tengu(0, false, 0, 29));
        setInitialPiece(new MountainEagle(0, false, 0, 30));
        setInitialPiece(new FireDemon(0, false, 0, 31));
        setInitialPiece(new WhaleMackerel(0, false, 0, 32));
        setInitialPiece(new RunningRabbit(0, false, 0, 33));
        setInitialPiece(new BlackTortoise(0, false, 0, 34));
        setInitialPiece(new Lance(0, false, 0, 35));

        setInitialPiece(new AntiCar(0, false, 1, 0));
        setInitialPiece(new LanceElephant(0, false, 1, 1));
        setInitialPiece(new MountainPigeon(0, false, 1, 2));
        setInitialPiece(new RookSwallow(0, false, 1, 3));
        setInitialPiece(new BirdOfficial(0, false, 1, 4));
        setInitialPiece(new RainDragon(0, false, 1, 5));
        setInitialPiece(new ForestDemon(0, false, 1, 6));
        setInitialPiece(new MountainDeer(0, false, 1, 7));
        setInitialPiece(new RunningDog(0, false, 1, 8));
        setInitialPiece(new RunningSnake(0, false, 1, 9));
        setInitialPiece(new SideSnake(0, false, 1, 10));
        setInitialPiece(new GrandPigeon(0, false, 1, 11));
        setInitialPiece(new RunningTiger(0, false, 1, 12));
        setInitialPiece(new RunningBear(0, false, 1, 13));
        setInitialPiece(new Yaksha(0, false, 1, 14));
        setInitialPiece(new Vajra(0, false, 1, 15));
        setInitialPiece(new SilverGeneral(0, false, 1, 16));
        setInitialPiece(new DrunkElephant(0, false, 1, 17));
        setInitialPiece(new CloseKing(0, false, 1, 18));
        setInitialPiece(new SilverGeneral(0, false, 1, 19));
        setInitialPiece(new SumoWrestler(0, false, 1, 20));
        setInitialPiece(new Rakshasa(0, false, 1, 21));
        setInitialPiece(new RunningBear(0, false, 1, 22));
        setInitialPiece(new RunningTiger(0, false, 1, 23));
        setInitialPiece(new GrandPigeon(0, false, 1, 24));
        setInitialPiece(new SideSnake(0, false, 1, 25));
        setInitialPiece(new RunningSnake(0, false, 1, 26));
        setInitialPiece(new RunningDog(0, false, 1, 27));
        setInitialPiece(new MountainDeer(0, false, 1, 28));
        setInitialPiece(new ForestDemon(0, false, 1, 29));
        setInitialPiece(new RainDragon(0, false, 1, 30));
        setInitialPiece(new BirdOfficial(0, false, 1, 31));
        setInitialPiece(new RookSwallow(0, false, 1, 32));
        setInitialPiece(new MountainPigeon(0, false, 1, 33));
        setInitialPiece(new WhiteElephant(0, false, 1, 34));
        setInitialPiece(new AntiCar(0, false, 1, 35));

        setInitialPiece(new GoldenCar(0, false, 2, 0));
        setInitialPiece(new SideDragon(0, false, 2, 1));
        setInitialPiece(new RunningDeer(0, false, 2, 2));
        setInitialPiece(new RunningWolf(0, false, 2, 3));
        setInitialPiece(new BishopGeneral(0, false,2, 4));
        setInitialPiece(new RookGeneral(0, false, 2, 5));
        setInitialPiece(new RightTiger(0, false, 2, 6));
        setInitialPiece(new RightDragon(0, false, 2, 7));
        setInitialPiece(new BeastOfficial(0, false, 2, 8));
        setInitialPiece(new WindDragon(0, false, 2, 9));
        setInitialPiece(new WildDog(0, false, 2, 10));
        setInitialPiece(new RowingBird(0, false, 2, 11));
        setInitialPiece(new OldBlackKite(0, false, 2, 12));
        setInitialPiece(new Peacock(0, false, 2, 13));
        setInitialPiece(new WaterDragon(0, false, 2, 14));
        setInitialPiece(new FireDragon(0, false, 2, 15));
        setInitialPiece(new BlonzeGeneral(0, false, 2, 16));
        setInitialPiece(new PhoenixMaster(0, false, 2, 17));
        setInitialPiece(new GiraffeMaster(0, false, 2, 18));
        setInitialPiece(new BlonzeGeneral(0, false, 2, 19));
        setInitialPiece(new FireDragon(0, false, 2, 20));
        setInitialPiece(new WaterDragon(0, false, 2, 21));
        setInitialPiece(new Peacock(0, false, 2, 22));
        setInitialPiece(new OldBlackKite(0, false, 2, 23));
        setInitialPiece(new RowingBird(0, false, 2, 24));
        setInitialPiece(new WildDog(0, false, 2, 25));
        setInitialPiece(new WindDragon(0, false, 2, 26));
        setInitialPiece(new BeastOfficial(0, false, 2, 27));
        setInitialPiece(new LeftDragon(0, false, 2, 28));
        setInitialPiece(new LeftTiger(0, false, 2, 29));
        setInitialPiece(new RookGeneral(0, false, 2, 30));
        setInitialPiece(new BishopGeneral(0, false, 2, 31));
        setInitialPiece(new RunningWolf(0, false, 2, 32));
        setInitialPiece(new RunningDeer(0, false, 2, 33));
        setInitialPiece(new SideDragon(0, false, 2, 34));
        setInitialPiece(new GoldenCar(0, false, 2, 35));

        setInitialPiece(new SilverCar(0, false, 3, 0));
        setInitialPiece(new VerticalBear(0, false, 3, 1));
        setInitialPiece(new Knight(0, false, 3, 2));
        setInitialPiece(new PigGeneral(0, false, 3, 3));
        setInitialPiece(new ChickenGeneral(0, false, 3, 4));
        setInitialPiece(new DogGeneral(0, false, 3, 5));
        setInitialPiece(new HorseGeneral(0, false, 3, 6));
        setInitialPiece(new CowGeneral(0, false, 3, 7));
        setInitialPiece(new MiddleFlag(0, false, 3, 8));
        setInitialPiece(new SideBoar(0, false, 3, 9));
        setInitialPiece(new SilverRabbit(0, false, 3, 10));
        setInitialPiece(new GoldenDeer(0, false, 3, 11));
        setInitialPiece(new Lion(0, false, 3, 12));
        setInitialPiece(new BirdSergent(0, false, 3, 13));
        setInitialPiece(new GrandDeer(0, false, 3, 14));
        setInitialPiece(new FierceDragon(0, false, 3, 15));
        setInitialPiece(new WoodsDemon(0, false, 3, 16));
        setInitialPiece(new ViceGeneral(0, false, 3, 17));
        setInitialPiece(new GrandGeneral(0, false, 3, 18));
        setInitialPiece(new WoodsDemon(0, false, 3, 19));
        setInitialPiece(new FierceDragon(0, false, 3, 20));
        setInitialPiece(new GrandDeer(0, false, 3, 21));
        setInitialPiece(new BirdSergent(0, false, 3, 22));
        setInitialPiece(new Lion(0, false, 3, 23));
        setInitialPiece(new GoldenDeer(0, false, 3, 24));
        setInitialPiece(new SilverRabbit(0, false, 3, 25));
        setInitialPiece(new SideBoar(0, false, 3, 26));
        setInitialPiece(new MiddleFlag(0, false, 3, 27));
        setInitialPiece(new CowGeneral(0, false, 3, 28));
        setInitialPiece(new HorseGeneral(0, false, 3, 29));
        setInitialPiece(new DogGeneral(0, false, 3, 30));
        setInitialPiece(new ChickenGeneral(0, false, 3, 31));
        setInitialPiece(new PigGeneral(0, false, 3, 32));
        setInitialPiece(new Knight(0, false, 3, 33));
        setInitialPiece(new VerticalBear(0, false, 3, 34));
        setInitialPiece(new SilverCar(0, false, 3, 35));

        setInitialPiece(new StoneCar(0, false, 4, 0));
        setInitialPiece(new CloudEagle(0, false, 4, 1));
        setInitialPiece(new Bishop(0, false, 4, 2));
        setInitialPiece(new Rook(0, false, 4, 3));
        setInitialPiece(new SideWolf(0, false, 4, 4));
        setInitialPiece(new RookCat(0, false, 4, 5));
        setInitialPiece(new MountainHawk(0, false, 4, 6));
        setInitialPiece(new VerticalTiger(0, false, 4, 7));
        setInitialPiece(new Warrior(0, false, 4, 8));
        setInitialPiece(new SmallFlag(0, false, 4, 9));
        setInitialPiece(new CloudDragon(0, false, 4, 10));
        setInitialPiece(new BlonzeCar(0, false, 4, 11));
        setInitialPiece(new RunningCar(0, false, 4, 12));
        setInitialPiece(new SheepWarrior(0, false, 4, 13));
        setInitialPiece(new FierceCow(0, false, 4, 14));
        setInitialPiece(new GrandDragon(0, false, 4, 15));
        setInitialPiece(new GoldenWing(0, false, 4, 16));
        setInitialPiece(new Ignorance(0, false, 4, 17));
        setInitialPiece(new Deva(0, false, 4, 18));
        setInitialPiece(new GoldenWing(0, false, 4, 19));
        setInitialPiece(new GrandDragon(0, false, 4, 20));
        setInitialPiece(new FierceCow(0, false, 4, 21));
        setInitialPiece(new SheepWarrior(0, false, 4, 22));
        setInitialPiece(new RunningCar(0, false, 4, 23));
        setInitialPiece(new BlonzeCar(0, false, 4, 24));
        setInitialPiece(new CloudDragon(0, false, 4, 25));
        setInitialPiece(new SmallFlag(0, false, 4, 26));
        setInitialPiece(new Warrior(0, false, 4, 27));
        setInitialPiece(new VerticalTiger(0, false, 4, 28));
        setInitialPiece(new MountainHawk(0, false, 4, 29));
        setInitialPiece(new RookCat(0, false, 4, 30));
        setInitialPiece(new SideWolf(0, false, 4, 31));
        setInitialPiece(new Rook(0, false, 4, 32));
        setInitialPiece(new Bishop(0, false, 4, 33));
        setInitialPiece(new CloudEagle(0, false, 4, 34));
        setInitialPiece(new StoneCar(0, false, 4, 35));

        setInitialPiece(new WoodenCar(0, false, 5, 0));
        setInitialPiece(new WhitePiece(0, false, 5, 1));
        setInitialPiece(new ChineseDogR(0, false, 5, 2));
        setInitialPiece(new SideLine(0, false, 5, 3));
        setInitialPiece(new DanceDeer(0, false, 5, 4));
        setInitialPiece(new WaterCow(0, false, 5, 5));
        setInitialPiece(new FierceLeopard(0, false, 5, 6));
        setInitialPiece(new FierceEagle(0, false, 5, 7));
        setInitialPiece(new RookDragon(0, false, 5, 8));
        setInitialPiece(new ToxicSnake(0, false, 5, 9));
        setInitialPiece(new WildGooseRook(0, false, 5, 10));
        setInitialPiece(new RavenLine(0, false, 5, 11));
        setInitialPiece(new BlindDog(0, false, 5, 12));
        setInitialPiece(new WaterGeneral(0, false, 5, 13));
        setInitialPiece(new FireGeneral(0, false, 5, 14));
        setInitialPiece(new Phoenix(0, false, 5, 15));
        setInitialPiece(new HookLine(0, false, 5, 16));
        setInitialPiece(new SmallTurtle(0, false, 5, 17));
        setInitialPiece(new GrandTurtle(0, false, 5, 18));
        setInitialPiece(new Makara(0, false, 5, 19));
        setInitialPiece(new Giraffe(0, false, 5, 20));
        setInitialPiece(new FireGeneral(0, false, 5, 21));
        setInitialPiece(new WaterGeneral(0, false, 5, 22));
        setInitialPiece(new BlindDog(0, false, 5, 23));
        setInitialPiece(new RavenLine(0, false, 5, 24));
        setInitialPiece(new WildGooseRook(0, false, 5, 25));
        setInitialPiece(new ToxicSnake(0, false, 5, 26));
        setInitialPiece(new RookDragon(0, false, 5, 27));
        setInitialPiece(new FierceEagle(0, false, 5, 28));
        setInitialPiece(new FierceLeopard(0, false, 5, 29));
        setInitialPiece(new WaterCow(0, false, 5, 30));
        setInitialPiece(new DanceDeer(0, false, 5, 31));
        setInitialPiece(new SideLine(0, false, 5, 32));
        setInitialPiece(new ChineseDogL(0, false, 5, 33));
        setInitialPiece(new WhitePiece(0, false, 5, 34));
        setInitialPiece(new WoodenCar(0, false, 5, 35));

        setInitialPiece(new TileCar(0, false, 6, 0));
        setInitialPiece(new VerticalWolf(0, false, 6, 1));
        setInitialPiece(new SideCow(0, false, 6, 2));
        setInitialPiece(new Donkey(0, false, 6, 3));
        setInitialPiece(new HorseScale(0, false, 6, 4));
        setInitialPiece(new FierceBear(0, false, 6, 5));
        setInitialPiece(new AngerBoar(0, false, 6, 6));
        setInitialPiece(new EvilWolf(0, false, 6, 7));
        setInitialPiece(new WindHorse(0, false, 6, 8));
        setInitialPiece(new ChickenRook(0, false, 6, 9));
        setInitialPiece(new OldMonkey(0, false, 6, 10));
        setInitialPiece(new HuaiChicken(0, false, 6, 11));
        setInitialPiece(new NorthernBarbarian(0, false, 6, 12));
        setInitialPiece(new SouthernBarbarian(0, false, 6, 13));
        setInitialPiece(new FierceDeer(0, false, 6, 14));
        setInitialPiece(new FierceWolf(0, false, 6, 15));
        setInitialPiece(new HiddenFox(0, false, 6, 16));
        setInitialPiece(new MiddleMaster(0, false, 6, 17));
        setInitialPiece(new PengMaster(0, false, 6, 18));
        setInitialPiece(new HiddenFox(0, false, 6, 19));
        setInitialPiece(new FierceWolf(0, false, 6, 20));
        setInitialPiece(new FierceDeer(0, false, 6, 21));
        setInitialPiece(new EasternBarbarian(0, false, 6, 22));
        setInitialPiece(new WesternBarbarian(0, false, 6, 23));
        setInitialPiece(new HuaiChicken(0, false, 6, 24));
        setInitialPiece(new OldMonkey(0, false, 6, 25));
        setInitialPiece(new ChickenRook(0, false, 6, 26));
        setInitialPiece(new WindHorse(0, false, 6, 27));
        setInitialPiece(new EvilWolf(0, false, 6, 28));
        setInitialPiece(new AngerBoar(0, false, 6, 29));
        setInitialPiece(new FierceBear(0, false, 6, 30));
        setInitialPiece(new HorseScale(0, false, 6, 31));
        setInitialPiece(new Donkey(0, false, 6, 32));
        setInitialPiece(new SideCow(0, false, 6, 33));
        setInitialPiece(new VerticalWolf(0, false, 6, 34));
        setInitialPiece(new TileCar(0, false, 6, 35));
    
        setInitialPiece(new EarthenCar(0, false, 7, 0));
        setInitialPiece(new VermilionBird(0, false, 7, 1));
        setInitialPiece(new ChangeRacoonDog(0, false, 7, 2));
        setInitialPiece(new KnightWarrior(0, false, 7, 3));
        setInitialPiece(new BlackKiteLine(0, false, 7, 4));
        setInitialPiece(new ClimbMonkey(0, false, 7, 5));
        setInitialPiece(new CatBlade(0, false, 7, 6));
        setInitialPiece(new SwallowFeather(0, false, 7, 7));
        setInitialPiece(new BlindMonkey(0, false, 7, 8));
        setInitialPiece(new BlindTiger(0, false, 7, 9));
        setInitialPiece(new CowCar(0, false, 7, 10));
        setInitialPiece(new SideRook(0, false, 7, 11));
        setInitialPiece(new BlindBear(0, false, 7, 12));
        setInitialPiece(new OldRat(0, false, 7, 13));
        setInitialPiece(new Direction(0, false, 7, 14));
        setInitialPiece(new AntSnake(0, false, 7, 15));
        setInitialPiece(new LyingDragon(0, false, 7, 16));
        setInitialPiece(new WildEagle(0, false, 7, 17));
        setInitialPiece(new LionHawk(0, false, 7, 18));
        setInitialPiece(new LyingDragon(0, false, 7, 19));
        setInitialPiece(new AntSnake(0, false, 7, 20));
        setInitialPiece(new Direction(0, false, 7, 21));
        setInitialPiece(new OldRat(0, false, 7, 22));
        setInitialPiece(new BlindBear(0, false, 7, 23));
        setInitialPiece(new SideRook(0, false, 7, 24));
        setInitialPiece(new CowCar(0, false, 7, 25));
        setInitialPiece(new BlindTiger(0, false, 7, 26));
        setInitialPiece(new BlindMonkey(0, false, 7, 27));
        setInitialPiece(new SwallowFeather(0, false, 7, 28));
        setInitialPiece(new CatBlade(0, false, 7, 29));
        setInitialPiece(new ClimbMonkey(0, false, 7, 30));
        setInitialPiece(new BlackKiteLine(0, false, 7, 31));
        setInitialPiece(new KnightWarrior(0, false, 7, 32));
        setInitialPiece(new ChangeRacoonDog(0, false, 7, 33));
        setInitialPiece(new AzureDragon(0, false, 7, 34));
        setInitialPiece(new EarthenCar(0, false, 7, 35));

        setInitialPiece(new CarWarrior(0, false, 8, 0));
        setInitialPiece(new SideWarrior(0, false, 8, 1));
        setInitialPiece(new VerticalWarrior(0, false, 8, 2));
        setInitialPiece(new WindGeneral(0, false, 8, 3));
        setInitialPiece(new RiverGeneral(0, false, 8, 4));
        setInitialPiece(new MountainGeneral(0, false, 8, 5));
        setInitialPiece(new FrontFlag(0, false, 8, 6));
        setInitialPiece(new HorseWarrior(0, false, 8, 7));
        setInitialPiece(new WoodenGeneral(0, false, 8, 8));
        setInitialPiece(new CowWarrior(0, false, 8, 9));
        setInitialPiece(new EarthenGeneral(0, false, 8, 10));
        setInitialPiece(new BoarWarrior(0, false, 8, 11));
        setInitialPiece(new StoneGeneral(0, false, 8, 12));
        setInitialPiece(new LeopardWarrior(0, false, 8, 13));
        setInitialPiece(new TileGeneral(0, false, 8 ,14));
        setInitialPiece(new BearWarrior(0, false, 8, 15));
        setInitialPiece(new IronGeneral(0, false, 8, 16));
        setInitialPiece(new GrandFlag(0, false, 8, 17));
        setInitialPiece(new GrandMaster(0, false, 8, 18));
        setInitialPiece(new IronGeneral(0, false, 8, 19));
        setInitialPiece(new BearWarrior(0, false, 8, 20));
        setInitialPiece(new TileGeneral(0, false, 8 ,21));
        setInitialPiece(new LeopardWarrior(0, false, 8, 22));
        setInitialPiece(new StoneGeneral(0, false, 8, 23));
        setInitialPiece(new BoarWarrior(0, false, 8, 24));
        setInitialPiece(new EarthenGeneral(0, false, 8, 25));
        setInitialPiece(new CowWarrior(0, false, 8, 26));
        setInitialPiece(new WoodenGeneral(0, false, 8, 27));
        setInitialPiece(new HorseWarrior(0, false, 8, 28));
        setInitialPiece(new FrontFlag(0, false, 8, 29));
        setInitialPiece(new MountainGeneral(0, false, 8, 30));
        setInitialPiece(new RiverGeneral(0, false, 8, 31));
        setInitialPiece(new WindGeneral(0, false, 8, 32));
        setInitialPiece(new VerticalWarrior(0, false, 8, 33));
        setInitialPiece(new SideWarrior(0, false, 8, 34));
        setInitialPiece(new CarWarrior(0, false, 8, 35));

        setInitialPiece(new RightCar(0, false, 9, 0));
        setInitialPiece(new SideMonkey(0, false, 9, 1));
        setInitialPiece(new VerticalLine(0, false, 9, 2));
        setInitialPiece(new RookCow(0, false, 9, 3));
        setInitialPiece(new CrossBowWarrior(0, false, 9, 4));
        setInitialPiece(new VerticalDog(0, false, 9, 5));
        setInitialPiece(new VerticalHorse(0, false, 9, 6));
        setInitialPiece(new GunWarrior(0, false, 9, 7));
        setInitialPiece(new DragonHorse(0, false, 9, 8));
        setInitialPiece(new DragonKing(0, false, 9, 9));
        setInitialPiece(new SwordWarrior(0, false, 9, 10));
        setInitialPiece(new BishopHawk(0, false, 9, 11));
        setInitialPiece(new RookEagle(0, false, 9, 12));
        setInitialPiece(new SpearWarrior(0, false, 9, 13));
        setInitialPiece(new VerticalLeopard(0, false, 9, 14));
        setInitialPiece(new FierceTiger(0, false, 9, 15));
        setInitialPiece(new BowWarrior(0, false, 9, 16));
        setInitialPiece(new BarkDog(0, false, 9, 17));
        setInitialPiece(new GuardianDog(0, false, 9, 18));
        setInitialPiece(new BowWarrior(0, false, 9, 19));
        setInitialPiece(new FierceTiger(0, false, 9, 20));
        setInitialPiece(new VerticalLeopard(0, false, 9, 21));
        setInitialPiece(new SpearWarrior(0, false, 9, 22));
        setInitialPiece(new RookEagle(0, false, 9, 23));
        setInitialPiece(new BishopHawk(0, false, 9, 24));
        setInitialPiece(new SwordWarrior(0, false, 9, 25));
        setInitialPiece(new DragonKing(0, false, 9, 26));
        setInitialPiece(new DragonHorse(0, false, 9, 27));
        setInitialPiece(new GunWarrior(0, false, 9, 28));
        setInitialPiece(new VerticalHorse(0, false, 9, 29));
        setInitialPiece(new VerticalDog(0, false, 9, 30));
        setInitialPiece(new CrossBowWarrior(0, false, 9, 31));
        setInitialPiece(new RookCow(0, false, 9, 32));
        setInitialPiece(new VerticalLine(0, false, 9, 33));
        setInitialPiece(new SideMonkey(0, false, 9, 34));
        setInitialPiece(new LeftCar(0, false, 9, 35));

        for(int i=0; i<36; i++){
            setInitialPiece(new Pawn(0, false, 10, i));
        }

        setInitialPiece(new Dog(0, false, 11, 5));
        setInitialPiece(new MatchMaker(0, false, 11, 10));
        setInitialPiece(new Dog(0, false, 11, 14));
        setInitialPiece(new Dog(0, false, 11, 21));
        setInitialPiece(new MatchMaker(0, false, 11, 25));
        setInitialPiece(new Dog(0, false, 11, 30));

        setInitialPiece(new Dog(1, false, 24, 5));
        setInitialPiece(new MatchMaker(1, false, 24, 10));
        setInitialPiece(new Dog(1, false, 24, 14));
        setInitialPiece(new Dog(1, false, 24, 21));
        setInitialPiece(new MatchMaker(1, false, 24, 25));
        setInitialPiece(new Dog(1, false, 24, 30));

        for(int i=0; i<36; i++){
            setInitialPiece(new Pawn(1, false, 25, i));
        }

        setInitialPiece(new LeftCar(1, false, 26, 0));
        setInitialPiece(new SideMonkey(1, false, 26, 1));
        setInitialPiece(new VerticalLine(1, false, 26, 2));
        setInitialPiece(new RookCow(1, false, 26, 3));
        setInitialPiece(new CrossBowWarrior(1, false, 26, 4));
        setInitialPiece(new VerticalDog(1, false, 26, 5));
        setInitialPiece(new VerticalHorse(1, false, 26, 6));
        setInitialPiece(new GunWarrior(1, false, 26, 7));
        setInitialPiece(new DragonHorse(1, false, 26, 8));
        setInitialPiece(new DragonKing(1, false, 26, 9));
        setInitialPiece(new SwordWarrior(1, false, 26, 10));
        setInitialPiece(new BishopHawk(1, false, 26, 11));
        setInitialPiece(new RookEagle(1, false, 26, 12));
        setInitialPiece(new SpearWarrior(1, false, 26, 13));
        setInitialPiece(new VerticalLeopard(1, false, 26, 14));
        setInitialPiece(new FierceTiger(1, false, 26, 15));
        setInitialPiece(new BowWarrior(1, false, 26, 16));
        setInitialPiece(new GuardianDog(1, false, 26, 17));
        setInitialPiece(new BarkDog(1, false, 26, 18));
        setInitialPiece(new BowWarrior(1, false, 26, 19));
        setInitialPiece(new FierceTiger(1, false, 26, 20));
        setInitialPiece(new VerticalLeopard(1, false, 26, 21));
        setInitialPiece(new SpearWarrior(1, false, 26, 22));
        setInitialPiece(new RookEagle(1, false, 26, 23));
        setInitialPiece(new BishopHawk(1, false, 26, 24));
        setInitialPiece(new SwordWarrior(1, false, 26, 25));
        setInitialPiece(new DragonKing(1, false, 26, 26));
        setInitialPiece(new DragonHorse(1, false, 26, 27));
        setInitialPiece(new GunWarrior(1, false, 26, 28));
        setInitialPiece(new VerticalHorse(1, false, 26, 29));
        setInitialPiece(new VerticalDog(1, false, 26, 30));
        setInitialPiece(new CrossBowWarrior(1, false, 26, 31));
        setInitialPiece(new RookCow(1, false, 26, 32));
        setInitialPiece(new VerticalLine(1, false, 26, 33));
        setInitialPiece(new SideMonkey(1, false, 26, 34));
        setInitialPiece(new RightCar(1, false, 26, 35));
        
        setInitialPiece(new CarWarrior(1, false, 27, 0));
        setInitialPiece(new SideWarrior(1, false, 27, 1));
        setInitialPiece(new VerticalWarrior(1, false, 27, 2));
        setInitialPiece(new WindGeneral(1, false, 27, 3));
        setInitialPiece(new RiverGeneral(1, false, 27, 4));
        setInitialPiece(new MountainGeneral(1, false, 27, 5));
        setInitialPiece(new FrontFlag(1, false, 27, 6));
        setInitialPiece(new HorseWarrior(1, false, 27, 7));
        setInitialPiece(new WoodenGeneral(1, false, 27, 8));
        setInitialPiece(new CowWarrior(1, false, 27, 9));
        setInitialPiece(new EarthenGeneral(1, false, 27, 10));
        setInitialPiece(new BoarWarrior(1, false, 27, 11));
        setInitialPiece(new StoneGeneral(1, false, 27, 12));
        setInitialPiece(new LeopardWarrior(1, false, 27, 13));
        setInitialPiece(new TileGeneral(1, false, 27,14));
        setInitialPiece(new BearWarrior(1, false, 27, 15));
        setInitialPiece(new IronGeneral(1, false, 27, 16));
        setInitialPiece(new GrandMaster(1, false, 27, 17));
        setInitialPiece(new GrandFlag(1, false, 27, 18));
        setInitialPiece(new IronGeneral(1, false, 27, 19));
        setInitialPiece(new BearWarrior(1, false, 27, 20));
        setInitialPiece(new TileGeneral(1, false, 27,21));
        setInitialPiece(new LeopardWarrior(1, false, 27, 22));
        setInitialPiece(new StoneGeneral(1, false, 27, 23));
        setInitialPiece(new BoarWarrior(1, false, 27, 24));
        setInitialPiece(new EarthenGeneral(1, false, 27, 25));
        setInitialPiece(new CowWarrior(1, false, 27, 26));
        setInitialPiece(new WoodenGeneral(1, false, 27, 27));
        setInitialPiece(new HorseWarrior(1, false, 27, 28));
        setInitialPiece(new FrontFlag(1, false, 27, 29));
        setInitialPiece(new MountainGeneral(1, false, 27, 30));
        setInitialPiece(new RiverGeneral(1, false, 27, 31));
        setInitialPiece(new WindGeneral(1, false, 27, 32));
        setInitialPiece(new VerticalWarrior(1, false, 27, 33));
        setInitialPiece(new SideWarrior(1, false, 27, 34));
        setInitialPiece(new CarWarrior(1, false, 27, 35));

        setInitialPiece(new EarthenCar(1, false, 28, 0));
        setInitialPiece(new AzureDragon(1, false, 28, 1));
        setInitialPiece(new ChangeRacoonDog(1, false, 28, 2));
        setInitialPiece(new KnightWarrior(1, false, 28, 3));
        setInitialPiece(new BlackKiteLine(1, false, 28, 4));
        setInitialPiece(new ClimbMonkey(1, false, 28, 5));
        setInitialPiece(new CatBlade(1, false, 28, 6));
        setInitialPiece(new SwallowFeather(1, false, 28, 7));
        setInitialPiece(new BlindMonkey(1, false, 28, 8));
        setInitialPiece(new BlindTiger(1, false, 28, 9));
        setInitialPiece(new CowCar(1, false, 28, 10));
        setInitialPiece(new SideRook(1, false, 28, 11));
        setInitialPiece(new BlindBear(1, false, 28, 12));
        setInitialPiece(new OldRat(1, false, 28, 13));
        setInitialPiece(new Direction(1, false, 28, 14));
        setInitialPiece(new AntSnake(1, false, 28, 15));
        setInitialPiece(new LyingDragon(1, false, 28, 16));
        setInitialPiece(new LionHawk(1, false, 28, 17));
        setInitialPiece(new WildEagle(1, false, 28, 18));
        setInitialPiece(new LyingDragon(1, false, 28, 19));
        setInitialPiece(new AntSnake(1, false, 28, 20));
        setInitialPiece(new Direction(1, false, 28, 21));
        setInitialPiece(new OldRat(1, false, 28, 22));
        setInitialPiece(new BlindBear(1, false, 28, 23));
        setInitialPiece(new SideRook(1, false, 28, 24));
        setInitialPiece(new CowCar(1, false, 28, 25));
        setInitialPiece(new BlindTiger(1, false, 28, 26));
        setInitialPiece(new BlindMonkey(1, false, 28, 27));
        setInitialPiece(new SwallowFeather(1, false, 28, 28));
        setInitialPiece(new CatBlade(1, false, 28, 29));
        setInitialPiece(new ClimbMonkey(1, false, 28, 30));
        setInitialPiece(new BlackKiteLine(1, false, 28, 31));
        setInitialPiece(new KnightWarrior(1, false, 28, 32));
        setInitialPiece(new ChangeRacoonDog(1, false, 28, 33));
        setInitialPiece(new VermilionBird(1, false, 28, 34));
        setInitialPiece(new EarthenCar(1, false, 28, 35));

        setInitialPiece(new TileCar(1, false, 29, 0));
        setInitialPiece(new VerticalWolf(1, false, 29, 1));
        setInitialPiece(new SideCow(1, false, 29, 2));
        setInitialPiece(new Donkey(1, false, 29, 3));
        setInitialPiece(new HorseScale(1, false, 29, 4));
        setInitialPiece(new FierceBear(1, false, 29, 5));
        setInitialPiece(new AngerBoar(1, false, 29, 6));
        setInitialPiece(new EvilWolf(1, false, 29, 7));
        setInitialPiece(new WindHorse(1, false, 29, 8));
        setInitialPiece(new ChickenRook(1, false, 29, 9));
        setInitialPiece(new OldMonkey(1, false, 29, 10));
        setInitialPiece(new HuaiChicken(1, false, 29, 11));
        setInitialPiece(new WesternBarbarian(1, false, 29, 12));
        setInitialPiece(new EasternBarbarian(1, false, 29, 13));
        setInitialPiece(new FierceDeer(1, false, 29, 14));
        setInitialPiece(new FierceWolf(1, false, 29, 15));
        setInitialPiece(new HiddenFox(1, false, 29, 16));
        setInitialPiece(new PengMaster(1, false, 29, 17));
        setInitialPiece(new MiddleMaster(1, false, 29, 18));
        setInitialPiece(new HiddenFox(1, false, 29, 19));
        setInitialPiece(new FierceWolf(1, false, 29, 20));
        setInitialPiece(new FierceDeer(1, false, 29, 21));
        setInitialPiece(new SouthernBarbarian(1, false, 29, 22));
        setInitialPiece(new NorthernBarbarian(1, false, 29, 23));
        setInitialPiece(new HuaiChicken(1, false, 29, 24));
        setInitialPiece(new OldMonkey(1, false, 29, 25));
        setInitialPiece(new ChickenRook(1, false, 29, 26));
        setInitialPiece(new WindHorse(1, false, 29, 27));
        setInitialPiece(new EvilWolf(1, false, 29, 28));
        setInitialPiece(new AngerBoar(1, false, 29, 29));
        setInitialPiece(new FierceBear(1, false, 29, 30));
        setInitialPiece(new HorseScale(1, false, 29, 31));
        setInitialPiece(new Donkey(1, false, 29, 32));
        setInitialPiece(new SideCow(1, false, 29, 33));
        setInitialPiece(new VerticalWolf(1, false, 29, 34));
        setInitialPiece(new TileCar(1, false, 29, 35));

        setInitialPiece(new WoodenCar(1, false, 30, 0));
        setInitialPiece(new WhitePiece(1, false, 30, 1));
        setInitialPiece(new ChineseDogL(1, false, 30, 2));
        setInitialPiece(new SideLine(1, false, 30, 3));
        setInitialPiece(new DanceDeer(1, false, 30, 4));
        setInitialPiece(new WaterCow(1, false, 30, 5));
        setInitialPiece(new FierceLeopard(1, false, 30, 6));
        setInitialPiece(new FierceEagle(1, false, 30, 7));
        setInitialPiece(new RookDragon(1, false, 30, 8));
        setInitialPiece(new ToxicSnake(1, false, 30, 9));
        setInitialPiece(new WildGooseRook(1, false, 30, 10));
        setInitialPiece(new RavenLine(1, false, 30, 11));
        setInitialPiece(new BlindDog(1, false, 30, 12));
        setInitialPiece(new WaterGeneral(1, false, 30, 13));
        setInitialPiece(new FireGeneral(1, false, 30, 14));
        setInitialPiece(new Giraffe(1, false, 30, 15));
        setInitialPiece(new Makara(1, false, 30, 16));
        setInitialPiece(new GrandTurtle(1, false, 30, 17));
        setInitialPiece(new SmallTurtle(1, false, 30, 18));
        setInitialPiece(new HookLine(1, false, 30, 19));
        setInitialPiece(new Phoenix(1, false, 30, 20));
        setInitialPiece(new FireGeneral(1, false, 30, 21));
        setInitialPiece(new WaterGeneral(1, false, 30, 22));
        setInitialPiece(new BlindDog(1, false, 30, 23));
        setInitialPiece(new RavenLine(1, false, 30, 24));
        setInitialPiece(new WildGooseRook(1, false, 30, 25));
        setInitialPiece(new ToxicSnake(1, false, 30, 26));
        setInitialPiece(new RookDragon(1, false, 30, 27));
        setInitialPiece(new FierceEagle(1, false, 30, 28));
        setInitialPiece(new FierceLeopard(1, false, 30, 29));
        setInitialPiece(new WaterCow(1, false, 30, 30));
        setInitialPiece(new DanceDeer(1, false, 30, 31));
        setInitialPiece(new SideLine(1, false, 30, 32));
        setInitialPiece(new ChineseDogR(1, false, 30, 33));
        setInitialPiece(new WhitePiece(1, false, 30, 34));
        setInitialPiece(new WoodenCar(1, false, 30, 35));

        setInitialPiece(new StoneCar(1, false, 31, 0));
        setInitialPiece(new CloudEagle(1, false, 31, 1));
        setInitialPiece(new Bishop(1, false, 31, 2));
        setInitialPiece(new Rook(1, false, 31, 3));
        setInitialPiece(new SideWolf(1, false, 31, 4));
        setInitialPiece(new RookCat(1, false, 31, 5));
        setInitialPiece(new MountainHawk(1, false, 31, 6));
        setInitialPiece(new VerticalTiger(1, false, 31, 7));
        setInitialPiece(new Warrior(1, false, 31, 8));
        setInitialPiece(new SmallFlag(1, false, 31, 9));
        setInitialPiece(new CloudDragon(1, false, 31, 10));
        setInitialPiece(new BlonzeCar(1, false, 31, 11));
        setInitialPiece(new RunningCar(1, false, 31, 12));
        setInitialPiece(new SheepWarrior(1, false, 31, 13));
        setInitialPiece(new FierceCow(1, false, 31, 14));
        setInitialPiece(new GrandDragon(1, false, 31, 15));
        setInitialPiece(new GoldenWing(1, false, 31, 16));
        setInitialPiece(new Deva(1, false, 31, 17));
        setInitialPiece(new Ignorance(1, false, 31, 18));
        setInitialPiece(new GoldenWing(1, false, 31, 19));
        setInitialPiece(new GrandDragon(1, false, 31, 20));
        setInitialPiece(new FierceCow(1, false, 31, 21));
        setInitialPiece(new SheepWarrior(1, false, 31, 22));
        setInitialPiece(new RunningCar(1, false, 31, 23));
        setInitialPiece(new BlonzeCar(1, false, 31, 24));
        setInitialPiece(new CloudDragon(1, false, 31, 25));
        setInitialPiece(new SmallFlag(1, false, 31, 26));
        setInitialPiece(new Warrior(1, false, 31, 27));
        setInitialPiece(new VerticalTiger(1, false, 31, 28));
        setInitialPiece(new MountainHawk(1, false, 31, 29));
        setInitialPiece(new RookCat(1, false, 31, 30));
        setInitialPiece(new SideWolf(1, false, 31, 31));
        setInitialPiece(new Rook(1, false, 31, 32));
        setInitialPiece(new Bishop(1, false, 31, 33));
        setInitialPiece(new CloudEagle(1, false, 31, 34));
        setInitialPiece(new StoneCar(1, false, 31, 35));

        setInitialPiece(new SilverCar(1, false, 32, 0));
        setInitialPiece(new VerticalBear(1, false, 32, 1));
        setInitialPiece(new Knight(1, false, 32, 2));
        setInitialPiece(new PigGeneral(1, false, 32, 3));
        setInitialPiece(new ChickenGeneral(1, false, 32, 4));
        setInitialPiece(new DogGeneral(1, false, 32, 5));
        setInitialPiece(new HorseGeneral(1, false, 32, 6));
        setInitialPiece(new CowGeneral(1, false, 32, 7));
        setInitialPiece(new MiddleFlag(1, false, 32, 8));
        setInitialPiece(new SideBoar(1, false, 32, 9));
        setInitialPiece(new SilverRabbit(1, false, 32, 10));
        setInitialPiece(new GoldenDeer(1, false, 32, 11));
        setInitialPiece(new Lion(1, false, 32, 12));
        setInitialPiece(new BirdSergent(1, false, 32, 13));
        setInitialPiece(new GrandDeer(1, false, 32, 14));
        setInitialPiece(new FierceDragon(1, false, 32, 15));
        setInitialPiece(new WoodsDemon(1, false, 32, 16)); 
        setInitialPiece(new GrandGeneral(1, false, 32, 17));
        setInitialPiece(new ViceGeneral(1, false, 32, 18));
        setInitialPiece(new WoodsDemon(1, false, 32, 19));
        setInitialPiece(new FierceDragon(1, false, 32, 20));
        setInitialPiece(new GrandDeer(1, false, 32, 21));
        setInitialPiece(new BirdSergent(1, false, 32, 22));
        setInitialPiece(new Lion(1, false, 32, 23));
        setInitialPiece(new GoldenDeer(1, false, 32, 24));
        setInitialPiece(new SilverRabbit(1, false, 32, 25));
        setInitialPiece(new SideBoar(1, false, 32, 26));
        setInitialPiece(new MiddleFlag(1, false, 32, 27));
        setInitialPiece(new CowGeneral(1, false, 32, 28));
        setInitialPiece(new HorseGeneral(1, false, 32, 29));
        setInitialPiece(new DogGeneral(1, false, 32, 30));
        setInitialPiece(new ChickenGeneral(1, false, 32, 31));
        setInitialPiece(new PigGeneral(1, false, 32, 32));
        setInitialPiece(new Knight(1, false, 32, 33));
        setInitialPiece(new VerticalBear(1, false, 32, 34));
        setInitialPiece(new SilverCar(1, false, 32, 35));

        setInitialPiece(new GoldenCar(1, false, 33, 0));
        setInitialPiece(new SideDragon(1, false, 33, 1));
        setInitialPiece(new RunningDeer(1, false, 33, 2));
        setInitialPiece(new RunningWolf(1, false, 33, 3));
        setInitialPiece(new BishopGeneral(1, false, 33, 4));
        setInitialPiece(new RookGeneral(1, false, 33, 5));
        setInitialPiece(new LeftTiger(1, false, 33, 6));
        setInitialPiece(new LeftDragon(1, false, 33, 7));
        setInitialPiece(new BeastOfficial(1, false, 33, 8));
        setInitialPiece(new WindDragon(1, false, 33, 9));
        setInitialPiece(new WildDog(1, false, 33, 10));
        setInitialPiece(new RowingBird(1, false, 33, 11));
        setInitialPiece(new OldBlackKite(1, false, 33, 12));
        setInitialPiece(new Peacock(1, false, 33, 13));
        setInitialPiece(new WaterDragon(1, false, 33, 14));
        setInitialPiece(new FireDragon(1, false, 33, 15));
        setInitialPiece(new BlonzeGeneral(1, false, 33, 16));
        setInitialPiece(new GiraffeMaster(1, false, 33, 17));
        setInitialPiece(new PhoenixMaster(1, false, 33, 18));
        setInitialPiece(new BlonzeGeneral(1, false, 33, 19));
        setInitialPiece(new FireDragon(1, false, 33, 20));
        setInitialPiece(new WaterDragon(1, false, 33, 21));
        setInitialPiece(new Peacock(1, false, 33, 22));
        setInitialPiece(new OldBlackKite(1, false, 33, 23));
        setInitialPiece(new RowingBird(1, false, 33, 24));
        setInitialPiece(new WildDog(1, false, 33, 25));
        setInitialPiece(new WindDragon(1, false, 33, 26));
        setInitialPiece(new BeastOfficial(1, false, 33, 27));
        setInitialPiece(new RightDragon(1, false, 33, 28));
        setInitialPiece(new RightTiger(1, false, 33, 29));
        setInitialPiece(new RookGeneral(1, false, 33, 30));
        setInitialPiece(new BishopGeneral(1, false, 33, 31));
        setInitialPiece(new RunningWolf(1, false, 33, 32));
        setInitialPiece(new RunningDeer(1, false, 33, 33));
        setInitialPiece(new SideDragon(1, false, 33, 34));
        setInitialPiece(new GoldenCar(1, false, 33, 35));

        setInitialPiece(new AntiCar(1, false, 34, 0));
        setInitialPiece(new WhiteElephant(1, false, 34, 1));
        setInitialPiece(new MountainPigeon(1, false, 34, 2));
        setInitialPiece(new RookSwallow(1, false, 34, 3));
        setInitialPiece(new BirdOfficial(1, false, 34, 4));
        setInitialPiece(new RainDragon(1, false, 34, 5));
        setInitialPiece(new ForestDemon(1, false, 34, 6));
        setInitialPiece(new MountainDeer(1, false, 34, 7));
        setInitialPiece(new RunningDog(1, false, 34, 8));
        setInitialPiece(new RunningSnake(1, false, 34, 9));
        setInitialPiece(new SideSnake(1, false, 34, 10));
        setInitialPiece(new GrandPigeon(1, false, 34, 11));
        setInitialPiece(new RunningTiger(1, false, 34, 12));
        setInitialPiece(new RunningBear(1, false, 34, 13));
        setInitialPiece(new Rakshasa(1, false, 34, 14));
        setInitialPiece(new SumoWrestler(1, false, 34, 15));
        setInitialPiece(new SilverGeneral(1, false, 34, 16)); 
        setInitialPiece(new CloseKing(1, false, 34, 17));
        setInitialPiece(new DrunkElephant(1, false, 34, 18));
        setInitialPiece(new SilverGeneral(1, false, 34, 19));
        setInitialPiece(new Vajra(1, false, 34, 20));
        setInitialPiece(new Yaksha(1, false, 34, 21));
        setInitialPiece(new RunningBear(1, false, 34, 22));
        setInitialPiece(new RunningTiger(1, false, 34, 23));
        setInitialPiece(new GrandPigeon(1, false, 34, 24));
        setInitialPiece(new SideSnake(1, false, 34, 25));
        setInitialPiece(new RunningSnake(1, false, 34, 26));
        setInitialPiece(new RunningDog(1, false, 34, 27));
        setInitialPiece(new MountainDeer(1, false, 34, 28));
        setInitialPiece(new ForestDemon(1, false, 34, 29));
        setInitialPiece(new RainDragon(1, false, 34, 30));
        setInitialPiece(new BirdOfficial(1, false, 34, 31));
        setInitialPiece(new RookSwallow(1, false, 34, 32));
        setInitialPiece(new MountainPigeon(1, false, 34, 33));
        setInitialPiece(new LanceElephant(1, false, 34, 34));
        setInitialPiece(new AntiCar(1, false, 34, 35));

        setInitialPiece(new Lance(1, false, 35, 0));
        setInitialPiece(new BlackTortoise(1, false, 35, 1));
        setInitialPiece(new RunningRabbit(1, false, 35, 2));
        setInitialPiece(new WhaleMackerel(1, false, 35, 3));
        setInitialPiece(new FireDemon(1, false, 35, 4));
        setInitialPiece(new MountainEagle(1, false, 35, 5));
        setInitialPiece(new Tengu(1, false, 35, 6));
        setInitialPiece(new BeastSergent(1, false, 35, 7));
        setInitialPiece(new RunningHorse(1, false, 35, 8));
        setInitialPiece(new WildDemon(1, false, 35, 9));
        setInitialPiece(new EarthenDragon(1, false, 35, 10));
        setInitialPiece(new PigeonBoard(1, false, 35, 11));
        setInitialPiece(new WildTapir(1, false, 35, 12));
        setInitialPiece(new WildKing(1, false, 35, 13));
        setInitialPiece(new RearFlag(1, false, 35, 14));
        setInitialPiece(new LeftGeneral(1, false, 35, 15));
        setInitialPiece(new GoldenGeneral(1, false, 35, 16));
        //setInitialPiece(new King(1, false, 35, 17));
        //setInitialPiece(new Prince(1, false, 35, 18));
        setInitialPiece(new GoldenGeneral(1, false, 35, 19));
        setInitialPiece(new RightGeneral(1, false, 35, 20));
        setInitialPiece(new RearFlag(1, false, 35, 21));
        setInitialPiece(new WildKing(1, false, 35, 22));
        setInitialPiece(new WildTapir(1, false, 35, 23));
        setInitialPiece(new Kumbhanda(1, false, 35, 24));
        setInitialPiece(new EarthenDragon(1, false, 35, 25));
        setInitialPiece(new WildDemon(1, false, 35, 26));
        setInitialPiece(new RunningHorse(1, false, 35, 27));
        setInitialPiece(new BeastSergent(1, false, 35, 28));
        setInitialPiece(new Tengu(1, false, 35, 29));
        setInitialPiece(new MountainEagle(1, false, 35, 30));
        setInitialPiece(new FireDemon(1, false, 35, 31));
        setInitialPiece(new WhaleMackerel(1, false, 35, 32));
        setInitialPiece(new RunningRabbit(1, false, 35, 33));
        setInitialPiece(new WhiteTiger(1, false, 35, 34));
        setInitialPiece(new Lance(1, false, 35, 35));
    }

    private void setInitialPiece(Piece piece){
        x = piece.position.getX();
        y = piece.position.getY();
        if(isValidCoordinate(x, y)){
            board[x][y] = piece;
        }
    }

    public boolean isValidCoordinate(int x, int y){
        return x >= 0 && x < 36 && y >= 0 && y < 36;
    }

    public static int getPieceOwner(int x, int y){
        return board[x][y].owner;
    }

    public boolean isOccupied(int x, int y){
        if(isValidCoordinate(x, y) && board[x][y]==null){
            return true;
        }else if(isValidCoordinate(x, y) && (board[x][y].owner != player)){
            return true;
        }else{
            return false;
        }
    }

    public List<Coordinate> getPossibleMoves(int row, int col){
        //List<Coordinate> selectedPieceMoves = new ArrayList<>();
        Piece selectedPiece = getPiece(row, col);
        if(selectedPiece != null && !selectedPiece.promoted){
            setSelectedPieceMoves(selectedPiece.getPossibleMoves(this));
            return selectedPiece.getPossibleMoves(this);
        }else if(selectedPiece != null && selectedPiece.promoted){
            setSelectedPieceMoves(selectedPiece.getPossibleMoves(this));
            return selectedPiece.promote(this);
        }
        return Collections.emptyList();
    }

    public void setSelectedPieceMoves(List<Coordinate> moves){
        this.selectedPieceMoves = moves;
    }
    
    public void setPlayer(int player){
        this.player = player;
    }

    public Piece getSelectedPiece(){
        return selectedPiece;
    }

    public void setSelectedPiece(Piece piece){
        this.selectedPiece = piece;
    }

    public List<Coordinate> getSelectedPieceMoves(){
        return selectedPieceMoves;
    }

    public Piece getPiece(int row, int col){
        return board[row][col];
    }

    public Piece[][] getShogiBoard(){
        return board;
    }

    public int getPlayer(){
        return player;
    }

    public void clearSelectedPiece(){
        this.selectedPiece = null;
        this.selectedPieceMoves = null;
        this.player = 0;
    }

    public void movePiece(Piece piece, int newX, int newY){
        int currentX = piece.position.getX();
        int currentY = piece.position.getY();

        if(isValidCoordinate(currentX, currentY) && isValidCoordinate(newX, newY)){
            if(board[currentX][currentY] == piece){
                board[currentX][currentY] = null;
                board[newX][newY] = piece;
                piece.position.setX(newX);
                piece.position.setY(newY);
                if(board[newX][newY].owner == 0 && newX > 25 && newX < 36){
                    selectedPieceMoves = board[newX][newY].promote(this);
                }else if(board[newX][newY].owner == 1 && newX >= 0 && newX < 11){
                    selectedPieceMoves = board[newX][newY].promote(this);
                }
            }else{
                System.out.println("error: the piece is not at its current position");
            }
        }else{
            System.out.println("error: invalid coordinates");
        }
    }

    public void capturePiece(int newX, int newY){
        if(isValidCoordinate(newX, newY) && board[newX][newY] != null){
            board[newX][newY] = null;
        }
        if(isGameOver()){
            Player winner = getWinner();
            showWinnerDialog(winner);
        }
    }

    public boolean isGameOver(){
        boolean player0King = false;
        boolean player1King = false;
        for(int i=0; i<36; i++){
            for(int j=0; j<36; j++){
                Piece piece = board[i][j];
                if(piece != null){
                    if(piece.isKings()){
                        if(piece.getPieceOwner() == 0){
                            player0King = true;
                        }else if(piece.getPieceOwner() == 1){
                            player1King = true;
                        }
                        /*if(checkmate()){
                            return true;
                        }*/
                    }
                }
            }
        }
        return !(player0King && player1King);
    }

    public Player getWinner(){
        for(int i=0; i<36; i++){
            for(int j=0; j<36; j++){
                Piece piece = board[i][j];
                if(piece != null && piece.isKings()){
                    return piece.getPieceOwner() == 0 ? player0 : player1;
                }
            }
        }

        return null;
    }

    private void showWinnerDialog(Player winner){
        JOptionPane.showMessageDialog(null, "game finished! player " + winner.getPlayerID() + "won!");
    }

    public void draw(Graphics g){
        for(int i=0; i<36; i++){
            for(int j=0; j<36; j++){
                x = i * SQUARE_SIZE;
                y = j * SQUARE_SIZE;

                g.setColor((i + j) % 2 == 0 ? Color.LIGHT_GRAY : Color.WHITE);
                g.fillRect(x, y, SQUARE_SIZE, SQUARE_SIZE);

                Piece piece = board[i][j];
                if(piece != null){
                    //g.setColor(Color.BLACK);
                    if(piece.owner == 0){
                        g.setColor(Color.BLACK);
                    }else{
                        g.setColor(Color.RED);
                    }
                    Font font = new Font("Arial", Font.BOLD, 10);
                    g.setFont(font);
                    g.drawString(Integer.toString(piece.pieceID), x + SQUARE_SIZE / 2 - 5, y + SQUARE_SIZE / 2 + 5);
                }
            }
        }
    }
}
