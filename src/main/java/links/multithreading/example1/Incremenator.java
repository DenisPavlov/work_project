package links.multithreading.example1;

class Incremenator extends Thread
{
    //О ключевом слове volatile - чуть ниже
    private volatile boolean mIsIncrement = true;
    private volatile boolean mFinish = false;

    public void changeAction()	//Меняет действие на противоположное
    {
        mIsIncrement = !mIsIncrement;
    }
    public void finish()		//Инициирует завершение потока
    {
        mFinish = true;
    }

    @Override
    public void run()
    {
        do
        {
            if(!mFinish)	//Проверка на необходимость завершения
            {
                if(mIsIncrement)
                    Program1.mValue++;	//Инкремент
                else
                    Program1.mValue--;	//Декремент

                //Вывод текущего значения переменной
                System.out.print(Program1.mValue + " ");
            }
            else
                return;		//Завершение потока

            try{
                Thread.sleep(1000);		//Приостановка потока на 1 сек.
            }catch(InterruptedException ignored){}
        }
        while(true);
    }
}
