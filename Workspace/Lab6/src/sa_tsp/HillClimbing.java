package sa_tsp;

import student.Node;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class HillClimbing implements Algothrims {
    @Override
    public Node execute(Node initialState) {

        Node current = initialState;
        while (true){
            int currentH = current.getH();
            List<Node> neighbors = current.generateAllCandidates();
            boolean foundBetterNeighbor = false;

            for (Node neighbor : neighbors) {
                int neighborH = neighbor.getH();

                if (neighborH < currentH) {
                    // Di chuyển đến trạng thái con có chi phí thấp hơn
                    current = neighbor;
                    foundBetterNeighbor = true;
                    break; // Chấm dứt vòng lặp vì đã tìm thấy trạng thái con tốt hơn
                }
            }

            if (!foundBetterNeighbor) {
                // Không có trạng thái con nào có chi phí thấp hơn, kết thúc thuật toán
                break;
            }
        }

        return current;
    }

    @Override
    public Node executeHillClimbingWithRandomRestart(Node initialState) {
        int maxRestarts = 1000; // Số lần khởi tạo lại tối đa
        Node bestSolution = null;

        for (int restart = 0; restart < maxRestarts; restart++) {
            Node current = execute(initialState);

            if (bestSolution == null || current.getH() < bestSolution.getH()) {
                // Cập nhật giải pháp tốt nhất nếu tìm thấy giải pháp tốt hơn
                bestSolution = current;
            }
        }

        return bestSolution;
    }
}
