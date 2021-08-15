package BInaryTree.BridgeLab;

	interface Tree<T extends Comparable<T>> {
		void add(T data);

		void preOrder();

		void postOrder();

		void inOrder();

		void bfs();

		public boolean isEmpty();

		public boolean search(T data);

	}

