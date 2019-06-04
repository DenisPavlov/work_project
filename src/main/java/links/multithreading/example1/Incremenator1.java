package links.multithreading.example1;

class Incremenator1 extends Thread
{
    private volatile boolean mIsIncrement = true;

    public void changeAction()	//Меняет действие на противоположное
    {
        mIsIncrement = !mIsIncrement;
    }

    @Override
    public void run()
    {
        do
        {
            if(!Thread.interrupted())	                        //Проверка прерывания
            {
                if(mIsIncrement) Program1.mValue++;	            //Инкремент
                else Program1.mValue--;			                //Декремент

                //Вывод текущего значения переменной
                System.out.print(Program1.mValue + " ");
            }
            else return;	                                	//Завершение потока

            try{
                Thread.sleep(1000);		                    //Приостановка потока на 1 сек.
            }catch(InterruptedException e){
                return;	                                        //Завершение потока после прерывания
            }
        }
        while(true);
    }
}
