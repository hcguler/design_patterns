package behavioral.templatemetod.example_1;

public abstract class AbstractDialog {
    public AbstractDialog() {
        initializeDialog();
    }

    protected void initializeDialog(){
        beforeRender();
        System.out.println("Diyalog oluşturuluyor");
        afterRender();
    }

    abstract void beforeRender();
    abstract void afterRender();
    abstract void afterClose();
    abstract void beforeClose();

    protected void closeDialog(){
        beforeClose();
        System.out.println("Diyalog kapatılıyor.");
        afterClose();
    }
}
