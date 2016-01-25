import java.util.ArrayList;

public class ArrayListExam {

    public static void main(String[] args) {

        Picture picture1 = new Picture("degas1.jpg");
        Picture picture2 = new Picture("gaugin1.jpg");
        Picture picture3 = new Picture("monet1.jpg");
        Picture picture4 = new Picture("monet2.jpg");
        Picture picture5 = new Picture("renoir1.jpg");

        // ArrayList<Picture> 생성하고 add를 하세요.
        // for 문으로 draw() 를 하시면됩니다.

        ArrayList<Picture> list = new ArrayList<>();
        list.add(picture1);
        list.add(picture2);
        list.add(picture3);
        list.add(picture4);
        list.add(picture5);

        // pic1.getMaxX() : 오른쪽 끝 x 좌표
        // pic1.getWidth() : 가로길이
        // pic1.translate(x,y) ; x,y 만큼 그림 이동 (MOVE)
        // pic1.draw(); = 그림 출력

        System.out.println(picture1.getMaxX());
        picture1.translate(picture2.getWidth() + 30, 0);
        System.out.println(picture1.getMaxX());
        picture1.draw();
        picture2.draw();

//      픽셀은 좌측 상단이 0.0
//      for (Picture pic : list) {
//          pic.draw();
//      }

//        for (int i = 0; i < list.size(); i++) {
//            Picture pic = list.get(i);
//            pic.draw();
//       }

    }
}