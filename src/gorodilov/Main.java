package gorodilov;

   /*     1. Расширить задачу про котов и тарелки с едой.
        2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды
        (например, в миске 10 еды, а кот пытается покушать 15-20).
        3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту
        удалось покушать (хватило еды), сытость = true.
        4. Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть
        наполовину сыт ( это сделано для упрощения логики программы ).
        5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и
        потом вывести информацию о сытости котов в консоль.
        6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.*/



public class Main {

    public static void main(String[] args) {

        Cat[]catsArray = new Cat[3];
         catsArray[0] = new Cat ( "Barsik" , 55, false);
         catsArray[1] =new Cat ("Murzik", 5, false);
         catsArray[2] = new Cat("Manua",60,false);

         Plate plate = new Plate ( 100 );
        plate . info ();

        for (int i = 0; i < 3; i++)
        {


            if (plate.food >= catsArray[i].appetite)
            {

                catsArray[i].eat(plate);
                catsArray[i].richness = true;
                System.out.println("Кот" + i + " поел " + catsArray[i].appetite + " и наелся " + catsArray[i].richness);

                plate . info ();

            } else

            System.out.println("Еды для Кота" + i + " не хватает и Кот " + i + " не наелся " + catsArray[i].richness );
            if (plate.food <= 0) {
                plate.addfood(100);
                System.out.println("В тарелке закончилась еда, насыпем полную тарелку");
                plate.info();}
        }




    }

    }

