package links.multithreading.fork_join;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class MaxWithFJ extends RecursiveAction {
    private final int threshold;
    private final SelectMaxProblem problem;
    public int result;

    public MaxWithFJ(SelectMaxProblem problem, int threshold) {
        this.threshold = threshold;
        this.problem = problem;
    }

    @Override
    protected void compute() {
        if (problem.size < threshold)
            result = problem.solveSequentially();
        else {
            int midpoint = problem.size / 2;
            MaxWithFJ left = new MaxWithFJ(problem.subproblem(0, midpoint), threshold);
            MaxWithFJ right = new MaxWithFJ(problem.subproblem(midpoint + 1, problem.size), threshold);

//            coInvoke(left, right);
            result = Math.max(left.result, right.result);
        }
    }

    public static void main(String[] args) {
        int[] numbers = new int[100000000];
        for (int i = 0; i < 100000000; i++) {
            numbers[i] = (int) (Math.random() * 1000);
        }
        SelectMaxProblem problem = new SelectMaxProblem(numbers, 0, numbers.length-1);
        int threshold = 100;
        int nThreads = 100;
        MaxWithFJ mfj = new MaxWithFJ(problem, threshold);
        ForkJoinPool fjPool = new ForkJoinPool(nThreads);

        fjPool.invoke(mfj);
        int result = mfj.result;
        System.out.println(result);
    }
}
