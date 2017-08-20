package t6;

/**
 * Created by X501A on 19.08.2017.
 */
public class FileCopyTestUtilsImpl implements FileCopyTestUtils {
    @Override
    public FileCopyUtils createSimpleFileCopyUtils() {
        return new FileCopy();
    }

    @Override
    public FileCopyUtils createBufferedFileCopyUtils() {
        return new BufferCopyFile();
    }

    @Override
    public FileCopyUtils createChannelsFileCopyUtils() {
        return new FileCopyChannel();
    }

    @Override
    public FileCopyUtils createJava7CopyUtils() {
        return new FileCopyWithJava7();
    }
}
