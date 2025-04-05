export interface WebviewCachePlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
