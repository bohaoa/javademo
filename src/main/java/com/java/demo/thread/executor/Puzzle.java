package com.java.demo.thread.executor;

import java.util.Set;
/**
 * “搬箱子”谜题的抽象
 * @author boge
 *
 * @param <P>
 * @param <M>
 */
public interface Puzzle<P, M> {

	P initialPosition();
	boolean isGoal(P position);
	Set<M> legalMoves(P position);
	P move(P position, M move);
	
}
