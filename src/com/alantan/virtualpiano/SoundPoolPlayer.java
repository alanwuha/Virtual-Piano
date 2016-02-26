package com.alantan.virtualpiano;

import java.util.HashMap;

import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;

public class SoundPoolPlayer {
    private SoundPool mShortPlayer= null;
    private HashMap mSounds = new HashMap();

    public SoundPoolPlayer(Context pContext)
    {
        // setup Soundpool
        this.mShortPlayer = new SoundPool(4, AudioManager.STREAM_MUSIC, 0);

        mSounds.put(R.raw.pianoc1, this.mShortPlayer.load(pContext, R.raw.pianoc1, 1));
        mSounds.put(R.raw.pianod1, this.mShortPlayer.load(pContext, R.raw.pianod1, 1));
        mSounds.put(R.raw.pianoe1, this.mShortPlayer.load(pContext, R.raw.pianoe1, 1));
        mSounds.put(R.raw.pianof1, this.mShortPlayer.load(pContext, R.raw.pianof1, 1));
        mSounds.put(R.raw.pianog1, this.mShortPlayer.load(pContext, R.raw.pianog1, 1));
        mSounds.put(R.raw.pianoa1, this.mShortPlayer.load(pContext, R.raw.pianoa1, 1));
        mSounds.put(R.raw.pianob1, this.mShortPlayer.load(pContext, R.raw.pianob1, 1));
        mSounds.put(R.raw.pianoc2, this.mShortPlayer.load(pContext, R.raw.pianoc2, 1));
        mSounds.put(R.raw.pianod2, this.mShortPlayer.load(pContext, R.raw.pianod2, 1));
        mSounds.put(R.raw.pianoe2, this.mShortPlayer.load(pContext, R.raw.pianoe2, 1));
        mSounds.put(R.raw.pianocd1, this.mShortPlayer.load(pContext, R.raw.pianocd1, 1));
        mSounds.put(R.raw.pianode1, this.mShortPlayer.load(pContext, R.raw.pianode1, 1));
        mSounds.put(R.raw.pianofg1, this.mShortPlayer.load(pContext, R.raw.pianofg1, 1));
        mSounds.put(R.raw.pianoga1, this.mShortPlayer.load(pContext, R.raw.pianoga1, 1));
        mSounds.put(R.raw.pianoab1, this.mShortPlayer.load(pContext, R.raw.pianoab1, 1));
        mSounds.put(R.raw.pianocd2, this.mShortPlayer.load(pContext, R.raw.pianocd2, 1));
        mSounds.put(R.raw.pianode2, this.mShortPlayer.load(pContext, R.raw.pianode2, 1));
    }

    public void playShortResource(int piResource) {
        int iSoundId = (Integer) mSounds.get(piResource);
        this.mShortPlayer.play(iSoundId, 0.99f, 0.99f, 0, 0, 1);
    }

    // Cleanup
    public void release() {
        // Cleanup
        this.mShortPlayer.release();
        this.mShortPlayer = null;
    }
    
    public void playLayout1Sound(int i) {
    	// Layout one starts from note C
    	switch(i) {
		case 0:
			playShortResource(R.raw.pianoc1);
			break;
		case 1:
			playShortResource(R.raw.pianod1);
			break;
		case 2:
			playShortResource(R.raw.pianoe1);
			break;
		case 3:
			playShortResource(R.raw.pianof1);
			break;
		case 4:
			playShortResource(R.raw.pianog1);
			break;
		case 5:
			playShortResource(R.raw.pianoa1);
			break;
		case 6:
			playShortResource(R.raw.pianob1);
			break;
		case 7:
			playShortResource(R.raw.pianoc2);
			break;
		case 8:
			playShortResource(R.raw.pianod2);
			break;
		case 9:
			playShortResource(R.raw.pianoe2);
			break;
		case 10:
			playShortResource(R.raw.pianocd1);
			break;
		case 11:
			playShortResource(R.raw.pianode1);
			break;
		case 12:
			playShortResource(R.raw.pianofg1);
			break;
		case 13:
			playShortResource(R.raw.pianoga1);
			break;
		case 14:
			playShortResource(R.raw.pianoab1);
			break;
		case 15:
			playShortResource(R.raw.pianocd2);
			break;
		case 16:
			playShortResource(R.raw.pianode2);
			break;
		default:
			break;
		}
    }
    
    public void playLayout2Sound(int i) {
    	// Layout 2 start from note F
    	switch(i) {
		case 0:
			playShortResource(R.raw.pianoc1);
			break;
		case 1:
			playShortResource(R.raw.pianod1);
			break;
		case 2:
			playShortResource(R.raw.pianoe1);
			break;
		case 3:
			playShortResource(R.raw.pianof1);
			break;
		case 4:
			playShortResource(R.raw.pianog1);
			break;
		case 5:
			playShortResource(R.raw.pianoa1);
			break;
		case 6:
			playShortResource(R.raw.pianob1);
			break;
		case 7:
			playShortResource(R.raw.pianoc2);
			break;
		case 8:
			playShortResource(R.raw.pianod2);
			break;
		case 9:
			playShortResource(R.raw.pianoe2);
			break;
		case 10:
			playShortResource(R.raw.pianocd1);
			break;
		case 11:
			playShortResource(R.raw.pianode1);
			break;
		case 12:
			playShortResource(R.raw.pianofg1);
			break;
		case 13:
			playShortResource(R.raw.pianoga1);
			break;
		case 14:
			playShortResource(R.raw.pianoab1);
			break;
		case 15:
			playShortResource(R.raw.pianocd2);
			break;
		case 16:
			playShortResource(R.raw.pianode2);
			break;
		default:
			break;
		}
    }
}