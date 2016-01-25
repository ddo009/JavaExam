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

        // 1번문제
        int result = 0;

        for (int i = 0; i < list.size(); i++) {
            Picture pic = list.get(i);
            System.out.println(list.get(i));
            pic.translate(result, 0);
            result += pic.getWidth() + 30;
            pic.draw();
        }


        // 2번문제
//        int sum = 0;
//        for (int i = 0; i < list.size(); i++) {
//            Picture pic = list.get(i);
//            sum += pic.getWidth();
//        }
//        System.out.println(sum);
//        // 가로길이 총합 685

        // 3번문제
//        int sum = 0;
//        for (int i = 0; i < list.size(); i++) {
//            Picture pic = list.get(i);
//            if (pic.getWidth() < pic.getHeight()) {
//                pic.translate(0, sum);
//                sum += pic.getHeight() + 30;
//                pic.draw();
//            }
//
//        }

        // 4번문제
//        int sum = 0;
//        for (int i = 0; i < list.size(); i++) {
//            Picture pic = list.get(i);
//            if (pic.getWidth() < pic.getHeight()) {
//                sum++;
//            }
//        }
//        System.out.println("세로 사진의 갯수는" + sum);

        // 5번문제
//        for (int i = 0 ; i < list.size(); i++){
//            Picture pic = list.get(i);
//            if (pic.getWidth() < pic.getHeight()){
//                pic.draw();
//                break;
//            }
//
//        }

        // 6번문제
//        int sum = 0;
//        ArrayList<Picture> matchs = new ArrayList<>();
//        for (int i = 0 ; i < list.size(); i ++){
//            Picture pic = list.get(i);
//            if (pic.getWidth() < pic.getHeight()){
//                matchs.add(pic);
//            }
//        }
//        System.out.println(matchs.size());



//      픽셀은 좌측 상단이 0.0
//        for (Picture pic : list) {
//            pic.draw();
//        }

//        for (int i = 0; i < list.size(); i++) {
//            Picture pic = list.get(i);
//            pic.draw();
//       }

    }
}