package org.eclipse.jface.text;

/*
 * (c) Copyright IBM Corp. 2000, 2001.
 * All Rights Reserved.
 */
 
/**
 * For internal use only. Not API. <p>
 * A document partitioning listener extension is for extending
 * <code>IDocumentPartitioningListener</code> instances with new 
 * or revised functionality.
*/
public interface IDocumentPartitioningListenerExtension {
		
	/**
	 * The partitioning of the given document changed in the given range.
	 *
	 * @param document the document whose partitioning changed
	 * @param region the range in which the partition type changed
	 *
	 * @see IDocument#addDocumentPartitioningListener
	 */
	void documentPartitioningChanged(IDocument document, IRegion region);
}
