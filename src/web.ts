import { WebPlugin } from '@capacitor/core';

import type { WebviewCachePlugin } from './definitions';

export class WebviewCacheWeb extends WebPlugin implements WebviewCachePlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
