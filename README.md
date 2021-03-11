# java-stream-experiments
Try out various structures of streams and their behavior!

I will use this repository for individual learning, but also to share tips and tricks on what I've learned using Java streams.

# Tip 1
ForEach + Outside List vs. map + collect: Check the ExperientsApp.java file to see the two constructs.

One might think that using a forEach loop on a (parallel) stream and collecting the created/modified objects in an outside list does not harm! But be careful:
The forEach loop and the stream are not synced, which can easily lead to a loss of objects that won't be processed.

A map() command on the entities of the stream with a following collect() is way safer: The stream is in sync. with the actions happening inside, ensuring
that it will only finish once all objects were processed
