package com.lix.transit.domain;

public enum CommandType {
	insertVertex,
	insertEdge,
	updateInsertVertex,
	updateInsertEdge,
	deleteVertex,
	deleteEdges,
	slicing,
	extension,
	batchCmd,
	batchCmdList
}
