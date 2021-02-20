package behavioral.templatemetod.example_1;

public class DeleteConfirmDialog extends AbstractDialog{
    @Override
    void beforeRender() {
        System.out.println("Render etmeden önce yapılacak işlemler");
    }

    @Override
    void afterRender() {
        System.out.println("Render ettikten sonra yapılacak işlemler");
    }

    @Override
    void beforeClose() {
        System.out.println("Kapanmadan önce yapılacak işlemler");
    }

    @Override
    void afterClose() {
        System.out.println("Kapandıktan sonra yapılacak işlemler");
    }
}
